import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!af;")
	public static Class6 aClass6_2;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!ra;")
	public static Class170 aClass170_7;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!fi;")
	public static Class66 aClass66_11 = new Class66(64);

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString59 = "Loaded wordpack";

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "[S")
	public static final short[] aShortArray5 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "[I")
	public static final int[] anIntArray46 = new int[13];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public static void method875() {
		if (Static252.aBoolean377) {
			return;
		}
		Static255.aBoolean381 = true;
		if (Static139.aBoolean462) {
			Static5.aFloat2 = (int) Static5.aFloat2 - 17 & 0xFFFFFFF0;
		} else {
			Static230.aFloat69 += (-12.0F - Static230.aFloat69) / 2.0F;
		}
		Static252.aBoolean377 = true;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)I")
	public static int method876(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[I[IBI)V")
	public static void method877(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg0) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg1[local15];
		arg1[local15] = arg1[arg3];
		arg1[arg3] = local21;
		@Pc(35) int local35 = arg2[local15];
		arg2[local15] = arg2[arg3];
		arg2[arg3] = local35;
		for (@Pc(47) int local47 = arg0; local47 < arg3; local47++) {
			if (arg1[local47] < (local47 & 0x1) + local21) {
				@Pc(66) int local66 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17] = local66;
				@Pc(80) int local80 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17++] = local80;
			}
		}
		arg1[arg3] = arg1[local17];
		arg1[local17] = local21;
		arg2[arg3] = arg2[local17];
		arg2[local17] = local35;
		method877(arg0, arg1, arg2, local17 - 1);
		method877(local17 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public static void method878() {
		@Pc(5) Class66 local5 = Static173.aClass66_79;
		synchronized (Static173.aClass66_79) {
			Static173.aClass66_79.method1942();
		}
	}
}
