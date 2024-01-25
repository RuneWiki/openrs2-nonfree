import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "[Lclient!wb;")
	public static Class382[] aClass382Array1;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "[I")
	public static int[] anIntArray556;

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Lclient!uia;")
	public static Class354 aClass354_5;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "Lclient!ld;")
	public static final Class203 aClass203_4 = new Class203(1);

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Z")
	public static boolean aBoolean586 = false;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
	public static int anInt8485 = 0;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "[I")
	public static final int[] anIntArray557 = new int[5];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILclient!ns;III)V")
	public static void method7220(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub1_Sub3 arg2, @OriginalArg(6) int arg3) {
		Static234.method3564(arg2.aByte140, arg0, arg2.anInt10001, arg1, arg3, 0, arg2.anInt10006);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!oc;)Z")
	public static boolean method7222(@OriginalArg(1) Interface18 arg0) {
		@Pc(10) Class308 local10 = Static411.aClass88_3.method2024(arg0.method8469());
		if (local10.anInt8614 == -1) {
			return true;
		} else {
			@Pc(27) Class281 local27 = Static340.aClass186_3.method4234(local10.anInt8614);
			return local27.anInt8088 == -1 ? true : local27.method6921();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Z")
	public static boolean method7223(@OriginalArg(0) int arg0) {
		if (Static643.aBooleanArray35[arg0]) {
			return true;
		} else if (Static582.aClass8_127.method278(arg0)) {
			@Pc(34) int local34 = Static582.aClass8_127.method280(arg0);
			if (local34 == 0) {
				Static643.aBooleanArray35[arg0] = true;
				return true;
			}
			if (Static109.aClass321ArrayArray1[arg0] == null) {
				Static109.aClass321ArrayArray1[arg0] = new Class321[local34];
			}
			for (@Pc(56) int local56 = 0; local56 < local34; local56++) {
				if (Static109.aClass321ArrayArray1[arg0][local56] == null) {
					@Pc(70) byte[] local70 = Static582.aClass8_127.method262(local56, arg0);
					if (local70 != null) {
						@Pc(82) Class321 local82 = Static109.aClass321ArrayArray1[arg0][local56] = new Class321();
						local82.anInt9040 = (arg0 << 16) + local56;
						if (local70[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local82.method7685(new Class6_Sub23(local70));
					}
				}
			}
			Static643.aBooleanArray35[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
