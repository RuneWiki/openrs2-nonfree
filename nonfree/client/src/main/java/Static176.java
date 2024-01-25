import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "Lclient!o;")
	public static Class13 aClass13_2;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
	public static final int anInt49 = 4;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_4 = new Class134("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "[I")
	public static final int[] anIntArray6 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "Lclient!at;")
	public static Class16 aClass16_2 = null;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BII)Z")
	public static boolean method68(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!at;I)V")
	public static void method70(@OriginalArg(0) Class16 arg0) {
		if (Static182.anInt3111 == arg0.anInt302) {
			Static101.aBooleanArray9[arg0.anInt258] = true;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	public static void method71(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static241.aClass141_5.method2914(Static445.aClass134_104.method2720(Static331.anInt5597));
		@Pc(26) int local26;
		for (@Pc(20) Class2_Sub46 local20 = (Class2_Sub46) Static261.aClass156_13.method3155(); local20 != null; local20 = (Class2_Sub46) Static261.aClass156_13.method3150()) {
			local26 = Static431.method5391(local20);
			if (local26 > local13) {
				local13 = local26;
			}
		}
		local13 += 8;
		local26 = Static137.anInt6647 * 16 + 21;
		@Pc(51) int local51 = arg0 - local13 / 2;
		if (Static141.anInt2513 < local13 + local51) {
			local51 = Static141.anInt2513 - local13;
		}
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(67) int local67 = arg1;
		if (Static314.anInt5426 < arg1 + local26) {
			local67 = Static314.anInt5426 - local26;
		}
		Static275.anInt4524 = local51;
		if (local67 < 0) {
			local67 = 0;
		}
		Static253.anInt4058 = local67;
		Static246.anInt3972 = local13;
		Static126.aBoolean52 = true;
		Static429.anInt6935 = (Static285.aBoolean329 ? 26 : 22) + Static137.anInt6647 * 16;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!jv;B)V")
	public static void method72(@OriginalArg(0) Class131 arg0) {
		Static431.aClass131_1 = arg0;
	}
}
