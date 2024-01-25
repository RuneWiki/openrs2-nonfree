import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "Lclient!la;")
	public static Class46 aClass46_9;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
	public static int anInt5454;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_253 = new Class22(83, 3);

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
	public static int anInt5452 = -1;

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
	public static int anInt5453 = -1;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!uu;I)V")
	public static void method4182(@OriginalArg(0) Class247 arg0) {
		if (!Static341.aBoolean599) {
			return;
		}
		if (arg0.anObjectArray17 != null) {
			@Pc(14) Class247 local14 = Static378.method3230(Static408.anInt6726, Static23.anInt350);
			if (local14 != null) {
				@Pc(20) Class4_Sub34 local20 = new Class4_Sub34();
				local20.aClass247_14 = local14;
				local20.aClass247_15 = arg0;
				local20.anObjectArray4 = arg0.anObjectArray17;
				Static271.method3894(local20);
			}
		}
		Static429.method5476(Static437.aClass215_66);
		Static3.aClass4_Sub12_Sub1_5.method2531(arg0.anInt6809);
		Static3.aClass4_Sub12_Sub1_5.method2494(Static23.anInt350);
		Static3.aClass4_Sub12_Sub1_5.method2524(arg0.anInt6865);
		Static3.aClass4_Sub12_Sub1_5.method2531(Static408.anInt6726);
		Static3.aClass4_Sub12_Sub1_5.method2494(arg0.anInt6779);
		Static3.aClass4_Sub12_Sub1_5.method2524(Static161.anInt3179);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)Z")
	public static boolean method4188() {
		try {
			return Static174.method2816();
		} catch (@Pc(14) IOException local14) {
			Static165.method2731();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static300.aClass22_246 == null ? -1 : Static300.aClass22_246.method527()) + "," + (Static380.aClass22_294 == null ? -1 : Static380.aClass22_294.method527()) + "," + (Static316.aClass22_257 == null ? -1 : Static316.aClass22_257.method527()) + " - " + Static454.anInt4075 + "," + (Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray426[0] + Static180.anInt3453) + "," + (Static86.anInt1771 + Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray427[0]) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static454.anInt4075 && local79 < 50; local79++) {
				local77 = local77 + Static146.aClass4_Sub12_Sub1_3.aByteArray36[local79] + ",";
			}
			Static94.method1654(local19, local77);
			Static251.method3639();
			return true;
		}
	}
}
