import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class109_Sub1_Sub1 extends Class109_Sub1 {

	@OriginalMember(owner = "client!ij", name = "x", descriptor = "Lclient!gi;")
	private Class20_Sub3 aClass20_Sub3_1;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_21;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
	private final int anInt2907;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
	private final int anInt2902;

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
	private final int anInt2905;

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
	private final int anInt2908;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
	private final int anInt2906;

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
	private final int anInt2903;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!pg;IIIIII)V")
	public Class109_Sub1_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass163_Sub2_21 = arg0;
		this.anInt2907 = arg3;
		this.anInt2902 = arg2;
		this.anInt2905 = arg5;
		this.anInt2908 = arg4;
		this.anInt2906 = arg1;
		this.anInt2903 = arg6;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Lclient!gi;")
	@Override
	public Class20_Sub3 method4787() {
		if (this.aClass20_Sub3_1 == null) {
			Static72.anIntArray121[3] = this.anInt2908;
			Static72.anIntArray121[1] = this.anInt2902;
			Static72.anIntArray121[4] = this.anInt2905;
			Static72.anIntArray121[0] = this.anInt2906;
			@Pc(39) Interface9 local39 = this.aClass163_Sub2_21.anInterface9_12;
			Static72.anIntArray121[2] = this.anInt2907;
			Static72.anIntArray121[5] = this.anInt2903;
			@Pc(51) boolean local51 = false;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local39.method1773(Static72.anIntArray121[local55])) {
					return null;
				}
				@Pc(73) Class158 local73 = local39.method1769(Static72.anIntArray121[local55]);
				@Pc(80) int local80 = local73.aBoolean283 ? 64 : 128;
				if (local53 < local80) {
					local53 = local80;
				}
				if (local73.aByte46 > 0) {
					local51 = true;
				}
			}
			for (@Pc(103) int local103 = 0; local103 < 6; local103++) {
				Static231.anIntArrayArray27[local103] = local39.method1770(local53, Static72.anIntArray121[local103], 1.0F, false, local53);
			}
			this.aClass20_Sub3_1 = new Class20_Sub3(this.aClass163_Sub2_21, 6407, local53, local51, Static231.anIntArrayArray27);
		}
		return this.aClass20_Sub3_1;
	}
}
