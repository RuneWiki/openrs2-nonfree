import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class2_Sub3_Sub33 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ug", name = "hb", descriptor = "I")
	private int anInt3784;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(26) int[][] local26 = this.method2900(arg0, 0);
			@Pc(32) int[][] local32 = this.method2900(arg0, 1);
			@Pc(36) int[] local36 = local16[1];
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[1];
			@Pc(52) int[] local52 = local26[0];
			@Pc(56) int[] local56 = local32[0];
			@Pc(60) int[] local60 = local32[1];
			@Pc(64) int[] local64 = local26[2];
			@Pc(68) int[] local68 = local32[2];
			for (@Pc(70) int local70 = 0; local70 < Static54.anInt1423; local70++) {
				local40[local70] = this.method2643(local56[local70], local52[local70]);
				local36[local70] = this.method2643(local60[local70], local48[local70]);
				local44[local70] = this.method2643(local68[local70], local64[local70]);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI)I")
	private int method2643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt3784;
		if (local6 == 1) {
			return arg0 + arg1;
		} else if (local6 == 2) {
			return arg1 - arg0;
		} else if (local6 == 3) {
			return arg0 * arg1 >> 12;
		} else if (local6 == 4) {
			return arg0 == 0 ? 4096 : (arg1 << 12) / arg0;
		} else if (local6 == 5) {
			return 4096 - ((4096 - arg1) * (-arg0 + 4096) >> 12);
		} else if (local6 == 6) {
			return arg0 >= 2048 ? 4096 - ((4096 - arg0) * (-arg1 + 4096) >> 11) : arg0 * arg1 >> 11;
		} else if (local6 == 7) {
			return arg1 == 4096 ? 4096 : (arg0 << 12) / (4096 - arg1);
		} else if (local6 == 8) {
			return arg1 == 0 ? 0 : 4096 - (4096 - arg0 << 12) / arg1;
		} else if (local6 == 9) {
			return arg0 <= arg1 ? arg0 : arg1;
		} else if (local6 == 10) {
			return arg1 <= arg0 ? arg0 : arg1;
		} else if (local6 == 11) {
			return arg1 <= arg0 ? arg0 - arg1 : -arg0 + arg1;
		} else if (local6 == 12) {
			return arg0 + arg1 - (arg1 * arg0 >> 11);
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3784 = arg1.method1698();
		} else if (arg0 == 1) {
			super.aBoolean173 = arg1.method1698() == 1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(25) int[] local25 = this.method2901(0, arg0);
			@Pc(31) int[] local31 = this.method2901(1, arg0);
			for (@Pc(33) int local33 = 0; local33 < Static54.anInt1423; local33++) {
				local15[local33] = this.method2643(local31[local33], local25[local33]);
			}
		}
		return local15;
	}
}
