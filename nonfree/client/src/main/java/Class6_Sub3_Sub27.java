import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class6_Sub3_Sub27 extends Class6_Sub3 {

	@OriginalMember(owner = "client!op", name = "G", descriptor = "I")
	private int anInt6381 = 4096;

	@OriginalMember(owner = "client!op", name = "D", descriptor = "I")
	private int anInt6379 = 4096;

	@OriginalMember(owner = "client!op", name = "L", descriptor = "I")
	private int anInt6384 = 4096;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt6384 = arg1.method6006();
		} else if (arg0 == 1) {
			this.anInt6379 = arg1.method6006();
		} else if (arg0 == 2) {
			this.anInt6381 = arg1.method6006();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(29) int[][] local29 = this.method7823(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static447.anInt8568; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local69 == local65) {
					local45[local55] = local61 * this.anInt6384 >> 12;
					local49[local55] = this.anInt6379 * local65 >> 12;
					local53[local55] = this.anInt6381 * local69 >> 12;
				} else {
					local45[local55] = this.anInt6384;
					local49[local55] = this.anInt6379;
					local53[local55] = this.anInt6381;
				}
			}
		}
		return local19;
	}
}
