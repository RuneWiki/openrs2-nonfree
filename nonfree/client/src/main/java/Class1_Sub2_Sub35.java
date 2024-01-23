import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class1_Sub2_Sub35 extends Class1_Sub2 {

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(26) int[] local26 = this.method3514(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static105.anInt2391; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean265 = arg0.method895() == 1;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(28) int[][] local28 = this.method3501(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[2];
			@Pc(40) int[] local40 = local28[1];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static105.anInt2391; local54++) {
				local44[local54] = 4096 - local32[local54];
				local48[local54] = 4096 - local40[local54];
				local52[local54] = 4096 - local36[local54];
			}
		}
		return local18;
	}
}
