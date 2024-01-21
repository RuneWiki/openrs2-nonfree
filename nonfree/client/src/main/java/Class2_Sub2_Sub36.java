import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class2_Sub2_Sub36 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
	private int anInt4392 = 4096;

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
	private int anInt4393 = 4096;

	@OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
	private int anInt4390 = 4096;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4393 = arg1.method234();
		} else if (arg0 == 1) {
			this.anInt4392 = arg1.method234();
		} else if (arg0 == 2) {
			this.anInt4390 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(29) int[][] local29 = this.method3557(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[2];
			@Pc(53) int[] local53 = local19[1];
			for (@Pc(55) int local55 = 0; local55 < Static106.anInt3045; local55++) {
				@Pc(61) int local61 = local41[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local33[local55];
				if (local69 == local61 && local61 == local65) {
					local45[local55] = local69 * this.anInt4393 >> 12;
					local53[local55] = local61 * this.anInt4392 >> 12;
					local49[local55] = local65 * this.anInt4390 >> 12;
				} else {
					local45[local55] = this.anInt4393;
					local53[local55] = this.anInt4392;
					local49[local55] = this.anInt4390;
				}
			}
		}
		return local19;
	}
}
