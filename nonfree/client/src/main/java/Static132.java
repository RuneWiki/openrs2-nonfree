import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "Lclient!ug;")
	public static Class243 aClass243_17;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_87 = new Class189("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ae;B)V")
	public static void method2044(@OriginalArg(0) Class6_Sub1 arg0) {
		arg0.aClass7_1 = null;
		@Pc(14) int local14 = arg0.aClass6_Sub5Array1.length;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			arg0.aClass6_Sub5Array1[local16].aBoolean358 = false;
		}
		@Pc(33) Class138[] local33 = Class7_Sub4.aClass138Array4;
		synchronized (Class7_Sub4.aClass138Array4) {
			if (local14 < Class7_Sub4.aClass138Array4.length && Static47.anIntArray87[local14] < 200) {
				Class7_Sub4.aClass138Array4[local14].method3307(arg0);
				@Pc(54) int local54 = Static47.anIntArray87[local14]++;
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)I")
	public static int method2045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Lclient!t;")
	public static Class234 method2049() {
		try {
			return (Class234) Class.forName("Class234_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)Lclient!vr;")
	public static Class117_Sub1 method2050(@OriginalArg(0) int arg0) {
		return Static422.aBoolean593 && Static73.anInt1827 <= arg0 && Static398.anInt6550 >= arg0 ? Static292.aClass117_Sub1Array4[arg0 - Static73.anInt1827] : null;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIBLjava/lang/String;)V")
	public static void method2052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class156 local8 = Static109.method1853(arg2, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray31 != null) {
			@Pc(18) Class3_Sub31 local18 = new Class3_Sub31();
			local18.anObjectArray36 = local8.anObjectArray31;
			local18.aClass156_11 = local8;
			local18.anInt5004 = arg0;
			local18.aString44 = arg3;
			Static285.method4059(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt4794 != 0) {
			local35 = Static170.method2753(local8);
		}
		if (!local35 || !Static53.method1118(local8).method5982(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static30.method641(Static261.aClass217_15);
			Static339.method4511(arg1, local8.anInt4826, arg2);
		}
		if (arg0 == 2) {
			Static30.method641(Static332.aClass217_91);
			Static339.method4511(arg1, local8.anInt4826, arg2);
		}
		if (arg0 == 3) {
			Static30.method641(Static438.aClass217_110);
			Static339.method4511(arg1, local8.anInt4826, arg2);
		}
		if (arg0 == 4) {
			Static30.method641(Static298.aClass217_92);
			Static339.method4511(arg1, local8.anInt4826, arg2);
		}
		if (arg0 == 5) {
			Static30.method641(Static13.aClass217_7);
			Static339.method4511(arg1, local8.anInt4826, arg2);
		}
		if (arg0 == 6) {
			Static30.method641(Static58.aClass217_26);
			Static339.method4511(arg1, local8.anInt4826, arg2);
		}
		if (arg0 == 7) {
			Static30.method641(Static221.aClass217_69);
			Static339.method4511(arg1, local8.anInt4826, arg2);
		}
		if (arg0 == 8) {
			Static30.method641(Static138.aClass217_51);
			Static339.method4511(arg1, local8.anInt4826, arg2);
		}
		if (arg0 == 9) {
			Static30.method641(Static293.aClass217_82);
			Static339.method4511(arg1, local8.anInt4826, arg2);
		}
		if (arg0 == 10) {
			Static30.method641(Static367.aClass217_96);
			Static339.method4511(arg1, local8.anInt4826, arg2);
		}
	}
}
