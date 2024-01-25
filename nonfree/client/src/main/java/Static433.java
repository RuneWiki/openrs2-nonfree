import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vt", name = "z", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!vt", name = "w", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_99 = new Class84("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIZI)V")
	public static void method5781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static212.anInt452 < arg4 || Static305.anInt5429 > arg3) {
			return;
		}
		@Pc(32) boolean local32;
		if (Static83.anInt7380 > arg0) {
			local32 = false;
			arg0 = Static83.anInt7380;
		} else if (arg0 <= Static221.anInt4001) {
			local32 = true;
		} else {
			local32 = false;
			arg0 = Static221.anInt4001;
		}
		@Pc(51) boolean local51;
		if (arg2 < Static83.anInt7380) {
			arg2 = Static83.anInt7380;
			local51 = false;
		} else if (Static221.anInt4001 < arg2) {
			arg2 = Static221.anInt4001;
			local51 = false;
		} else {
			local51 = true;
		}
		if (arg4 >= Static305.anInt5429) {
			Static217.method3280(Static59.anIntArrayArray34[arg4++], arg0, arg1, arg2);
		} else {
			arg4 = Static305.anInt5429;
		}
		if (arg3 <= Static212.anInt452) {
			Static217.method3280(Static59.anIntArrayArray34[arg3--], arg0, arg1, arg2);
		} else {
			arg3 = Static212.anInt452;
		}
		@Pc(104) int local104;
		if (local32 && local51) {
			for (local104 = arg4; local104 <= arg3; local104++) {
				@Pc(150) int[] local150 = Static59.anIntArrayArray34[local104];
				local150[arg0] = local150[arg2] = arg1;
			}
			return;
		}
		if (local32) {
			for (local104 = arg4; local104 <= arg3; local104++) {
				Static59.anIntArrayArray34[local104][arg0] = arg1;
			}
			return;
		}
		if (local51) {
			for (local104 = arg4; local104 <= arg3; local104++) {
				Static59.anIntArrayArray34[local104][arg2] = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
	public static void method5783() {
		Static199.aClass83_32.method1663(5);
	}
}
