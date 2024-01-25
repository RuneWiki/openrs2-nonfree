import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class68_Sub2_Sub1 extends Class68_Sub2 {

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "Lclient!hfa;")
	private Class116_Sub1 aClass116_Sub1_1;

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
	private final int anInt7501;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
	private final int anInt7495;

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
	private final int anInt7497;

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
	private final int anInt7496;

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
	private final int anInt7499;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
	private final int anInt7498;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_24;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!pc;IIIIII)V")
	public Class68_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7501 = arg3;
		this.anInt7495 = arg2;
		this.anInt7497 = arg6;
		this.anInt7496 = arg4;
		this.anInt7499 = arg1;
		this.anInt7498 = arg5;
		this.aClass33_Sub3_24 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class116_Sub1 method8702() {
		if (this.aClass116_Sub1_1 == null) {
			Static175.anIntArray226[5] = this.anInt7497;
			Static175.anIntArray226[0] = this.anInt7499;
			@Pc(26) Interface9 local26 = this.aClass33_Sub3_24.anInterface9_12;
			Static175.anIntArray226[1] = this.anInt7495;
			Static175.anIntArray226[2] = this.anInt7501;
			Static175.anIntArray226[3] = this.anInt7496;
			Static175.anIntArray226[4] = this.anInt7498;
			@Pc(48) byte local48 = 0;
			@Pc(50) int local50 = 0;
			for (@Pc(52) int local52 = 0; local52 < 6; local52++) {
				if (!local26.method1557(Static175.anIntArray226[local52])) {
					return null;
				}
				@Pc(70) Class130 local70 = local26.method1558(Static175.anIntArray226[local52]);
				@Pc(77) int local77 = local70.aBoolean236 ? 64 : 128;
				if (local70.aByte37 > 0) {
					local48 = 1;
				}
				if (local77 > local50) {
					local50 = local77;
				}
			}
			for (@Pc(97) int local97 = 0; local97 < 6; local97++) {
				Static596.anIntArrayArray58[local97] = local26.method1555(Static175.anIntArray226[local97], 1.0F, false, local50, local50);
			}
			this.aClass116_Sub1_1 = new Class116_Sub1(this.aClass33_Sub3_24, 6407, local50, local48 != 0, Static596.anIntArrayArray58);
		}
		return this.aClass116_Sub1_1;
	}
}
