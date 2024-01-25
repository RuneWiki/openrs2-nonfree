import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_54 = new Class242("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_126 = new Class186(103, 1);

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "[I")
	public static final int[] anIntArray325 = new int[32];

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	public static void method2987() {
		for (@Pc(10) Class41_Sub5 local10 = (Class41_Sub5) Static391.aClass27_8.method733(); local10 != null; local10 = (Class41_Sub5) Static391.aClass27_8.method733()) {
			Static437.method5653(local10);
		}
		@Pc(31) int local31;
		@Pc(30) int local30;
		if (Static126.aClass67_Sub1_1.method4531(Static286.anInt5207)) {
			local31 = 0;
			local30 = 3;
		} else {
			local30 = Static107.anInt2257;
			local31 = Static107.anInt2257;
		}
		Static55.method1121();
		for (@Pc(45) int local45 = local31; local45 <= local30; local45++) {
			Static55.method1130();
			Static55.method1127(local45);
			Static55.method1123(local45);
		}
		Static55.method1120();
		Static55.method1133();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBIII)V")
	public static void method2991(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg0, 8);
		local8.method2762();
		local8.anInt3611 = arg2;
		local8.anInt3610 = arg1;
		local8.anInt3607 = arg3;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILclient!ou;I)J")
	public static long method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface11 arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(21) Class71 local21 = Static2.aClass74_13.method1683(arg2.method5648());
		@Pc(42) long local42 = (long) (arg2.method5644() << 14 | arg1 << 7 | arg0 | arg2.method5649() << 20 | 0x40000000);
		if (local21.anInt2194 == 0) {
			local42 |= local14;
		}
		if (local21.anInt2174 == 1) {
			local42 |= local10;
		}
		if (local21.aBoolean173) {
			local42 |= local12;
		}
		return local42 | (long) arg2.method5648() << 32;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2994(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static354.aClass242_84.method5320(Static139.anInt2670) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static44.aClass242_11.method5320(Static139.anInt2670) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
