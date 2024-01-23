import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt3372;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Lclient!nk;")
	public static Class121 aClass121_82;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!vh;")
	public static Class187 aClass187_90 = new Class187(64);

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString193 = "Loaded update list";

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Lclient!gj;")
	public static Class59 aClass59_27 = new Class59();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!df;I)V")
	public static void method2912(@OriginalArg(1) Class1_Sub10 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray1;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class1_Sub2_Sub18 local18 = Static266.method4192(local14);
		if (local18 == null) {
			return;
		}
		Static140.anIntArray464 = new int[local18.anInt4572];
		Static75.aStringArray7 = new String[local18.anInt4575];
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 1; local36 < local8.length; local36++) {
			if (local8[local36] instanceof Integer) {
				@Pc(81) int local81 = (Integer) local8[local36];
				if (local81 == -2147483647) {
					local81 = arg0.anInt950;
				}
				if (local81 == -2147483646) {
					local81 = arg0.anInt947;
				}
				if (local81 == -2147483645) {
					local81 = arg0.aClass66_10 == null ? -1 : arg0.aClass66_10.anInt2157;
				}
				if (local81 == -2147483644) {
					local81 = arg0.anInt951;
				}
				if (local81 == -2147483643) {
					local81 = arg0.aClass66_10 == null ? -1 : arg0.aClass66_10.anInt2178;
				}
				if (local81 == -2147483642) {
					local81 = arg0.aClass66_9 == null ? -1 : arg0.aClass66_9.anInt2157;
				}
				if (local81 == -2147483641) {
					local81 = arg0.aClass66_9 == null ? -1 : arg0.aClass66_9.anInt2178;
				}
				if (local81 == -2147483640) {
					local81 = arg0.anInt954;
				}
				if (local81 == -2147483639) {
					local81 = arg0.anInt955;
				}
				Static140.anIntArray464[local34++] = local81;
			} else if (local8[local36] instanceof String) {
				@Pc(60) String local60 = (String) local8[local36];
				if (local60.equals("event_opbase")) {
					local60 = arg0.aString50;
				}
				Static75.aStringArray7[local32++] = local60;
			}
		}
		Static172.method2906(local18, arg1);
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
	public static void method2914() {
		Static127.aClass1_Sub14_Sub1_3.method1408(248);
		for (@Pc(18) Class1_Sub25 local18 = (Class1_Sub25) Static302.aClass142_26.method3534(); local18 != null; local18 = (Class1_Sub25) Static302.aClass142_26.method3530()) {
			if (local18.anInt4294 == 0) {
				Static261.method4118(true, local18);
			}
		}
		if (Static310.aClass66_51 != null) {
			Static103.method1865(Static310.aClass66_51);
			Static310.aClass66_51 = null;
		}
	}
}
