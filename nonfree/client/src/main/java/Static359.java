import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!m", name = "E", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_30 = new Class22(4);

	@OriginalMember(owner = "client!m", name = "I", descriptor = "[I")
	public static final int[] anIntArray327 = new int[500];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!th;II)Z")
	public static boolean method6150(@OriginalArg(0) Class348 arg0, @OriginalArg(1) int arg1) {
		Static182.aClass76_5.method9642(arg0.anIntArray508[arg1], arg0.anIntArray506[arg1], arg0.anIntArray507[arg1], Static75.anIntArray71);
		@Pc(22) int local22 = Static75.anIntArray71[2];
		if (local22 < 50) {
			return false;
		} else {
			arg0.aShortArray147[arg1] = (short) (Static390.anInt7383 * Static75.anIntArray71[0] / local22 + Static610.anInt10745);
			arg0.aShortArray149[arg1] = (short) (Static41.anInt911 + Static131.anInt2513 * Static75.anIntArray71[1] / local22);
			arg0.aShortArray148[arg1] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
	public static void method6151(@OriginalArg(1) int arg0) {
		Static353.anInt6795 = arg0;
		Static605.anInt10580 = 2;
		if (Static616.aString130 == null) {
			Static173.method3384(35);
		} else {
			@Pc(24) Class2_Sub8 local24 = new Class2_Sub8(Static205.method3905(Static565.method8571(Static616.aString130)));
			@Pc(28) long local28 = local24.method5213();
			Static613.aLong289 = local24.method5213();
			Static205.method3904(true, Static538.method8270(local28), "");
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6152(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(37) int local37 = arg0.indexOf(" ", "directlogin ".length());
			if (local37 >= 0) {
				@Pc(45) int local45 = arg0.length();
				arg0 = arg0.substring(0, local37) + " ";
				for (@Pc(61) int local61 = local37 + 1; local61 < local45; local61++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V")
	public static void method6153() {
		Static309.anInt5585 = 200;
		Static315.anInt5681 = (int) ((double) Static222.anInt4533 * 34.46D);
		Static315.anInt5681 <<= 0x2;
		if (Static607.aClass101_15.method8123()) {
			Static315.anInt5681 += 512;
		}
		Static102.method1769(false);
	}
}
