import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class3_Sub4_Sub30 extends Class3_Sub4 {

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean504 = arg0.method4096() == 1;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(29) int[][] local29 = this.method6138(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static148.anInt2687; local55++) {
				local45[local55] = 4096 - local33[local55];
				local49[local55] = 4096 - local37[local55];
				local53[local55] = 4096 - local41[local55];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(26) int[] local26 = this.method6139(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static148.anInt2687; local28++) {
				local11[local28] = 4096 - local26[local28];
			}
		}
		return local11;
	}
}
