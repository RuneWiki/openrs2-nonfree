import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "D", descriptor = "I")
	private int anInt41 = 4096;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "I")
	private int anInt43 = 0;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "I")
	private int anInt45 = 8192;

	@OriginalMember(owner = "client!a", name = "N", descriptor = "I")
	private int anInt51 = 2048;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "I")
	private int anInt49 = 12288;

	@OriginalMember(owner = "client!a", name = "P", descriptor = "I")
	private int anInt53 = 0;

	@OriginalMember(owner = "client!a", name = "R", descriptor = "I")
	private int anInt54 = 2048;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(III)Z")
	private boolean method37(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = this.anInt49 * (arg0 - arg1) >> 12;
		@Pc(29) int local29 = Static549.anIntArray610[local19 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt49;
		@Pc(43) int local43 = (local36 << 12) / this.anInt45;
		@Pc(50) int local50 = this.anInt41 * local43 >> 12;
		return local50 > arg0 + arg1 && arg0 + arg1 > -local50;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(III)Z")
	private boolean method39(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = (arg1 + arg0) * this.anInt49 >> 12;
		@Pc(28) int local28 = Static549.anIntArray610[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt49;
		@Pc(42) int local42 = (local35 << 12) / this.anInt45;
		@Pc(49) int local49 = local42 * this.anInt41 >> 12;
		return local49 > arg1 - arg0 && -local49 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(27) int local27 = Static337.anIntArray406[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static87.anInt1964; local29++) {
				@Pc(37) int local37 = Static436.anIntArray506[local29] - 2048;
				@Pc(42) int local42 = this.anInt51 + local37;
				@Pc(53) int local53 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(64) int local64 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(69) int local69 = this.anInt53 + local27;
				@Pc(78) int local78 = local69 >= -2048 ? local69 : local69 + 4096;
				@Pc(87) int local87 = local78 > 2048 ? local78 - 4096 : local78;
				@Pc(92) int local92 = this.anInt43 + local37;
				@Pc(101) int local101 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(110) int local110 = local101 > 2048 ? local101 - 4096 : local101;
				@Pc(116) int local116 = local27 + this.anInt54;
				@Pc(127) int local127 = local116 < -2048 ? local116 + 4096 : local116;
				@Pc(138) int local138 = local127 <= 2048 ? local127 : local127 - 4096;
				local17[local29] = this.method37(local87, local64) || this.method39(local110, local138) ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt51 = arg1.method4426();
		} else if (arg0 == 1) {
			this.anInt53 = arg1.method4426();
		} else if (arg0 == 2) {
			this.anInt43 = arg1.method4426();
		} else if (arg0 == 3) {
			this.anInt54 = arg1.method4426();
		} else if (arg0 == 4) {
			this.anInt49 = arg1.method4426();
		} else if (arg0 == 5) {
			this.anInt41 = arg1.method4426();
		} else if (arg0 == 6) {
			this.anInt45 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		Static316.method4803();
	}
}
