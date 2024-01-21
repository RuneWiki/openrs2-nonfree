import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class2_Sub3_Sub24 extends Class2_Sub3 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(25) int[] local25 = this.method2901(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static54.anInt1423; local27++) {
				local15[local27] = 4096 - local25[local27];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			super.aBoolean173 = arg1.method1698() == 1;
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(29) int[][] local29 = this.method2900(arg0, 0);
			@Pc(33) int[] local33 = local19[1];
			@Pc(37) int[] local37 = local29[0];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local29[1];
			@Pc(49) int[] local49 = local19[2];
			@Pc(53) int[] local53 = local19[0];
			for (@Pc(55) int local55 = 0; local55 < Static54.anInt1423; local55++) {
				local53[local55] = 4096 - local37[local55];
				local33[local55] = 4096 - local45[local55];
				local49[local55] = 4096 - local41[local55];
			}
		}
		return local19;
	}
}
