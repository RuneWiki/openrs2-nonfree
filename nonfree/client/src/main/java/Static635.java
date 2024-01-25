import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
	public static int anInt10187 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()V")
	public static void method8481() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static498.aClass212Array1.length; local3++) {
				if (Static498.aClass212Array1[local3].method4414()) {
					Static58.aLongArray4[local3] = Static498.aClass212Array1[local3].method4410();
				} else {
					synchronized (Static498.aClass212Array1[local3]) {
						Static498.aClass212Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static498.aClass212Array1[Static498.aClass212Array1.length - 1].method4408();
				Static441.method5558(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static498.aClass212Array1.length - 1; local3++) {
						if (!Static498.aClass212Array1[local3].method4414()) {
							synchronized (Static498.aClass212Array1[local3]) {
								Static498.aClass212Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static498.aClass212Array1.length - 2; local102++) {
							Static498.aClass212Array1[local102].method4408();
						}
						Static441.method5558(2);
						while (!Static498.aClass212Array1[0].method4414()) {
							synchronized (Static498.aClass212Array1[0]) {
								Static498.aClass212Array1[0].notify();
							}
							try {
								Static444.method6061(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static498.aClass212Array1[0].method4408();
						return;
					}
					try {
						Static444.method6061(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static444.method6061(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIII)V")
	public static void method8483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static67.anInt1214 < arg3 || arg0 < Static257.anInt4068) {
			return;
		}
		@Pc(18) boolean local18;
		if (Static379.anInt5914 > arg2) {
			arg2 = Static379.anInt5914;
			local18 = false;
		} else if (Static624.anInt10032 < arg2) {
			arg2 = Static624.anInt10032;
			local18 = false;
		} else {
			local18 = true;
		}
		@Pc(40) boolean local40;
		if (Static379.anInt5914 > arg4) {
			local40 = false;
			arg4 = Static379.anInt5914;
		} else if (arg4 <= Static624.anInt10032) {
			local40 = true;
		} else {
			arg4 = Static624.anInt10032;
			local40 = false;
		}
		if (Static257.anInt4068 > arg3) {
			arg3 = Static257.anInt4068;
		} else {
			Static134.method1841(Static543.anIntArrayArray57[arg3++], arg2, arg4, arg1);
		}
		if (Static67.anInt1214 < arg0) {
			arg0 = Static67.anInt1214;
		} else {
			Static134.method1841(Static543.anIntArrayArray57[arg0--], arg2, arg4, arg1);
		}
		@Pc(107) int local107;
		if (local18 && local40) {
			for (local107 = arg3; local107 <= arg0; local107++) {
				@Pc(151) int[] local151 = Static543.anIntArrayArray57[local107];
				local151[arg2] = local151[arg4] = arg1;
			}
		} else if (local18) {
			for (local107 = arg3; local107 <= arg0; local107++) {
				Static543.anIntArrayArray57[local107][arg2] = arg1;
			}
		} else if (local40) {
			for (local107 = arg3; local107 <= arg0; local107++) {
				Static543.anIntArrayArray57[local107][arg4] = arg1;
			}
		}
	}
}
