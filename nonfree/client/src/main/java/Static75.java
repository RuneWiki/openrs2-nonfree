import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!ti;")
	public static Class1_Sub2_Sub20 aClass1_Sub2_Sub20_3;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public static int anInt1557;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "Z")
	public static boolean aBoolean88 = true;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!gj;")
	public static Class59 aClass59_18 = new Class59();

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
	public static int anInt1563 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!rj;Ljava/awt/Frame;I)V")
	public static void method1470(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(6) Class185 local6 = arg0.method3894(arg1);
			while (local6.anInt5276 == 0) {
				Static282.method4345(10L);
			}
			if (local6.anInt5276 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static282.method4345(100L);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Lclient!fk;")
	public static Class52 method1471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass52_1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	public static void method1472() {
		Static46.anInt938++;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = arg6 - 334;
		@Pc(14) int local14 = 2048 - arg2 & 0x7FF;
		@Pc(16) int local16 = 0;
		if (local3 < 0) {
			local3 = 0;
		} else if (local3 > 100) {
			local3 = 100;
		}
		@Pc(42) int local42 = Static256.aShort35 + (Static306.aShort55 - Static256.aShort35) * local3 / 100;
		@Pc(49) int local49 = 2048 - arg3 & 0x7FF;
		@Pc(51) int local51 = 0;
		@Pc(57) int local57 = local42 * arg0 >> 8;
		@Pc(59) int local59 = local57;
		@Pc(68) int local68;
		@Pc(79) int local79;
		if (local14 != 0) {
			local68 = Class135.anIntArray335[local14];
			local16 = -local57 * local68 >> 16;
			local79 = Class135.anIntArray338[local14];
			local59 = local79 * local57 >> 16;
		}
		if (local49 != 0) {
			local68 = Class135.anIntArray335[local49];
			local51 = local68 * local59 >> 16;
			local79 = Class135.anIntArray338[local49];
			local59 = local59 * local79 >> 16;
		}
		Static277.anInt4987 = arg2;
		Static94.anInt3434 = arg4 - local51;
		Static306.anInt5420 = arg1 - local16;
		Static233.anInt4252 = arg5 - local59;
		Static93.anInt1895 = arg3;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Lclient!lf;")
	public static Class1_Sub14 method1474() {
		@Pc(16) Class1_Sub14 local16 = new Class1_Sub14(34);
		local16.method1390(11);
		local16.method1390(Static184.anInt3503);
		local16.method1390(Static29.aBoolean19 ? 1 : 0);
		local16.method1390(Static249.aBoolean306 ? 1 : 0);
		local16.method1390(Static239.aBoolean299 ? 1 : 0);
		local16.method1390(Static310.aBoolean382 ? 1 : 0);
		local16.method1390(Static152.aBoolean35 ? 1 : 0);
		local16.method1390(Static94.aBoolean232 ? 1 : 0);
		local16.method1390(Static102.aBoolean113 ? 1 : 0);
		local16.method1390(Static123.aBoolean160 ? 1 : 0);
		local16.method1390(Static192.anInt3641);
		local16.method1390(Static311.aBoolean384 ? 1 : 0);
		local16.method1390(Static187.aBoolean243 ? 1 : 0);
		local16.method1390(Static183.aBoolean241 ? 1 : 0);
		local16.method1390(Static37.anInt771);
		local16.method1390(Static219.aBoolean281 ? 1 : 0);
		local16.method1390(Static64.anInt1228);
		local16.method1390(Static182.anInt3491);
		local16.method1390(Static294.anInt5275);
		local16.method1338(Static48.anInt956);
		local16.method1338(Static218.anInt1144);
		local16.method1390(Static158.method2715());
		local16.method1387(Static138.anInt2784);
		local16.method1390(Static41.anInt852);
		local16.method1390(Static277.aBoolean341 ? 1 : 0);
		local16.method1390(Static73.aBoolean87 ? 1 : 0);
		local16.method1390(Static27.anInt478);
		local16.method1390(Static36.aBoolean28 ? 1 : 0);
		local16.method1390(Static261.aBoolean326 ? 1 : 0);
		return local16;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILclient!io;JZ)V")
	public static void method1476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class36 local6 = new Class36();
		local6.aClass15_1 = arg4;
		local6.anInt1014 = arg1 * 128 + 64;
		local6.anInt1012 = arg2 * 128 + 64;
		local6.anInt1015 = arg3;
		local6.aLong44 = arg5;
		local6.aBoolean55 = arg6;
		if (Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2] = new Class1_Sub33(arg0, arg1, arg2);
		}
		Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2].aClass36_1 = local6;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method1477() {
		Static9.method122();
		Static94.anInterface4Array3 = new Interface4[8];
		Static94.anInterface4Array3[1] = new Class149();
		Static94.anInterface4Array3[2] = new Class79();
		Static94.anInterface4Array3[3] = new Class145();
		Static94.anInterface4Array3[4] = new Class43();
		Static94.anInterface4Array3[5] = new Class49();
		Static94.anInterface4Array3[6] = new Class81();
		Static94.anInterface4Array3[7] = new Class182();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)Lclient!ig;")
	public static Class74 method1479(@OriginalArg(1) int arg0) {
		@Pc(10) Class74 local10 = (Class74) Static185.aClass187_96.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static79.aClass121_44.method3115(1, arg0);
		local10 = new Class74();
		if (local25 != null) {
			local10.method2113(arg0, new Class1_Sub14(local25));
		}
		Static185.aClass187_96.method4524((long) arg0, local10);
		return local10;
	}
}
