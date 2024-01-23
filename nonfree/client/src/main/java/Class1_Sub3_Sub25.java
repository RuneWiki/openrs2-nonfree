import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class1_Sub3_Sub25 extends Class1_Sub3 {

	@OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
	private int anInt2497 = 32768;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub25() {
		super(3, false);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt2497 = arg1.method2178() << 4;
		} else if (arg0 == 1) {
			super.aBoolean213 = arg1.method2142() == 1;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(26) int[] local26 = this.method3468(arg0, 1);
			@Pc(32) int[] local32 = this.method3468(arg0, 2);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[2];
			@Pc(44) int[] local44 = local16[1];
			for (@Pc(46) int local46 = 0; local46 < Static76.anInt1531; local46++) {
				@Pc(57) int local57 = this.anInt2497 * local32[local46] >> 12;
				@Pc(67) int local67 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(75) int local75 = Static149.anIntArray324[local67] * local57 >> 12;
				@Pc(83) int local83 = Static106.anIntArray203[local67] * local57 >> 12;
				@Pc(91) int local91 = Static171.anInt3496 & arg0 + (local75 >> 12);
				@Pc(99) int local99 = Static121.anInt2385 & local46 + (local83 >> 12);
				@Pc(105) int[][] local105 = this.method3465(local91, 0);
				local36[local46] = local105[0][local99];
				local44[local46] = local105[1][local99];
				local40[local46] = local105[2][local99];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		Static191.method3137();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(26) int[] local26 = this.method3468(arg0, 1);
			@Pc(32) int[] local32 = this.method3468(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static76.anInt1531; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt2497 >> 12;
				@Pc(61) int local61 = Static106.anIntArray203[local44] * local53 >> 12;
				@Pc(69) int local69 = (local61 >> 12) + local34 & Static121.anInt2385;
				@Pc(77) int local77 = Static149.anIntArray324[local44] * local53 >> 12;
				@Pc(85) int local85 = Static171.anInt3496 & arg0 + (local77 >> 12);
				@Pc(91) int[] local91 = this.method3468(local85, 0);
				local16[local34] = local91[local69];
			}
		}
		return local16;
	}
}
