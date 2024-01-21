import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!ea;")
	private static Class18 aClass18_281 = Static8.method128("Loaded fonts");

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_280 = aClass18_281;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public static int anInt1163 = -1;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!rc;")
	public static Class66 aClass66_6 = new Class66(128);

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!ea;")
	public static Class18 aClass18_282 = Static8.method128("M");

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method756() {
		Static163.aClass66_21.method2604();
		Static37.aClass66_7.method2604();
		Static106.aClass66_12.method2604();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	public static void method757(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static30.method659(Static1.aClass18_42, Static108.aClass18_812, Static21.aClass18_185);
		} else if (arg0 == -2) {
			Static30.method659(Static1.aClass18_37, Static1.aClass18_25, Static12.aClass18_1205);
		} else if (arg0 == -1) {
			Static30.method659(Static1.aClass18_35, Static30.aClass18_254, Static21.aClass18_187);
		} else if (arg0 == 3) {
			Static30.method659(Static1.aClass18_24, Static1.aClass18_17, Static42.aClass18_338);
		} else if (arg0 == 4) {
			Static30.method659(Static1.aClass18_34, Static142.aClass18_991, Static46.aClass18_1237);
		} else if (arg0 == 5) {
			Static30.method659(Static1.aClass18_44, Static105.aClass18_788, Static64.aClass18_480);
		} else if (arg0 == 6) {
			Static30.method659(Static1.aClass18_14, Static91.aClass18_684, Static42.aClass18_334);
		} else if (arg0 == 7) {
			Static30.method659(Static1.aClass18_49, Static113.aClass18_1131, Static46.aClass18_1242);
		} else if (arg0 == 8) {
			Static30.method659(Static1.aClass18_29, Static40.aClass18_312, Static158.aClass18_1111);
		} else if (arg0 == 9) {
			Static30.method659(Static1.aClass18_12, Static87.aClass18_649, Static11.aClass18_118);
		} else if (arg0 == 10) {
			Static30.method659(Static1.aClass18_22, Static40.aClass18_315, Static151.aClass18_1067);
		} else if (arg0 == 11) {
			Static30.method659(Static1.aClass18_38, Static156.aClass18_1103, Static58.aClass18_454);
		} else if (arg0 == 12) {
			Static30.method659(Static1.aClass18_43, Static40.aClass18_311, Static89.aClass18_681);
		} else if (arg0 == 13) {
			Static30.method659(Static1.aClass18_45, Static48.aClass18_381, Static21.aClass18_189);
		} else if (arg0 == 14) {
			Static30.method659(Static1.aClass18_33, Static80.aClass18_591, Static42.aClass18_336);
		} else if (arg0 == 16) {
			Static30.method659(Static1.aClass18_15, Static57.aClass18_443, Static93.aClass18_726);
		} else if (arg0 == 17) {
			Static30.method659(Static1.aClass18_18, Static166.aClass18_1171, Static47.aClass18_1085);
		} else if (arg0 == 18) {
			Static30.method659(Static1.aClass18_36, Static158.aClass18_1112, Static75.aClass18_551);
		} else if (arg0 == 19) {
			Static30.method659(Static46.aClass18_1243, Static3.aClass18_65, Static133.aClass18_958);
		} else if (arg0 == 20) {
			Static30.method659(Static1.aClass18_27, Static95.aClass18_745, Static21.aClass18_186);
		} else if (arg0 == 22) {
			Static30.method659(Static1.aClass18_50, Static43.aClass18_354, Static119.aClass18_860);
		} else if (arg0 == 23) {
			Static30.method659(Static1.aClass18_13, Static39.aClass18_299, Static42.aClass18_333);
		} else if (arg0 == 24) {
			Static30.method659(Static1.aClass18_32, Static142.aClass18_994, Static130.aClass18_937);
		} else if (arg0 == 25) {
			Static30.method659(Static1.aClass18_40, Static24.aClass18_219, Static21.aClass18_191);
		} else if (arg0 == 26) {
			Static30.method659(Static1.aClass18_26, Static144.aClass18_1017, Static168.aClass18_1181);
		} else if (arg0 == 27) {
			Static30.method659(Static1.aClass18_19, Static1.aClass18_31, Static48.aClass18_386);
		} else {
			Static30.method659(Static1.aClass18_46, Static58.aClass18_453, Static21.aClass18_190);
		}
		Static6.method107(10);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ef;I)I")
	public static int method758(@OriginalArg(0) Class20 arg0) {
		@Pc(18) Class1_Sub11 local18 = (Class1_Sub11) Static131.aClass14_9.method569(((long) arg0.anInt1240 << 32) + (long) arg0.anInt1200);
		return local18 == null ? arg0.anInt1194 : local18.anInt1570;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZII)I")
	public static int method759(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 * arg1 + (4096 - arg1) * arg2 >> 12;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method760() {
		aClass18_282 = null;
		aClass18_280 = null;
		aClass66_6 = null;
		aClass18_281 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIBLjava/awt/Component;)Lclient!jf;")
	public static Class17 method761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class17_Sub2");
			@Pc(18) Class17 local18 = (Class17) local6.getDeclaredConstructor().newInstance();
			local18.method1247(arg2, arg0, arg1);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class17_Sub1 local31 = new Class17_Sub1();
			local31.method1247(arg2, arg0, arg1);
			return local31;
		}
	}
}
