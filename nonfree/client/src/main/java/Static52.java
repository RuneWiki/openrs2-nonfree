import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "Lclient!kb;")
	public static Class41 aClass41_5;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Lclient!af;")
	private static Class5 aClass5_656 = Static45.method1937("FULL");

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!af;")
	public static Class5 aClass5_655 = aClass5_656;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
	public static int[] anIntArray205 = new int[128];

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	public static final int anInt1263 = 0;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "[I")
	public static int[] anIntArray206 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Lclient!af;")
	public static Class5 aClass5_657 = Static45.method1937("mapmarker");

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
	public static int anInt1265 = 0;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_658 = Static45.method1937("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method902(@OriginalArg(1) KeyEvent arg0) {
		@Pc(2) int local2 = arg0.getKeyChar();
		if (local2 == 8364) {
			return 128;
		} else {
			if (local2 <= 0 || local2 >= 256) {
				local2 = -1;
			}
			return local2;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public static void method903() {
		Static18.aClass28_80.method792();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method904() {
		@Pc(6) int local6 = Static79.aClass1_Sub20_Sub1_2.method2115(8);
		@Pc(19) int local19;
		if (Static111.anInt2739 > local6) {
			for (local19 = local6; local19 < Static111.anInt2739; local19++) {
				Static75.anIntArray289[Static103.anInt2537++] = Static77.anIntArray299[local19];
			}
		}
		if (Static111.anInt2739 < local6) {
			throw new RuntimeException("gppov1");
		}
		Static111.anInt2739 = 0;
		for (local19 = 0; local19 < local6; local19++) {
			@Pc(57) int local57 = Static77.anIntArray299[local19];
			@Pc(61) Class1_Sub3_Sub4_Sub2_Sub1 local61 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local57];
			@Pc(66) int local66 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
			if (local66 == 0) {
				Static77.anIntArray299[Static111.anInt2739++] = local57;
				local61.anInt3066 = Static131.anInt3270;
			} else {
				@Pc(89) int local89 = Static79.aClass1_Sub20_Sub1_2.method2115(2);
				if (local89 == 0) {
					Static77.anIntArray299[Static111.anInt2739++] = local57;
					local61.anInt3066 = Static131.anInt3270;
					Static20.anIntArray83[Static86.anInt2184++] = local57;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local89 == 1) {
						Static77.anIntArray299[Static111.anInt2739++] = local57;
						local61.anInt3066 = Static131.anInt3270;
						local133 = Static79.aClass1_Sub20_Sub1_2.method2115(3);
						local61.method2155(false, local133);
						local143 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
						if (local143 == 1) {
							Static20.anIntArray83[Static86.anInt2184++] = local57;
						}
					} else if (local89 == 2) {
						Static77.anIntArray299[Static111.anInt2739++] = local57;
						local61.anInt3066 = Static131.anInt3270;
						local133 = Static79.aClass1_Sub20_Sub1_2.method2115(3);
						local61.method2155(true, local133);
						local143 = Static79.aClass1_Sub20_Sub1_2.method2115(3);
						local61.method2155(true, local143);
						@Pc(195) int local195 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
						if (local195 == 1) {
							Static20.anIntArray83[Static86.anInt2184++] = local57;
						}
					} else if (local89 == 3) {
						Static75.anIntArray289[Static103.anInt2537++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method905() {
		aClass5_658 = null;
		aClass5_657 = null;
		aClass41_5 = null;
		anIntArray205 = null;
		anIntArray206 = null;
		aClass5_655 = null;
		aClass5_656 = null;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)J")
	public static synchronized long method906() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static84.aLong66) {
			Static97.aLong79 += Static84.aLong66 - local5;
		}
		Static84.aLong66 = local5;
		return Static97.aLong79 + local5;
	}
}
