import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!qga", name = "i", descriptor = "Lclient!q;")
	public static Class68 aClass68_3;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_85 = new Class286(15, -1);

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILclient!dr;IIIIZ)V")
	public static void method4018(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (Static245.anInt4559 >= 50 || (arg1 == null || arg1.anIntArrayArray7 == null || arg4 >= arg1.anIntArrayArray7.length || arg1.anIntArrayArray7[arg4] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray7[arg4][0];
		@Pc(43) int local43 = local34 >> 8;
		@Pc(49) int local49 = local34 >> 5 & 0x7;
		@Pc(66) int local66;
		if (arg1.anIntArrayArray7[arg4].length > 1) {
			local66 = (int) (Math.random() * (double) arg1.anIntArrayArray7[arg4].length);
			if (local66 > 0) {
				local43 = arg1.anIntArrayArray7[arg4][local66];
			}
		}
		@Pc(82) int local82 = local34 & 0x1F;
		if (local82 == 0) {
			if (arg5) {
				if (arg1.aBoolean185) {
					Static385.method5669(local43, local49, 0, 255, false);
					return;
				}
				Static228.method3557(255, local43, local49, 0);
			}
		} else if (Static72.aClass2_Sub12_Sub1_1.anInt1926 != 0) {
			local66 = arg2 - 256 >> 9;
			@Pc(120) int local120 = arg3 - 256 >> 9;
			Static515.aClass351Array1[Static245.anInt4559++] = new Class351((byte) (arg1.aBoolean185 ? 2 : 1), local43, local49, 0, 255, local82 + (arg0 << 24) + (local66 << 16) + (local120 << 8));
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "()V")
	public static void method4020() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static563.aClass356Array1.length; local3++) {
				if (Static563.aClass356Array1[local3].method7824()) {
					Static251.aLongArray7[local3] = Static563.aClass356Array1[local3].method7826();
				} else {
					synchronized (Static563.aClass356Array1[local3]) {
						Static563.aClass356Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static563.aClass356Array1[Static563.aClass356Array1.length - 1].method7823();
				Static333.method5099(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static563.aClass356Array1.length - 1; local3++) {
						if (!Static563.aClass356Array1[local3].method7824()) {
							synchronized (Static563.aClass356Array1[local3]) {
								Static563.aClass356Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static563.aClass356Array1.length - 2; local102++) {
							Static563.aClass356Array1[local102].method7823();
						}
						Static333.method5099(2);
						while (!Static563.aClass356Array1[0].method7824()) {
							synchronized (Static563.aClass356Array1[0]) {
								Static563.aClass356Array1[0].notify();
							}
							try {
								Static459.method6498(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static563.aClass356Array1[0].method7823();
						return;
					}
					try {
						Static459.method6498(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static459.method6498(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}
}
