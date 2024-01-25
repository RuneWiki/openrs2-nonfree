import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!lq", name = "mb", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!lq", name = "nb", descriptor = "Lclient!ew;")
	public static final Class98 aClass98_27 = new Class98("", 10);

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(B)V")
	public static void method4915() {
		Static465.method6901(Static443.aClass295_14);
		Static465.anInt7824++;
		if (Static172.aBoolean216 && Static553.aBoolean673) {
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			if (Static428.aBoolean526) {
				local26 = Static584.method8436();
				local28 = Static88.method1487();
			}
			@Pc(42) int local42 = Static3.aClass3_3.method8875() + local26;
			@Pc(48) int local48 = Static3.aClass3_3.method8879() + local28;
			local42 -= Static246.anInt4495;
			local48 -= Static380.anInt6270;
			if (local42 < Static384.anInt6352) {
				local42 = Static384.anInt6352;
			}
			if (Static274.anInt4912 > local48) {
				local48 = Static274.anInt4912;
			}
			if (Static384.anInt6352 + Static106.aClass295_6.anInt7957 < local42 + Static443.aClass295_14.anInt7957) {
				local42 = Static384.anInt6352 + Static106.aClass295_6.anInt7957 - Static443.aClass295_14.anInt7957;
			}
			if (Static274.anInt4912 + Static106.aClass295_6.anInt7985 < local48 - -Static443.aClass295_14.anInt7985) {
				local48 = Static106.aClass295_6.anInt7985 + Static274.anInt4912 - Static443.aClass295_14.anInt7985;
			}
			@Pc(125) int local125 = Static106.aClass295_6.anInt7988 + local42 - Static384.anInt6352;
			@Pc(133) int local133 = Static106.aClass295_6.anInt7997 + local48 - Static274.anInt4912;
			@Pc(148) Class5_Sub51 local148;
			if (Static3.aClass3_3.method8878()) {
				if (Static443.aClass295_14.anInt8004 < Static465.anInt7824) {
					@Pc(221) int local221 = local42 - Static27.anInt356;
					@Pc(225) int local225 = local48 - Static185.anInt3257;
					if (Static443.aClass295_14.anInt8021 < local221 || local221 < -Static443.aClass295_14.anInt8021 || Static443.aClass295_14.anInt8021 < local225 || local225 < -Static443.aClass295_14.anInt8021) {
						Static328.aBoolean404 = true;
					}
				}
				if (Static443.aClass295_14.anObjectArray14 != null && Static328.aBoolean404) {
					local148 = new Class5_Sub51();
					local148.anObjectArray33 = Static443.aClass295_14.anObjectArray14;
					local148.aClass295_19 = Static443.aClass295_14;
					local148.anInt9438 = local125;
					local148.anInt9442 = local133;
					Static370.method5457(local148);
				}
			} else {
				if (Static328.aBoolean404) {
					Static420.method6387();
					if (Static443.aClass295_14.anObjectArray19 != null) {
						local148 = new Class5_Sub51();
						local148.anInt9438 = local125;
						local148.anObjectArray33 = Static443.aClass295_14.anObjectArray19;
						local148.aClass295_18 = Static573.aClass295_9;
						local148.anInt9442 = local133;
						local148.aClass295_19 = Static443.aClass295_14;
						Static370.method5457(local148);
					}
					if (Static573.aClass295_9 != null && Static75.method1300(Static443.aClass295_14) != null) {
						Static376.method5536(Static573.aClass295_9, Static443.aClass295_14);
					}
				} else if ((Static197.anInt10376 == 1 || Static535.method7886()) && Static491.anInt8293 > 2) {
					Static270.method4337(Static27.anInt356 + Static246.anInt4495, Static380.anInt6270 + Static185.anInt3257);
				} else if (Static498.method7455()) {
					Static270.method4337(Static27.anInt356 + Static246.anInt4495, Static185.anInt3257 + Static380.anInt6270);
				}
				Static443.aClass295_14 = null;
			}
		} else if (Static465.anInt7824 > 1) {
			Static443.aClass295_14 = null;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([BI)[B")
	public static byte[] method4916(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class5_Sub22 local12 = new Class5_Sub22(arg0);
		@Pc(18) int local18 = local12.method5966();
		@Pc(22) int local22 = local12.method5913();
		if (local22 < 0 || Static239.anInt4415 != 0 && local22 > Static239.anInt4415) {
			throw new RuntimeException();
		} else if (local18 == 0) {
			@Pc(96) byte[] local96 = new byte[local22];
			local12.method5915(0, local22, local96);
			return local96;
		} else {
			@Pc(46) int local46 = local12.method5913();
			if (local46 < 0 || Static239.anInt4415 != 0 && local46 > Static239.anInt4415) {
				throw new RuntimeException();
			}
			@Pc(64) byte[] local64 = new byte[local46];
			if (local18 == 1) {
				Static489.method7210(local64, local46, arg0, local22);
			} else {
				@Pc(71) Class122 local71 = Static300.aClass122_1;
				synchronized (Static300.aClass122_1) {
					Static300.aClass122_1.method2712(local64, local12);
				}
			}
			return local64;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!la;ILclient!d;)Lclient!ha;")
	public static Class133 method4917(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Class207 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface3 arg3) {
		if (!Static198.method3509()) {
			throw new RuntimeException("");
		} else if (Static82.method1382("jaggl")) {
			@Pc(34) OpenGL local34 = new OpenGL();
			@Pc(44) long local44 = local34.init(arg0, 8, 8, 8, 24, 0, arg2);
			if (local44 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(63) Class133_Sub1_Sub2 local63 = new Class133_Sub1_Sub2(local34, arg0, local44, arg3, arg1, arg2);
			local63.method6231();
			return local63;
		} else {
			throw new RuntimeException("");
		}
	}
}
