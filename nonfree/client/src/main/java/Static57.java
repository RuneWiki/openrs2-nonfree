import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dj", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "client!dj", name = "db", descriptor = "Lclient!r;")
	public static Class197 aClass197_11;

	@OriginalMember(owner = "client!dj", name = "eb", descriptor = "Lclient!r;")
	public static Class197 aClass197_12;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 145)
	public static void method1671(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Class2_Sub43.anInt7165 >= 100 && !Class90_Sub1.aBoolean482 || Class2_Sub43.anInt7165 >= 200) {
			Static193.method3701(Class49.aClass79_129.method2269(Class197.anInt5569));
			return;
		}
		@Pc(33) String local33 = Static126.method2539(arg0);
		if (local33 == null) {
			return;
		}
		@Pc(78) String local78;
		for (@Pc(38) int local38 = 0; local38 < Class2_Sub43.anInt7165; local38++) {
			@Pc(46) String local46 = Static126.method2539(Class12_Sub1_Sub1.aStringArray43[local38]);
			if (local46 != null && local46.equals(local33)) {
				Static193.method3701(arg0 + Class6.aClass79_131.method2269(Class197.anInt5569));
				return;
			}
			if (Class214.aStringArray54[local38] != null) {
				local78 = Static126.method2539(Class214.aStringArray54[local38]);
				if (local78 != null && local78.equals(local33)) {
					Static193.method3701(arg0 + Class6.aClass79_131.method2269(Class197.anInt5569));
					return;
				}
			}
		}
		for (@Pc(108) int local108 = 0; local108 < Class2_Sub3_Sub30.anInt5688; local108++) {
			local78 = Static126.method2539(Class2_Sub3_Sub22.aStringArray35[local108]);
			if (local78 != null && local78.equals(local33)) {
				Static193.method3701(Class2_Sub3_Sub16.aClass79_64.method2269(Class197.anInt5569) + arg0 + Class2_Sub2_Sub9.aClass79_65.method2269(Class197.anInt5569));
				return;
			}
			if (Class173_Sub4.aStringArray66[local108] != null) {
				@Pc(151) String local151 = Static126.method2539(Class173_Sub4.aStringArray66[local108]);
				if (local151 != null && local151.equals(local33)) {
					Static193.method3701(Class2_Sub3_Sub16.aClass79_64.method2269(Class197.anInt5569) + arg0 + Class2_Sub2_Sub9.aClass79_65.method2269(Class197.anInt5569));
					return;
				}
			}
		}
		if (Static126.method2539(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41).equals(local33)) {
			Static193.method3701(Class89.aClass79_54.method2269(Class197.anInt5569));
		} else {
			Static85.method1962(Class105.aClass145_104);
			Class14.aClass2_Sub4_Sub2_4.method4843(Static26.method872(arg0));
			Class14.aClass2_Sub4_Sub2_4.method4823(arg0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B[JI[II)V", line = 318)
	public static void method1673(@OriginalArg(1) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg1; local46++) {
			if (local20 + (long) (local46 & 0x1) > arg0[local46]) {
				@Pc(64) long local64 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local64;
				@Pc(78) int local78 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16++] = local78;
			}
		}
		arg0[arg1] = arg0[local16];
		arg0[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method1673(arg0, local16 - 1, arg2, arg3);
		method1673(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBLclient!r;)Lclient!vj;", line = 375)
	public static Class2_Sub2_Sub17 method1674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class197 arg2) {
		@Pc(14) Class2_Sub4 local14 = new Class2_Sub4(arg2.method5090(arg0, arg1));
		@Pc(54) Class2_Sub2_Sub17 local54 = new Class2_Sub2_Sub17(arg0, local14.method4810(), local14.method4810(), local14.method4837(), local14.method4837(), local14.method4816() == 1, local14.method4816(), local14.method4816());
		@Pc(58) int local58 = local14.method4816();
		for (@Pc(60) int local60 = 0; local60 < local58; local60++) {
			local54.aClass135_41.method3541(new Class2_Sub31(local14.method4816(), local14.method4830(), local14.method4830(), local14.method4830(), local14.method4830(), local14.method4830(), local14.method4830(), local14.method4830(), local14.method4830()));
		}
		local54.method6151();
		return local54;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V", line = 403)
	public static void method1675() {
		for (@Pc(5) int local5 = 0; local5 < Class117.anInt3183; local5++) {
			@Pc(13) int local13 = Class149.anIntArray230[local5];
			@Pc(17) Class11_Sub5_Sub2_Sub2 local17 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local13];
			if (local17 != null) {
				Static87.method2001(local17, local17.aClass71_1.anInt2038);
			}
		}
	}
}
