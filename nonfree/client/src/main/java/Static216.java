import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
	public static int anInt4206;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_51 = new Class306("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
	public static int anInt4203 = 100;

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIII)Z")
	public static boolean method3734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static184.method6133(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static451.anInt7905;
		@Pc(14) int local14 = arg2 << Static451.anInt7905;
		@Pc(23) int local23 = Static544.aClass205Array3[arg0].ba(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static451.anInt7905 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static451.anInt7905 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static451.anInt7905 - 7);
		if (arg3 == 1) {
			if (local10 > Static311.anInt1617) {
				if (!Static393.method5943(local10, local23, local14)) {
					return false;
				}
				if (!Static393.method5943(local10, local23, local14 + Static122.anInt2483)) {
					return false;
				}
				if (!Static393.method5943(local10, local23, local14 + Static201.anInt3950)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static393.method5943(local10, local31, local14)) {
					return false;
				}
				if (!Static393.method5943(local10, local31, local14 + Static122.anInt2483)) {
					return false;
				}
				if (!Static393.method5943(local10, local31, local14 + Static201.anInt3950)) {
					return false;
				}
			}
			if (!Static393.method5943(local10, local39, local14)) {
				return false;
			} else if (Static393.method5943(local10, local39, local14 + Static122.anInt2483)) {
				return Static393.method5943(local10, local39, local14 + Static201.anInt3950);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static2.anInt5668) {
				if (!Static393.method5943(local10, local23, local14 + Static201.anInt3950)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static122.anInt2483, local23, local14 + Static201.anInt3950)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static201.anInt3950, local23, local14 + Static201.anInt3950)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static393.method5943(local10, local31, local14 + Static201.anInt3950)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static122.anInt2483, local31, local14 + Static201.anInt3950)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static201.anInt3950, local31, local14 + Static201.anInt3950)) {
					return false;
				}
			}
			if (!Static393.method5943(local10, local39, local14 + Static201.anInt3950)) {
				return false;
			} else if (Static393.method5943(local10 + Static122.anInt2483, local39, local14 + Static201.anInt3950)) {
				return Static393.method5943(local10 + Static201.anInt3950, local39, local14 + Static201.anInt3950);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static311.anInt1617) {
				if (!Static393.method5943(local10 + Static201.anInt3950, local23, local14)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static201.anInt3950, local23, local14 + Static122.anInt2483)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static201.anInt3950, local23, local14 + Static201.anInt3950)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static393.method5943(local10 + Static201.anInt3950, local31, local14)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static201.anInt3950, local31, local14 + Static122.anInt2483)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static201.anInt3950, local31, local14 + Static201.anInt3950)) {
					return false;
				}
			}
			if (!Static393.method5943(local10 + Static201.anInt3950, local39, local14)) {
				return false;
			} else if (Static393.method5943(local10 + Static201.anInt3950, local39, local14 + Static122.anInt2483)) {
				return Static393.method5943(local10 + Static201.anInt3950, local39, local14 + Static201.anInt3950);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static2.anInt5668) {
				if (!Static393.method5943(local10, local23, local14)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static122.anInt2483, local23, local14)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static201.anInt3950, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static393.method5943(local10, local31, local14)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static122.anInt2483, local31, local14)) {
					return false;
				}
				if (!Static393.method5943(local10 + Static201.anInt3950, local31, local14)) {
					return false;
				}
			}
			if (!Static393.method5943(local10, local39, local14)) {
				return false;
			} else if (Static393.method5943(local10 + Static122.anInt2483, local39, local14)) {
				return Static393.method5943(local10 + Static201.anInt3950, local39, local14);
			} else {
				return false;
			}
		} else if (!Static393.method5943(local10 + Static122.anInt2483, local47, local14 + Static122.anInt2483)) {
			return false;
		} else if (arg3 == 16) {
			return Static393.method5943(local10, local39, local14 + Static201.anInt3950);
		} else if (arg3 == 32) {
			return Static393.method5943(local10 + Static201.anInt3950, local39, local14 + Static201.anInt3950);
		} else if (arg3 == 64) {
			return Static393.method5943(local10 + Static201.anInt3950, local39, local14);
		} else if (arg3 == 128) {
			return Static393.method5943(local10, local39, local14);
		} else {
			return true;
		}
	}
}
