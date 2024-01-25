import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Z")
	public static boolean aBoolean390;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_190 = new Class288(95, 6);

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_70 = new Class179(21, 8);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLjava/lang/String;ZI)V")
	public static void method4623(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		Static173.method8450();
		if (arg2 == 0) {
			Static192.aClass95_4 = Static562.method7703(0, Static234.aClass2_Sub5_48.aClass6_Sub11_2.method3433() * 2, Static252.anInterface6_14, Static504.aCanvas11, Static525.aClass380_94);
			if (arg0 != null) {
				Static192.aClass95_4.GA(0);
				@Pc(172) Class256 local172 = Static416.method5569(Static141.aClass380_39, Static397.anInt6240);
				@Pc(181) Class62 local181 = Static192.aClass95_4.method6956(local172, Static655.method7413(Static79.aClass380_22, Static397.anInt6240));
				Static130.method1828();
				Static445.method6068(local172, arg0, local181, true, Static192.aClass95_4);
			}
		} else {
			@Pc(11) Class95 local11 = null;
			@Pc(30) Class256 local30;
			@Pc(39) Class62 local39;
			if (arg0 != null) {
				local11 = Static562.method7703(0, 0, Static252.anInterface6_14, Static504.aCanvas11, Static525.aClass380_94);
				local11.GA(0);
				local30 = Static416.method5569(Static141.aClass380_39, Static397.anInt6240);
				local39 = local11.method6956(local30, Static655.method7413(Static79.aClass380_22, Static397.anInt6240));
				Static130.method1828();
				Static445.method6068(local30, arg0, local39, true, local11);
			}
			try {
				Static192.aClass95_4 = Static562.method7703(arg2, Static234.aClass2_Sub5_48.aClass6_Sub11_2.method3433() * 2, Static252.anInterface6_14, Static504.aCanvas11, Static525.aClass380_94);
				if (arg0 != null) {
					local11.GA(0);
					local30 = Static416.method5569(Static141.aClass380_39, Static397.anInt6240);
					local39 = local11.method6956(local30, Static655.method7413(Static79.aClass380_22, Static397.anInt6240));
					Static130.method1828();
					Static445.method6068(local30, arg0, local39, true, local11);
				}
				if (Static192.aClass95_4.method6992()) {
					@Pc(95) boolean local95 = true;
					try {
						local95 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(105) Throwable local105) {
					}
					@Pc(111) Class2_Sub31 local111;
					if (local95) {
						local111 = Static192.aClass95_4.method6985(146800640);
					} else {
						local111 = Static192.aClass95_4.method6985(104857600);
					}
					Static192.aClass95_4.method6987(local111);
				}
			} catch (@Pc(122) Throwable local122) {
				@Pc(127) int local127 = Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280();
				Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub21_2);
				method4623(arg0, arg1, local127);
				return;
			}
			if (local11 != null) {
				try {
					local11.method6930();
				} catch (@Pc(146) Throwable local146) {
				}
			}
		}
		Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7281(!arg1);
		Static234.aClass2_Sub5_48.method176(arg2, Static234.aClass2_Sub5_48.aClass6_Sub21_2);
		Static213.method2956();
		Static192.aClass95_4.method6935();
		Static192.aClass95_4.X(32);
		Static185.aClass177_4 = Static192.aClass95_4.method7001();
		Static458.aClass177_9 = Static192.aClass95_4.method7001();
		Static130.method1833();
		Static192.aClass95_4.method7006(Static234.aClass2_Sub5_48.aClass6_Sub26_1.method8163() == 1);
		if (Static192.aClass95_4.method6944()) {
			Static570.method7807(Static234.aClass2_Sub5_48.aClass6_Sub8_1.method2927() == 1);
		}
		Static66.method8416(Static192.aClass95_4, Static228.anInt3704 >> 3, Static162.anInt2911 >> 3);
		Static249.method3418();
		Static266.aBoolean292 = false;
		Static308.aClass210Array1 = null;
		Static555.aBoolean676 = true;
		Static541.method7472();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)I")
	public static int method4624(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
