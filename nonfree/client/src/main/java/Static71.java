import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "[Lclient!fe;")
	public static Class56_Sub1[] aClass56_Sub1Array1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
	public static int anInt1360 = 5063219;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	public static int anInt1367 = -1;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public static void method1100() {
		if (Static266.anInt5118 == 0) {
			return;
		}
		try {
			if (++Static150.anInt2974 > 1500) {
				if (Static134.aClass52_7 != null) {
					Static134.aClass52_7.method1103();
					Static134.aClass52_7 = null;
				}
				if (Static217.anInt4217 >= 1) {
					Static75.anInt1641 = -5;
					Static266.anInt5118 = 0;
					return;
				}
				Static266.anInt5118 = 1;
				Static217.anInt4217++;
				if (Static117.anInt2337 == Static177.anInt3358) {
					Static177.anInt3358 = Static297.anInt5499;
				} else {
					Static177.anInt3358 = Static117.anInt2337;
				}
				Static150.anInt2974 = 0;
			}
			if (Static266.anInt5118 == 1) {
				Static304.aClass185_8 = Static276.aClass139_4.method3505(Static251.aString298, Static177.anInt3358);
				Static266.anInt5118 = 2;
			}
			@Pc(131) int local131;
			if (Static266.anInt5118 == 2) {
				if (Static304.aClass185_8.anInt5623 == 2) {
					throw new IOException();
				}
				if (Static304.aClass185_8.anInt5623 != 1) {
					return;
				}
				Static134.aClass52_7 = new Class52((Socket) Static304.aClass185_8.anObject7, Static276.aClass139_4);
				Static304.aClass185_8 = null;
				Static134.aClass52_7.method1107(Static110.aClass4_Sub10_Sub1_1.aByteArray71, Static110.aClass4_Sub10_Sub1_1.anInt5713);
				if (Static30.aClass103_1 != null) {
					Static30.aClass103_1.method3009();
				}
				if (Static249.aClass103_2 != null) {
					Static249.aClass103_2.method3009();
				}
				local131 = Static134.aClass52_7.method1105();
				if (Static30.aClass103_1 != null) {
					Static30.aClass103_1.method3009();
				}
				if (Static249.aClass103_2 != null) {
					Static249.aClass103_2.method3009();
				}
				if (local131 != 101) {
					Static75.anInt1641 = local131;
					Static266.anInt5118 = 0;
					Static134.aClass52_7.method1103();
					Static134.aClass52_7 = null;
					return;
				}
				Static266.anInt5118 = 3;
			}
			if (Static266.anInt5118 == 3) {
				if (Static134.aClass52_7.method1101() < 2) {
					return;
				}
				local131 = Static134.aClass52_7.method1105() << 8 | Static134.aClass52_7.method1105();
				Static307.method4757(local131);
				if (Static254.anInt4847 == -1) {
					Static266.anInt5118 = 0;
					Static75.anInt1641 = 6;
					Static134.aClass52_7.method1103();
					Static134.aClass52_7 = null;
					return;
				}
				Static266.anInt5118 = 0;
				Static134.aClass52_7.method1103();
				Static134.aClass52_7 = null;
				Static6.method101();
				return;
			}
		} catch (@Pc(217) IOException local217) {
			if (Static134.aClass52_7 != null) {
				Static134.aClass52_7.method1103();
				Static134.aClass52_7 = null;
			}
			if (Static217.anInt4217 < 1) {
				Static217.anInt4217++;
				Static150.anInt2974 = 0;
				if (Static177.anInt3358 == Static117.anInt2337) {
					Static177.anInt3358 = Static297.anInt5499;
				} else {
					Static177.anInt3358 = Static117.anInt2337;
				}
				Static266.anInt5118 = 1;
			} else {
				Static266.anInt5118 = 0;
				Static75.anInt1641 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)V")
	public static void method1102(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static79.method1364(arg0)) {
			return;
		}
		@Pc(24) Class189[] local24 = Static188.aClass189ArrayArray115[arg0];
		for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
			@Pc(34) Class189 local34 = local24[local26];
			if (local34.anObjectArray22 != null) {
				@Pc(42) Class4_Sub13 local42 = new Class4_Sub13();
				local42.anObjectArray2 = local34.anObjectArray22;
				local42.aClass189_7 = local34;
				Static32.method519(local42, 2000000);
			}
		}
	}
}
