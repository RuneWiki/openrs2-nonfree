import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString37;

	@OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
	public static int anInt4234 = 0;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public static void method3923() {
		@Pc(7) Class92 local7 = null;
		try {
			@Pc(11) Class16 local11 = Static182.aClass139_5.method3860();
			while (local11.anInt381 == 0) {
				Static20.method408(1L);
			}
			if (local11.anInt381 == 1) {
				local7 = (Class92) local11.anObject1;
				@Pc(38) byte[] local38 = new byte[(int) local7.method2382()];
				@Pc(52) int local52;
				for (@Pc(40) int local40 = 0; local40 < local38.length; local40 += local52) {
					local52 = local7.method2384(local38, local40, local38.length - local40);
					if (local52 == -1) {
						throw new IOException("EOF");
					}
				}
				Static336.method5810(new Class5_Sub12(local38));
			}
		} catch (@Pc(76) Exception local76) {
		}
		try {
			if (local7 != null) {
				local7.method2387();
			}
		} catch (@Pc(88) Exception local88) {
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(BI)Lclient!wh;")
	public static Class5_Sub1_Sub21 method3924(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub1_Sub21 local10 = (Class5_Sub1_Sub21) Static176.aClass109_40.method2857((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static242.aClass93_89.method2410(arg0, 26);
		local10 = new Class5_Sub1_Sub21();
		if (local29 != null) {
			local10.method5976(new Class5_Sub12(local29));
		}
		Static176.aClass109_40.method2855((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBIII)Lclient!sd;")
	public static Class184 method3926(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class206[] local7 = null;
		@Pc(16) Class63 local16 = Static51.method833(arg2);
		if (local16.anIntArray119 != null) {
			local7 = new Class206[local16.anIntArray119.length];
			for (@Pc(26) int local26 = 0; local26 < local7.length; local26++) {
				@Pc(35) Class168 local35 = Static220.method4015(local16.anIntArray119[local26]);
				local7[local26] = new Class206(local35.anInt5131, local35.anInt5130, local35.anInt5128, local35.anInt5134, local35.anInt5124, local35.anInt5127, local35.anInt5129, local35.aBoolean428);
			}
		}
		return new Class184(local16.anInt1468, local7, local16.anInt1462, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([[[Lclient!r;B)V")
	public static void method3928(@OriginalArg(0) Class174[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(12) Class174[][] local12 = arg0[local7];
			for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
				for (@Pc(17) int local17 = 0; local17 < local12[local14].length; local17++) {
					@Pc(24) Class174 local24 = local12[local14][local17];
					if (local24 != null) {
						if (local24.aClass4_Sub4_1 instanceof Interface5) {
							((Interface5) local24.aClass4_Sub4_1).method5907();
						}
						if (local24.aClass4_Sub1_2 instanceof Interface5) {
							((Interface5) local24.aClass4_Sub1_2).method5907();
						}
						if (local24.aClass4_Sub1_1 instanceof Interface5) {
							((Interface5) local24.aClass4_Sub1_1).method5907();
						}
						if (local24.aClass4_Sub3_2 instanceof Interface5) {
							((Interface5) local24.aClass4_Sub3_2).method5907();
						}
						if (local24.aClass4_Sub3_1 instanceof Interface5) {
							((Interface5) local24.aClass4_Sub3_1).method5907();
						}
						for (@Pc(74) Class84 local74 = local24.aClass84_3; local74 != null; local74 = local74.aClass84_2) {
							@Pc(78) Class4_Sub5 local78 = local74.aClass4_Sub5_1;
							if (local78 instanceof Interface5) {
								((Interface5) local78).method5907();
							}
						}
					}
				}
			}
		}
	}
}
