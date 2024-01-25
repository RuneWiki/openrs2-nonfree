import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!hea", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!hea", name = "g", descriptor = "Lclient!wk;")
	public static Class3_Sub22_Sub5 aClass3_Sub22_Sub5_1;

	@OriginalMember(owner = "client!hea", name = "x", descriptor = "I")
	public static int anInt4471;

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "Lclient!bka;")
	public static Class9 aClass9_9;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!hd;I)I")
	public static int method3664(@OriginalArg(0) Class145 arg0) {
		if (Static702.aClass145_15 == arg0) {
			return 6407;
		} else if (arg0 == Static557.aClass145_14) {
			return 6408;
		} else if (arg0 == Static407.aClass145_13) {
			return 6406;
		} else if (Static184.aClass145_7 == arg0) {
			return 6409;
		} else if (Static349.aClass145_9 == arg0) {
			return 6410;
		} else if (Static618.aClass145_11 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!mla;Z)V")
	public static void method3665(@OriginalArg(0) Class19_Sub8 arg0) {
		arg0.aClass19_Sub1_16 = null;
		@Pc(17) int local17 = arg0.aClass19_Sub6Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass19_Sub6Array1[local19].aBoolean477 = false;
		}
		@Pc(39) Class66[] local39 = Class3_Sub18.aClass66Array1;
		synchronized (Class3_Sub18.aClass66Array1) {
			if (local17 < Class3_Sub18.aClass66Array1.length && Static335.anIntArray330[local17] < 200) {
				Class3_Sub18.aClass66Array1[local17].method1375(arg0);
				@Pc(64) int local64 = Static335.anIntArray330[local17]++;
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!rba;)V")
	public static void method3666(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5322(-57);
			if (local14 == 0) {
				Static261.anInt4814 = arg0.method5272();
				Static310.anInt5522 = arg0.method5272();
			} else if (local14 == 255) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)V")
	public static void method3668() {
		if (Static231.anInt4426 == -1 || Static119.anInt2324 == -1) {
			return;
		}
		if (Static231.anInt4426 == 1 || Static231.anInt4426 == 3 || Static231.anInt4426 != Static119.anInt2324 && (Static231.anInt4426 == 0 || Static119.anInt2324 == 0)) {
			Static337.anInt5854 = 0;
			Static32.anInt518 = 0;
			Static612.aClass136_44.method3505();
		}
		Static119.anInt2324 = Static231.anInt4426;
	}
}
