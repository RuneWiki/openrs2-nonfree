import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "[S")
	public static short[] aShortArray139;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
	public static int anInt8736;

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "D")
	public static double aDouble50 = -1.0D;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!uu;")
	public static final Class369 aClass369_11 = new Class369(8, 1);

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
	public static int anInt8734 = 0;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
	public static int anInt8737 = 0;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
	public static int anInt8738 = 0;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_162 = new Class322(5, -1);

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
	public static int anInt8739 = -1;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!lga;Lclient!lga;Lclient!lga;Lclient!lga;B)V")
	public static void method7648(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		Static40.aClass223_7 = arg3;
		Static552.aClass223_106 = arg1;
		Static44.aClass223_8 = arg0;
		Static686.aClass381ArrayArray2 = new Class381[Static552.aClass223_106.method5290()][];
		Static319.aBooleanArray17 = new boolean[Static552.aClass223_106.method5290()];
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLclient!lq;Lclient!lq;IIZI)I")
	public static int method7649(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class204_Sub1 arg1, @OriginalArg(2) Class204_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(10) int local10 = Static635.method8593(arg5, arg1, arg3, arg2);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(45) int local45 = Static635.method8593(arg0, arg1, arg4, arg2);
			return arg0 ? -local45 : local45;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
	public static void method7650() {
		Static305.aClass260_2.method6403();
		Static305.aClass260_2.anInt7198 = 0;
		Static305.aClass260_2.aClass322_129 = null;
		Static305.aClass260_2.anInt7199 = 0;
		Static305.aClass260_2.aClass322_127 = null;
		Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = 0;
		Static305.aClass260_2.aClass322_128 = null;
		Static305.aClass260_2.aClass322_126 = null;
		Static594.anInt9443 = 0;
		Static414.method6396();
		Static283.method4691();
		for (@Pc(38) int local38 = 0; local38 < 2048; local38++) {
			Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local38] = null;
		}
		Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 = null;
		for (@Pc(54) int local54 = 0; local54 < Static251.anInt4781; local54++) {
			@Pc(63) Class60_Sub1_Sub1_Sub3_Sub2 local63 = Static216.aClass6_Sub11Array1[local54].aClass60_Sub1_Sub1_Sub3_Sub2_1;
			if (local63 != null) {
				local63.anInt4858 = -1;
			}
		}
		Static454.method6960();
		Static526.anInt8626 = 1;
		Static16.anInt232 = -1;
		Static126.anInt2529 = -1;
		Static307.method4889(11);
		for (@Pc(96) int local96 = 0; local96 < 100; local96++) {
			Static72.aBooleanArray5[local96] = true;
		}
		Static232.method4112();
		Static182.aLong105 = 0L;
		Static442.aClass6_Sub46_2 = null;
	}
}
