import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class6_Sub1_Sub17 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!ih", name = "O", descriptor = "Z")
	private boolean aBoolean204 = true;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(34) int[] local34 = this.method5609(0, this.aBoolean204 ? Static113.anInt2099 - arg0 : arg0);
			if (this.aBoolean203) {
				for (@Pc(39) int local39 = 0; local39 < Static299.anInt5659; local39++) {
					local11[local39] = local34[Static76.anInt2850 - local39];
				}
			} else {
				Static358.method951(local34, 0, local11, 0, Static299.anInt5659);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(37) int[][] local37 = this.method5618(this.aBoolean204 ? Static113.anInt2099 - arg0 : arg0, 0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean203) {
				for (local66 = 0; local66 < Static299.anInt5659; local66++) {
					local53[local66] = local41[Static76.anInt2850 - local66];
					local57[local66] = local45[Static76.anInt2850 - local66];
					local61[local66] = local49[Static76.anInt2850 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static299.anInt5659; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean203 = arg0.method3972() == 1;
		} else if (arg1 == 1) {
			this.aBoolean204 = arg0.method3972() == 1;
		} else if (arg1 == 2) {
			super.aBoolean411 = arg0.method3972() == 1;
		}
	}
}
