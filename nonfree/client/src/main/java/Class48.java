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
	private int anInt1030;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "B")
	private byte aByte65 = 9;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	private int anInt1028 = 741;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "I")
	private int anInt1029 = 2;

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "([BB)V")
	public Class48(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.method677((byte) 9, arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("8537, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(B[B)V")
	private void method677(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(45427, arg1);
			@Pc(10) int local10 = local7.method502();
			@Pc(13) int local13 = local7.method502();
			if (local13 == local10) {
				this.aByteArray21 = arg1;
				this.aBoolean235 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class40.method595(local19, local10, arg1, local13, 6);
				this.aByteArray21 = local19;
				local7 = new Class1_Sub1_Sub3(45427, this.aByteArray21);
				this.aBoolean235 = true;
			}
			this.anInt1030 = local7.method500();
			@Pc(61) int local61;
			if (this.aByte65 == 9) {
				@Pc(57) boolean local57 = false;
			} else {
				for (local61 = 1; local61 > 0; local61++) {
				}
			}
			this.anIntArray267 = new int[this.anInt1030];
			this.anIntArray268 = new int[this.anInt1030];
			this.anIntArray269 = new int[this.anInt1030];
			this.anIntArray270 = new int[this.anInt1030];
			local61 = local7.anInt796 + this.anInt1030 * 10;
			for (@Pc(96) int local96 = 0; local96 < this.anInt1030; local96++) {
				this.anIntArray267[local96] = local7.method503();
				this.anIntArray268[local96] = local7.method502();
				this.anIntArray269[local96] = local7.method502();
				this.anIntArray270[local96] = local61;
				local61 += this.anIntArray269[local96];
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("76287, " + arg0 + ", " + arg1 + ", " + local135.toString());
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
		for (@Pc(27) int local27 = 0; local27 < this.anInt1030; local27++) {
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
