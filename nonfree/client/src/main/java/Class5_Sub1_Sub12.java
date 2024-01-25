import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class5_Sub1_Sub12 extends Class5_Sub1 {

	@OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
	private int anInt2243 = 2048;

	@OriginalMember(owner = "client!fv", name = "J", descriptor = "I")
	private int anInt2246 = 8192;

	@OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
	private int anInt2241 = 4096;

	@OriginalMember(owner = "client!fv", name = "L", descriptor = "I")
	private int anInt2248 = 12288;

	@OriginalMember(owner = "client!fv", name = "O", descriptor = "I")
	private int anInt2251 = 2048;

	@OriginalMember(owner = "client!fv", name = "H", descriptor = "I")
	private int anInt2244 = 0;

	@OriginalMember(owner = "client!fv", name = "P", descriptor = "I")
	private int anInt2252 = 0;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt2251 = arg1.method5598();
		} else if (arg0 == 1) {
			this.anInt2252 = arg1.method5598();
		} else if (arg0 == 2) {
			this.anInt2244 = arg1.method5598();
		} else if (arg0 == 3) {
			this.anInt2243 = arg1.method5598();
		} else if (arg0 == 4) {
			this.anInt2248 = arg1.method5598();
		} else if (arg0 == 5) {
			this.anInt2241 = arg1.method5598();
		} else if (arg0 == 6) {
			this.anInt2246 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		Static56.method929();
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(III)Z")
	private boolean method1797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt2248 >> 12;
		@Pc(30) int local30 = Static412.anIntArray467[local12 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt2248;
		@Pc(44) int local44 = (local37 << 12) / this.anInt2246;
		@Pc(51) int local51 = this.anInt2241 * local44 >> 12;
		return local51 > arg0 - arg1 && -local51 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(26) int local26 = Static346.anIntArray401[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static148.anInt2666; local28++) {
				@Pc(36) int local36 = Static224.anIntArray234[local28] - 2048;
				@Pc(41) int local41 = this.anInt2251 + local36;
				@Pc(52) int local52 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(61) int local61 = local52 > 2048 ? local52 - 4096 : local52;
				@Pc(66) int local66 = this.anInt2252 + local26;
				@Pc(77) int local77 = local66 < -2048 ? local66 + 4096 : local66;
				@Pc(88) int local88 = local77 > 2048 ? local77 - 4096 : local77;
				@Pc(93) int local93 = this.anInt2244 + local36;
				@Pc(102) int local102 = local93 >= -2048 ? local93 : local93 + 4096;
				@Pc(111) int local111 = local102 <= 2048 ? local102 : local102 - 4096;
				@Pc(117) int local117 = local26 + this.anInt2243;
				@Pc(128) int local128 = local117 >= -2048 ? local117 : local117 + 4096;
				@Pc(137) int local137 = local128 <= 2048 ? local128 : local128 - 4096;
				local16[local28] = this.method1800(local88, local61) || this.method1797(local137, local111) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBI)Z")
	private boolean method1800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) int local23 = (arg0 - arg1) * this.anInt2248 >> 12;
		@Pc(33) int local33 = Static412.anIntArray467[local23 * 255 >> 12 & 0xFF];
		@Pc(40) int local40 = (local33 << 12) / this.anInt2248;
		@Pc(47) int local47 = (local40 << 12) / this.anInt2246;
		@Pc(54) int local54 = local47 * this.anInt2241 >> 12;
		return local54 > arg1 + arg0 && arg1 + arg0 > -local54;
	}
}
