import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sj", name = "rb", descriptor = "Lclient!qj;")
	public static Interface7 anInterface7_1 = null;

	@OriginalMember(owner = "client!sj", name = "dd", descriptor = "Ljava/lang/String;")
	public static String aString208 = "wave:";

	@OriginalMember(owner = "client!sj", name = "rd", descriptor = "I")
	public static int anInt5771 = -1;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!kg;B)I")
	public static int method4914(@OriginalArg(0) Class5_Sub4_Sub4_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt3421;
		@Pc(12) Class54 local12 = arg0.method4201();
		if (arg0.aBoolean285) {
			local8 = arg0.anInt3425;
		} else if (arg0.anInt4911 == local12.anInt1509 || arg0.anInt4911 == local12.anInt1491 || local12.anInt1505 == arg0.anInt4911 || local12.anInt1498 == arg0.anInt4911) {
			local8 = arg0.anInt3399;
		} else if (arg0.anInt4911 == local12.anInt1499 || arg0.anInt4911 == local12.anInt1473 || local12.anInt1475 == arg0.anInt4911 || local12.anInt1482 == arg0.anInt4911) {
			local8 = arg0.anInt3414;
		}
		return local8;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)I")
	public static int method4919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static69.aClass22Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > Static162.anInt2152 - 1 || Static122.anInt2632 - 1 < local15) {
			return 0;
		}
		@Pc(48) int local48 = arg2;
		if (arg2 < 3 && (Static160.aByteArrayArrayArray9[1][local11][local15] & 0x2) != 0) {
			local48 = arg2 + 1;
		}
		return Static69.aClass22Array1[local48].method4678(arg0, arg1);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	public static void method4923() {
		if (Static75.method1142() || Static163.anInt3184 == Static353.anInt6829) {
			Static184.method5384(Static212.aClass122_2);
			if (Static163.anInt3184 != Static264.anInt5282) {
				Static24.method5096();
			}
		} else {
			Static243.method4157(false, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], false, Static163.anInt3184, Static130.anInt2745, Static16.anInt512, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0]);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ir;ZLclient!tj;)V")
	public static void method4927(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Class122 arg1) {
		@Pc(10) Class149[] local10 = Static366.method3882(arg0, Static221.anInt4561);
		Static271.aClass57Array18 = new Class57[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static271.aClass57Array18[local16] = arg1.method4757(local10[local16]);
		}
		local10 = Static366.method3882(arg0, Static7.anInt210);
		Static221.aClass57Array14 = new Class57[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static221.aClass57Array14[local47] = arg1.method4757(local10[local47]);
		}
		local10 = Static366.method3882(arg0, Static174.anInt3625);
		Static147.aClass57Array9 = new Class57[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static147.aClass57Array9[local74] = arg1.method4757(local10[local74]);
		}
		local10 = Static366.method3882(arg0, Static162.anInt2150);
		Static204.aClass57Array13 = new Class57[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static204.aClass57Array13[local101] = arg1.method4757(local10[local101]);
		}
		local10 = Static366.method3882(arg0, Static233.anInt4700);
		Static287.aClass57Array21 = new Class57[local10.length];
		for (@Pc(132) int local132 = 0; local132 < local10.length; local132++) {
			Static287.aClass57Array21[local132] = arg1.method4757(local10[local132]);
		}
		local10 = Static366.method3882(arg0, Static197.anInt4049);
		Static6.aClass57Array23 = new Class57[local10.length];
		for (@Pc(159) int local159 = 0; local159 < local10.length; local159++) {
			Static6.aClass57Array23[local159] = arg1.method4757(local10[local159]);
		}
		local10 = Static366.method3882(arg0, Static178.anInt3701);
		Static82.aClass57Array4 = new Class57[local10.length];
		for (@Pc(186) int local186 = 0; local186 < local10.length; local186++) {
			Static82.aClass57Array4[local186] = arg1.method4757(local10[local186]);
		}
		local10 = Static366.method3882(arg0, Static37.anInt6455);
		Static322.aClass57Array25 = new Class57[local10.length];
		for (@Pc(213) int local213 = 0; local213 < local10.length; local213++) {
			Static322.aClass57Array25[local213] = arg1.method4757(local10[local213]);
		}
		local10 = Static366.method3882(arg0, Static172.anInt3601);
		Static284.aClass57Array20 = new Class57[local10.length];
		for (@Pc(240) int local240 = 0; local240 < local10.length; local240++) {
			Static284.aClass57Array20[local240] = arg1.method4757(local10[local240]);
		}
		local10 = Static366.method3882(arg0, Static331.anInt6459);
		Static232.aClass57Array15 = new Class57[local10.length];
		for (@Pc(267) int local267 = 0; local267 < local10.length; local267++) {
			Static232.aClass57Array15[local267] = arg1.method4757(local10[local267]);
		}
		local10 = Static366.method3882(arg0, Static171.anInt3586);
		Static55.aClass57Array19 = new Class57[local10.length];
		for (@Pc(298) int local298 = 0; local298 < local10.length; local298++) {
			Static55.aClass57Array19[local298] = arg1.method4757(local10[local298]);
		}
		local10 = Static366.method3882(arg0, Static19.anInt534);
		Static153.aClass57Array10 = new Class57[local10.length];
		for (@Pc(325) int local325 = 0; local325 < local10.length; local325++) {
			Static153.aClass57Array10[local325] = arg1.method4757(local10[local325]);
		}
		local10 = Static366.method3882(arg0, Static343.anInt6682);
		Static257.aClass57Array17 = new Class57[local10.length];
		for (@Pc(356) int local356 = 0; local356 < local10.length; local356++) {
			Static257.aClass57Array17[local356] = arg1.method4757(local10[local356]);
		}
		Static190.aClass57_11 = arg1.method4757(Static366.method3895(arg0, Static132.anInt2760, 0));
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[B")
	public static byte[] method4929(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub7_Sub20 local12 = (Class3_Sub7_Sub20) Static93.aClass188_2.method5061((long) arg0);
		if (local12 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(48) int local48 = 0; local48 < 255; local48++) {
				@Pc(55) int local55 = 255 - local48;
				@Pc(60) int local60 = Static54.method915(local55, local31);
				@Pc(64) byte local64 = local25[local60];
				local25[local60] = local25[local55];
				local25[local55] = local25[511 - local48] = local64;
			}
			local12 = new Class3_Sub7_Sub20(local25);
			Static93.aClass188_2.method5063(local12, (long) arg0);
		}
		return local12.aByteArray88;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!ir;Lclient!ir;Lclient!ir;Lclient!ir;)V")
	public static void method4932(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class100 arg3) {
		Static232.aClass100_96 = arg1;
		Static302.aClass100_118 = arg0;
		Static296.aClass100_114 = arg3;
		Static343.aClass100_126 = arg2;
		Static311.aClass181ArrayArray1 = new Class181[Static232.aClass100_96.method2306()][];
		Static61.aBooleanArray5 = new boolean[Static232.aClass100_96.method2306()];
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)Z")
	public static boolean method4933() {
		if (Static341.aBoolean445) {
			try {
				Static361.method2055("showVideoAd", Static353.aClass42_5.anApplet1);
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}
}
