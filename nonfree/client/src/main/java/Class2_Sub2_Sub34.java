import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class2_Sub2_Sub34 extends Class2_Sub2 {

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
	private int anInt3285;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
	private int anInt3292;

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
	private int anInt3289;

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
	private int anInt3294;

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
	private int anInt3295;

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
	private int anInt3300;

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
	private int anInt3302;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(30) int local30 = Static86.anIntArray218[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static149.anInt3233; local32++) {
				@Pc(39) int local39 = this.anInt3289 + local30;
				@Pc(50) int local50 = local39 >= -2048 ? local39 : local39 + 4096;
				@Pc(59) int local59 = local50 > 2048 ? local50 - 4096 : local50;
				@Pc(65) int local65 = Static154.anIntArray354[local32] - 2048;
				@Pc(70) int local70 = this.anInt3300 + local65;
				@Pc(75) int local75 = this.anInt3302 + local30;
				@Pc(86) int local86 = local70 >= -2048 ? local70 : local70 + 4096;
				@Pc(95) int local95 = local86 > 2048 ? local86 - 4096 : local86;
				@Pc(100) int local100 = this.anInt3294 + local65;
				@Pc(111) int local111 = local75 >= -2048 ? local75 : local75 + 4096;
				@Pc(122) int local122 = local111 > 2048 ? local111 - 4096 : local111;
				@Pc(133) int local133 = local100 < -2048 ? local100 + 4096 : local100;
				@Pc(144) int local144 = local133 > 2048 ? local133 - 4096 : local133;
				local11[local32] = this.method2368(local59, local95) || this.method2369(local122, local144) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIB)Z")
	private boolean method2368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = (arg0 - arg1) * this.anInt3292 >> 12;
		@Pc(28) int local28 = Static45.anIntArray135[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt3292;
		@Pc(42) int local42 = (local35 << 12) / this.anInt3295;
		@Pc(49) int local49 = local42 * this.anInt3285 >> 12;
		return local49 > arg1 + arg0 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZI)Z")
	private boolean method2369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt3292 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static45.anIntArray135[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt3292;
		@Pc(36) int local36 = (local29 << 12) / this.anInt3295;
		@Pc(52) int local52 = local36 * this.anInt3285 >> 12;
		return local52 > arg0 - arg1 && -local52 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3300 = arg1.method1456();
		} else if (arg0 == 1) {
			this.anInt3289 = arg1.method1456();
		} else if (arg0 == 2) {
			this.anInt3294 = arg1.method1456();
		} else if (arg0 == 3) {
			this.anInt3302 = arg1.method1456();
		} else if (arg0 == 4) {
			this.anInt3292 = arg1.method1456();
		} else if (arg0 == 5) {
			this.anInt3285 = arg1.method1456();
		} else if (arg0 == 6) {
			this.anInt3295 = arg1.method1456();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
	@Override
	public void method2574() {
		Static100.method1657();
	}
}
