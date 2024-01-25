import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
	public static int anInt6230;

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "[I")
	public static final int[] anIntArray349 = new int[4096];

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray65 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V")
	public static void method5018() {
		Static27.method293(11);
		Static512.method6921();
		System.gc();
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)V")
	public static void method5019() {
		if (Static467.aClass168_12.aBoolean335) {
			Static372.anInt6489 = 96;
			return;
		}
		try {
			@Pc(23) Method local23 = Runtime.class.getMethod("maxMemory");
			if (local23 != null) {
				try {
					@Pc(27) Runtime local27 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local23.invoke(local27, (Object[]) null);
					Static372.anInt6489 = (int) (local33 / 1048576L) + 1;
				} catch (@Pc(43) Throwable local43) {
				}
			}
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V")
	public static void method5020() {
		Static455.aClass3_Sub26_Sub1_2.method5554();
		@Pc(13) int local13 = Static455.aClass3_Sub26_Sub1_2.method5553(8);
		@Pc(22) int local22;
		if (Static60.anInt1599 > local13) {
			for (local22 = local13; local22 < Static60.anInt1599; local22++) {
				Static370.anIntArray352[Static4.anInt41++] = Static529.anIntArray535[local22];
			}
		}
		if (local13 > Static60.anInt1599) {
			throw new RuntimeException("gnpov1");
		}
		Static60.anInt1599 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(56) int local56 = Static529.anIntArray535[local22];
			@Pc(64) Class25_Sub2_Sub2_Sub5_Sub2 local64 = ((Class3_Sub39) Static581.aClass297_39.method6531((long) local56)).aClass25_Sub2_Sub2_Sub5_Sub2_2;
			@Pc(69) int local69 = Static455.aClass3_Sub26_Sub1_2.method5553(1);
			if (local69 == 0) {
				Static529.anIntArray535[Static60.anInt1599++] = local56;
				local64.anInt8550 = Static397.anInt6998;
			} else {
				@Pc(91) int local91 = Static455.aClass3_Sub26_Sub1_2.method5553(2);
				if (local91 == 0) {
					Static529.anIntArray535[Static60.anInt1599++] = local56;
					local64.anInt8550 = Static397.anInt6998;
					Static105.anIntArray86[Static427.anInt7540++] = local56;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local91 == 1) {
						Static529.anIntArray535[Static60.anInt1599++] = local56;
						local64.anInt8550 = Static397.anInt6998;
						local138 = Static455.aClass3_Sub26_Sub1_2.method5553(3);
						local64.method6685(local138, 1);
						local148 = Static455.aClass3_Sub26_Sub1_2.method5553(1);
						if (local148 == 1) {
							Static105.anIntArray86[Static427.anInt7540++] = local56;
						}
					} else if (local91 == 2) {
						Static529.anIntArray535[Static60.anInt1599++] = local56;
						local64.anInt8550 = Static397.anInt6998;
						if (Static455.aClass3_Sub26_Sub1_2.method5553(1) == 1) {
							local138 = Static455.aClass3_Sub26_Sub1_2.method5553(3);
							local64.method6685(local138, 2);
							local148 = Static455.aClass3_Sub26_Sub1_2.method5553(3);
							local64.method6685(local148, 2);
						} else {
							local138 = Static455.aClass3_Sub26_Sub1_2.method5553(3);
							local64.method6685(local138, 0);
						}
						local138 = Static455.aClass3_Sub26_Sub1_2.method5553(1);
						if (local138 == 1) {
							Static105.anIntArray86[Static427.anInt7540++] = local56;
						}
					} else if (local91 == 3) {
						Static370.anIntArray352[Static4.anInt41++] = local56;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BIII)I")
	public static int method5021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg0 & 0xFF00FF) * arg2 & 0xFF00FF00 | arg2 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(31) int local31 = 255 - arg2;
		return (((arg1 & 0xFF00) * local31 & 0xFF0000 | (arg1 & 0xFF00FF) * local31 & 0xFF00FF00) >>> 8) + local26;
	}
}
