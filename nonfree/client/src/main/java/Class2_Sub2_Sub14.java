import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!g", name = "M", descriptor = "I")
	private int anInt2205 = 4096;

	@OriginalMember(owner = "client!g", name = "P", descriptor = "I")
	private int anInt2207 = 4096;

	@OriginalMember(owner = "client!g", name = "S", descriptor = "I")
	private int anInt2209 = 4096;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt2209 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt2207 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt2205 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(29) int[][] local29 = this.method5887(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static339.anInt6735; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local69 == local65) {
					local45[local55] = this.anInt2209 * local61 >> 12;
					local49[local55] = this.anInt2207 * local65 >> 12;
					local53[local55] = local69 * this.anInt2205 >> 12;
				} else {
					local45[local55] = this.anInt2209;
					local49[local55] = this.anInt2207;
					local53[local55] = this.anInt2205;
				}
			}
		}
		return local19;
	}
}
