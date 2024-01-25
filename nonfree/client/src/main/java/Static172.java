import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fja", name = "X", descriptor = "J")
	public static long aLong86;

	@OriginalMember(owner = "client!fja", name = "Z", descriptor = "[I")
	public static final int[] anIntArray159 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!fja", name = "cb", descriptor = "[F")
	public static final float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(III)Lclient!vda;")
	public static Class368 method2744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static254.aClass368ArrayArrayArray2[0][arg1][arg2] != null && Static254.aClass368ArrayArrayArray2[0][arg1][arg2].aClass368_1 != null;
			if (local28 && arg0 >= Static247.anInt4367 - 1) {
				return null;
			}
			Static142.method2337(arg0, arg1, arg2);
		}
		return Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(ZB)V")
	public static void method2747(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static187.anInt3418 != -1) {
				Static223.method3279(Static187.anInt3418);
			}
			for (@Pc(27) Class3_Sub25 local27 = (Class3_Sub25) Static513.aClass333_33.method7490(); local27 != null; local27 = (Class3_Sub25) Static513.aClass333_33.method7487()) {
				if (!local27.method9036()) {
					local27 = (Class3_Sub25) Static513.aClass333_33.method7490();
					if (local27 == null) {
						break;
					}
				}
				Static186.method2905(local27, true, false);
			}
			Static187.anInt3418 = -1;
			Static513.aClass333_33 = new Class333(8);
			Static155.method2484();
			Static187.anInt3418 = Static335.anInt5741;
			Static630.method8507(false);
			Static184.method2885();
			Static250.method3769(Static187.anInt3418);
		}
		Static437.aBoolean506 = true;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(ILjava/awt/Canvas;BLclient!d;)Lclient!ha;")
	public static Class95 method2748(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Interface2 arg2) {
		return new Class95_Sub3(arg1, arg2, arg0);
	}
}
