import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	public static int anInt5886;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Lclient!hja;")
	public static final Class147 aClass147_4 = new Class147();

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "[I")
	public static final int[] anIntArray317 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "S")
	public static short aShort51 = 1;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!uq;IJZIIB)V")
	public static void method4991(@OriginalArg(1) Class362 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(5) int arg3) {
		Static523.anInt8276 = arg1;
		Static223.aLong104 = arg2;
		Static653.aClass3_Sub12_Sub3_4 = null;
		Static566.anInt9146 = 0;
		Static27.anInt684 = 10000;
		Static208.anInt3637 = 0;
		Static634.anInt6735 = 1;
		Static554.aClass362_126 = arg0;
		Static18.aBoolean20 = false;
		Static531.anInt8329 = arg3;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class205 local13 = local7.aClass205_4; local13 != null; local13 = local13.aClass205_3) {
			@Pc(17) Class34_Sub1_Sub1 local17 = local13.aClass34_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort98 == arg1 && local17.aShort99 == arg2) {
				Static525.method6827(local17, false);
				return;
			}
		}
	}
}
