import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
	public static int anInt5490 = -1;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!ha;III[Z)V")
	public static void method4410(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static256.aClass127Array3 == Static108.aClass127Array5) {
			return;
		}
		@Pc(10) int local10 = Static420.aClass127Array6[arg1].method7860(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class127 local23 = Static420.aClass127Array6[local12];
				if (local23 != null) {
					local23.DA(arg0, arg2, local10 - local23.method7860(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZI)Lclient!ui;")
	public static Class329 method4411(@OriginalArg(1) int arg0) {
		@Pc(8) Class329[] local8 = Static401.method5680();
		for (@Pc(19) int local19 = 0; local19 < local8.length; local19++) {
			if (arg0 == local8[local19].anInt9450) {
				return local8[local19];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!ri;IBZI)V")
	public static void method4412(@OriginalArg(1) Class284 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		Static392.method5559(arg0, 0L, arg2, arg1);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)V")
	public static void method4413() {
		Static38.aBoolean94 = false;
		Static130.aClass284_126 = null;
		Static530.anInt9251 = 1;
		Static508.anInt8798 = -1;
		Static426.anInt7533 = 2;
		Static533.aClass3_Sub16_Sub3_3 = null;
		Static530.anInt9247 = -1;
		Static213.anInt4459 = 0;
	}
}
