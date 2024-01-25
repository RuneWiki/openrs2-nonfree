import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
	public static int anInt9064;

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "Lclient!faa;")
	public static final Class91 aClass91_36 = new Class91(8);

	@OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
	public static int anInt9068 = -1;

	@OriginalMember(owner = "client!ut", name = "I", descriptor = "Z")
	public static boolean aBoolean677 = false;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZI)V")
	public static void method7357(@OriginalArg(0) boolean arg0) {
		if (Static520.aClass247_5 == null) {
			Static324.method4818();
		}
		if (arg0) {
			Static520.aClass247_5.method5325();
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7360(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 == 0) {
			Static31.aClass78_18 = Static439.method6788(Static86.aClass1_Sub30_Sub1_1.anInt6186 * 2, 0, Static103.aCanvas2, Static302.anInterface9_12, Static461.aClass308_163);
			if (arg1 != null) {
				Static31.aClass78_18.ja(0);
				@Pc(32) Class352 local32 = Static337.method5009(Static414.anInt7794, Static77.aClass308_183);
				@Pc(41) Class96 local41 = Static31.aClass78_18.method6837(local32, Static604.method6020(Static121.aClass308_48, Static414.anInt7794));
				Static8.method4849();
				Static307.method6069(arg1, local41, true, Static31.aClass78_18, local32);
			}
		} else {
			@Pc(58) Class78 local58 = null;
			@Pc(88) Class96 local88;
			@Pc(79) Class352 local79;
			if (arg1 != null) {
				local58 = Static439.method6788(0, 0, Static103.aCanvas2, Static302.anInterface9_12, Static461.aClass308_163);
				local58.ja(0);
				local79 = Static337.method5009(Static414.anInt7794, Static77.aClass308_183);
				local88 = local58.method6837(local79, Static604.method6020(Static121.aClass308_48, Static414.anInt7794));
				Static8.method4849();
				Static307.method6069(arg1, local88, true, local58, local79);
			}
			try {
				Static31.aClass78_18 = Static439.method6788(Static86.aClass1_Sub30_Sub1_1.anInt6186 * 2, arg0, Static103.aCanvas2, Static302.anInterface9_12, Static461.aClass308_163);
				if (arg1 != null) {
					local58.ja(0);
					local79 = Static337.method5009(Static414.anInt7794, Static77.aClass308_183);
					local88 = local58.method6837(local79, Static604.method6020(Static121.aClass308_48, Static414.anInt7794));
					Static8.method4849();
					Static307.method6069(arg1, local88, true, local58, local79);
				}
				if (Static31.aClass78_18.method6804()) {
					@Pc(148) boolean local148 = true;
					try {
						local148 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(160) Throwable local160) {
					}
					@Pc(166) Class1_Sub16 local166;
					if (local148) {
						local166 = Static31.aClass78_18.method6829(146800640);
					} else {
						local166 = Static31.aClass78_18.method6829(104857600);
					}
					Static31.aClass78_18.method6798(local166);
				}
			} catch (@Pc(177) Throwable local177) {
				arg0 = 0;
				Static31.aClass78_18 = Static439.method6788(0, 0, Static103.aCanvas2, Static302.anInterface9_12, Static461.aClass308_163);
			}
			if (local58 != null) {
				try {
					local58.method6786();
				} catch (@Pc(196) Throwable local196) {
				}
			}
		}
		Static286.anInt5239 = arg0;
		Static22.method489();
		Static31.aClass78_18.va(32);
		Static160.aClass34_1 = Static31.aClass78_18.method6833();
		Static586.aClass34_6 = Static31.aClass78_18.method6833();
		Static193.method3075();
		Static31.aClass78_18.method6824(!Static86.aClass1_Sub30_Sub1_1.aBoolean486);
		if (Static31.aClass78_18.method6840()) {
			Static165.method2704(Static86.aClass1_Sub30_Sub1_1.aBoolean474);
		}
		Static470.method2480(Static378.anInt6747 >> 3, Static31.aClass78_18, Static458.anInt9736 >> 3);
		Static585.method7837();
		Static518.aBoolean696 = false;
		Static174.aBoolean239 = true;
		Static188.aClass19Array1 = null;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB[F)[F")
	public static float[] method7361(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static598.method776(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
