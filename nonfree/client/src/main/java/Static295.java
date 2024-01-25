import jaggl.OpenGL;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
	public static int anInt10019 = 0;

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)V")
	public static void method8178() {
		Static228.aClass189_4.method4519();
		Static407.aClass360_5.method8297();
		Static522.aClass290_6.method6966();
		Static204.aClass139_8.method3315();
		Static237.aClass31_1.method481();
		Static521.aClass273_2.method6716();
		Static61.aClass48_1.method1012();
		Static569.aClass213_2.method5290();
		Static381.aClass2_4.method68();
		Static121.aClass141_1.method3344();
		Static462.aClass178_1.method4036();
		Static447.aClass237_3.method5791();
		Static182.aClass142_3.method3369();
		Static517.aClass144_1.method3382();
		Static484.aClass313_2.method7382();
		Static419.aClass28_1.method454();
		Static594.aClass170_1.method3842();
		Static565.aClass188_1.method4462();
		Static222.aClass243_2.method5943();
		Static278.aClass171_1.method3849();
		Static551.method7985();
		Static223.method3628();
		Static521.method7614();
		Static19.method220();
		Static88.method2071();
		Static261.aClass223_34.method5400();
		Static175.aClass223_18.method5400();
		Static95.aClass223_14.method5400();
		Static148.aClass223_65.method5400();
		Static388.aClass223_52.method5400();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!wd;IIILjava/awt/Component;)Lclient!kv;")
	public static Class80 method8179(@OriginalArg(0) Class354 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static262.anInt5047 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class80 local33 = (Class80) Class.forName("Class80_Sub1").getDeclaredConstructor().newInstance();
			local33.anInt6712 = arg1;
			local33.anIntArray347 = new int[(Static161.aBoolean31 ? 2 : 1) * 256];
			local33.method5613(arg3);
			local33.anInt6713 = (-1024 & arg1) + 1024;
			if (local33.anInt6713 > 16384) {
				local33.anInt6713 = 16384;
			}
			local33.method5599(local33.anInt6713);
			if (Static354.anInt6884 > 0 && Static30.aClass156_1 == null) {
				Static30.aClass156_1 = new Class156();
				Static30.aClass156_1.aClass354_2 = arg0;
				arg0.method8231(Static30.aClass156_1, Static354.anInt6884);
			}
			if (Static30.aClass156_1 != null) {
				if (Static30.aClass156_1.aClass80Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static30.aClass156_1.aClass80Array1[arg2] = local33;
			}
			return local33;
		} catch (@Pc(103) Throwable local103) {
			try {
				@Pc(109) Class80_Sub2 local109 = new Class80_Sub2(arg0, arg2);
				local109.anIntArray347 = new int[(Static161.aBoolean31 ? 2 : 1) * 256];
				local109.anInt6712 = arg1;
				local109.method5613(arg3);
				local109.anInt6713 = 16384;
				local109.method5599(local109.anInt6713);
				if (Static354.anInt6884 > 0 && Static30.aClass156_1 == null) {
					Static30.aClass156_1 = new Class156();
					Static30.aClass156_1.aClass354_2 = arg0;
					arg0.method8231(Static30.aClass156_1, Static354.anInt6884);
				}
				if (Static30.aClass156_1 != null) {
					if (Static30.aClass156_1.aClass80Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static30.aClass156_1.aClass80Array1[arg2] = local109;
				}
				return local109;
			} catch (@Pc(171) Throwable local171) {
				return new Class80();
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(JJ)J")
	public static long method8180(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZLjava/lang/String;JI)V")
	public static void method8181(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) {
		if (arg0) {
			Static517.method7563();
			if (Static143.aString26.equals("")) {
				Static164.anInt3328 = 39;
				return;
			}
		}
		@Pc(19) Class4_Sub11 local19 = new Class4_Sub11(576);
		local19.method4957(10);
		local19.method4937((int) (Math.random() * 65535.0D));
		local19.method4906(arg2);
		local19.method4937(arg0 ? Static126.anInt2811 : Static566.anInt9919);
		local19.method4945(arg1);
		local19.method4906(arg0 ? Static430.aLong211 : Static79.aLong41);
		if (arg0) {
			local19.method4906(Static518.method7584(Static143.aString26));
			try {
				local19.method4906(Long.parseLong(Static98.aString8));
			} catch (@Pc(99) Exception local99) {
				Static164.anInt3328 = 39;
				return;
			}
		} else {
			local19.method4909((int) (Math.random() * 9.9999999E7D));
			local19.method4909((int) (Math.random() * 9.9999999E7D));
			local19.method4909((int) (Math.random() * 9.9999999E7D));
			local19.method4909((int) (Math.random() * 9.9999999E7D));
		}
		local19.method4909((int) (Math.random() * 9.9999999E7D));
		local19.method4939(Static526.aBigInteger2, Static251.aBigInteger3);
		@Pc(117) Class4_Sub14 local117 = Static296.method5096();
		local117.aClass4_Sub11_Sub1_3.method4957(arg0 ? Static367.aClass140_12.anInt3740 : Static367.aClass140_9.anInt3740);
		@Pc(130) int local130 = 1;
		if (Static314.aString60 != null) {
			local130 = Static314.aString60.length() + 1 + 1;
		}
		local117.aClass4_Sub11_Sub1_3.method4937(local19.anInt5831 + local130 + 28);
		local117.aClass4_Sub11_Sub1_3.method4937(623);
		local117.aClass4_Sub11_Sub1_3.method4957(Static154.anInt3181);
		local117.aClass4_Sub11_Sub1_3.method4957(Static438.aClass92_4.anInt2751);
		Static54.method688(local117.aClass4_Sub11_Sub1_3);
		@Pc(175) String local175 = arg0 ? Static337.aString66 : Static314.aString60;
		local117.aClass4_Sub11_Sub1_3.method4957(local175 == null ? 0 : 1);
		if (local175 != null) {
			local117.aClass4_Sub11_Sub1_3.method4945(local175);
		}
		local117.aClass4_Sub11_Sub1_3.method4929(local19.aByteArray68, local19.anInt5831);
		Static353.method5712(local117);
		Static164.anInt3328 = -3;
		Static254.anInt4666 = 0;
		Static146.anInt3106 = 0;
		Static354.anInt6887 = 1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IILjava/lang/String;Lclient!kga;)Lclient!qb;")
	public static Class267 method8182(@OriginalArg(2) String arg0, @OriginalArg(3) Class44_Sub3 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static144.anIntArray142, 0);
		if (Static144.anIntArray142[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class267(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
