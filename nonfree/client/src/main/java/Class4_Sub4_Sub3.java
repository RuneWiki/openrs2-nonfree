import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class4_Sub4_Sub3 extends Class4_Sub4 {

	@OriginalMember(owner = "client!cr", name = "L", descriptor = "I")
	private int anInt1134 = 8192;

	@OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
	private int anInt1133 = 2048;

	@OriginalMember(owner = "client!cr", name = "R", descriptor = "I")
	private int anInt1140 = 2048;

	@OriginalMember(owner = "client!cr", name = "U", descriptor = "I")
	private int anInt1142 = 0;

	@OriginalMember(owner = "client!cr", name = "W", descriptor = "I")
	private int anInt1144 = 0;

	@OriginalMember(owner = "client!cr", name = "T", descriptor = "I")
	private int anInt1141 = 4096;

	@OriginalMember(owner = "client!cr", name = "V", descriptor = "I")
	private int anInt1143 = 12288;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(27) int local27 = Static64.anIntArray148[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static124.anInt3576; local29++) {
				@Pc(37) int local37 = Static149.anIntArray298[local29] - 2048;
				@Pc(43) int local43 = local37 + this.anInt1133;
				@Pc(52) int local52 = local43 < -2048 ? local43 + 4096 : local43;
				@Pc(63) int local63 = local52 <= 2048 ? local52 : local52 - 4096;
				@Pc(69) int local69 = local27 + this.anInt1142;
				@Pc(78) int local78 = local69 >= -2048 ? local69 : local69 + 4096;
				@Pc(87) int local87 = local78 <= 2048 ? local78 : local78 - 4096;
				@Pc(93) int local93 = local37 + this.anInt1144;
				@Pc(102) int local102 = local93 >= -2048 ? local93 : local93 + 4096;
				@Pc(111) int local111 = local102 <= 2048 ? local102 : local102 - 4096;
				@Pc(116) int local116 = this.anInt1140 + local27;
				@Pc(125) int local125 = local116 >= -2048 ? local116 : local116 + 4096;
				@Pc(134) int local134 = local125 <= 2048 ? local125 : local125 - 4096;
				local17[local29] = this.method958(local87, local63) || this.method955(local134, local111) ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(III)Z")
	private boolean method955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = (arg1 + arg0) * this.anInt1143 >> 12;
		@Pc(28) int local28 = Static238.anIntArray411[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt1143;
		@Pc(42) int local42 = (local35 << 12) / this.anInt1134;
		@Pc(49) int local49 = this.anInt1141 * local42 >> 12;
		return local49 > arg0 - arg1 && arg0 - arg1 > -local49;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		Static317.method5269();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt1133 = arg1.method2404();
		} else if (arg0 == 1) {
			this.anInt1142 = arg1.method2404();
		} else if (arg0 == 2) {
			this.anInt1144 = arg1.method2404();
		} else if (arg0 == 3) {
			this.anInt1140 = arg1.method2404();
		} else if (arg0 == 4) {
			this.anInt1143 = arg1.method2404();
		} else if (arg0 == 5) {
			this.anInt1141 = arg1.method2404();
		} else if (arg0 == 6) {
			this.anInt1134 = arg1.method2404();
		}
	}

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "(III)Z")
	private boolean method958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt1143 * (arg0 - arg1) >> 12;
		@Pc(31) int local31 = Static238.anIntArray411[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt1143;
		@Pc(45) int local45 = (local38 << 12) / this.anInt1134;
		@Pc(52) int local52 = this.anInt1141 * local45 >> 12;
		return local52 > arg0 + arg1 && -local52 < arg0 + arg1;
	}
}
