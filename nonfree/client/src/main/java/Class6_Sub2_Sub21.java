import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class6_Sub2_Sub21 extends Class6_Sub2 {

	@OriginalMember(owner = "client!le", name = "C", descriptor = "Z")
	private boolean aBoolean249 = true;

	@OriginalMember(owner = "client!le", name = "F", descriptor = "Z")
	private boolean aBoolean250 = true;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(36) int[][] local36 = this.method5867(this.aBoolean250 ? Static296.anInt4928 - arg0 : arg0, 0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local18[0];
			@Pc(56) int[] local56 = local18[1];
			@Pc(60) int[] local60 = local18[2];
			@Pc(65) int local65;
			if (this.aBoolean249) {
				for (local65 = 0; local65 < Static185.anInt4925; local65++) {
					local52[local65] = local40[Static64.anInt1348 - local65];
					local56[local65] = local44[Static64.anInt1348 - local65];
					local60[local65] = local48[Static64.anInt1348 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static185.anInt4925; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean249 = arg0.method3111() == 1;
		} else if (arg1 == 1) {
			this.aBoolean250 = arg0.method3111() == 1;
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method3111() == 1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(37) int[] local37 = this.method5858(0, this.aBoolean250 ? Static296.anInt4928 - arg0 : arg0);
			if (this.aBoolean249) {
				for (@Pc(50) int local50 = 0; local50 < Static185.anInt4925; local50++) {
					local11[local50] = local37[Static64.anInt1348 - local50];
				}
			} else {
				Static459.method5352(local37, 0, local11, 0, Static185.anInt4925);
			}
		}
		return local11;
	}
}
