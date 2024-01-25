import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
	public int anInt7214;

	@OriginalMember(owner = "client!mo", name = "gb", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(I)V")
	public Class1_Sub35(@OriginalArg(0) int arg0) {
		this.anInt7214 = 0;
		this.aByteArray85 = Static566.method7648(arg0);
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "([B)V")
	public Class1_Sub35(@OriginalArg(0) byte[] arg0) {
		this.aByteArray85 = arg0;
		this.anInt7214 = 0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)I")
	public final int method5737() {
		this.anInt7214 += 4;
		return (this.aByteArray85[this.anInt7214 - 2] & 0xFF) + ((this.aByteArray85[this.anInt7214 - 1] & 0xFF) << 8) + ((this.aByteArray85[-3 + this.anInt7214] & 0xFF) << 24) + ((this.aByteArray85[this.anInt7214 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)I")
	public final int method5738() {
		this.anInt7214 += 2;
		@Pc(37) int local37 = ((this.aByteArray85[this.anInt7214 - 2] & 0xFF) << 8) + (this.aByteArray85[this.anInt7214 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I")
	public final int method5739() {
		@Pc(18) int local18 = this.aByteArray85[this.anInt7214] & 0xFF;
		return local18 >= 128 ? this.method5771() - 32768 : this.method5750();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
	public final void method5740(@OriginalArg(0) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 + 128);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)J")
	public final long method5741(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = local6 * 8;
		@Pc(23) long local23 = 0L;
		while (local21 >= 0) {
			local23 |= ((long) this.aByteArray85[this.anInt7214++] & 0xFFL) << local21;
			local21 -= 8;
		}
		return local23;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)I")
	public final int method5742() {
		return 128 - this.aByteArray85[this.anInt7214++] & 0xFF;
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)B")
	public final byte method5743() {
		return (byte) -this.aByteArray85[this.anInt7214++];
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(Z)I")
	public final int method5744() {
		@Pc(16) byte local16 = this.aByteArray85[this.anInt7214++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray85[this.anInt7214++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)V")
	public final void method5745(@OriginalArg(0) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) arg0;
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 16);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)I")
	public final int method5746() {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = this.method5739();
		while (local16 == 32767) {
			local16 = this.method5739();
			local7 += 32767;
		}
		return local7 + local16;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method5747(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt7214;
		this.anInt7214 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5800(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(36) BigInteger local36 = local23.modPow(arg1, arg0);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt7214 = 0;
		this.method5776(local39.length);
		this.method5781(local39.length, local39);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJ)V")
	public final void method5748(@OriginalArg(1) long arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 56);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 48);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 40);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 32);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 24);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 16);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
		this.aByteArray85[this.anInt7214++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(B)Z")
	public final boolean method5749() {
		this.anInt7214 -= 4;
		@Pc(22) int local22 = Static359.method4477(0, this.aByteArray85, this.anInt7214);
		@Pc(26) int local26 = this.method5804();
		return local22 == local26;
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(Z)I")
	public final int method5750() {
		return this.aByteArray85[this.anInt7214++] & 0xFF;
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(B)B")
	public final byte method5751() {
		return this.aByteArray85[this.anInt7214++];
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I")
	public final int method5752() {
		@Pc(11) int local11 = this.aByteArray85[this.anInt7214] & 0xFF;
		return local11 >= 128 ? this.method5771() - 49152 : this.method5750() - 64;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([IIIB)V")
	public final void method5754(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt7214;
		this.anInt7214 = 5;
		@Pc(24) int local24 = (arg1 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) int local32 = this.method5804();
			@Pc(36) int local36 = this.method5804();
			@Pc(38) int local38 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= local32 + (local32 << 4 ^ local32 >>> 5) ^ arg0[local38 >>> 11 & 0x3] + local38;
				local38 -= -1640531527;
				local32 -= local36 + (local36 >>> 5 ^ local36 << 4) ^ local38 + arg0[local38 & 0x3];
			}
			this.anInt7214 -= 8;
			this.method5792(local32);
			this.method5792(local36);
		}
		this.anInt7214 = local8;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)V")
	public final void method5755(@OriginalArg(1) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 16);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
		this.aByteArray85[this.anInt7214++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)V")
	public final void method5756(@OriginalArg(1) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method5757() {
		@Pc(20) byte local20 = this.aByteArray85[this.anInt7214++];
		if (local20 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(31) int local31 = this.method5744();
		if (this.aByteArray85.length < local31 + this.anInt7214) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(57) String local57 = Static347.method4734(this.aByteArray85, local31, this.anInt7214);
		this.anInt7214 += local31;
		return local57;
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)I")
	public final int method5758() {
		this.anInt7214 += 2;
		@Pc(36) int local36 = ((this.aByteArray85[this.anInt7214 - 1] & 0xFF) << 8) + (this.aByteArray85[this.anInt7214 - 2] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)V")
	public final void method5759(@OriginalArg(1) int arg0) {
		this.aByteArray85[this.anInt7214 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray85[this.anInt7214 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray85[this.anInt7214 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray85[this.anInt7214 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(Z)Ljava/lang/String;")
	public final String method5760() {
		@Pc(6) int local6 = this.anInt7214;
		while (this.aByteArray85[this.anInt7214++] != 0) {
		}
		@Pc(33) int local33 = this.anInt7214 - local6 - 1;
		return local33 == 0 ? "" : Static133.method3234(local6, local33, this.aByteArray85);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method5761(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt7214 += Static270.method3845(this.aByteArray85, arg0.length(), arg0, this.anInt7214);
		this.aByteArray85[this.anInt7214++] = 0;
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(Z)B")
	public final byte method5762() {
		return (byte) (128 - this.aByteArray85[this.anInt7214++]);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III[B)V")
	public final void method5763(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = (byte) (this.aByteArray85[this.anInt7214++] - 128);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)V")
	public final void method5764(@OriginalArg(1) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "(B)I")
	public final int method5765() {
		this.anInt7214 += 4;
		return ((this.aByteArray85[this.anInt7214 - 1] & 0xFF) << 24) + (this.aByteArray85[this.anInt7214 - 2] << 16 & 0xFF0000) + ((this.aByteArray85[this.anInt7214 + -3] & 0xFF) << 8) + (this.aByteArray85[this.anInt7214 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)I")
	public final int method5766() {
		this.anInt7214 += 3;
		@Pc(43) int local43 = ((this.aByteArray85[this.anInt7214 - 3] & 0xFF) << 16) + (this.aByteArray85[this.anInt7214 - 2] << 8 & 0xFF00) + (this.aByteArray85[this.anInt7214 + -1] & 0xFF);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V")
	public final void method5767(@OriginalArg(0) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) arg0;
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)B")
	public final byte method5768() {
		return (byte) (this.aByteArray85[this.anInt7214++] - 128);
	}

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "(I)I")
	public final int method5769() {
		this.anInt7214 += 2;
		@Pc(33) int local33 = ((this.aByteArray85[this.anInt7214 - 1] & 0xFF) << 8) + (this.aByteArray85[this.anInt7214 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(JIB)V")
	public final void method5770(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(30) int local30 = local6 * 8; local30 >= 0; local30 -= 8) {
			this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> local30);
		}
	}

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "(B)I")
	public final int method5771() {
		this.anInt7214 += 2;
		return ((this.aByteArray85[this.anInt7214 - 2] & 0xFF) << 8) + (this.aByteArray85[this.anInt7214 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "(I)I")
	public final int method5772() {
		this.anInt7214 += 2;
		return (this.aByteArray85[this.anInt7214 - 1] - 128 & 0xFF) + ((this.aByteArray85[this.anInt7214 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)V")
	public final void method5773(@OriginalArg(0) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) arg0;
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 16);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "(I)I")
	public final int method5774() {
		this.anInt7214 += 4;
		return ((this.aByteArray85[this.anInt7214 - 3] & 0xFF) << 8) + ((this.aByteArray85[this.anInt7214 - 1] << 24 & 0xFF000000) + ((this.aByteArray85[this.anInt7214 - 2] & 0xFF) << 16) + (this.aByteArray85[this.anInt7214 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "(B)I")
	public final int method5775() {
		return -this.aByteArray85[this.anInt7214++] & 0xFF;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(ZI)V")
	public final void method5776(@OriginalArg(1) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
		this.aByteArray85[this.anInt7214++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(BI)V")
	public final void method5777(@OriginalArg(1) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "(B)J")
	public final long method5778() {
		@Pc(12) long local12 = (long) this.method5804() & 0xFFFFFFFFL;
		@Pc(21) long local21 = (long) this.method5804() & 0xFFFFFFFFL;
		return (local12 << 32) + local21;
	}

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "(I)I")
	public final int method5779() {
		this.anInt7214 += 2;
		return (this.aByteArray85[this.anInt7214 - 2] - 128 & 0xFF) + ((this.aByteArray85[this.anInt7214 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II[BI)V")
	public final void method5781(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray85[this.anInt7214++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "(Z)I")
	public final int method5782() {
		this.anInt7214 += 4;
		return ((this.aByteArray85[this.anInt7214 - 1] & 0xFF) << 16) + ((this.aByteArray85[this.anInt7214 - 2] & 0xFF) << 24) + ((this.aByteArray85[this.anInt7214 + -4] & 0xFF) << 8) + (this.aByteArray85[this.anInt7214 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "(B)I")
	public final int method5783() {
		this.anInt7214 += 2;
		return (this.aByteArray85[this.anInt7214 - 2] & 0xFF) + ((this.aByteArray85[this.anInt7214 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(BI)V")
	public final void method5784(@OriginalArg(1) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 16);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 24);
		this.aByteArray85[this.anInt7214++] = (byte) arg0;
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "(Z)I")
	public final int method5785() {
		@Pc(17) int local17 = Static359.method4477(0, this.aByteArray85, this.anInt7214);
		this.method5792(local17);
		return local17;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(IB)V")
	public final void method5786(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5777(arg0 >>> 28 | 0x80);
					}
					this.method5777(arg0 >>> 21 | 0x80);
				}
				this.method5777(arg0 >>> 14 | 0x80);
			}
			this.method5777(arg0 >>> 7 | 0x80);
		}
		this.method5777(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(BI)I")
	public final int method5787(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static359.method4477(arg0, this.aByteArray85, this.anInt7214);
		this.method5792(local11);
		return local11;
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(II)V")
	public final void method5789(@OriginalArg(1) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) arg0;
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(II)V")
	public final void method5790(@OriginalArg(1) int arg0) {
		this.aByteArray85[this.anInt7214 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray85[this.anInt7214 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(IB)V")
	public final void method5791(@OriginalArg(0) int arg0) {
		this.aByteArray85[this.anInt7214 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(II)V")
	public final void method5792(@OriginalArg(0) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 24);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 16);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
		this.aByteArray85[this.anInt7214++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "(I)I")
	public final int method5793() {
		return this.aByteArray85[this.anInt7214++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "(II)V")
	public final void method5794(@OriginalArg(0) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(ZI)V")
	public final void method5795(@OriginalArg(1) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(IB)V")
	public final void method5796(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5777(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5776(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "(I)I")
	public final int method5797() {
		this.anInt7214 += 3;
		return (this.aByteArray85[this.anInt7214 - 1] & 0xFF) + ((this.aByteArray85[this.anInt7214 - 3] & 0xFF) << 16) + ((this.aByteArray85[this.anInt7214 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method5798() {
		@Pc(14) byte local14 = this.aByteArray85[this.anInt7214++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt7214;
		while (this.aByteArray85[this.anInt7214++] != 0) {
		}
		@Pc(52) int local52 = this.anInt7214 - local27 - 1;
		return local52 == 0 ? "" : Static133.method3234(local27, local52, this.aByteArray85);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B[BII)V")
	public final void method5800(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			arg0[local9] = this.aByteArray85[this.anInt7214++];
		}
	}

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "(Z)Ljava/lang/String;")
	public final String method5801() {
		if (this.aByteArray85[this.anInt7214] == 0) {
			this.anInt7214++;
			return null;
		} else {
			return this.method5760();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method5802(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = Static448.method6202(arg0);
		this.aByteArray85[this.anInt7214++] = 0;
		this.method5786(local11);
		this.anInt7214 += Static549.method6484(this.anInt7214, arg0, this.aByteArray85);
	}

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "(II)V")
	public final void method5803(@OriginalArg(0) int arg0) {
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 8);
		this.aByteArray85[this.anInt7214++] = (byte) arg0;
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 24);
		this.aByteArray85[this.anInt7214++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "(I)I")
	public final int method5804() {
		this.anInt7214 += 4;
		return (this.aByteArray85[this.anInt7214 - 1] & 0xFF) + ((this.aByteArray85[this.anInt7214 - 3] & 0xFF) << 16) + ((this.aByteArray85[this.anInt7214 + -4] & 0xFF) << 24) + ((this.aByteArray85[this.anInt7214 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "(Z)V")
	public final void method5805() {
		if (this.aByteArray85 != null) {
			Static566.method7644(this.aByteArray85);
		}
		this.aByteArray85 = null;
	}
}
