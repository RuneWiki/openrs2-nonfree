import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "Lclient!ud;")
	public static Class5 aClass5_12;

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!hb", name = "ob", descriptor = "I")
	public static int anInt935;

	@OriginalMember(owner = "client!hb", name = "wb", descriptor = "I")
	public static int anInt941;

	@OriginalMember(owner = "client!hb", name = "Ib", descriptor = "Lclient!qc;")
	public static Class47 aClass47_9;

	@OriginalMember(owner = "client!hb", name = "Ob", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V", line = 92)
	public static void method711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg0 * (arg0 - 32) / arg4;
		if (local11 < 8) {
			local11 = 8;
		}
		Static85.aClass2_Sub2_Sub2_Sub3Array12[0].method1320(arg1, arg3);
		@Pc(41) int local41 = (arg0 - local11 - 32) * arg2 / (arg4 - arg0);
		Static85.aClass2_Sub2_Sub2_Sub3Array12[1].method1320(arg1, arg0 + arg3 - 16);
		Static25.method1612(arg1, arg3 + 16, 16, arg0 - 32, Class2_Sub2_Sub12.anInt2253);
		Static25.method1612(arg1, local41 + arg3 + 16, 16, local11, Class50.anInt1936);
		Static25.method1611(arg1, arg3 + local41 + 16, local11, RuntimeException_Sub1.anInt311);
		Static25.method1611(arg1 + 1, local41 + arg3 + 16, local11, RuntimeException_Sub1.anInt311);
		Static25.method1603(arg1, arg3 + local41 + 16, 16, RuntimeException_Sub1.anInt311);
		Static25.method1603(arg1, local41 + arg3 + 17, 16, RuntimeException_Sub1.anInt311);
		Static25.method1611(arg1 + 15, arg3 + 16 + local41, local11, Class33.anInt1519);
		Static25.method1611(arg1 + 14, local41 + arg3 - -17, local11 - 1, Class33.anInt1519);
		Static25.method1603(arg1, arg3 + local41 + local11 + 15, 16, Class33.anInt1519);
		Static25.method1603(arg1 + 1, local11 + local41 + 14 + arg3, 15, Class33.anInt1519);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 155)
	public static void method712(@OriginalArg(0) Component arg0) {
		try {
			@Pc(1) Method local1 = Static8.aMethod1;
			if (local1 != null) {
				local1.invoke(arg0, Boolean.FALSE);
			}
		} catch (@Pc(20) Throwable local20) {
		}
		arg0.addKeyListener(Class41.aClass30_1);
		arg0.addFocusListener(Class41.aClass30_1);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)[Lclient!vb;", line = 324)
	public static Class2_Sub2_Sub2_Sub4[] method715() {
		@Pc(8) Class2_Sub2_Sub2_Sub4[] local8 = new Class2_Sub2_Sub2_Sub4[Static28.anInt727];
		for (@Pc(15) int local15 = 0; local15 < Static28.anInt727; local15++) {
			@Pc(25) Class2_Sub2_Sub2_Sub4 local25 = local8[local15] = new Class2_Sub2_Sub2_Sub4();
			local25.anInt2443 = Static96.anInt2513;
			local25.anInt2445 = Static41.anInt1079;
			local25.anInt2444 = Static75.anIntArray430[local15];
			local25.anInt2441 = Static89.anIntArray503[local15];
			local25.anInt2446 = Static61.anIntArray338[local15];
			local25.anInt2442 = Static18.anIntArray86[local15];
			@Pc(55) byte[] local55 = Static83.aByteArrayArray10[local15];
			@Pc(61) int local61 = local25.anInt2446 * local25.anInt2442;
			local25.anIntArray534 = new int[local61];
			for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
				local25.anIntArray534[local67] = Static19.anIntArray92[local55[local67] & 0xFF];
			}
		}
		Static85.method1485();
		return local8;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!bb;Ljava/awt/Component;)Lclient!qa;", line = 383)
	public static Class2_Sub10_Sub2 method717(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Component arg1) {
		Static12.method256(arg1, arg0);
		@Pc(12) Class2_Sub10_Sub2 local12 = new Class2_Sub10_Sub2();
		Static99.method1657(local12);
		return local12;
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V", line = 487)
	public static void method719() {
		if (Static98.aClass12_1 == null) {
			return;
		}
		if (Class34.anInt1548 >= 0) {
			if (Class15.anInt432 > 0) {
				Class2_Sub2_Sub16.anInt2474 += Class30.anInt1175;
				Static98.aClass12_1.method1244(Class2_Sub2_Sub16.anInt2474, Class34.anInt1548);
				Class15.anInt432--;
				if (Class15.anInt432 == 0) {
					Static98.aClass12_1.method1241();
					Class34.anInt1548 = -1;
					Class15.anInt432 = 20;
				}
			}
		} else if (Class15.anInt432 > 0) {
			Class15.anInt432--;
			if (Class15.anInt432 == 0) {
				Static98.aClass12_1.method1251();
				Class2_Sub2_Sub16.anInt2474 = 0;
				if (Static23.aByteArray9 != null) {
					Class34.anInt1548 = Static26.anInt685;
					Static98.aClass12_1.method1250(Static21.aBoolean185, Static23.aByteArray9, Static26.anInt685);
					Static23.aByteArray9 = null;
				}
			}
		}
		Static98.aClass12_1.method1252();
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)V", line = 542)
	public static void method720() {
		anIntArray182 = null;
		aClass47_9 = null;
		Class2_Sub2_Sub8.aClass40_288 = null;
		aByteArrayArrayArray4 = null;
		aClass5_12 = null;
		Class2_Sub2_Sub8.aClass40_287 = null;
		Class2_Sub2_Sub8.aClass40_286 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V", line = 607)
	public static void method722(@OriginalArg(0) int arg0) {
		Class2_Sub2_Sub12_Sub3.anInt1497 = arg0;
	}
}
