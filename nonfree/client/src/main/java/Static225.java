import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!po", name = "J", descriptor = "I")
	public static int anInt4140;

	@OriginalMember(owner = "client!po", name = "D", descriptor = "Lclient!gj;")
	public static Class59 aClass59_32 = new Class59();

	@OriginalMember(owner = "client!po", name = "E", descriptor = "Z")
	public static boolean aBoolean286 = false;

	@OriginalMember(owner = "client!po", name = "F", descriptor = "[Lclient!mj;")
	public static Class110[] aClass110Array1 = new Class110[50];

	@OriginalMember(owner = "client!po", name = "G", descriptor = "I")
	public static int anInt4138 = 0;

	@OriginalMember(owner = "client!po", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString233 = "Attack";

	@OriginalMember(owner = "client!po", name = "I", descriptor = "I")
	public static int anInt4139 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)V")
	public static void method3496(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static5.method35(arg0, 11);
		local8.method2873();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIZZIZI)V")
	public static void method3497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg5 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg5 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) Class29_Sub1 local20 = Static96.aClass29_Sub1Array3[local14];
		Static96.aClass29_Sub1Array3[local14] = Static96.aClass29_Sub1Array3[arg5];
		Static96.aClass29_Sub1Array3[arg5] = local20;
		for (@Pc(32) int local32 = arg0; local32 < arg5; local32++) {
			if (Static190.method3092(arg4, arg2, arg3, arg1, local20, Static96.aClass29_Sub1Array3[local32]) <= 0) {
				@Pc(55) Class29_Sub1 local55 = Static96.aClass29_Sub1Array3[local32];
				Static96.aClass29_Sub1Array3[local32] = Static96.aClass29_Sub1Array3[local16];
				Static96.aClass29_Sub1Array3[local16++] = local55;
			}
		}
		Static96.aClass29_Sub1Array3[arg5] = Static96.aClass29_Sub1Array3[local16];
		Static96.aClass29_Sub1Array3[local16] = local20;
		method3497(arg0, arg1, arg2, arg3, arg4, local16 - 1);
		method3497(local16 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	public static void method3499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10;
		if (arg1 != Static182.anInt3492) {
			Static279.anIntArray454 = new int[arg1];
			for (local10 = 0; local10 < arg1; local10++) {
				Static279.anIntArray454[local10] = (local10 << 12) / arg1;
			}
			Static182.anInt3492 = arg1;
			Static61.anInt1166 = arg1 - 1;
			Static157.anInt1467 = arg1 * 32;
		}
		if (arg0 == Static117.anInt2472) {
			return;
		}
		if (Static182.anInt3492 == arg0) {
			Static250.anIntArray398 = Static279.anIntArray454;
		} else {
			Static250.anIntArray398 = new int[arg0];
			for (local10 = 0; local10 < arg0; local10++) {
				Static250.anIntArray398[local10] = (local10 << 12) / arg0;
			}
		}
		Static171.anInt3359 = arg0 - 1;
		Static117.anInt2472 = arg0;
	}
}
