import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class2_Sub3_Sub9 extends Class2_Sub3 {

	@OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
	private int anInt1546;

	@OriginalMember(owner = "client!gd", name = "vb", descriptor = "I")
	private int anInt1548;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1548 = arg1.method1698();
		} else if (arg0 == 1) {
			this.anInt1546 = arg1.method1698();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(29) int local29 = Static54.anInt1423 / this.anInt1548;
			@Pc(34) int local34 = Static12.anInt558 / this.anInt1546;
			@Pc(45) int[] local45;
			@Pc(51) int local51;
			if (local34 <= 0) {
				local45 = this.method2901(0, 0);
			} else {
				local51 = arg0 % local34;
				local45 = this.method2901(0, Static12.anInt558 * local51 / local34);
			}
			for (local51 = 0; local51 < Static54.anInt1423; local51++) {
				if (local29 <= 0) {
					local20[local51] = local45[0];
				} else {
					@Pc(81) int local81 = local51 % local29;
					local20[local51] = local45[Static54.anInt1423 * local81 / local29];
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(25) int local25 = Static54.anInt1423 / this.anInt1548;
			@Pc(30) int local30 = Static12.anInt558 / this.anInt1546;
			@Pc(41) int[][] local41;
			if (local30 <= 0) {
				local41 = this.method2900(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local30;
				local41 = this.method2900(Static12.anInt558 * local47 / local30, 0);
			}
			@Pc(61) int[] local61 = local41[1];
			@Pc(65) int[] local65 = local41[2];
			@Pc(69) int[] local69 = local16[0];
			@Pc(73) int[] local73 = local41[0];
			@Pc(77) int[] local77 = local16[2];
			@Pc(81) int[] local81 = local16[1];
			for (@Pc(83) int local83 = 0; local83 < Static54.anInt1423; local83++) {
				@Pc(97) int local97;
				if (local25 > 0) {
					@Pc(91) int local91 = local83 % local25;
					local97 = local91 * Static54.anInt1423 / local25;
				} else {
					local97 = 0;
				}
				local69[local83] = local73[local97];
				local81[local83] = local61[local97];
				local77[local83] = local65[local97];
			}
		}
		return local16;
	}
}
