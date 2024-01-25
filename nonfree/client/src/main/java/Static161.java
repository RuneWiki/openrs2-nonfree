import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_4 = new Class271(8, 0, 4, 1);

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_47 = new Class274(104, 7);

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_48 = new Class274(31, 8);

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "Z")
	public static final boolean aBoolean307 = false;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BII)Z")
	public static boolean method3020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static556.method7709(arg0, arg1) & Static321.method8560(arg0, arg1);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIII)V")
	public static void method3022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class11_Sub1_Sub3 local13 = local7.aClass11_Sub1_Sub3_1;
		@Pc(16) Class11_Sub1_Sub3 local16 = local7.aClass11_Sub1_Sub3_2;
		if (local13 != null) {
			local13.aShort122 = (short) (local13.aShort122 * arg3 / (0x10 << Static415.anInt7579 - 7));
			local13.aShort121 = (short) (local13.aShort121 * arg3 / (0x10 << Static415.anInt7579 - 7));
		}
		if (local16 != null) {
			local16.aShort122 = (short) (local16.aShort122 * arg3 / (0x10 << Static415.anInt7579 - 7));
			local16.aShort121 = (short) (local16.aShort121 * arg3 / (0x10 << Static415.anInt7579 - 7));
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZZ)V")
	public static void method3023(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static387.anInt6978 != -1) {
				Static535.method7477(Static387.anInt6978);
			}
			for (@Pc(17) Class2_Sub37 local17 = (Class2_Sub37) Static206.aClass222_14.method5474(); local17 != null; local17 = (Class2_Sub37) Static206.aClass222_14.method5472()) {
				if (!local17.method8600()) {
					local17 = (Class2_Sub37) Static206.aClass222_14.method5474();
					if (local17 == null) {
						break;
					}
				}
				Static450.method4870(local17, true, false);
			}
			Static387.anInt6978 = -1;
			Static206.aClass222_14 = new Class222(8);
			Static588.method8118();
			Static387.anInt6978 = Static276.anInt5310;
			Static146.method2807(false);
			Static539.method7534();
			Static639.method8547(Static387.anInt6978);
		}
		Static213.aString15 = "";
		Static187.aString46 = "";
		Static457.aBoolean598 = false;
		Static4.method58();
		Static385.anInt6934 = -1;
		Static547.method7772(Static595.anInt9812);
		Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 = new Class11_Sub1_Sub1_Sub2_Sub1();
		Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray232[0] = Static3.anInt46 / 2;
		Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 = Static270.anInt5194 * 512 / 2;
		Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 = Static3.anInt46 * 512 / 2;
		Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray233[0] = Static270.anInt5194 / 2;
		Static395.anInt3530 = 0;
		Static53.anInt1153 = 0;
		if (Static2.anInt31 == 2) {
			Static53.anInt1153 = Static244.anInt4842 << 9;
			Static395.anInt3530 = Static307.anInt5655 << 9;
		} else {
			Static257.method4230();
		}
		Static57.method1058();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Z")
	public static boolean method3027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static58.method1085(arg0, arg1) | (arg0 & 0x800) != 0 || Static370.method5584(arg1, arg0);
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(III)Z")
	public static boolean method3030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}
}
