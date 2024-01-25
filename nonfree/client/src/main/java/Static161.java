import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!gp;")
	public static Class75 aClass75_4;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "Lclient!bn;")
	public static final Class24 aClass24_1 = new Class24();

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	public static int anInt3248 = 0;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	public static int anInt3258 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!lg;III[Z)Z")
	public static boolean method2990(@OriginalArg(0) Class5_Sub9_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static130.aClass3Array2 != Static93.aClass3Array1) {
			@Pc(11) int local11 = Static262.aClass3Array3[arg1].method5639(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class3 local18 = Static262.aClass3Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method5639(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5626(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method5628(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!en;III)V")
	public static void method2991(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static26.aClass59_2 = arg0;
		Static115.aClass6ArrayArray1 = new Class6[arg2][arg1];
		if (Static2.anIntArray1 != null) {
			Static230.aClass18_4 = Static350.method5781(Static2.anIntArray1[1], Static2.anIntArray1[2], Static2.anIntArray1[4], Static2.anIntArray1[5], Static2.anIntArray1[0], Static2.anIntArray1[3]);
		}
		Static38.aClass6_2 = new Class6();
		Static254.method4679();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!ra;Lclient!ra;Z)V")
	public static void method2994(@OriginalArg(1) Class170 arg0, @OriginalArg(2) Class170 arg1) {
		Static38.aClass170_7 = arg1;
		Static169.aClass170_63 = arg0;
		Static22.aBoolean44 = true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ir;I)V")
	public static void method2996(@OriginalArg(0) Class63_Sub3 arg0) {
		arg0.aClass25_1 = null;
		@Pc(12) int local12 = arg0.aClass63_Sub7Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass63_Sub7Array1[local14].aBoolean453 = false;
		}
		@Pc(37) Class24[] local37 = Class180.aClass24Array1;
		synchronized (Class180.aClass24Array1) {
			if (local12 < Class180.aClass24Array1.length && Static93.anIntArray126[local12] < 200) {
				Class180.aClass24Array1[local12].method620(arg0);
				@Pc(66) int local66 = Static93.anIntArray126[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
	public static void method2997() {
		Static344.aClass5_Sub4_2 = new Class5_Sub4(Static197.aString228, "", Static156.anInt3126, 1001, 0L, 0, 0);
	}
}
