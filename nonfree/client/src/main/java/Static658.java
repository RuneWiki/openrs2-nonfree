import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "Lclient!of;")
	public static final Class251 aClass251_9 = new Class251(4, 1);

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray65 = new String[100];

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
	public static int anInt10577 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!oq;IZLclient!gf;)V")
	public static void method8966(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class119 arg2) {
		if (Static505.anInt8479 >= 50 || (arg2 == null || arg2.anIntArrayArray16 == null || arg1 >= arg2.anIntArrayArray16.length || arg2.anIntArrayArray16[arg1] == null)) {
			return;
		}
		@Pc(32) int local32 = arg2.anIntArrayArray16[arg1][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(59) int local59;
		if (arg2.anIntArrayArray16[arg1].length > 1) {
			local59 = (int) (Math.random() * (double) arg2.anIntArrayArray16[arg1].length);
			if (local59 > 0) {
				local36 = arg2.anIntArrayArray16[arg1][local59];
			}
		}
		@Pc(75) int local75 = local32 & 0x1F;
		local59 = 256;
		if (arg2.anIntArray166 != null && arg2.anIntArray165 != null) {
			local59 = (int) ((double) (arg2.anIntArray165[arg1] - arg2.anIntArray166[arg1]) * Math.random()) + arg2.anIntArray166[arg1];
		}
		@Pc(113) int local113 = arg2.anIntArray169 == null ? 255 : arg2.anIntArray169[arg1];
		if (local75 == 0) {
			if (arg0 == Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2) {
				if (!arg2.aBoolean186) {
					Static424.method6293(local36, local42, local59, 0, local113);
					return;
				}
				Static351.method5110(local42, local113, false, 0, local36, local59);
			}
		} else if (Static96.aClass6_Sub22_7.aClass29_Sub5_1.method1502() != 0) {
			@Pc(154) int local154 = arg0.anInt10006 - 256 >> 9;
			@Pc(161) int local161 = arg0.anInt10001 - 256 >> 9;
			@Pc(186) int local186 = arg0 == Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 ? 0 : (local154 << 16) + (arg0.aByte140 << 24) + (local161 << 8) + local75;
			Static461.aClass243Array1[Static505.anInt8479++] = new Class243((byte) (arg2.aBoolean186 ? 2 : 1), local36, local42, 0, local113, local186, local59, arg0);
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
	public static void method8967() {
		Static604.anInt4516 = 0;
		Static622.anInt10138 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static415.anInt7233; local11++) {
			@Pc(19) int local19 = local11 * Static519.anInt8647;
			for (@Pc(21) int local21 = 0; local21 < Static519.anInt8647; local21++) {
				@Pc(27) int local27 = local21 + local19;
				Static155.anInterface16Array1[local27].method8878(local21 * Static208.anInt3594, Static263.anInt4574 * local11, Static208.anInt3594, Static263.anInt4574, true);
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)[I")
	public static int[] method8968() {
		return new int[] { Static270.anInt4693, Static332.anInt7616, Static568.anInt9424 };
	}
}
