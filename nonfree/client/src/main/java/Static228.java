import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public static int anInt4240;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_50 = new Class46(24, 6);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIBIILclient!ha;)V")
	public static void method3849(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class133 arg2) {
		Static9.aClass133_1 = arg2;
		Static10.aClass113_1 = Static9.aClass133_1.method7275();
		Static633.aClass113_9 = Static9.aClass133_1.method7275();
		Static182.aClass113_3 = Static9.aClass133_1.method7275();
		Static483.anInt8236 = 0;
		Static583.anInt9806 = 100;
		Static641.anIntArray604 = null;
		Static443.anInt7572 = 100;
		Static197.anInterface16Array5 = null;
		Static137.method2017(arg1, arg0);
		Static517.anInt8885 = -1;
		Static468.anInt7871 = -1;
		Static244.anInt4473 = -1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIB)B")
	public static byte method3850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BIII)I")
	public static int method3851(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = 255 - arg2;
		@Pc(36) int local36 = (arg2 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
		return (((arg1 & 0xFF00FF) * local18 & 0xFF00FF00 | (arg1 & 0xFF00) * local18 & 0xFF0000) >>> 8) + local36;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method3853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class217 local28 = Static421.aClass217ArrayArrayArray5[local9][arg0][arg1] = Static421.aClass217ArrayArrayArray5[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class290 local33 = local28.aClass290_2; local33 != null; local33 = local33.aClass290_3) {
					@Pc(37) Class4_Sub2_Sub1 local37 = local33.aClass4_Sub2_Sub1_1;
					if (local37.aShort107 == arg0 && local37.aShort108 == arg1) {
						local37.aByte132--;
					}
				}
				if (local28.aClass4_Sub2_Sub2_1 != null) {
					local28.aClass4_Sub2_Sub2_1.aByte132--;
				}
				if (local28.aClass4_Sub2_Sub4_1 != null) {
					local28.aClass4_Sub2_Sub4_1.aByte132--;
				}
				if (local28.aClass4_Sub2_Sub4_2 != null) {
					local28.aClass4_Sub2_Sub4_2.aByte132--;
				}
				if (local28.aClass4_Sub2_Sub3_1 != null) {
					local28.aClass4_Sub2_Sub3_1.aByte132--;
				}
				if (local28.aClass4_Sub2_Sub3_2 != null) {
					local28.aClass4_Sub2_Sub3_2.aByte132--;
				}
			}
		}
		if (Static421.aClass217ArrayArrayArray5[0][arg0][arg1] == null) {
			Static421.aClass217ArrayArrayArray5[0][arg0][arg1] = new Class217(0);
			Static421.aClass217ArrayArrayArray5[0][arg0][arg1].aByte80 = 1;
		}
		Static421.aClass217ArrayArrayArray5[0][arg0][arg1].aClass217_1 = local7;
		Static421.aClass217ArrayArrayArray5[3][arg0][arg1] = null;
	}
}
