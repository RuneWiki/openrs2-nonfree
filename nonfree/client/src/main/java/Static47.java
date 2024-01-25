import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_34 = new Class235(2, 5);

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
	public static int anInt802 = 0;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method716(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + Static514.method7147(arg0.charAt(local17)) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!ft;Lclient!mo;)V")
	public static void method717(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1, @OriginalArg(3) Class1_Sub35 arg2) {
		@Pc(9) Class1_Sub22 local9 = new Class1_Sub22();
		local9.anInt3251 = arg2.method5750();
		local9.anInt3250 = arg2.method5804();
		local9.anIntArray301 = new int[local9.anInt3251];
		local9.anIntArray302 = new int[local9.anInt3251];
		local9.aClass260Array2 = new Class260[local9.anInt3251];
		local9.aClass260Array1 = new Class260[local9.anInt3251];
		local9.anIntArray300 = new int[local9.anInt3251];
		local9.aByteArrayArrayArray14 = new byte[local9.anInt3251][][];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt3251; local56++) {
			try {
				@Pc(62) int local62 = arg2.method5750();
				@Pc(85) String local85;
				@Pc(89) String local89;
				@Pc(93) int local93;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local85 = arg2.method5760();
					local89 = arg2.method5760();
					local93 = 0;
					if (local62 == 1) {
						local93 = arg2.method5804();
					}
					local9.anIntArray300[local56] = local62;
					local9.anIntArray301[local56] = local93;
					local9.aClass260Array2[local56] = arg1.method2182(local89, Static296.method4154(local85));
				} else if (local62 == 3 || local62 == 4) {
					local85 = arg2.method5760();
					local89 = arg2.method5760();
					local93 = arg2.method5750();
					@Pc(96) String[] local96 = new String[local93];
					for (@Pc(98) int local98 = 0; local98 < local93; local98++) {
						local96[local98] = arg2.method5760();
					}
					@Pc(117) byte[][] local117 = new byte[local93][];
					@Pc(130) int local130;
					if (local62 == 3) {
						for (@Pc(124) int local124 = 0; local124 < local93; local124++) {
							local130 = arg2.method5804();
							local117[local124] = new byte[local130];
							arg2.method5800(local117[local124], local130);
						}
					}
					local9.anIntArray300[local56] = local62;
					@Pc(159) Class[] local159 = new Class[local93];
					for (local130 = 0; local130 < local93; local130++) {
						local159[local130] = Static296.method4154(local96[local130]);
					}
					local9.aClass260Array1[local56] = arg1.method2181(local89, local159, Static296.method4154(local85));
					local9.aByteArrayArrayArray14[local56] = local117;
				}
			} catch (@Pc(234) ClassNotFoundException local234) {
				local9.anIntArray302[local56] = -1;
			} catch (@Pc(241) SecurityException local241) {
				local9.anIntArray302[local56] = -2;
			} catch (@Pc(248) NullPointerException local248) {
				local9.anIntArray302[local56] = -3;
			} catch (@Pc(255) Exception local255) {
				local9.anIntArray302[local56] = -4;
			} catch (@Pc(262) Throwable local262) {
				local9.anIntArray302[local56] = -5;
			}
		}
		Static520.aClass353_61.method7679(local9);
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	public static void method718() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("availableProcessors");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local20.invoke(local24, (Object[]) null);
					Static464.anInt7967 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}
}
