import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "Z")
	public static boolean aBoolean222;

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
	public static int anInt2917;

	@OriginalMember(owner = "client!ho", name = "E", descriptor = "Lclient!uu;")
	public static Class250 aClass250_46;

	@OriginalMember(owner = "client!ho", name = "H", descriptor = "Lclient!ws;")
	public static Class272 aClass272_1;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "(I)V")
	public static void method2486() {
		Static127.anIntArray114 = Static280.method3859(0.4F);
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(IIII)V")
	public static void method2487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Static59.anInt1127 + arg1;
		@Pc(13) int local13 = arg2 + Static49.anInt873;
		if (Static389.aClass227ArrayArrayArray3 == null || arg1 < 0 || arg2 < 0 || Static373.anInt6324 <= arg1 || arg2 >= Static291.anInt5062) {
			return;
		}
		@Pc(44) long local44 = (long) (local9 | local13 << 14 | arg0 << 28);
		@Pc(50) Class3_Sub13 local50 = (Class3_Sub13) Static242.aClass140_26.method3490(local44);
		if (local50 == null) {
			Static240.method5192(arg0, arg1, arg2);
			return;
		}
		@Pc(68) Class3_Sub9 local68 = (Class3_Sub9) local50.aClass193_19.method4519();
		if (local68 == null) {
			Static240.method5192(arg0, arg1, arg2);
			return;
		}
		@Pc(82) Class1_Sub5_Sub1 local82 = (Class1_Sub5_Sub1) Static240.method5192(arg0, arg1, arg2);
		if (local82 == null) {
			local82 = new Class1_Sub5_Sub1();
		} else {
			local82.anInt5679 = local82.anInt5681 = -1;
		}
		local82.anInt5684 = local68.anInt627;
		local82.anInt5676 = local68.anInt625;
		label46: while (true) {
			@Pc(110) Class3_Sub9 local110 = (Class3_Sub9) local50.aClass193_19.method4525();
			if (local110 == null) {
				break;
			}
			if (local82.anInt5684 != local110.anInt627) {
				local82.anInt5679 = local110.anInt627;
				local82.anInt5680 = local110.anInt625;
				while (true) {
					@Pc(135) Class3_Sub9 local135 = (Class3_Sub9) local50.aClass193_19.method4525();
					if (local135 == null) {
						break label46;
					}
					if (local82.anInt5684 != local135.anInt627 && local135.anInt627 != local82.anInt5679) {
						local82.anInt5683 = local135.anInt625;
						local82.anInt5681 = local135.anInt627;
					}
				}
			}
		}
		@Pc(183) int local183 = Static181.method4212(arg0, (arg2 << 7) + 64, (arg1 << 7) + 64);
		Static257.method3588(arg0, arg1, arg2, local183, local82);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;IZJ)V")
	public static void method2489(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2) {
		if (arg1) {
			Static299.method4268();
			if (Static140.aString37.equals("")) {
				Static88.anInt1593 = 39;
				return;
			}
		}
		@Pc(19) Class3_Sub25 local19 = new Class3_Sub25(128);
		local19.method4081(10);
		local19.method4123((int) (Math.random() * 65535.0D));
		local19.method4063(arg2);
		local19.method4123(Static59.anInt1131);
		local19.method4082((int) (Math.random() * 9.9999999E7D));
		local19.method4080(arg0);
		local19.method4082((int) (Math.random() * 9.9999999E7D));
		if (arg1) {
			local19.method4063(Static428.method5838(Static140.aString37));
			try {
				local19.method4063(Long.parseLong(Static223.aString46));
			} catch (@Pc(77) Exception local77) {
				Static88.anInt1593 = 39;
				return;
			}
		} else {
			local19.method4082((int) (Math.random() * 9.9999999E7D));
			local19.method4082((int) (Math.random() * 9.9999999E7D));
			local19.method4082((int) (Math.random() * 9.9999999E7D));
			local19.method4082((int) (Math.random() * 9.9999999E7D));
		}
		local19.method4082((int) (Math.random() * 9.9999999E7D));
		local19.method4111(Static319.aBigInteger1, Static386.aBigInteger2);
		Static243.aClass3_Sub25_Sub1_7.anInt4974 = 0;
		Static243.aClass3_Sub25_Sub1_7.method4081(arg1 ? Static445.aClass235_36.anInt6547 : Static445.aClass235_33.anInt6547);
		Static243.aClass3_Sub25_Sub1_7.method4123(local19.anInt4974 + 28);
		Static243.aClass3_Sub25_Sub1_7.method4123(603);
		Static243.aClass3_Sub25_Sub1_7.method4081(Static300.anInt5192);
		Static243.aClass3_Sub25_Sub1_7.method4081(Static154.aClass113_3.anInt3360);
		Static294.method4200(Static243.aClass3_Sub25_Sub1_7);
		Static243.aClass3_Sub25_Sub1_7.method4098(local19.aByteArray88, local19.anInt4974);
		Static233.anInt3996 = 0;
		Static88.anInt1593 = -3;
		Static235.anInt4027 = 0;
		Static238.anInt4081 = 1;
	}
}
