import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!kja", name = "K", descriptor = "[Lclient!aga;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!kja", name = "P", descriptor = "I")
	public static final int anInt5099 = 0;

	@OriginalMember(owner = "client!kja", name = "O", descriptor = "Z")
	public static boolean aBoolean436 = true;

	@OriginalMember(owner = "client!kja", name = "B", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(II)I")
	public static int method4626(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(Lclient!oh;IB)I")
	public static int method4627(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1) {
		if (!Static91.method1412(arg0).method3016(arg1) && arg0.anObjectArray15 == null) {
			return -1;
		} else if (arg0.anIntArray531 == null || arg1 >= arg0.anIntArray531.length) {
			return -1;
		} else {
			return arg0.anIntArray531[arg1];
		}
	}

	@OriginalMember(owner = "client!kja", name = "b", descriptor = "(B)V")
	public static void method4628() {
		if (Static610.anInt10726 > 1) {
			Static650.aClass2_Sub30_29.method2988(4, Static650.aClass2_Sub30_29.aClass11_Sub8_1);
		} else {
			Static650.aClass2_Sub30_29.method2988(2, Static650.aClass2_Sub30_29.aClass11_Sub8_1);
		}
	}

	@OriginalMember(owner = "client!kja", name = "h", descriptor = "(I)V")
	public static void method4632() {
		@Pc(11) Class85 local11 = Static650.aClass85_66;
		synchronized (Static650.aClass85_66) {
			Static650.aClass85_66.method1741();
		}
		local11 = Static124.aClass85_15;
		synchronized (Static124.aClass85_15) {
			Static124.aClass85_15.method1741();
		}
	}
}
