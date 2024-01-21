import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gh", name = "cb", descriptor = "I")
	private int anInt1510;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1510 = arg0.method2387();
		} else if (arg1 == 1) {
			super.aBoolean183 = arg0.method2387() == 1;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(26) int[][] local26 = this.method2991(arg0, 0);
			@Pc(32) int[][] local32 = this.method2991(arg0, 1);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			for (@Pc(70) int local70 = 0; local70 < Static129.anInt3118; local70++) {
				local36[local70] = this.method1062(local48[local70], local60[local70]);
				local40[local70] = this.method1062(local52[local70], local64[local70]);
				local44[local70] = this.method1062(local56[local70], local68[local70]);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BII)I")
	private int method1062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt1510;
		if (local6 == 1) {
			return arg1 + arg0;
		} else if (local6 == 2) {
			return arg0 - arg1;
		} else if (local6 == 3) {
			return arg1 * arg0 >> 12;
		} else if (local6 == 4) {
			return arg1 == 0 ? 4096 : (arg0 << 12) / arg1;
		} else if (local6 == 5) {
			return 4096 - ((4096 - arg0) * (-arg1 + 4096) >> 12);
		} else if (local6 == 6) {
			return arg1 >= 2048 ? 4096 - ((4096 - arg1) * (-arg0 + 4096) >> 11) : arg0 * arg1 >> 11;
		} else if (local6 == 7) {
			return arg0 == 4096 ? 4096 : (arg1 << 12) / (4096 - arg0);
		} else if (local6 == 8) {
			return arg0 == 0 ? 0 : 4096 - (4096 - arg1 << 12) / arg0;
		} else if (local6 == 9) {
			return arg0 >= arg1 ? arg1 : arg0;
		} else if (local6 == 10) {
			return arg0 <= arg1 ? arg1 : arg0;
		} else if (local6 == 11) {
			return arg0 <= arg1 ? arg1 - arg0 : -arg1 + arg0;
		} else if (local6 == 12) {
			return arg0 + arg1 - (arg1 * arg0 >> 11);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(26) int[] local26 = this.method2980(0, arg0);
			@Pc(34) int[] local34 = this.method2980(1, arg0);
			for (@Pc(36) int local36 = 0; local36 < Static129.anInt3118; local36++) {
				local16[local36] = this.method1062(local26[local36], local34[local36]);
			}
		}
		return local16;
	}
}
