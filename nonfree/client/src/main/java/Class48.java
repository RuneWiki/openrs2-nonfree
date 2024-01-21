import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "I")
	private int anInt999 = -751;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "(B[B)V")
	public Class48(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg0 != -21) {
				this.aBoolean234 = !this.aBoolean234;
			}
			this.method677(arg1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("99947, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "([BI)V")
	private void method677(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 337);
			@Pc(10) int local10 = local7.method502();
			@Pc(13) int local13 = local7.method502();
			if (local13 == local10) {
				this.aByteArray21 = arg0;
				this.aBoolean235 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class40.method595(local19, local10, arg0, local13, 6);
				this.aByteArray21 = local19;
				local7 = new Class1_Sub1_Sub3(this.aByteArray21, 337);
				this.aBoolean235 = true;
			}
			this.anInt1000 = local7.method500();
			this.anIntArray267 = new int[this.anInt1000];
			this.anIntArray268 = new int[this.anInt1000];
			this.anIntArray269 = new int[this.anInt1000];
			this.anIntArray270 = new int[this.anInt1000];
			@Pc(79) int local79 = local7.anInt768 + this.anInt1000 * 10;
			for (@Pc(81) int local81 = 0; local81 < this.anInt1000; local81++) {
				this.anIntArray267[local81] = local7.method503();
				this.anIntArray268[local81] = local7.method502();
				this.anIntArray269[local81] = local7.method502();
				this.anIntArray270[local81] = local79;
				local79 += this.anIntArray269[local81];
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("90872, " + arg0 + ", " + -42280 + ", " + local130.toString());
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
		for (@Pc(27) int local27 = 0; local27 < this.anInt1000; local27++) {
			if (this.anIntArray267[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray268[local27]];
				}
				if (this.aBoolean235) {
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
