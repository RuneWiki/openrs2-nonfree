import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(29) int[] local29 = this.method3393(arg0, 2);
			@Pc(35) int[][] local35 = this.method3397(0, arg0);
			@Pc(41) int[][] local41 = this.method3397(1, arg0);
			@Pc(45) int[] local45 = local19[1];
			@Pc(49) int[] local49 = local19[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static107.anInt2321; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local53[local79] = local57[local79];
					local45[local79] = local61[local79];
					local49[local79] = local65[local79];
				} else if (local85 == 0) {
					local53[local79] = local69[local79];
					local45[local79] = local73[local79];
					local49[local79] = local77[local79];
				} else {
					@Pc(135) int local135 = 4096 - local85;
					local53[local79] = local69[local79] * local135 + local57[local79] * local85 >> 12;
					local45[local79] = local61[local79] * local85 + local135 * local73[local79] >> 12;
					local49[local79] = local85 * local65[local79] + local135 * local77[local79] >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean241 = arg0.method3010() == 1;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(25) int[] local25 = this.method3393(arg0, 0);
			@Pc(31) int[] local31 = this.method3393(arg0, 1);
			@Pc(37) int[] local37 = this.method3393(arg0, 2);
			for (@Pc(39) int local39 = 0; local39 < Static107.anInt2321; local39++) {
				@Pc(45) int local45 = local37[local39];
				if (local45 == 4096) {
					local11[local39] = local25[local39];
				} else if (local45 == 0) {
					local11[local39] = local31[local39];
				} else {
					local11[local39] = local45 * local25[local39] + local31[local39] * (4096 - local45) >> 12;
				}
			}
		}
		return local11;
	}
}
