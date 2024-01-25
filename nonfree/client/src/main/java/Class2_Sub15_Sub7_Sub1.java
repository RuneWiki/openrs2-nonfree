import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class2_Sub15_Sub7_Sub1 extends Class2_Sub15_Sub7 {

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "[Lclient!cp;")
	public static final Class60[] aClass60Array1 = new Class60[5];

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass60Array1.length; local4++) {
			aClass60Array1[local4] = new Class60();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64 && this.method7428()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt8308 * (arg0 % super.anInt8308);
			for (@Pc(46) int local46 = 0; local46 < Static329.anInt6017; local46++) {
				@Pc(58) int local58 = super.anIntArray417[local46 % super.anInt8299 + local44];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
