import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "Lclient!wv;")
	public static final Class409 aClass409_7 = new Class409(1, 2);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "[I")
	public static final int[] anIntArray231 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!faa;I)Z")
	public static boolean method3522(@OriginalArg(0) Class105 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean250) {
			return false;
		} else if (!arg0.method2655(Static654.anInterface10_2)) {
			return false;
		} else if (Static548.aClass136_41.method3503((long) arg0.anInt3088) == null) {
			return Static284.aClass136_26.method3503((long) arg0.anInt3089) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method3523(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		if (-8 < -126) {
			method3524(-36);
		}
		return local8;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	public static void method3524(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static459.anInt2357 == 2) {
				Static150.aClass240Array1[0].method5947(Static307.aClass198Array1[0]);
				Static150.aClass240Array1[1].method5947(Static307.aClass198Array1[1]);
			} else if (Static459.anInt2357 == 3) {
				Static150.aClass240Array1[0].method5947(Static307.aClass198Array1[0]);
				Static150.aClass240Array1[1].method5947(Static307.aClass198Array1[1]);
				Static150.aClass240Array1[2].method5947(Static307.aClass198Array1[2]);
			} else {
				Static150.aClass240Array1[0].method5947(Static307.aClass198Array1[0]);
				Static150.aClass240Array1[1].method5947(Static307.aClass198Array1[1]);
				Static150.aClass240Array1[2].method5947(Static307.aClass198Array1[2]);
				Static150.aClass240Array1[3].method5947(Static307.aClass198Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static459.anInt2357 == 2) {
				Static150.aClass240Array1[0].method5947(Static307.aClass198Array1[2]);
			} else if (Static459.anInt2357 == 3) {
				Static150.aClass240Array1[0].method5947(Static307.aClass198Array1[3]);
				Static150.aClass240Array1[1].method5947(Static307.aClass198Array1[4]);
			} else {
				Static150.aClass240Array1[0].method5947(Static307.aClass198Array1[4]);
				Static150.aClass240Array1[1].method5947(Static307.aClass198Array1[5]);
				Static150.aClass240Array1[2].method5947(Static307.aClass198Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static459.anInt2357 == 2) {
				Static150.aClass240Array1[0].method5947(Static307.aClass198Array1[3]);
				return;
			}
			if (Static459.anInt2357 == 3) {
				Static150.aClass240Array1[0].method5947(Static307.aClass198Array1[5]);
				return;
			}
			Static150.aClass240Array1[0].method5947(Static307.aClass198Array1[7]);
		}
	}
}
