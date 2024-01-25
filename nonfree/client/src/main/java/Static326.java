import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!mda", name = "k", descriptor = "Lclient!ad;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIILclient!ri;)Lclient!uo;")
	public static Class332 method4807(@OriginalArg(0) int arg0, @OriginalArg(3) Class284 arg1) {
		@Pc(14) byte[] local14 = arg1.method6331(arg0, 0);
		return local14 == null ? null : new Class332(local14);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!ri;Lclient!cl;ILclient!ri;Lclient!qk;Lclient!ri;)Z")
	public static boolean method4808(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(3) Class284 arg2, @OriginalArg(4) Class3_Sub16_Sub3 arg3, @OriginalArg(5) Class284 arg4) {
		Static437.aClass284_125 = arg4;
		Static476.aClass284_137 = arg0;
		Static548.aClass3_Sub16_Sub3_4 = arg3;
		Static430.aClass284_123 = arg2;
		Static114.aClass58_1 = arg1;
		for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
			Static338.anIntArray341[local17] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)V")
	public static void method4809(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub7_Sub19 local12 = Static73.method5992(3, arg0);
		local12.method7364();
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
	public static void method4810() {
		if (Static563.aBoolean468) {
			return;
		}
		if (Static348.aClass3_Sub51_Sub1_5.aBoolean681) {
			Static123.aFloat75 = (int) Static123.aFloat75 - 17 & 0xFFFFFFF0;
		} else {
			Static240.aFloat116 += (-12.0F - Static240.aFloat116) / 2.0F;
		}
		Static563.aBoolean468 = true;
		Static595.aBoolean725 = true;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "()V")
	public static void method4811() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static242.aClass176Array1.length; local3++) {
				if (Static242.aClass176Array1[local3].method4280()) {
					Static525.aLongArray14[local3] = Static242.aClass176Array1[local3].method4281();
				} else {
					synchronized (Static242.aClass176Array1[local3]) {
						Static242.aClass176Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static242.aClass176Array1[Static242.aClass176Array1.length - 1].method4284();
				Static386.method5378(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static242.aClass176Array1.length - 1; local3++) {
						if (!Static242.aClass176Array1[local3].method4280()) {
							synchronized (Static242.aClass176Array1[local3]) {
								Static242.aClass176Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static242.aClass176Array1.length - 2; local102++) {
							Static242.aClass176Array1[local102].method4284();
						}
						Static386.method5378(2);
						while (!Static242.aClass176Array1[0].method4280()) {
							synchronized (Static242.aClass176Array1[0]) {
								Static242.aClass176Array1[0].notify();
							}
							try {
								Static373.method5240(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static242.aClass176Array1[0].method4284();
						return;
					}
					try {
						Static373.method5240(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static373.method5240(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}
}
