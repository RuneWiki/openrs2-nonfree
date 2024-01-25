import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class1_Sub4_Sub22 extends Class1_Sub4 {

	@OriginalMember(owner = "client!kt", name = "O", descriptor = "[I")
	public static final int[] anIntArray236 = new int[4096];

	static {
		for (@Pc(12) int local12 = 0; local12 < 4096; local12++) {
			anIntArray236[local12] = Static209.method3086(local12);
		}
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(21) int[] local21 = this.method5695(arg0, 2);
			@Pc(27) int[][] local27 = this.method5696(arg0, 0);
			@Pc(33) int[][] local33 = this.method5696(arg0, 1);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static395.anInt6592; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local37[local71] = local49[local71];
					local41[local71] = local53[local71];
					local45[local71] = local57[local71];
				} else if (local77 == 0) {
					local37[local71] = local61[local71];
					local41[local71] = local65[local71];
					local45[local71] = local69[local71];
				} else {
					@Pc(128) int local128 = 4096 - local77;
					local37[local71] = local49[local71] * local77 + local128 * local61[local71] >> 12;
					local41[local71] = local128 * local65[local71] + local77 * local53[local71] >> 12;
					local45[local71] = local77 * local57[local71] + local128 * local69[local71] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean796 = arg0.method5337() == 1;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(29) int[] local29 = this.method5695(arg0, 0);
			@Pc(35) int[] local35 = this.method5695(arg0, 1);
			@Pc(43) int[] local43 = this.method5695(arg0, 2);
			for (@Pc(45) int local45 = 0; local45 < Static395.anInt6592; local45++) {
				@Pc(51) int local51 = local43[local45];
				if (local51 == 4096) {
					local11[local45] = local29[local45];
				} else if (local51 == 0) {
					local11[local45] = local35[local45];
				} else {
					local11[local45] = local51 * local29[local45] + local35[local45] * (4096 - local51) >> 12;
				}
			}
		}
		return local11;
	}
}
