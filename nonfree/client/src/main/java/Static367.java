import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	public static int anInt6709;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Lclient!ik;")
	public static final Class117 aClass117_8 = new Class117();

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
	public static int anInt6719 = 0;

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "[I")
	public static final int[] anIntArray618 = new int[4096];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Lclient!u;")
	public static Class22 method5116() {
		try {
			return (Class22) Class.forName("Class22_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;BLclient!qs;Z)Lclient!is;")
	public static Class121 method5117(@OriginalArg(0) String arg0, @OriginalArg(2) Class211 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.method4759(arg0);
		if (local8 == -1) {
			return new Class121(0);
		}
		@Pc(22) int[] local22 = arg1.method4755(local8);
		@Pc(33) Class121 local33 = new Class121(local22.length);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		while (true) {
			while (local35 < local33.anInt3940) {
				@Pc(50) Class1_Sub3 local50 = new Class1_Sub3(arg1.method4758(local22[local37++], local8));
				@Pc(54) int local54 = local50.method1188();
				@Pc(58) int local58 = local50.method1177();
				@Pc(62) int local62 = local50.method1171();
				if (!arg2 && local62 == 1) {
					local33.anInt3940--;
				} else {
					local33.anIntArray378[local35] = local54;
					local33.anIntArray379[local35] = local58;
					local35++;
				}
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[Lclient!ec;I)V")
	public static void method5119(@OriginalArg(1) Class68[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class68 local13 = arg0[local7];
			if (local13 != null && arg1 == local13.anInt2129 && !Static55.method1064(local13)) {
				if (local13.anInt2153 == 0) {
					method5119(arg0, local13.anInt2135);
					if (local13.aClass68Array2 != null) {
						method5119(local13.aClass68Array2, local13.anInt2135);
					}
					@Pc(54) Class1_Sub39 local54 = (Class1_Sub39) Static177.aClass38_18.method765((long) local13.anInt2135);
					if (local54 != null) {
						Static117.method1922(local54.anInt6172);
					}
				}
				if (local13.anInt2153 == 6 && local13.anInt2111 != -1) {
					@Pc(76) Class235 local76 = Static107.aClass239_1.method5420(local13.anInt2111);
					if (local76 != null) {
						local13.anInt2128 += Static234.anInt4630;
						while (local13.anInt2128 > local76.anIntArray632[local13.anInt2151]) {
							local13.anInt2128 -= local76.anIntArray632[local13.anInt2151];
							local13.anInt2151++;
							if (local76.anIntArray633.length <= local13.anInt2151) {
								local13.anInt2151 -= local76.anInt6857;
								if (local13.anInt2151 < 0 || local13.anInt2151 >= local76.anIntArray633.length) {
									local13.anInt2151 = 0;
								}
							}
							local13.anInt2116 = local13.anInt2151 + 1;
							if (local76.anIntArray633.length <= local13.anInt2116) {
								local13.anInt2116 -= local76.anInt6857;
								if (local13.anInt2116 < 0 || local13.anInt2116 >= local76.anIntArray633.length) {
									local13.anInt2116 = -1;
								}
							}
							Static446.method6042(local13);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLclient!sr;)V")
	public static void method5120(@OriginalArg(1) Class41_Sub7 arg0) {
		arg0.aClass30_1 = null;
		@Pc(12) int local12 = arg0.aClass41_Sub8Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass41_Sub8Array1[local14].aBoolean441 = false;
		}
		@Pc(28) Class117[] local28 = Class41_Sub2.aClass117Array1;
		synchronized (Class41_Sub2.aClass117Array1) {
			if (local12 < Class41_Sub2.aClass117Array1.length && Static93.anIntArray609[local12] < 200) {
				Class41_Sub2.aClass117Array1[local12].method2961(arg0);
				@Pc(53) int local53 = Static93.anIntArray609[local12]++;
			}
		}
	}
}
