import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_167 = new Class239(98, -2);

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "Lclient!wu;")
	public static final Class320 aClass320_15 = new Class320("LIVE", 0);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIILclient!uf;I)Ljava/awt/Frame;")
	public static Frame method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class283 arg3) {
		if (!arg3.method7183()) {
			return null;
		}
		@Pc(25) Class237[] local25 = Static254.method3979(arg3);
		if (local25 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local25.length; local33++) {
			if (arg1 == local25[local33].anInt7570 && local25[local33].anInt7571 == arg0 && (!local31 || local25[local33].anInt7573 > arg2)) {
				arg2 = local25[local33].anInt7573;
				local31 = true;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(95) Class20 local95 = arg3.method7167(arg2, arg1, arg0);
		while (local95.anInt593 == 0) {
			Static379.method5233(10L);
		}
		@Pc(107) Frame local107 = (Frame) local95.anObject2;
		if (local107 == null) {
			return null;
		} else if (local95.anInt593 == 2) {
			Static396.method6325(arg3, local107);
			return null;
		} else {
			return local107;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)Z")
	public static boolean method6958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static266.method4294(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static175.anInt3259;
		@Pc(14) int local14 = arg2 << Static175.anInt3259;
		@Pc(23) int local23 = Static532.aClass75Array3[arg0].ba(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static175.anInt3259 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static175.anInt3259 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static175.anInt3259 - 7);
		if (arg3 == 1) {
			if (local10 > Static2.anInt66) {
				if (!Static468.method7043(local10, local23, local14)) {
					return false;
				}
				if (!Static468.method7043(local10, local23, local14 + Static392.anInt7455)) {
					return false;
				}
				if (!Static468.method7043(local10, local23, local14 + Static136.anInt2574)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static468.method7043(local10, local31, local14)) {
					return false;
				}
				if (!Static468.method7043(local10, local31, local14 + Static392.anInt7455)) {
					return false;
				}
				if (!Static468.method7043(local10, local31, local14 + Static136.anInt2574)) {
					return false;
				}
			}
			if (!Static468.method7043(local10, local39, local14)) {
				return false;
			} else if (Static468.method7043(local10, local39, local14 + Static392.anInt7455)) {
				return Static468.method7043(local10, local39, local14 + Static136.anInt2574);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static412.anInt7685) {
				if (!Static468.method7043(local10, local23, local14 + Static136.anInt2574)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static392.anInt7455, local23, local14 + Static136.anInt2574)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static136.anInt2574, local23, local14 + Static136.anInt2574)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static468.method7043(local10, local31, local14 + Static136.anInt2574)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static392.anInt7455, local31, local14 + Static136.anInt2574)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static136.anInt2574, local31, local14 + Static136.anInt2574)) {
					return false;
				}
			}
			if (!Static468.method7043(local10, local39, local14 + Static136.anInt2574)) {
				return false;
			} else if (Static468.method7043(local10 + Static392.anInt7455, local39, local14 + Static136.anInt2574)) {
				return Static468.method7043(local10 + Static136.anInt2574, local39, local14 + Static136.anInt2574);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static2.anInt66) {
				if (!Static468.method7043(local10 + Static136.anInt2574, local23, local14)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static136.anInt2574, local23, local14 + Static392.anInt7455)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static136.anInt2574, local23, local14 + Static136.anInt2574)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static468.method7043(local10 + Static136.anInt2574, local31, local14)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static136.anInt2574, local31, local14 + Static392.anInt7455)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static136.anInt2574, local31, local14 + Static136.anInt2574)) {
					return false;
				}
			}
			if (!Static468.method7043(local10 + Static136.anInt2574, local39, local14)) {
				return false;
			} else if (Static468.method7043(local10 + Static136.anInt2574, local39, local14 + Static392.anInt7455)) {
				return Static468.method7043(local10 + Static136.anInt2574, local39, local14 + Static136.anInt2574);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static412.anInt7685) {
				if (!Static468.method7043(local10, local23, local14)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static392.anInt7455, local23, local14)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static136.anInt2574, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static468.method7043(local10, local31, local14)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static392.anInt7455, local31, local14)) {
					return false;
				}
				if (!Static468.method7043(local10 + Static136.anInt2574, local31, local14)) {
					return false;
				}
			}
			if (!Static468.method7043(local10, local39, local14)) {
				return false;
			} else if (Static468.method7043(local10 + Static392.anInt7455, local39, local14)) {
				return Static468.method7043(local10 + Static136.anInt2574, local39, local14);
			} else {
				return false;
			}
		} else if (!Static468.method7043(local10 + Static392.anInt7455, local47, local14 + Static392.anInt7455)) {
			return false;
		} else if (arg3 == 16) {
			return Static468.method7043(local10, local39, local14 + Static136.anInt2574);
		} else if (arg3 == 32) {
			return Static468.method7043(local10 + Static136.anInt2574, local39, local14 + Static136.anInt2574);
		} else if (arg3 == 64) {
			return Static468.method7043(local10 + Static136.anInt2574, local39, local14);
		} else if (arg3 == 128) {
			return Static468.method7043(local10, local39, local14);
		} else {
			return true;
		}
	}
}
