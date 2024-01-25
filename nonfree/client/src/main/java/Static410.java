import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "Lclient!qca;")
	public static Class298 aClass298_1;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[128][128];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B[B)V")
	public static void method5169(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class4_Sub11 local10 = new Class4_Sub11(arg0);
		@Pc(12) boolean local12 = false;
		while (true) {
			while (true) {
				@Pc(16) int local16 = local10.method8865();
				if (local16 == 0) {
					if (local12) {
						return;
					}
					if (Static438.anIntArray473 == null) {
						Static438.anIntArray473 = new int[4];
						Static621.anInt9744 = 4;
						Static315.anIntArray371 = new int[4];
					}
					for (local16 = 0; local16 < Static438.anIntArray473.length; local16++) {
						Static438.anIntArray473[local16] = 0;
						Static315.anIntArray371[local16] = local16 * 20;
					}
					return;
				}
				if (local16 == 1) {
					if (Static438.anIntArray473 == null) {
						Static621.anInt9744 = 4;
						Static315.anIntArray371 = new int[4];
						Static438.anIntArray473 = new int[4];
					}
					for (@Pc(61) int local61 = 0; local61 < Static438.anIntArray473.length; local61++) {
						Static438.anIntArray473[local61] = local10.method8834();
						Static315.anIntArray371[local61] = local10.method8834();
					}
					local12 = true;
				} else if (local16 == 2) {
					Static386.anInt5675 = local10.method8859();
				} else if (local16 == 3) {
					Static621.anInt9744 = local10.method8865();
					Static438.anIntArray473 = new int[Static621.anInt9744];
					Static315.anIntArray371 = new int[Static621.anInt9744];
				}
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!uea;)V")
	public static void method5170(@OriginalArg(1) Class4_Sub48 arg0) {
		Static8.aClass163_2.method3646(arg0);
		arg0.anInt9241 = arg0.aClass4_Sub11_Sub1_2.anInt10466;
		arg0.aClass4_Sub11_Sub1_2.anInt10466 = 0;
		Static384.anInt5662 += arg0.anInt9241;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)Z")
	public static boolean method5172(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
