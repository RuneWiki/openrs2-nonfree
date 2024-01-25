import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "[J")
	public static long[] aLongArray6;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
	public static boolean aBoolean366 = false;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Z")
	public static volatile boolean aBoolean368 = true;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
	public static void method4499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg1, 10);
		local8.method202();
		local8.anInt211 = arg0;
		local8.anInt214 = arg2;
		local8.anInt218 = arg3;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!kj;IIIII)Ljava/awt/Frame;")
	public static Frame method4500(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method3209()) {
			return null;
		}
		@Pc(20) Class171[] local20 = Static122.method1810(arg0);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (local20[local28].anInt4868 == arg3 && local20[local28].anInt4869 == arg2 && (!local26 || local20[local28].anInt4872 > arg1)) {
				local26 = true;
				arg1 = local20[local28].anInt4872;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(93) Class100 local93 = arg0.method3222(arg2, arg1, arg3);
		while (local93.anInt2365 == 0) {
			Static67.method1189(10L);
		}
		@Pc(113) Frame local113 = (Frame) local93.anObject4;
		if (local113 == null) {
			return null;
		} else if (local93.anInt2365 == 2) {
			Static32.method552(arg0, local113);
			return null;
		} else {
			return local113;
		}
	}
}
