import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!yb", name = "k", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "I")
	private int anInt988 = -213;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "B")
	private byte aByte40 = 107;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "I")
	private int anInt989 = -31;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "([BI)V")
	public Class48(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method688(this.anInt988, arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("90586, " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(I[B)V")
	private void method688(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg1, true);
			if (arg0 >= 0) {
				this.anInt989 = 331;
			}
			@Pc(15) int local15 = local7.method507();
			@Pc(18) int local18 = local7.method507();
			if (local18 == local15) {
				this.aByteArray21 = arg1;
				this.aBoolean235 = false;
			} else {
				@Pc(24) byte[] local24 = new byte[local15];
				Class40.method607(local24, local15, arg1, local18, 6);
				this.aByteArray21 = local24;
				local7 = new Class1_Sub1_Sub3(this.aByteArray21, true);
				this.aBoolean235 = true;
			}
			this.anInt990 = local7.method505();
			this.anIntArray277 = new int[this.anInt990];
			this.anIntArray278 = new int[this.anInt990];
			this.anIntArray279 = new int[this.anInt990];
			this.anIntArray280 = new int[this.anInt990];
			@Pc(84) int local84 = local7.anInt766 + this.anInt990 * 10;
			for (@Pc(86) int local86 = 0; local86 < this.anInt990; local86++) {
				this.anIntArray277[local86] = local7.method508();
				this.anIntArray278[local86] = local7.method507();
				this.anIntArray279[local86] = local7.method507();
				this.anIntArray280[local86] = local84;
				local84 += this.anIntArray279[local86];
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("35346, " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method689(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt990; local27++) {
			if (this.anIntArray277[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray278[local27]];
				}
				if (this.aBoolean235) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray278[local27]; local67++) {
						arg1[local67] = this.aByteArray21[this.anIntArray280[local27] + local67];
					}
				} else {
					Class40.method607(arg1, this.anIntArray278[local27], this.aByteArray21, this.anIntArray279[local27], this.anIntArray280[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
