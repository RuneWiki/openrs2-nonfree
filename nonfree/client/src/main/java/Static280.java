import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public static int anInt4575;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!wu;")
	public static Class384 aClass384_71;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
	public static final int[] anIntArray375 = new int[32];

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)I")
	public static int method4192(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZ)V")
	public static void method4193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg1, 17);
		local8.method4140();
		local8.anInt4508 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method4194(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(12) String local12 = "";
			if (arg1 != null) {
				local12 = Static244.method3720(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local12 = local12 + " | ";
				}
				local12 = local12 + arg0;
			}
			Static285.method4274(local12);
			local12 = Static80.method1257(local12, "%3a", ":");
			local12 = Static80.method1257(local12, "%40", "@");
			local12 = Static80.method1257(local12, "%26", "&");
			local12 = Static80.method1257(local12, "%23", "#");
			if (Static401.anApplet6 != null) {
				@Pc(109) Class330 local109 = Static612.aClass192_5.method4337(new URL(Static401.anApplet6.getCodeBase(), "clienterror.ws?c=" + Static363.anInt6412 + "&u=" + (Static195.aString54 == null ? String.valueOf(Static124.aLong281) : Static195.aString54) + "&v1=" + Static295.aString77 + "&v2=" + Static295.aString73 + "&e=" + local12));
				while (local109.anInt9132 == 0) {
					Static452.method7478(1L);
				}
				if (local109.anInt9132 == 1) {
					@Pc(130) DataInputStream local130 = (DataInputStream) local109.anObject19;
					local130.read();
					local130.close();
				}
			}
		} catch (@Pc(137) Exception local137) {
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(Z)[Lclient!wm;")
	public static Class380[] method4196() {
		if (Static335.aClass380Array1 == null) {
			@Pc(12) Class380[] local12 = Static392.method6100(Static214.aClass192_1);
			@Pc(16) Class380[] local16 = new Class380[local12.length];
			@Pc(18) int local18 = 0;
			@Pc(23) int local23 = Static627.aClass5_Sub46_31.aClass11_Sub19_1.method6459();
			@Pc(88) int local88;
			@Pc(94) Class380 local94;
			label70: for (@Pc(25) int local25 = 0; local25 < local12.length; local25++) {
				@Pc(31) Class380 local31 = local12[local25];
				if ((local31.anInt10353 <= 0 || local31.anInt10353 >= 24) && local31.anInt10349 >= 800 && local31.anInt10348 >= 600 && (local23 != 2 || local31.anInt10349 <= 800 && local31.anInt10348 <= 600) && (local23 != 1 || local31.anInt10349 <= 1024 && local31.anInt10348 <= 768)) {
					for (local88 = 0; local88 < local18; local88++) {
						local94 = local16[local88];
						if (local94.anInt10349 == local31.anInt10349 && local94.anInt10348 == local31.anInt10348) {
							if (local94.anInt10353 < local31.anInt10353) {
								local16[local88] = local31;
							}
							continue label70;
						}
					}
					local16[local18] = local31;
					local18++;
				}
			}
			Static335.aClass380Array1 = new Class380[local18];
			Static655.method4106(local16, 0, Static335.aClass380Array1, 0, local18);
			@Pc(146) int[] local146 = new int[Static335.aClass380Array1.length];
			for (local88 = 0; local88 < Static335.aClass380Array1.length; local88++) {
				local94 = Static335.aClass380Array1[local88];
				local146[local88] = local94.anInt10349 * local94.anInt10348;
			}
			Static69.method1136(local146, Static335.aClass380Array1);
		}
		return Static335.aClass380Array1;
	}
}
