import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_103 = new Class55("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_104 = new Class55("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V")
	public static void method3747(@OriginalArg(0) boolean arg0) {
		Static330.method4331();
		if (!Static252.method3357(Static206.anInt3642)) {
			return;
		}
		Static48.anInt748++;
		if (Static48.anInt748 < 50 && !arg0) {
			return;
		}
		Static48.anInt748 = 0;
		if (!Static28.aBoolean13 && Static211.aClass247_4 != null) {
			Static81.method1414(Static407.aClass2_101);
			try {
				Static211.aClass247_4.method5151(Static255.aClass7_Sub14_Sub1_2.anInt4989, Static255.aClass7_Sub14_Sub1_2.aByteArray75);
				Static255.aClass7_Sub14_Sub1_2.anInt4989 = 0;
			} catch (@Pc(55) IOException local55) {
				Static28.aBoolean13 = true;
			}
		}
		Static330.method4331();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[[BLclient!cr;)V")
	public static void method3748(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class46_Sub1 arg1) {
		@Pc(6) int local6 = Static420.aByteArrayArray22.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(16) byte[] local16 = arg0[local8];
			if (local16 != null) {
				@Pc(28) int local28 = (Static331.anIntArray494[local8] >> 8) * 64 - Static359.anInt5713;
				@Pc(39) int local39 = (Static331.anIntArray494[local8] & 0xFF) * 64 - Static314.anInt5181;
				Static330.method4331();
				arg1.method810(local39, Static179.aClass70Array3, local16, local28, Static269.aClass51_9);
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!pf;II)V")
	public static void method3749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) Class7_Sub13 local17 = (Class7_Sub13) Static423.aClass85_47.method2010(); local17 != null; local17 = (Class7_Sub13) Static423.aClass85_47.method2000()) {
			if (local17.anInt1393 == arg1 && arg0 << 7 == local17.anInt1402 && local17.anInt1395 == arg3 << 7 && local17.aClass189_1.anInt5088 == arg2.anInt5088) {
				if (local17.aClass7_Sub8_Sub4_3 != null) {
					Static452.aClass7_Sub8_Sub1_2.method2428(local17.aClass7_Sub8_Sub4_3);
					local17.aClass7_Sub8_Sub4_3 = null;
				}
				if (local17.aClass7_Sub8_Sub4_2 != null) {
					Static452.aClass7_Sub8_Sub1_2.method2428(local17.aClass7_Sub8_Sub4_2);
					local17.aClass7_Sub8_Sub4_2 = null;
				}
				local17.method5802();
				return;
			}
		}
	}
}
