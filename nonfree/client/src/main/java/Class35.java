import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SXKKBWPU")
public final class Class35 {

	@OriginalMember(owner = "client!SXKKBWPU", name = "c", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!SXKKBWPU", name = "d", descriptor = "I")
	private int anInt570;

	@OriginalMember(owner = "client!SXKKBWPU", name = "e", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!SXKKBWPU", name = "f", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!SXKKBWPU", name = "g", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!SXKKBWPU", name = "h", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!SXKKBWPU", name = "i", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "client!SXKKBWPU", name = "a", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!SXKKBWPU", name = "b", descriptor = "Z")
	private boolean aBoolean133 = true;

	@OriginalMember(owner = "client!SXKKBWPU", name = "<init>", descriptor = "([BI)V")
	public Class35(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method363(arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("36260, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXKKBWPU", name = "a", descriptor = "(B[B)V")
	private void method363(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(11) Class8_Sub1_Sub3 local11 = new Class8_Sub1_Sub3(arg0, -631);
			@Pc(14) int local14 = local11.method410();
			@Pc(17) int local17 = local11.method410();
			if (local17 == local14) {
				this.aByteArray12 = arg0;
				this.aBoolean134 = false;
			} else {
				@Pc(23) byte[] local23 = new byte[local14];
				Class37.method445(local23, local14, arg0, local17, 6);
				this.aByteArray12 = local23;
				local11 = new Class8_Sub1_Sub3(this.aByteArray12, -631);
				this.aBoolean134 = true;
			}
			this.anInt570 = local11.method408();
			this.anIntArray169 = new int[this.anInt570];
			this.anIntArray170 = new int[this.anInt570];
			this.anIntArray171 = new int[this.anInt570];
			this.anIntArray172 = new int[this.anInt570];
			@Pc(83) int local83 = local11.anInt620 + this.anInt570 * 10;
			for (@Pc(85) int local85 = 0; local85 < this.anInt570; local85++) {
				this.anIntArray169[local85] = local11.method411();
				this.anIntArray170[local85] = local11.method410();
				this.anIntArray171[local85] = local11.method410();
				this.anIntArray172[local85] = local83;
				local83 += this.anIntArray171[local85];
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("22279, " + -91 + ", " + arg0 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXKKBWPU", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method364(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt570; local27++) {
			if (this.anIntArray169[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray170[local27]];
				}
				if (this.aBoolean134) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray170[local27]; local67++) {
						arg1[local67] = this.aByteArray12[this.anIntArray172[local27] + local67];
					}
				} else {
					Class37.method445(arg1, this.anIntArray170[local27], this.aByteArray12, this.anIntArray171[local27], this.anIntArray172[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
