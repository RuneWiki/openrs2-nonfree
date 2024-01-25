import java.awt.Dimension;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
	public static int anInt3555;

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread3;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3052(@OriginalArg(0) String arg0) {
		if (!Static574.aClass298_13.aBoolean613) {
			return -1;
		} else if (Static10.aHashtable1.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(25) String local25 = Static396.method6241(arg0);
			if (local25 == null) {
				return -1;
			}
			@Pc(38) String local38 = Static96.aString12 + local25;
			if (!Static340.aClass343_164.method8156(local38, "")) {
				return -1;
			} else if (Static340.aClass343_164.method8140(local38)) {
				@Pc(66) byte[] local66 = Static340.aClass343_164.method8142("", local38);
				@Pc(72) File local72;
				try {
					local72 = Static404.method6307(local25);
				} catch (@Pc(74) RuntimeException local74) {
					return -1;
				}
				if (local66 == null || local72 == null) {
					return -1;
				}
				@Pc(82) boolean local82 = true;
				@Pc(86) byte[] local86 = Static20.method262(local72);
				if (local86 != null && local86.length == local66.length) {
					for (@Pc(103) int local103 = 0; local103 < local86.length; local103++) {
						if (local66[local103] != local86[local103]) {
							local82 = false;
							break;
						}
					}
				} else {
					local82 = false;
				}
				try {
					if (!local82) {
						Static574.aClass298_13.method7282(local66, local72);
					}
				} catch (@Pc(135) Throwable local135) {
					return -1;
				}
				Static153.method2723(local72, arg0);
				return 100;
			} else {
				return Static340.aClass343_164.method8163(local38);
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIILclient!cea;)V")
	public static void method3053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class9_Sub2_Sub1_Sub2_Sub1 arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static651.method751(local6, 0, local6.length, arg1);
		Static49.method919(arg2, arg0, local6);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)I")
	public static int method3054() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static48.aClass298_12.aBoolean613 && !Static48.aClass298_12.aBoolean612) {
			local7 = true;
			if (Static545.aClass3_Sub38_1.anInt7213 < 512 && Static545.aClass3_Sub38_1.anInt7213 != 0) {
				local7 = false;
			}
			if (Static501.aString78.startsWith("win")) {
				local11 = true;
				local9 = true;
			} else {
				local9 = true;
			}
		}
		if (Static205.aBoolean609) {
			local11 = false;
		}
		if (Static52.aBoolean51) {
			local7 = false;
		}
		if (Static153.aBoolean236) {
			local9 = false;
		}
		if (!local7 && !local9 && !local11) {
			return Static517.method7518();
		}
		@Pc(70) int local70 = -1;
		@Pc(72) int local72 = -1;
		@Pc(74) int local74 = -1;
		if (local7) {
			try {
				local70 = Static163.method2791(1000, 2);
			} catch (@Pc(83) Exception local83) {
			}
		}
		if (local11) {
			try {
				local74 = Static163.method2791(1000, 3);
				if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() == 3) {
					@Pc(104) Class98 local104 = Static266.aClass82_8.method6119();
					@Pc(109) long local109 = local104.aLong78 & 0xFFFFFFFFFFFFL;
					@Pc(112) int local112 = local104.anInt2850;
					if (local112 == 4318) {
						local9 &= local109 >= 64425238954L;
					} else if (local112 == 4098) {
						local9 &= local109 >= 60129613779L;
					}
				}
			} catch (@Pc(148) Exception local148) {
			}
		}
		if (local9) {
			try {
				local72 = Static163.method2791(1000, 1);
			} catch (@Pc(158) Exception local158) {
			}
		}
		if (local70 == -1 && local72 == -1 && local74 == -1) {
			return Static517.method7518();
		}
		local74 = (int) ((float) local74 * 1.1F);
		local72 = (int) ((float) local72 * 1.1F);
		if (local74 < local70 && local72 < local70) {
			return Static104.method1724(local70);
		} else if (local74 <= local72) {
			return Static494.method7228(local72, 1);
		} else {
			return Static494.method7228(local74, 3);
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	public static void method3055() {
		if (Static266.aClass82_8.method6101()) {
			Static266.aClass82_8.method6140(Static617.aCanvas13);
			Static523.method7604();
			if (Static80.aBoolean118) {
				Static591.method8208(Static617.aCanvas13);
			} else {
				@Pc(23) Dimension local23 = Static617.aCanvas13.getSize();
				Static266.aClass82_8.method6123(Static617.aCanvas13, local23.width, local23.height);
			}
			Static266.aClass82_8.method6099(Static617.aCanvas13);
		} else {
			Static230.method3973(Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181(), false);
		}
		Static647.method8677();
		Static334.aBoolean462 = true;
	}
}
