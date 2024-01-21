import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class3_Sub2_Sub32 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ta", name = "Z", descriptor = "Z")
	private boolean aBoolean164 = true;

	@OriginalMember(owner = "client!ta", name = "ab", descriptor = "Z")
	private boolean aBoolean165 = true;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(37) int[] local37 = this.method3328(0, this.aBoolean164 ? Static170.anInt1101 - arg0 : arg0);
			if (this.aBoolean165) {
				for (@Pc(50) int local50 = 0; local50 < Static190.anInt3865; local50++) {
					local15[local50] = local37[Static134.anInt2681 - local50];
				}
			} else {
				Static218.method2013(local37, 0, local15, 0, Static190.anInt3865);
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean165 = arg0.method1278() == 1;
		} else if (arg1 == 1) {
			this.aBoolean164 = arg0.method1278() == 1;
		} else if (arg1 == 2) {
			super.aBoolean190 = arg0.method1278() == 1;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(37) int[][] local37 = this.method3332(0, this.aBoolean164 ? Static170.anInt1101 - arg0 : arg0);
			@Pc(41) int[] local41 = local37[1];
			@Pc(45) int[] local45 = local37[0];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[2];
			@Pc(61) int[] local61 = local19[1];
			@Pc(66) int local66;
			if (this.aBoolean165) {
				for (local66 = 0; local66 < Static190.anInt3865; local66++) {
					local53[local66] = local45[Static134.anInt2681 - local66];
					local61[local66] = local41[Static134.anInt2681 - local66];
					local57[local66] = local49[Static134.anInt2681 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static190.anInt3865; local66++) {
					local53[local66] = local45[local66];
					local61[local66] = local41[local66];
					local57[local66] = local49[local66];
				}
			}
		}
		return local19;
	}
}
