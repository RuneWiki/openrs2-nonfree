import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AKPFVPPG")
public final class Class2 {

	@OriginalMember(owner = "client!AKPFVPPG", name = "c", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!AKPFVPPG", name = "d", descriptor = "I")
	private int anInt3;

	@OriginalMember(owner = "client!AKPFVPPG", name = "e", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!AKPFVPPG", name = "f", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!AKPFVPPG", name = "g", descriptor = "[I")
	private int[] anIntArray3;

	@OriginalMember(owner = "client!AKPFVPPG", name = "h", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!AKPFVPPG", name = "i", descriptor = "Z")
	private boolean aBoolean4;

	@OriginalMember(owner = "client!AKPFVPPG", name = "a", descriptor = "Z")
	private boolean aBoolean2 = true;

	@OriginalMember(owner = "client!AKPFVPPG", name = "b", descriptor = "Z")
	private boolean aBoolean3 = true;

	@OriginalMember(owner = "client!AKPFVPPG", name = "<init>", descriptor = "(Z[B)V")
	public Class2(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method6(arg1);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("68655, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKPFVPPG", name = "a", descriptor = "([BZ)V")
	private void method6(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class4_Sub1_Sub3 local7 = new Class4_Sub1_Sub3(arg0, (byte) 3);
			@Pc(13) int local13 = local7.method106();
			@Pc(16) int local16 = local7.method106();
			if (local16 == local13) {
				this.aByteArray1 = arg0;
				this.aBoolean4 = false;
			} else {
				@Pc(22) byte[] local22 = new byte[local13];
				Class42.method405(local22, local13, arg0, local16, 6);
				this.aByteArray1 = local22;
				local7 = new Class4_Sub1_Sub3(this.aByteArray1, (byte) 3);
				this.aBoolean4 = true;
			}
			this.anInt3 = local7.method104();
			this.anIntArray1 = new int[this.anInt3];
			this.anIntArray2 = new int[this.anInt3];
			this.anIntArray3 = new int[this.anInt3];
			this.anIntArray4 = new int[this.anInt3];
			@Pc(82) int local82 = local7.anInt101 + this.anInt3 * 10;
			for (@Pc(84) int local84 = 0; local84 < this.anInt3; local84++) {
				this.anIntArray1[local84] = local7.method107();
				this.anIntArray2[local84] = local7.method106();
				this.anIntArray3[local84] = local7.method106();
				this.anIntArray4[local84] = local82;
				local82 += this.anIntArray3[local84];
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("88886, " + arg0 + ", " + true + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKPFVPPG", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method7(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt3; local27++) {
			if (this.anIntArray1[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray2[local27]];
				}
				if (this.aBoolean4) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray2[local27]; local67++) {
						arg1[local67] = this.aByteArray1[this.anIntArray4[local27] + local67];
					}
				} else {
					Class42.method405(arg1, this.anIntArray2[local27], this.aByteArray1, this.anIntArray3[local27], this.anIntArray4[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
