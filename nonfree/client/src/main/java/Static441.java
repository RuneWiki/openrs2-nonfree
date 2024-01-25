import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
	public static int anInt7710;

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "Lclient!js;")
	public static final Class156 aClass156_19 = new Class156(4, 1, 1, 1);

	@OriginalMember(owner = "client!sca", name = "i", descriptor = "Lclient!et;")
	public static Class91 aClass91_13 = null;

	@OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
	public static int anInt7708 = 0;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(III)I")
	public static int method6823(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(24) int local24 = (arg0 & 0x7F) * 96 >> 7;
		if (local24 < 2) {
			local24 = 2;
		} else if (local24 > 126) {
			local24 = 126;
		}
		return (arg0 & 0xFF80) + local24;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
	public static void method6824() {
		@Pc(18) int local18 = Static286.aClass1_Sub15_Sub1_1.method6378(Static449.anInt7876);
		if (local18 == 0) {
			Static314.aByteArrayArrayArray12 = null;
			Static421.method6576(0);
		} else if (local18 == 1) {
			Static60.method1522((byte) 0);
			Static421.method6576(512);
			if (Static379.aByteArrayArrayArray13 != null) {
				Static434.method6718();
			}
		} else {
			Static60.method1522((byte) (Static389.anInt6904 - 4 & 0xFF));
			Static421.method6576(2);
		}
		Static256.anInt5005 = Static322.anInt6113;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V")
	public static void method6830() {
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			Static174.aBooleanArray6[local15] = false;
		}
		Static517.anInt9160 = Static46.anInt1256;
		Static386.anInt8113 = Static536.anInt9434;
		Static387.anInt6848 = 0;
		Static364.anInt6575 = Static469.anInt8096;
		Static261.anInt5069 = -1;
		Static230.anInt4474 = 0;
		Static243.anInt4675 = Static445.anInt7791;
		Static170.anInt3418 = 5;
		Static362.anInt7982 = Static321.anInt6064;
		Static76.anInt1815 = -1;
		Static500.anInt8795 = Static276.anInt8653;
	}
}
