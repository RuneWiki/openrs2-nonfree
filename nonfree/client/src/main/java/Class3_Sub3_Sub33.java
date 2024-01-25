import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class3_Sub3_Sub33 extends Class3_Sub3 {

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "Z")
	private boolean aBoolean417 = true;

	@OriginalMember(owner = "client!tq", name = "R", descriptor = "Z")
	private boolean aBoolean419 = true;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(34) int[] local34 = this.method5733(this.aBoolean419 ? Static351.anInt6821 - arg0 : arg0, 0);
			if (this.aBoolean417) {
				for (@Pc(47) int local47 = 0; local47 < Static131.anInt2755; local47++) {
					local16[local47] = local34[Static167.anInt3460 - local47];
				}
			} else {
				Static367.method4032(local34, 0, local16, 0, Static131.anInt2755);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(33) int[][] local33 = this.method5729(0, this.aBoolean419 ? Static351.anInt6821 - arg0 : arg0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[1];
			@Pc(57) int[] local57 = local11[2];
			@Pc(62) int local62;
			if (this.aBoolean417) {
				for (local62 = 0; local62 < Static131.anInt2755; local62++) {
					local49[local62] = local37[Static167.anInt3460 - local62];
					local53[local62] = local41[Static167.anInt3460 - local62];
					local57[local62] = local45[Static167.anInt3460 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static131.anInt2755; local62++) {
					local49[local62] = local37[local62];
					local53[local62] = local41[local62];
					local57[local62] = local45[local62];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean417 = arg0.method3643() == 1;
		} else if (arg1 == 1) {
			this.aBoolean419 = arg0.method3643() == 1;
		} else if (arg1 == 2) {
			super.aBoolean454 = arg0.method3643() == 1;
		}
	}
}
