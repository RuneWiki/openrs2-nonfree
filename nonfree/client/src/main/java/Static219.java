import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
	public static int anInt4088;

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "B")
	public static byte aByte60 = -6;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
	public static void method3467() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static393.aClass204Array1.length; local3++) {
				if (Static393.aClass204Array1[local3].method5079()) {
					Static63.aLongArray3[local3] = Static393.aClass204Array1[local3].method5076();
				} else {
					synchronized (Static393.aClass204Array1[local3]) {
						Static393.aClass204Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static393.aClass204Array1[Static393.aClass204Array1.length - 1].method5074();
				Static293.method4686(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static393.aClass204Array1.length - 1; local3++) {
						if (!Static393.aClass204Array1[local3].method5079()) {
							synchronized (Static393.aClass204Array1[local3]) {
								Static393.aClass204Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static393.aClass204Array1.length - 2; local102++) {
							Static393.aClass204Array1[local102].method5074();
						}
						Static293.method4686(2);
						while (!Static393.aClass204Array1[0].method5079()) {
							synchronized (Static393.aClass204Array1[0]) {
								Static393.aClass204Array1[0].notify();
							}
							try {
								Static579.method8004(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static393.aClass204Array1[0].method5074();
						return;
					}
					try {
						Static579.method8004(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static579.method8004(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIILclient!dg;IIBILclient!pf;)V")
	public static void method3469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class81 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class275 arg10) {
		Static613.anInt10015 = arg7;
		Static518.anInt8634 = arg1;
		Static215.anInt8115 = arg8;
		Class28_Sub1_Sub2_Sub2.lb = arg10;
		Static496.anInt8306 = arg0;
		Static590.anInt9691 = arg2;
		Static559.aClass369_3 = null;
		Static678.anInt10878 = arg9;
		Static94.aClass81_9 = arg6;
		Static140.anInt2759 = arg4;
		Static534.anInt8839 = arg5;
		Static479.aClass369_2 = null;
		Static288.aClass369_1 = null;
		Static370.anInt8566 = arg3;
		Static192.method3181();
		Static578.aBoolean801 = true;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)Z")
	public static boolean method3471() {
		return Static173.anInt3397 >= 1;
	}
}
