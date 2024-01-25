import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
	public static int anInt5377;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "[I")
	public static int[] anIntArray1070;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "Z")
	public static boolean aBoolean396 = false;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_84 = new Class32("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "Z")
	public static boolean aBoolean397 = false;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public static void method4669() {
		Static238.aClass18_17 = null;
		Static392.aClass18_29 = null;
		Static250.aClass18_18 = null;
		Static379.aClass18_28 = null;
		Static46.aClass18_4 = null;
		Static96.aClass18_7 = null;
		Static45.aClass18_3 = null;
		Static343.aClass18_25 = null;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)I")
	public static int method4670(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Z")
	public static boolean method4672() {
		try {
			return Static98.method1940();
		} catch (@Pc(15) IOException local15) {
			Static17.method320();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(80) String local80 = "T2 - " + (Static339.aClass205_128 == null ? -1 : Static339.aClass205_128.method4376()) + "," + (Static113.aClass205_56 == null ? -1 : Static113.aClass205_56.method4376()) + "," + (Static239.aClass205_95 == null ? -1 : Static239.aClass205_95.method4376()) + " - " + Static276.anInt4757 + "," + (Static28.anInt606 + Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1324[0]) + "," + (Static319.anInt5425 + Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1323[0]) + " - ";
			for (@Pc(82) int local82 = 0; Static276.anInt4757 > local82 && local82 < 50; local82++) {
				local80 = local80 + Static218.aClass2_Sub16_Sub2_3.aByteArray112[local82] + ",";
			}
			Static142.method2676(local20, local80);
			Static32.method596();
			return true;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIZZ)V")
	public static void method4675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static4.aLong7 = 0L;
		@Pc(8) int local8 = Static162.method2888();
		if (arg0 == 3 || local8 == 3) {
			arg3 = true;
		}
		if (!Static111.aClass63_3.method1971()) {
			arg3 = true;
		}
		Static230.method3735(arg2, arg1, local8, arg3, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(II)V")
	public static void method4678(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub10_Sub2 local13 = Static217.method3611(arg0, 6);
		local13.method859();
	}
}
