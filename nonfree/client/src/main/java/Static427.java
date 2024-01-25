import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!nja", name = "D", descriptor = "I")
	public static int anInt6976;

	@OriginalMember(owner = "client!nja", name = "g", descriptor = "I")
	public static final int anInt6944 = -1;

	@OriginalMember(owner = "client!nja", name = "B", descriptor = "I")
	public static int anInt6966 = 0;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IZIIIIII)V")
	public static void method6249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(15) int local15 = arg6 + arg1;
		for (@Pc(17) int local17 = arg6; local17 < local15; local17++) {
			Static494.method7075(arg0, arg3, arg5, Static449.anIntArrayArray48[local17], 18601);
		}
		@Pc(38) int local38 = arg5 - arg1;
		@Pc(49) int local49 = arg0 + arg1;
		for (@Pc(51) int local51 = arg2; local51 > local10; local51--) {
			Static494.method7075(arg0, arg3, arg5, Static449.anIntArrayArray48[local51], 18601);
		}
		for (@Pc(73) int local73 = local15; local73 <= local10; local73++) {
			@Pc(81) int[] local81 = Static449.anIntArrayArray48[local73];
			Static494.method7075(arg0, arg3, local49, local81, 18601);
			Static494.method7075(local49, arg4, local38, local81, 18601);
			Static494.method7075(local38, arg3, arg5, local81, 18601);
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V")
	public static void method6251() {
		for (@Pc(10) int local10 = 0; local10 < Static331.anInt5059; local10++) {
			@Pc(23) int local23 = Static450.method6579(local10 + Static368.anInt5896, Static331.anInt5059) * Static59.anInt1029;
			for (@Pc(25) int local25 = 0; local25 < Static59.anInt1029; local25++) {
				@Pc(36) int local36 = local23 + Static450.method6579(local25 + Static466.anInt7550, Static59.anInt1029);
				if (Static388.anInt6469 == Static627.anIntArray698[local36]) {
					Class4_Sub2_Sub1_Sub1.lb[local36].method9368(0, 0, Static405.anInt6687, Static136.anInt2255, Static405.anInt6687 * local25, local10 * Static136.anInt2255);
				}
			}
		}
		anInt6976++;
	}
}
