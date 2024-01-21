import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!mh", name = "ib", descriptor = "Lclient!je;")
	public static Class44 aClass44_6;

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1053 = Static169.method2903("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1054 = Static169.method2903("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!mh", name = "cb", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!mh", name = "db", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1055 = Static169.method2903("jolt");

	@OriginalMember(owner = "client!mh", name = "eb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1056 = Static169.method2903("Connection timed out)3");

	@OriginalMember(owner = "client!mh", name = "gb", descriptor = "[J")
	public static long[] aLongArray5 = new long[200];

	@OriginalMember(owner = "client!mh", name = "kb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1057 = aClass23_1056;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
	public static void method1840() {
		aClass23_1057 = null;
		aClass23_1054 = null;
		aClass44_6 = null;
		aLongArray5 = null;
		aClass23_1053 = null;
		aClass23_1055 = null;
		aClass23_1056 = null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!jg;I)V")
	public static void method1841(@OriginalArg(0) Class1_Sub8 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static44.aClass21_3 != null) {
			@Pc(24) int local24;
			try {
				Static44.aClass21_3.method600(0L);
				Static44.aClass21_3.method597(local8);
				for (local24 = 0; local24 < 24 && local8[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(49) Exception local49) {
				for (local24 = 0; local24 < 24; local24++) {
					local8[local24] = -1;
				}
			}
		}
		arg0.method865(local8, 24);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIBI)I")
	public static int method1842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 / arg0;
		@Pc(9) int local9 = arg2 & arg0 - 1;
		@Pc(22) int local22 = arg1 / arg0;
		@Pc(27) int local27 = Static74.method1342(local22, local3);
		@Pc(34) int local34 = Static74.method1342(local22, local3 + 1);
		@Pc(40) int local40 = arg1 & arg0 - 1;
		@Pc(47) int local47 = Static74.method1342(local22 + 1, local3);
		@Pc(56) int local56 = Static74.method1342(local22 + 1, local3 + 1);
		@Pc(63) int local63 = Static29.method530(arg0, local9, local27, local34);
		@Pc(70) int local70 = Static29.method530(arg0, local9, local47, local56);
		return Static29.method530(arg0, local40, local63, local70);
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
	public static void method1843() {
		try {
			if (Static77.aClass82_1 == null) {
				Static77.aClass82_1 = new Class82(Static29.aClass74_2, Static149.method2571(new Class23[] { Static50.aClass23_519, Static101.aClass23_994, Static138.aClass23_1321 }).method652());
			} else {
				@Pc(32) byte[] local32 = Static77.aClass82_1.method2826();
				if (local32 != null) {
					@Pc(39) Class1_Sub8 local39 = new Class1_Sub8(local32);
					Static4.anInt298 = local39.method878();
					Static98.aClass78Array1 = new Class78[Static4.anInt298];
					for (@Pc(48) int local48 = 0; local48 < Static4.anInt298; local48++) {
						@Pc(58) Class78 local58 = Static98.aClass78Array1[local48] = new Class78();
						@Pc(62) int local62 = local39.method878();
						local58.aBoolean194 = (local62 & 0x8000) != 0;
						local58.anInt3807 = local62 & 0x7FFF;
						local58.aClass23_1460 = local39.method864();
						local58.anInt3806 = local39.method875();
						local58.anInt3805 = local48;
						local58.anInt3802 = Static132.method2794(local58.aClass23_1460);
					}
					Static122.method2771(Static98.aClass78Array1, Static108.anIntArray251, Static98.aClass78Array1.length - 1, 0, Static96.anIntArray310);
					Static77.aClass82_1 = null;
					Static5.aBoolean218 = true;
				}
			}
		} catch (@Pc(127) Exception local127) {
			local127.printStackTrace();
			Static77.aClass82_1 = null;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([Lclient!ob;II)V")
	public static void method1844(@OriginalArg(0) Class60[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class60 local18 = arg0[local12];
			if (local18 != null && local18.anInt2971 == arg1 && (!local18.aBoolean155 || !Static146.method2528(local18))) {
				if (local18.anInt3032 == 0) {
					if (!local18.aBoolean155 && Static146.method2528(local18) && Static107.aClass60_8 != local18) {
						continue;
					}
					method1844(arg0, local18.anInt3019);
					if (local18.aClass60Array1 != null) {
						method1844(local18.aClass60Array1, local18.anInt3019);
					}
					@Pc(66) Class1_Sub16 local66 = (Class1_Sub16) Static12.aClass10_1.method256((long) local18.anInt3019);
					if (local66 != null) {
						Static75.method1346(local66.anInt3207);
					}
				}
				if (local18.anInt3032 == 6) {
					@Pc(97) int local97;
					if (local18.anInt2975 != -1 || local18.anInt3005 != -1) {
						@Pc(92) boolean local92 = Static31.method545(local18);
						if (local92) {
							local97 = local18.anInt3005;
						} else {
							local97 = local18.anInt2975;
						}
						if (local97 != -1) {
							@Pc(110) Class1_Sub1_Sub18 local110 = Static157.method2652(local97);
							local18.anInt3026 += Static58.anInt1635;
							while (local110.anIntArray601[local18.anInt2976] < local18.anInt3026) {
								local18.anInt3026 -= local110.anIntArray601[local18.anInt2976];
								local18.anInt2976++;
								if (local110.anIntArray602.length <= local18.anInt2976) {
									local18.anInt2976 -= local110.anInt4304;
									if (local18.anInt2976 < 0 || local18.anInt2976 >= local110.anIntArray602.length) {
										local18.anInt2976 = 0;
									}
								}
								Static39.method659(local18);
							}
						}
					}
					if (local18.anInt3025 != 0 && !local18.aBoolean155) {
						@Pc(189) int local189 = local18.anInt3025 >> 16;
						local97 = local18.anInt3025 << 16 >> 16;
						local97 *= Static58.anInt1635;
						@Pc(204) int local204 = local189 * Static58.anInt1635;
						local18.anInt2978 = local18.anInt2978 + local97 & 0x7FF;
						local18.anInt2979 = local204 + local18.anInt2979 & 0x7FF;
						Static39.method659(local18);
					}
				}
			}
		}
	}
}
