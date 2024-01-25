import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!vda", name = "x", descriptor = "[I")
	public static int[] anIntArray689;

	@OriginalMember(owner = "client!vda", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString92 = null;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILclient!mo;)Lclient!jo;")
	public static Class43_Sub2 method7488(@OriginalArg(1) Class1_Sub35 arg0) {
		return new Class43_Sub2(arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5797(), arg0.method5750());
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IBLclient!mo;)Ljava/lang/String;")
	public static String method7489(@OriginalArg(2) Class1_Sub35 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5739();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt7214 += Static412.aClass356_1.method7736(local15, arg0.aByteArray85, arg0.anInt7214, local7, 0);
			return Static133.method3234(0, local7, local15);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!ea;)V")
	public static void method7490(@OriginalArg(0) Class79 arg0) {
		if (Static369.anInt6129 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub18 local6 = arg0.aClass1_Sub18_2;
		Static172.aClass79Array1[Static369.anInt6129] = arg0;
		Static571.aBooleanArray25[Static369.anInt6129] = false;
		Static369.anInt6129++;
		@Pc(21) int local21 = arg0.anInt2033;
		if (arg0.aBoolean160) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2033;
		if (arg0.aBoolean159) {
			local29 = Static175.anInt9133 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method4098() + Static142.anInt2687 - local6.method4104() >> Static351.anInt5832;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method4098() + local6.method4104() - Static142.anInt2687 >> Static351.anInt5832;
			if (local73 >= Static507.anInt8645) {
				local73 = Static507.anInt8645 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray45[local41++];
				@Pc(105) int local105 = (local6.method4107() + Static142.anInt2687 - local6.method4104() >> Static351.anInt5832) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static27.anInt373) {
					local113 = Static27.anInt373 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static91.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static91.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static369.anInt6129;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static91.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static369.anInt6129 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static91.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static369.anInt6129 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static91.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static369.anInt6129 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)Z")
	public static boolean method7492() {
		return Static11.anInt142 == 0 ? Static97.aClass1_Sub7_Sub2_2.method508() : true;
	}
}
