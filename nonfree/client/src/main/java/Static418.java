import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!ut", name = "W", descriptor = "I")
	public static int anInt6789;

	@OriginalMember(owner = "client!ut", name = "Y", descriptor = "Lclient!ri;")
	public static Class214 aClass214_243;

	@OriginalMember(owner = "client!ut", name = "Z", descriptor = "I")
	public static int anInt6791;

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_211 = new Class151("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!ut", name = "X", descriptor = "I")
	public static int anInt6790 = -2;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(FIIIIFFB)[F")
	public static float[] method5195(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[2] = local25;
		local6[3] = 0.0F;
		local6[7] = 0.0F;
		local6[6] = -local25;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[5] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(79) float local79 = (float) arg1 / 32767.0F;
		@Pc(90) float local90 = -((float) Math.sqrt((double) (1.0F - local79 * local79)));
		@Pc(94) float local94 = 1.0F - local79;
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2));
		if (local106 == 0.0F && local79 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local72 = (float) -arg2 / local106;
				local74 = (float) arg4 / local106;
			}
			local70[3] = local90 * -local74;
			local70[7] = local90 * -local72;
			local70[2] = local94 * local74 * local72;
			local70[1] = local74 * local90;
			local70[0] = local79 + local94 * local72 * local72;
			local70[5] = local90 * local72;
			local70[6] = local74 * local72 * local94;
			local70[8] = local79 + local94 * local74 * local74;
			local70[4] = local79;
			local9[0] = local6[2] * local70[6] + local70[0] * local6[0] + local70[3] * local6[1];
			local9[1] = local6[1] * local70[4] + local70[1] * local6[0] + local70[7] * local6[2];
			local9[2] = local6[0] * local70[2] + local6[1] * local70[5] + local6[2] * local70[8];
			local9[3] = local6[5] * local70[6] + local70[3] * local6[4] + local70[0] * local6[3];
			local9[4] = local6[4] * local70[4] + local6[3] * local70[1] + local70[7] * local6[5];
			local9[6] = local6[8] * local70[6] + local6[6] * local70[0] + local70[3] * local6[7];
			local9[5] = local6[3] * local70[2] + local70[5] * local6[4] + local6[5] * local70[8];
			local9[7] = local6[8] * local70[7] + local6[7] * local70[4] + local70[1] * local6[6];
			local9[8] = local6[7] * local70[5] + local70[2] * local6[6] + local70[8] * local6[8];
		}
		local9[1] *= arg5;
		local9[8] *= arg0;
		local9[0] *= arg5;
		local9[6] *= arg0;
		local9[5] *= arg6;
		local9[3] *= arg6;
		local9[4] *= arg6;
		local9[7] *= arg0;
		local9[2] *= arg5;
		return local9;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(JI)V")
	public static void method5196(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method5204(@OriginalArg(1) long arg0) {
		Static219.aCalendar3.setTime(new Date(arg0));
		@Pc(18) int local18 = Static219.aCalendar3.get(7);
		@Pc(22) int local22 = Static219.aCalendar3.get(5);
		@Pc(26) int local26 = Static219.aCalendar3.get(2);
		@Pc(30) int local30 = Static219.aCalendar3.get(1);
		@Pc(34) int local34 = Static219.aCalendar3.get(11);
		@Pc(38) int local38 = Static219.aCalendar3.get(12);
		@Pc(42) int local42 = Static219.aCalendar3.get(13);
		return Static400.aStringArray49[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static212.aStringArray27[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!na;)V")
	public static void method5207(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		Static202.aClass163Array2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)V")
	public static void method5209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static114.aFloat94 > Static114.aFloat93) {
			Static114.aFloat93 = (float) ((double) Static114.aFloat93 + (double) Static114.aFloat93 / 30.0D);
			if (Static114.aFloat93 > Static114.aFloat94) {
				Static114.aFloat93 = Static114.aFloat94;
			}
			Static144.method1907();
			Static114.anInt6795 = (int) Static114.aFloat93 >> 1;
			Static114.aByteArrayArrayArray18 = Static327.method4189(Static114.anInt6795);
		} else if (Static114.aFloat94 < Static114.aFloat93) {
			Static114.aFloat93 = (float) ((double) Static114.aFloat93 - (double) Static114.aFloat93 / 30.0D);
			if (Static114.aFloat93 < Static114.aFloat94) {
				Static114.aFloat93 = Static114.aFloat94;
			}
			Static144.method1907();
			Static114.anInt6795 = (int) Static114.aFloat93 >> 1;
			Static114.aByteArrayArrayArray18 = Static327.method4189(Static114.anInt6795);
		}
		if (Static323.anInt5318 != -1 && Static113.anInt2002 != -1) {
			@Pc(83) int local83 = Static323.anInt5318 - Static257.anInt6932;
			if (local83 < 2 || local83 > 2) {
				local83 /= 8;
			}
			@Pc(100) int local100 = Static113.anInt2002 - Static2.anInt3076;
			Static257.anInt6932 += local83;
			if (local100 < 2 || local100 > 2) {
				local100 /= 8;
			}
			Static2.anInt3076 += local100;
			if (local83 == 0 && local100 == 0) {
				Static323.anInt5318 = -1;
				Static113.anInt2002 = -1;
			}
			Static144.method1907();
		}
		if (Static409.anInt6639 <= 0) {
			Static176.anInt2869 = -1;
			Static157.anInt2629 = -1;
		} else {
			Static92.anInt1629--;
			if (Static92.anInt1629 == 0) {
				Static409.anInt6639--;
				Static92.anInt1629 = 100;
			}
		}
		if (!Static310.aBoolean416 || Static110.aClass254_11 == null) {
			return;
		}
		for (@Pc(165) Class1_Sub8 local165 = (Class1_Sub8) Static110.aClass254_11.method5437(); local165 != null; local165 = (Class1_Sub8) Static110.aClass254_11.method5433()) {
			@Pc(174) Class56 local174 = Static114.aClass101_4.method2104(local165.aClass1_Sub7_1.anInt969);
			if (local165.method863(arg1, arg0)) {
				if (local174.aStringArray11 != null) {
					if (local174.aStringArray11[4] != null) {
						Static87.method1275(false, local174.anInt1479, (long) local165.aClass1_Sub7_1.anInt969, local174.aString11, -1, true, local174.aStringArray11[4], -1, 0, 1002);
					}
					if (local174.aStringArray11[3] != null) {
						Static87.method1275(false, local174.anInt1479, (long) local165.aClass1_Sub7_1.anInt969, local174.aString11, -1, true, local174.aStringArray11[3], -1, 0, 1001);
					}
					if (local174.aStringArray11[2] != null) {
						Static87.method1275(false, local174.anInt1479, (long) local165.aClass1_Sub7_1.anInt969, local174.aString11, -1, true, local174.aStringArray11[2], -1, 0, 1003);
					}
					if (local174.aStringArray11[1] != null) {
						Static87.method1275(false, local174.anInt1479, (long) local165.aClass1_Sub7_1.anInt969, local174.aString11, -1, true, local174.aStringArray11[1], -1, 0, 1010);
					}
					if (local174.aStringArray11[0] != null) {
						Static87.method1275(false, local174.anInt1479, (long) local165.aClass1_Sub7_1.anInt969, local174.aString11, -1, true, local174.aStringArray11[0], -1, 0, 1009);
					}
				}
				if (!local165.aClass1_Sub7_1.aBoolean77) {
					local165.aClass1_Sub7_1.aBoolean77 = true;
					Static267.method3408(Static392.aClass268_130, local165.aClass1_Sub7_1.anInt969, local174.anInt1479);
				}
				if (local165.aClass1_Sub7_1.aBoolean77) {
					Static267.method3408(Static160.aClass268_133, local165.aClass1_Sub7_1.anInt969, local174.anInt1479);
				}
			} else if (local165.aClass1_Sub7_1.aBoolean77) {
				local165.aClass1_Sub7_1.aBoolean77 = false;
				Static267.method3408(Static281.aClass268_94, local165.aClass1_Sub7_1.anInt969, local174.anInt1479);
			}
		}
	}
}
