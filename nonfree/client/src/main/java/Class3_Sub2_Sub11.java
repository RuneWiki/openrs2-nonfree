import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class3_Sub2_Sub11 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(29) int[][] local29 = this.method8337(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static164.anInt8839; local55++) {
				local45[local55] = 4096 - local33[local55];
				local49[local55] = 4096 - local37[local55];
				local53[local55] = 4096 - local41[local55];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			super.aBoolean855 = arg1.method8401() == 1;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(29) int[] local29 = this.method8340(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static164.anInt8839; local31++) {
				local19[local31] = 4096 - local29[local31];
			}
		}
		return local19;
	}
}
