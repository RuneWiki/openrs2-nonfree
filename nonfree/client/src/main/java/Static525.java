import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "Lclient!jc;")
	public static Class155 aClass155_4 = null;

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "Z")
	public static boolean aBoolean644 = false;

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "Z")
	public static boolean aBoolean645 = false;

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_148 = new Class40("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_149 = new Class40("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method7179(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			local7 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local19);
			if (local29 >= 'A' && local29 <= 'Z') {
				local7 += local29 + 1 - 65;
			} else if (local29 >= 'a' && local29 <= 'z') {
				local7 += local29 - 96;
			} else if (local29 >= '0' && local29 <= '9') {
				local7 += local29 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
	public static void method7180() {
		if (Static28.anInt550 <= 0) {
			Static256.aString52 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static193.aStringArray19.length; local14++) {
			if (Static193.aStringArray19[local14].startsWith("--> ")) {
				local12++;
				if (local12 == Static28.anInt550) {
					Static256.aString52 = Static193.aStringArray19[local14].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!od;I[[B)V")
	public static void method7181(@OriginalArg(0) Class130_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt6544; local14++) {
			Static485.method6727();
			for (@Pc(20) int local20 = 0; local20 < Static460.anInt7894 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static235.anInt4493 >> 3; local24++) {
					@Pc(34) int local34 = Static157.anIntArrayArrayArray1[local14][local20][local24];
					if (local34 != -1) {
						@Pc(43) int local43 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean453 || local43 == 0) {
							@Pc(57) int local57 = local34 >> 1 & 0x3;
							@Pc(63) int local63 = local34 >> 14 & 0x3FF;
							@Pc(69) int local69 = local34 >> 3 & 0x7FF;
							@Pc(79) int local79 = local69 / 8 + (local63 / 8 << 8);
							for (@Pc(81) int local81 = 0; local81 < Static103.anIntArray76.length; local81++) {
								if (local79 == Static103.anIntArray76[local81] && arg1[local81] != null) {
									@Pc(99) Class5_Sub3 local99 = new Class5_Sub3(arg1[local81]);
									arg0.method5425(local43, local20 * 8, local57, local24 * 8, local69, local99, Static71.aClass10Array3, local14, local63);
									arg0.method5435(local20 * 8, local43, local63, local14, local99, local12[0] == -1 ? local12 : null, Static110.aClass62_15, local69, local57, local24 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static514.aClass82_1 = Static175.aClass49_1.method1196(local12[3], Static420.aClass118_10, local12[2], local12[1], local12[0]);
			Static458.anInt7886 = local12[4];
		}
	}
}
