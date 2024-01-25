import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Lclient!ar;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "Lclient!f;")
	public static Class73 aClass73_36;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "Lclient!la;")
	public static Class63 aClass63_8;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public static void method5378(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static553.anInt9663 == 2) {
				Static242.aClass176Array1[0].method4282(Static483.aClass311Array1[0]);
				Static242.aClass176Array1[1].method4282(Static483.aClass311Array1[1]);
			} else if (Static553.anInt9663 == 3) {
				Static242.aClass176Array1[0].method4282(Static483.aClass311Array1[0]);
				Static242.aClass176Array1[1].method4282(Static483.aClass311Array1[1]);
				Static242.aClass176Array1[2].method4282(Static483.aClass311Array1[2]);
			} else {
				Static242.aClass176Array1[0].method4282(Static483.aClass311Array1[0]);
				Static242.aClass176Array1[1].method4282(Static483.aClass311Array1[1]);
				Static242.aClass176Array1[2].method4282(Static483.aClass311Array1[2]);
				Static242.aClass176Array1[3].method4282(Static483.aClass311Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static553.anInt9663 == 2) {
				Static242.aClass176Array1[0].method4282(Static483.aClass311Array1[2]);
			} else if (Static553.anInt9663 == 3) {
				Static242.aClass176Array1[0].method4282(Static483.aClass311Array1[3]);
				Static242.aClass176Array1[1].method4282(Static483.aClass311Array1[4]);
			} else {
				Static242.aClass176Array1[0].method4282(Static483.aClass311Array1[4]);
				Static242.aClass176Array1[1].method4282(Static483.aClass311Array1[5]);
				Static242.aClass176Array1[2].method4282(Static483.aClass311Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static553.anInt9663 == 2) {
				Static242.aClass176Array1[0].method4282(Static483.aClass311Array1[3]);
				return;
			}
			if (Static553.anInt9663 == 3) {
				Static242.aClass176Array1[0].method4282(Static483.aClass311Array1[5]);
				return;
			}
			Static242.aClass176Array1[0].method4282(Static483.aClass311Array1[7]);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)S")
	public static short method5380(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 <= 64 ? local15 * local19 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(43) int local43 = local39 + local19;
		@Pc(59) int local59;
		if (local43 == 0) {
			local59 = local39 << 1;
		} else {
			local59 = (local39 << 8) / local43;
		}
		return (short) (local43 | local9 << 10 | local59 >> 4 << 7);
	}
}
