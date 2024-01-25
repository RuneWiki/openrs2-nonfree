import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!pe", name = "Ab", descriptor = "Lclient!dp;")
	public static Class53 aClass53_126;

	@OriginalMember(owner = "client!pe", name = "Bb", descriptor = "Lclient!pi;")
	public static Class30 aClass30_3;

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "J")
	public static long aLong169 = 0L;

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
	public static int anInt5098 = 0;

	@OriginalMember(owner = "client!pe", name = "sb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!pe", name = "Kb", descriptor = "Z")
	public static boolean aBoolean357 = false;

	@OriginalMember(owner = "client!pe", name = "Mb", descriptor = "I")
	public static int anInt5126 = -1;

	@OriginalMember(owner = "client!pe", name = "jc", descriptor = "I")
	public static final int anInt5145 = 50;

	@OriginalMember(owner = "client!pe", name = "mc", descriptor = "Ljava/lang/String;")
	public static final String aString220 = "green:";

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILclient!qo;)V")
	public static void method4704(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class44_Sub4_Sub4_Sub1 arg2) {
		if (arg0 == arg2.anInt5099 && arg0 != -1) {
			@Pc(23) Class24 local23 = Static209.method3737(arg0);
			@Pc(26) int local26 = local23.anInt574;
			if (local26 == 1) {
				arg2.anInt5152 = 0;
				arg2.anInt5144 = 0;
				arg2.anInt5118 = arg1;
				arg2.anInt5119 = 0;
				arg2.anInt5133 = 1;
				Static203.method3667(arg2.anInt5152, arg2.anInt6339, local23, arg2.anInt6340, arg2 == Static253.aClass44_Sub4_Sub4_Sub1_1);
			}
			if (local26 == 2) {
				arg2.anInt5144 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt5099 == -1 || Static209.method3737(arg0).anInt588 >= Static209.method3737(arg2.anInt5099).anInt588) {
			arg2.anInt5119 = 0;
			arg2.anInt5118 = arg1;
			arg2.anInt5144 = 0;
			arg2.anInt5133 = 1;
			arg2.anInt5099 = arg0;
			arg2.anInt5152 = 0;
			arg2.anInt5158 = arg2.anInt5156;
			if (arg2.anInt5099 != -1) {
				Static203.method3667(arg2.anInt5152, arg2.anInt6339, Static209.method3737(arg2.anInt5099), arg2.anInt6340, Static253.aClass44_Sub4_Sub4_Sub1_1 == arg2);
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Z")
	public static boolean method4711() {
		try {
			return Static142.method2690();
		} catch (@Pc(14) IOException local14) {
			Static21.method304();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static336.anInt6134 + "," + Static334.anInt6115 + "," + Static24.anInt387 + " - " + Static31.anInt578 + "," + (Static44.anInt881 + Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0]) + "," + (Static300.anInt5672 + Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0]) + " - ";
			for (@Pc(62) int local62 = 0; local62 < Static31.anInt578 && local62 < 50; local62++) {
				local60 = local60 + Static142.aClass6_Sub10_Sub1_3.aByteArray67[local62] + ",";
			}
			Static346.method5707(local60, local19);
			Static63.method1030();
			return true;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)V")
	public static void method4717(@OriginalArg(0) int arg0) {
		Static246.anIntArray505 = new int[Static246.anInt4606];
		Static225.anIntArray478 = new int[Static246.anInt4606];
		Static116.aByteArrayArrayArray7 = new byte[arg0][Static153.anInt2883][Static246.anInt4606];
		Static53.aByteArrayArrayArray4 = new byte[arg0][Static153.anInt2883][Static246.anInt4606];
		Static5.aByteArrayArrayArray1 = new byte[arg0][Static153.anInt2883][Static246.anInt4606];
		Static118.anIntArray300 = new int[Static246.anInt4606];
		Static230.aByteArrayArrayArray8 = new byte[arg0][Static153.anInt2883][Static246.anInt4606];
		Static292.anIntArray617 = new int[5];
		Static147.anIntArray340 = new int[Static246.anInt4606];
		Static5.anIntArrayArrayArray1 = new int[arg0][Static153.anInt2883 + 1][Static246.anInt4606 + 1];
		Static212.anIntArray453 = new int[Static246.anInt4606];
		Static270.aByteArrayArrayArray12 = null;
		aByteArrayArrayArray13 = new byte[arg0][Static153.anInt2883 + 1][Static246.anInt4606 + 1];
		Static320.anInt5932 = 99;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Lclient!ec;")
	public static Class6_Sub10 method4720() {
		@Pc(8) Class6_Sub10 local8 = new Class6_Sub10(37);
		local8.method3968(14);
		local8.method3968(Static29.anInt564);
		local8.method3968(Static43.aBoolean72 ? 1 : 0);
		local8.method3968(Static14.aBoolean22 ? 1 : 0);
		local8.method3968(Static293.aBoolean382 ? 1 : 0);
		local8.method3968(Static61.aBoolean81 ? 1 : 0);
		local8.method3968(0);
		local8.method3968(Static349.aBoolean421 ? 1 : 0);
		local8.method3968(Static119.aBoolean190 ? 1 : 0);
		local8.method3968(Static196.aBoolean281 ? 1 : 0);
		local8.method3968(Static282.anInt5340);
		local8.method3968(Static194.aBoolean277 ? 1 : 0);
		local8.method3968(Static20.aBoolean26 ? 1 : 0);
		local8.method3968(Static334.aBoolean407 ? 1 : 0);
		local8.method3968(Static189.anInt3613);
		local8.method3968(Static314.aBoolean195 ? 1 : 0);
		local8.method3968(Static252.anInt4702);
		local8.method3968(Static62.anInt1130);
		local8.method3968(Static243.anInt4564);
		local8.method4025(Static285.anInt5393);
		local8.method4025(Static91.anInt2907);
		local8.method3968(Static311.method5288());
		local8.method3976(Static98.anInt1846);
		local8.method3968(Static182.anInt3432);
		local8.method3968(Static276.aBoolean363 ? 1 : 0);
		local8.method3968(Static317.aBoolean395 ? 1 : 0);
		local8.method3968(Static163.anInt3087);
		local8.method3968(Static131.aBoolean201 ? 1 : 0);
		local8.method3968(Static346.aBoolean418 ? 1 : 0);
		local8.method3968(Static172.anInt3235);
		local8.method3968(Static354.aBoolean428 ? 1 : 0);
		local8.method3968(Static213.anInt3920);
		return local8;
	}
}
