import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class2_Sub15_Sub11 extends Class2_Sub15 {

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	private int anInt4360 = 4096;

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
	private int anInt4365 = 4096;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
	private int anInt4364 = 4096;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4365 = arg1.method5211();
		} else if (arg0 == 1) {
			this.anInt4364 = arg1.method5211();
		} else if (arg0 == 2) {
			this.anInt4360 = arg1.method5211();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(29) int[][] local29 = this.method9727(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static329.anInt6017; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local65 == local61 && local65 == local69) {
					local45[local55] = this.anInt4365 * local61 >> 12;
					local49[local55] = this.anInt4364 * local65 >> 12;
					local53[local55] = local69 * this.anInt4360 >> 12;
				} else {
					local45[local55] = this.anInt4365;
					local49[local55] = this.anInt4364;
					local53[local55] = this.anInt4360;
				}
			}
		}
		return local19;
	}
}
