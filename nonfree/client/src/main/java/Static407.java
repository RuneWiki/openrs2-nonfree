import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "F")
	public static float aFloat98;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "[I")
	public static final int[] anIntArray522 = new int[1000];

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_95 = new Class146(65, 12);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	public static void method5524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static448.method5935(Static49.aClass146_18);
		Static247.aClass4_Sub9_Sub2_2.method5053(arg0);
		Static247.aClass4_Sub9_Sub2_2.method5023(arg1);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLclient!tf;)I")
	public static int method5525(@OriginalArg(1) Class4_Sub9_Sub2 arg0) {
		@Pc(17) int local17 = arg0.method5071(2);
		@Pc(27) int local27;
		if (local17 == 0) {
			local27 = 0;
		} else if (local17 == 1) {
			local27 = arg0.method5071(5);
		} else if (local17 == 2) {
			local27 = arg0.method5071(8);
		} else {
			local27 = arg0.method5071(11);
		}
		return local27;
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
	public static void method5530() {
		if (Static166.anInt3041 == 5) {
			Static166.anInt3041 = 6;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!rd;I)I")
	public static int method5531(@OriginalArg(0) Class8_Sub3_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt5647;
		@Pc(12) Class42 local12 = arg0.method5892();
		if (arg0.aBoolean519) {
			local8 = arg0.anInt5672;
		} else if (arg0.anInt7389 == local12.anInt1010 || arg0.anInt7389 == local12.anInt1027 || local12.anInt1029 == arg0.anInt7389 || arg0.anInt7389 == local12.anInt1015) {
			local8 = arg0.anInt5683;
		} else if (local12.anInt1009 == arg0.anInt7389 || local12.anInt1037 == arg0.anInt7389 || local12.anInt1025 == arg0.anInt7389 || arg0.anInt7389 == local12.anInt1048) {
			local8 = arg0.anInt5656;
		}
		return local8;
	}
}
