import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	public static int anInt1373;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	public static int anInt1384;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_31 = new Class129(107, 12);

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "Lclient!nv;")
	public static final Class177 aClass177_5 = new Class177();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
	public static void method1125(@OriginalArg(0) int arg0) {
		@Pc(13) Class5_Sub2_Sub9 local13 = Static72.method1073(10, arg0);
		local13.method3024();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZII)I")
	public static int method1129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static396.anIntArray456[arg0 & 0x3] : Static246.anIntArray254[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIB)Z")
	public static boolean method1131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(JZ)V")
	public static void method1132(@OriginalArg(0) long arg0) {
		if (Static319.aClass258ArrayArrayArray3 != null) {
			if (Static449.anInt7379 == 1 || Static449.anInt7379 == 5) {
				Static326.method4006(arg0);
			} else if (Static449.anInt7379 == 4) {
				Static208.method2777(arg0);
			}
		}
		Static373.method4882((long) Static85.anInt1536, Static407.aClass200_9);
		if (Static199.anInt3319 != -1) {
			Static308.method3811(Static199.anInt3319);
		}
		for (@Pc(38) int local38 = 0; local38 < Static343.anInt5618; local38++) {
			if (Static99.aBooleanArray5[local38]) {
				Static371.aBooleanArray21[local38] = true;
			}
			Static39.aBooleanArray3[local38] = Static99.aBooleanArray5[local38];
			Static99.aBooleanArray5[local38] = false;
		}
		Static59.anInt1107 = Static85.anInt1536;
		if (Static407.aClass200_9.method5832()) {
			Static456.aBoolean502 = true;
		}
		if (Static199.anInt3319 != -1) {
			Static343.anInt5618 = 0;
			Static86.method1259();
		}
		Static407.aClass200_9.va();
		Static141.method4120(Static407.aClass200_9);
		@Pc(85) int local85 = Static394.method5132();
		if (local85 == -1) {
			local85 = Static333.anInt5333;
		}
		if (local85 == -1) {
			local85 = Static449.anInt7378;
		}
		Static390.method5094(local85);
		Static225.method2962(Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105, Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502, Static173.anInt2946, Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500);
		Static173.anInt2946 = 0;
	}
}
