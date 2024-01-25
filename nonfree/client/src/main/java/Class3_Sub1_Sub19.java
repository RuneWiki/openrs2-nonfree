import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class3_Sub1_Sub19 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
	private int anInt6154 = 4096;

	@OriginalMember(owner = "client!lp", name = "O", descriptor = "I")
	private int anInt6155 = 4096;

	@OriginalMember(owner = "client!lp", name = "Q", descriptor = "I")
	private int anInt6157 = 4096;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(29) int[][] local29 = this.method8360(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static131.anInt2935; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local69 == local65) {
					local45[local55] = local61 * this.anInt6155 >> 12;
					local49[local55] = local65 * this.anInt6154 >> 12;
					local53[local55] = this.anInt6157 * local69 >> 12;
				} else {
					local45[local55] = this.anInt6155;
					local49[local55] = this.anInt6154;
					local53[local55] = this.anInt6157;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6155 = arg1.method6535();
		} else if (arg0 == 1) {
			this.anInt6154 = arg1.method6535();
		} else if (arg0 == 2) {
			this.anInt6157 = arg1.method6535();
		}
	}
}
