import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RVLWVPJQ")
public final class Class36 {

	@OriginalMember(owner = "client!RVLWVPJQ", name = "c", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!RVLWVPJQ", name = "d", descriptor = "I")
	private int anInt580;

	@OriginalMember(owner = "client!RVLWVPJQ", name = "e", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!RVLWVPJQ", name = "f", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!RVLWVPJQ", name = "g", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!RVLWVPJQ", name = "h", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!RVLWVPJQ", name = "i", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!RVLWVPJQ", name = "a", descriptor = "B")
	private byte aByte22 = 6;

	@OriginalMember(owner = "client!RVLWVPJQ", name = "b", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!RVLWVPJQ", name = "<init>", descriptor = "(I[B)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method380(arg1);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("69143, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RVLWVPJQ", name = "a", descriptor = "([BI)V")
	private void method380(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class6_Sub2_Sub3 local7 = new Class6_Sub2_Sub3(741, arg0);
			@Pc(10) int local10 = local7.method406();
			@Pc(13) int local13 = local7.method406();
			if (local13 == local10) {
				this.aByteArray16 = arg0;
				this.aBoolean155 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class31.method362(local19, local10, arg0, local13, 6);
				this.aByteArray16 = local19;
				local7 = new Class6_Sub2_Sub3(741, this.aByteArray16);
				this.aBoolean155 = true;
			}
			this.anInt580 = local7.method404();
			this.anIntArray136 = new int[this.anInt580];
			this.anIntArray137 = new int[this.anInt580];
			this.anIntArray138 = new int[this.anInt580];
			this.anIntArray139 = new int[this.anInt580];
			@Pc(79) int local79 = local7.anInt609 + this.anInt580 * 10;
			for (@Pc(85) int local85 = 0; local85 < this.anInt580; local85++) {
				this.anIntArray136[local85] = local7.method407();
				this.anIntArray137[local85] = local7.method406();
				this.anIntArray138[local85] = local7.method406();
				this.anIntArray139[local85] = local79;
				local79 += this.anIntArray138[local85];
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("99236, " + arg0 + ", " + 1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RVLWVPJQ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method381(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt580; local27++) {
			if (this.anIntArray136[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray137[local27]];
				}
				if (this.aBoolean155) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray137[local27]; local67++) {
						arg1[local67] = this.aByteArray16[this.anIntArray139[local27] + local67];
					}
				} else {
					Class31.method362(arg1, this.anIntArray137[local27], this.aByteArray16, this.anIntArray138[local27], this.anIntArray139[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
