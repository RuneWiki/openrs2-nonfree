import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!hf;")
	public static final Class150 aClass150_16 = new Class150();

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
	public static final int[] anIntArray554 = new int[3];

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_4 = new Class6();

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_305 = new Class196(112, 6);

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_18 = new Class74(0, 4);

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "[I")
	public static final int[] anIntArray555 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
	public static void method8105() {
		for (@Pc(8) Class5_Sub2_Sub16 local8 = (Class5_Sub2_Sub16) Static97.aClass124_11.method2572(); local8 != null; local8 = (Class5_Sub2_Sub16) Static97.aClass124_11.method2569()) {
			@Pc(15) Class41_Sub1_Sub1_Sub5 local15 = local8.aClass41_Sub1_Sub1_Sub5_1;
			if (Static421.anInt7434 > local15.anInt9256) {
				local8.method8829();
				local15.method7762();
			} else if (local15.anInt9271 <= Static421.anInt7434) {
				local15.method7764();
				if (local15.anInt9257 > 0) {
					@Pc(54) Class5_Sub34 local54 = (Class5_Sub34) Static223.aClass335_19.method7766((long) (local15.anInt9257 - 1));
					if (local54 != null) {
						@Pc(59) Class41_Sub1_Sub1_Sub3_Sub1 local59 = local54.aClass41_Sub1_Sub1_Sub3_Sub1_1;
						if (local59.anInt10366 >= 0 && local59.anInt10366 < Static124.anInt2150 * 512 && local59.anInt10367 >= 0 && Static64.anInt1015 * 512 > local59.anInt10367) {
							local15.method7765(local59.anInt10366, Static421.anInt7434, local59.anInt10367, Static161.method1246(local15.aByte149, local59.anInt10367, local59.anInt10366) - local15.anInt9264);
						}
					}
				}
				if (local15.anInt9257 < 0) {
					@Pc(116) int local116 = -local15.anInt9257 - 1;
					@Pc(125) Class41_Sub1_Sub1_Sub3_Sub2 local125;
					if (Static177.anInt2910 == local116) {
						local125 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1;
					} else {
						local125 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local116];
					}
					if (local125 != null && local125.anInt10366 >= 0 && Static124.anInt2150 * 512 > local125.anInt10366 && local125.anInt10367 >= 0 && Static64.anInt1015 * 512 > local125.anInt10367) {
						local15.method7765(local125.anInt10366, Static421.anInt7434, local125.anInt10367, Static161.method1246(local15.aByte149, local125.anInt10367, local125.anInt10366) - local15.anInt9264);
					}
				}
				local15.method7758(Static648.anInt10220);
				Static213.method3080(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
	public static void method8106(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static628.method8367(arg1, arg0.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Z")
	public static boolean method8107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static279.method3859(arg1, arg0) || Static512.method7321(arg1, arg0);
	}
}
