import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "[I")
	public static int[] anIntArray383;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_68 = new Class286(12, 4);

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "[I")
	public static final int[] anIntArray384 = new int[5];

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_124 = new Class186(61, -2);

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "[I")
	public static final int[] anIntArray385 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method5941(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static639.aClass313Array2 == Static711.aClass313Array3) {
			return;
		}
		@Pc(10) int local10 = Static167.aClass313Array1[arg1].method9096(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(25) Class313 local25 = Static167.aClass313Array1[local12];
				if (local25 != null) {
					local25.wa(arg0, arg2, local10 - local25.method9096(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)Z")
	public static boolean method5943(@OriginalArg(1) int arg0) {
		if (Static463.anInt8119 != arg0 || Static131.aClass230_1 == null) {
			Static131.aClass230_1 = Static367.aClass230_2;
		}
		@Pc(52) int local52;
		if (Static131.aClass230_1 == Static367.aClass230_2) {
			@Pc(35) byte[] local35 = Static406.aClass221_116.method5077(arg0);
			if (local35 == null) {
				return false;
			}
			@Pc(45) Class3_Sub28 local45 = new Class3_Sub28(local35);
			Static235.method3666(local45);
			local52 = local45.method5322(-96);
			for (@Pc(54) int local54 = 0; local54 < local52; local54++) {
				Static290.aClass357_26.method8401(new Class3_Sub39(local45));
			}
			@Pc(77) int local77 = local45.method5331();
			Static154.aClass234Array1 = new Class234[local77];
			for (@Pc(82) int local82 = 0; local82 < local77; local82++) {
				Static154.aClass234Array1[local82] = new Class234(local45);
			}
			@Pc(107) int local107 = local45.method5331();
			Static154.aClass11Array1 = new Class11[local107];
			for (@Pc(112) int local112 = 0; local112 < local107; local112++) {
				Static154.aClass11Array1[local112] = new Class11(local45, local112);
			}
			@Pc(134) int local134 = local45.method5331();
			Static410.aClass72Array1 = new Class72[local134];
			for (@Pc(139) int local139 = 0; local139 < local134; local139++) {
				Static410.aClass72Array1[local139] = new Class72(local45);
			}
			@Pc(160) int local160 = local45.method5331();
			Static106.aClass297Array1 = new Class297[local160];
			for (@Pc(165) int local165 = 0; local165 < local160; local165++) {
				Static106.aClass297Array1[local165] = new Class297(local45);
			}
			@Pc(186) int local186 = local45.method5331();
			Static612.aClass10Array1 = new Class10[local186];
			for (@Pc(191) int local191 = 0; local191 < local186; local191++) {
				Static612.aClass10Array1[local191] = Static666.method8870(local45);
			}
			Static131.aClass230_1 = Static367.aClass230_3;
		}
		if (Static131.aClass230_1 == Static367.aClass230_3) {
			@Pc(222) boolean local222 = true;
			@Pc(224) Class10[] local224 = Static612.aClass10Array1;
			for (local52 = 0; local52 < local224.length; local52++) {
				@Pc(232) Class10 local232 = local224[local52];
				if (!local232.method9145()) {
					local222 = false;
				}
			}
			if (!local222) {
				return false;
			}
			Static131.aClass230_1 = Static367.aClass230_4;
		}
		return true;
	}
}
