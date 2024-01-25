import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class6_Sub3_Sub21 extends Class6_Sub3 {

	@OriginalMember(owner = "client!jea", name = "H", descriptor = "I")
	private int anInt4470 = 4;

	@OriginalMember(owner = "client!jea", name = "P", descriptor = "I")
	private int anInt4475 = 4;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(25) int local25 = Static35.anInt670 / this.anInt4470;
			@Pc(30) int local30 = Static170.anInt3133 / this.anInt4475;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local30 > 0) {
				local39 = arg0 % local30;
				local49 = this.method7950(0, Static170.anInt3133 * local39 / local30);
			} else {
				local49 = this.method7950(0, 0);
			}
			for (local39 = 0; local39 < Static35.anInt670; local39++) {
				if (local25 > 0) {
					@Pc(70) int local70 = local39 % local25;
					local11[local39] = local49[local70 * Static35.anInt670 / local25];
				} else {
					local11[local39] = local49[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4470 = arg1.method6019();
		} else if (arg0 == 1) {
			this.anInt4475 = arg1.method6019();
		}
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(20) int local20 = Static35.anInt670 / this.anInt4470;
			@Pc(25) int local25 = Static170.anInt3133 / this.anInt4475;
			@Pc(44) int[][] local44;
			if (local25 > 0) {
				@Pc(34) int local34 = arg0 % local25;
				local44 = this.method7961(local34 * Static170.anInt3133 / local25, 0);
			} else {
				local44 = this.method7961(0, 0);
			}
			@Pc(56) int[] local56 = local44[0];
			@Pc(60) int[] local60 = local44[1];
			@Pc(64) int[] local64 = local44[2];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static35.anInt670; local78++) {
				@Pc(95) int local95;
				if (local20 > 0) {
					@Pc(89) int local89 = local78 % local20;
					local95 = Static35.anInt670 * local89 / local20;
				} else {
					local95 = 0;
				}
				local68[local78] = local56[local95];
				local72[local78] = local60[local95];
				local76[local78] = local64[local95];
			}
		}
		return local11;
	}
}
