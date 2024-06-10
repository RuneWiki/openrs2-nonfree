import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!packet")
public final class Class1 {

	@OriginalMember(owner = "client!packet", name = "crctable", descriptor = "[I")
	private static int[] anIntArray1 = new int[256];

	@OriginalMember(owner = "client!packet", name = "data", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!packet", name = "pos", descriptor = "I")
	public int anInt1;

	@OriginalMember(owner = "client!packet", name = "base64enctab", descriptor = "[C")
	private char[] aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray1[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!packet", name = "<init>", descriptor = "([B)V", line = 33)
	public Class1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray1 = arg0;
		this.anInt1 = 0;
	}

	@OriginalMember(owner = "client!packet", name = "p1", descriptor = "(I)V", line = 41)
	public void method1(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt1++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!packet", name = "p4", descriptor = "(I)V", line = 61)
	public void method5(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt1++] = (byte) (arg0 >> 24);
		this.aByteArray1[this.anInt1++] = (byte) (arg0 >> 16);
		this.aByteArray1[this.anInt1++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt1++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!packet", name = "pjstr", descriptor = "(Ljava/lang/String;)V", line = 93)
	public void method8(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray1, this.anInt1);
		this.anInt1 += arg0.length();
		this.aByteArray1[this.anInt1++] = 0;
	}

	@OriginalMember(owner = "client!packet", name = "pdata", descriptor = "([BII)V", line = 98)
	private void method9(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			this.aByteArray1[this.anInt1++] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!packet", name = "g4", descriptor = "()I", line = 174)
	private int method23() {
		this.anInt1 += 4;
		return ((this.aByteArray1[this.anInt1 - 4] & 0xFF) << 24) + ((this.aByteArray1[this.anInt1 - 3] & 0xFF) << 16) + ((this.aByteArray1[this.anInt1 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt1 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!packet", name = "gstr", descriptor = "()Ljava/lang/String;", line = 190)
	public String method26() {
		@Pc(2) int local2 = this.anInt1;
		while (this.aByteArray1[this.anInt1++] != 10) {
		}
		return new String(this.aByteArray1, local2, this.anInt1 - local2 - 1);
	}

	@OriginalMember(owner = "client!packet", name = "gdata", descriptor = "([BII)V", line = 202)
	private void method28(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = this.aByteArray1[this.anInt1++];
		}
	}

	@OriginalMember(owner = "client!packet", name = "tinyenc", descriptor = "([I)V", line = 227)
	public void method32(@OriginalArg(0) int[] arg0) {
		@Pc(4) int local4 = this.anInt1 / 8;
		this.anInt1 = 0;
		for (@Pc(9) int local9 = 0; local9 < local4; local9++) {
			@Pc(13) int local13 = this.method23();
			@Pc(16) int local16 = this.method23();
			@Pc(18) int local18 = 0;
			@Pc(22) int local22 = 32;
			while (local22-- > 0) {
				local13 += (local16 << 4 ^ local16 >>> 5) + local16 ^ local18 + arg0[local18 & 0x3];
				local18 += -1640531527;
				local16 += (local13 << 4 ^ local13 >>> 5) + local13 ^ local18 + arg0[local18 >>> 11 & 0x3];
			}
			this.anInt1 -= 8;
			this.method5(local13);
			this.method5(local16);
		}
	}

	@OriginalMember(owner = "client!packet", name = "rsaenc", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 255)
	public void method34(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt1;
		this.anInt1 = 0;
		@Pc(8) byte[] local8 = new byte[local2];
		this.method28(local8, local2);
		@Pc(18) BigInteger local18 = new BigInteger(local8);
		@Pc(23) BigInteger local23 = local18.modPow(arg0, arg1);
		@Pc(26) byte[] local26 = local23.toByteArray();
		this.anInt1 = 0;
		this.method1(local26.length);
		this.method9(local26, local26.length);
	}

	@OriginalMember(owner = "client!packet", name = "addcrc", descriptor = "()I", line = 273)
	public int method36() {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < this.anInt1; local3++) {
			local1 = local1 >>> 8 ^ anIntArray1[(local1 ^ this.aByteArray1[local3]) & 0xFF];
		}
		local1 = ~local1;
		this.method5(local1);
		return local1;
	}

	@OriginalMember(owner = "client!packet", name = "g64encoded", descriptor = "(I)Ljava/lang/String;", line = 285)
	public String method37(@OriginalArg(0) int arg0) {
		@Pc(1) String local1 = "";
		@Pc(3) int local3 = arg0;
		@Pc(7) int local7 = arg0 % 3;
		if (local7 != 0) {
			arg0 += 3 - local7;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0; local17 += 3) {
			local1 = local1 + this.aCharArray1[this.aByteArray1[local17 + this.anInt1] >> 2 & 0x3F];
			if (local17 + 3 <= local3) {
				local1 = local1 + this.aCharArray1[(this.aByteArray1[local17 + this.anInt1] & 0x3) << 4 | this.aByteArray1[local17 + this.anInt1 + 1] >> 4 & 0xF];
				local1 = local1 + this.aCharArray1[(this.aByteArray1[local17 + this.anInt1 + 1] & 0xF) << 2 | this.aByteArray1[local17 + this.anInt1 + 2] >> 6 & 0x3];
				local1 = local1 + this.aCharArray1[this.aByteArray1[local17 + this.anInt1 + 2] & 0x3F];
			} else if (local7 == 1) {
				local1 = local1 + this.aCharArray1[(this.aByteArray1[local17 + this.anInt1] & 0x3) << 4];
				local1 = local1 + "==";
			} else if (local7 == 2) {
				local1 = local1 + this.aCharArray1[(this.aByteArray1[local17 + this.anInt1] & 0x3) << 4 | this.aByteArray1[local17 + this.anInt1 + 1] >> 4 & 0xF];
				local1 = local1 + this.aCharArray1[(this.aByteArray1[local17 + this.anInt1 + 1] & 0xF) << 2];
				local1 = local1 + "=";
			}
		}
		return local1;
	}
}
