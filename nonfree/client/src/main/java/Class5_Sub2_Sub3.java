import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class5_Sub2_Sub3 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bba", name = "F", descriptor = "Z")
	private boolean aBoolean21 = true;

	@OriginalMember(owner = "client!bba", name = "L", descriptor = "Z")
	private boolean aBoolean22 = true;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(28) int[][] local28 = this.method9033(0, this.aBoolean21 ? Static273.anInt4903 - arg0 : arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(57) int local57;
			if (this.aBoolean22) {
				for (local57 = 0; local57 < Static597.anInt10025; local57++) {
					local44[local57] = local32[Static28.anInt365 - local57];
					local48[local57] = local36[Static28.anInt365 - local57];
					local52[local57] = local40[Static28.anInt365 - local57];
				}
			} else {
				for (local57 = 0; local57 < Static597.anInt10025; local57++) {
					local44[local57] = local32[local57];
					local48[local57] = local36[local57];
					local52[local57] = local40[local57];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(36) int[] local36 = this.method9042(this.aBoolean21 ? Static273.anInt4903 - arg0 : arg0, 0);
			if (this.aBoolean22) {
				for (@Pc(49) int local49 = 0; local49 < Static597.anInt10025; local49++) {
					local18[local49] = local36[Static28.anInt365 - local49];
				}
			} else {
				Static652.method4549(local36, 0, local18, 0, Static597.anInt10025);
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean22 = arg0.method5966() == 1;
		} else if (arg1 == 1) {
			this.aBoolean21 = arg0.method5966() == 1;
		} else if (arg1 == 2) {
			super.aBoolean762 = arg0.method5966() == 1;
		}
	}
}
