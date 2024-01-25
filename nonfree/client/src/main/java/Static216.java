import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Lclient!sv;")
	public static Class326 aClass326_9;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "Lclient!on;")
	public static Class254 aClass254_10;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
	public static void method6829() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static85.aBooleanArray124[local11] = false;
		}
		Static2.anInt55 = Static262.anInt5597;
		Static533.anInt8753 = 0;
		Static102.anInt1339 = Static220.anInt3605;
		Static445.anInt7122 = 5;
		Static133.anInt2248 = -1;
		Static308.anInt4982 = 0;
		Static358.anInt5675 = Static440.anInt7072;
		Static310.anInt4994 = Static250.anInt4000;
		Static339.anInt5378 = Static644.anInt10376;
		Static571.anInt9318 = Static338.anInt5355;
		Static12.anInt159 = -1;
		Static8.anInt107 = -1;
		Static239.anInt3904 = -1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)I")
	public static int method6830(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(25) int local25 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local25 * arg0 >> 12) + 40960;
		return local19 * local33 >> 12;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6834(@OriginalArg(1) Class95 arg0) {
		if (Static386.aClass109_38.method2320() == 0) {
			return;
		}
		@Pc(31) Class2_Sub44 local31;
		if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() == 0) {
			for (local31 = (Class2_Sub44) Static386.aClass109_38.method2325(); local31 != null; local31 = (Class2_Sub44) Static386.aClass109_38.method2318()) {
				Static72.aClass225_2.method4782(local31.anInt9116, local31.anInt9114, local31.anInt9121, local31.aBoolean677 ? Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1 : null, false, Static139.aClass62_7, arg0, local31.anInt9119, arg0, local31.anInt9117, false);
				local31.method8653();
			}
			Static32.method574();
			return;
		}
		if (Static88.aClass95_2 == null) {
			@Pc(78) Canvas local78 = new Canvas();
			local78.setSize(36, 32);
			Static88.aClass95_2 = Static562.method7703(0, 0, Static252.anInterface6_14, local78, Static525.aClass380_94);
			Static527.aClass62_19 = Static88.aClass95_2.method6956(Static416.method5569(Static141.aClass380_39, Static114.anInt2095), Static655.method7413(Static79.aClass380_22, Static114.anInt2095));
		}
		for (local31 = (Class2_Sub44) Static386.aClass109_38.method2325(); local31 != null; local31 = (Class2_Sub44) Static386.aClass109_38.method2318()) {
			Static72.aClass225_2.method4782(local31.anInt9116, local31.anInt9114, local31.anInt9121, local31.aBoolean677 ? Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1 : null, false, Static527.aClass62_19, arg0, local31.anInt9119, Static88.aClass95_2, local31.anInt9117, false);
			local31.method8653();
		}
	}
}
