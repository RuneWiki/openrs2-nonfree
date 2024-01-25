import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class3_Sub2_Sub37 extends Class3_Sub2 {

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub37() {
		super(3, false);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean761 = arg0.method4888() == 1;
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(29) int[] local29 = this.method8716(2, arg0);
			@Pc(35) int[][] local35 = this.method8718(0, arg0);
			@Pc(41) int[][] local41 = this.method8718(1, arg0);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static30.anInt908; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local45[local79] = local57[local79];
					local49[local79] = local61[local79];
					local53[local79] = local65[local79];
				} else if (local85 == 0) {
					local45[local79] = local69[local79];
					local49[local79] = local73[local79];
					local53[local79] = local77[local79];
				} else {
					@Pc(138) int local138 = 4096 - local85;
					local45[local79] = local57[local79] * local85 + local138 * local69[local79] >> 12;
					local49[local79] = local138 * local73[local79] + local85 * local61[local79] >> 12;
					local53[local79] = local138 * local77[local79] + local65[local79] * local85 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(31) int[] local31 = this.method8716(0, arg0);
			@Pc(37) int[] local37 = this.method8716(1, arg0);
			@Pc(43) int[] local43 = this.method8716(2, arg0);
			for (@Pc(45) int local45 = 0; local45 < Static30.anInt908; local45++) {
				@Pc(51) int local51 = local43[local45];
				if (local51 == 4096) {
					local19[local45] = local31[local45];
				} else if (local51 == 0) {
					local19[local45] = local37[local45];
				} else {
					local19[local45] = local31[local45] * local51 + local37[local45] * (4096 - local51) >> 12;
				}
			}
		}
		return local19;
	}
}
