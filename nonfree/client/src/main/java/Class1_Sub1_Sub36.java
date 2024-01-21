import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vf", name = "eb", descriptor = "I")
	private int anInt4474 = 32768;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(3, false);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(26) int[] local26 = this.method3580(arg0, 1);
			@Pc(32) int[] local32 = this.method3580(arg0, 2);
			@Pc(36) int[] local36 = local16[1];
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static115.anInt2578; local46++) {
				@Pc(57) int local57 = local32[local46] * this.anInt4474 >> 12;
				@Pc(67) int local67 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(75) int local75 = local57 * Static134.anIntArray243[local67] >> 12;
				@Pc(83) int local83 = Static91.anInt2110 & arg0 + (local75 >> 12);
				@Pc(91) int local91 = local57 * Static189.anIntArray364[local67] >> 12;
				@Pc(99) int local99 = (local91 >> 12) + local46 & Static48.anInt1202;
				@Pc(105) int[][] local105 = this.method3579(local83, 0);
				local40[local46] = local105[0][local99];
				local36[local46] = local105[1][local99];
				local44[local46] = local105[2][local99];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(26) int[] local26 = this.method3580(arg0, 1);
			@Pc(34) int[] local34 = this.method3580(arg0, 2);
			for (@Pc(36) int local36 = 0; local36 < Static115.anInt2578; local36++) {
				@Pc(46) int local46 = local26[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = local34[local36] * this.anInt4474 >> 12;
				@Pc(63) int local63 = local55 * Static189.anIntArray364[local46] >> 12;
				@Pc(71) int local71 = local36 + (local63 >> 12) & Static48.anInt1202;
				@Pc(79) int local79 = local55 * Static134.anIntArray243[local46] >> 12;
				@Pc(87) int local87 = Static91.anInt2110 & arg0 + (local79 >> 12);
				@Pc(95) int[] local95 = this.method3580(local87, 0);
				local7[local36] = local95[local71];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4474 = arg0.method2765() << 4;
		} else if (arg1 == 1) {
			super.aBoolean231 = arg0.method2771() == 1;
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		Static64.method1304();
	}
}
