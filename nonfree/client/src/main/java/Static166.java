import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "Lclient!vj;")
	public static Class58 aClass58_22;

	@OriginalMember(owner = "client!kk", name = "fb", descriptor = "I")
	public static int anInt3582;

	@OriginalMember(owner = "client!kk", name = "ib", descriptor = "Z")
	public static boolean aBoolean288;

	@OriginalMember(owner = "client!kk", name = "Z", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_182 = new Class159("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!kk", name = "ab", descriptor = "Z")
	public static boolean aBoolean285 = true;

	@OriginalMember(owner = "client!kk", name = "gb", descriptor = "I")
	public static int anInt3583 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3250(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static252.method4449(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static129.anInt3035; local31++) {
			@Pc(37) String local37 = Static161.aStringArray39[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static252.method4449(local37);
			if (local37 != null && local37.equals(local20)) {
				Static129.anInt3035--;
				for (@Pc(61) int local61 = local31; local61 < Static129.anInt3035; local61++) {
					Static161.aStringArray39[local61] = Static161.aStringArray39[local61 + 1];
					Static332.aStringArray78[local61] = Static332.aStringArray78[local61 + 1];
					Static45.aStringArray11[local61] = Static45.aStringArray11[local61 + 1];
					Static292.aStringArray68[local61] = Static292.aStringArray68[local61 + 1];
					Static113.aBooleanArray13[local61] = Static113.aBooleanArray13[local61 + 1];
				}
				Static254.anInt2746 = Static66.anInt1751;
				Static15.aClass4_Sub11_Sub1_2.method706(54);
				Static15.aClass4_Sub11_Sub1_2.method3434(Static294.method4905(arg0));
				Static15.aClass4_Sub11_Sub1_2.method3410(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V")
	public static void method3251() {
		Static195.method3694();
		Static285.method4842();
		Static194.method3661();
		Static133.method2841();
		Static139.method2924();
		Static241.method4298();
		Static10.method201();
		Static17.method306();
		Static155.method3033();
		Static188.method3570();
		Static135.method2880();
		Static348.method5533();
		Static263.method5690();
		Static193.method3859();
		Static38.method751();
		Static122.method2533();
		Static112.method2378();
		Static133.method2844();
		Static178.method3444();
		Static240.method4259();
		Static149.method3567();
		Static287.method3915();
		Static222.method4010();
		Static248.aClass198_182.method5209();
		Static172.aClass198_133.method5209();
		Static7.aClass198_8.method5209();
		Static155.aClass198_114.method5209();
		Static164.aClass198_123.method5209();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Z")
	public static boolean method3253(@OriginalArg(0) int arg0) {
		if (Static51.aBooleanArray2[arg0]) {
			return true;
		} else if (Static92.aClass193_10.method5042(arg0)) {
			@Pc(23) int local23 = Static92.aClass193_10.method5055(arg0);
			if (local23 == 0) {
				Static51.aBooleanArray2[arg0] = true;
				return true;
			}
			if (Static271.aClass21ArrayArray1[arg0] == null) {
				Static271.aClass21ArrayArray1[arg0] = new Class21[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static271.aClass21ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static92.aClass193_10.method5047(arg0, local45);
					if (local59 != null) {
						@Pc(71) Class21 local71 = Static271.aClass21ArrayArray1[arg0][local45] = new Class21();
						local71.anInt728 = local45 + (arg0 << 16);
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method542(new Class4_Sub11(local59));
					}
				}
			}
			Static51.aBooleanArray2[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(Z)V")
	public static void method3254() {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = -1; local7 < Static289.anInt5643; local7++) {
			if (local7 == -1) {
				local16 = 2047;
			} else {
				local16 = Static333.anIntArray494[local7];
			}
			@Pc(24) Class8_Sub1_Sub2_Sub1 local24 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local16];
			if (local24 != null && local24.anInt4931 > 0) {
				local24.anInt4931--;
				if (local24.anInt4931 == 0) {
					local24.aString55 = null;
				}
			}
		}
		for (local16 = 0; local16 < Static145.anInt3273; local16++) {
			@Pc(58) int local58 = Static354.anIntArray510[local16];
			@Pc(62) Class8_Sub1_Sub2_Sub2 local62 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local58];
			if (local62 != null && local62.anInt4931 > 0) {
				local62.anInt4931--;
				if (local62.anInt4931 == 0) {
					local62.aString55 = null;
				}
			}
		}
	}
}
