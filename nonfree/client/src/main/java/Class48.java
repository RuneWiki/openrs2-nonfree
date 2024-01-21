import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "I")
	private int anInt1003 = 6;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	private int anInt1004 = -32176;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "([BI)V")
	public Class48(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 < 8 || arg1 > 8) {
				for (@Pc(18) int local18 = 1; local18 > 0; local18++) {
				}
			}
			this.method677(arg0);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("76475, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "([BZ)V")
	private void method677(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, (byte) 3);
			@Pc(10) int local10 = local7.method502();
			@Pc(13) int local13 = local7.method502();
			if (local13 == local10) {
				this.aByteArray21 = arg0;
				this.aBoolean247 = false;
			} else {
				@Pc(24) byte[] local24 = new byte[local10];
				Class40.method595(local24, local10, arg0, local13, 6);
				this.aByteArray21 = local24;
				local7 = new Class1_Sub1_Sub3(this.aByteArray21, (byte) 3);
				this.aBoolean247 = true;
			}
			this.anInt1005 = local7.method500();
			this.anIntArray267 = new int[this.anInt1005];
			this.anIntArray268 = new int[this.anInt1005];
			this.anIntArray269 = new int[this.anInt1005];
			this.anIntArray270 = new int[this.anInt1005];
			@Pc(84) int local84 = local7.anInt777 + this.anInt1005 * 10;
			for (@Pc(86) int local86 = 0; local86 < this.anInt1005; local86++) {
				this.anIntArray267[local86] = local7.method503();
				this.anIntArray268[local86] = local7.method502();
				this.anIntArray269[local86] = local7.method502();
				this.anIntArray270[local86] = local84;
				local84 += this.anIntArray269[local86];
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("43309, " + arg0 + ", " + true + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method678(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt1005; local27++) {
			if (this.anIntArray267[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray268[local27]];
				}
				if (this.aBoolean247) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray268[local27]; local67++) {
						arg1[local67] = this.aByteArray21[this.anIntArray270[local27] + local67];
					}
				} else {
					Class40.method595(arg1, this.anIntArray268[local27], this.aByteArray21, this.anIntArray269[local27], this.anIntArray270[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
