import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public static int anInt9726;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_96 = new Class124();

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
	public static int anInt9720 = 0;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Z")
	public static boolean aBoolean716 = false;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "Lclient!ve;")
	public static final Class370 aClass370_9 = new Class370(6, 1);

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_303 = new Class196(89, 6);

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "[I")
	public static final int[] anIntArray552 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	public static int anInt9725 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLclient!ts;)V")
	public static void method8096(@OriginalArg(1) Class41_Sub1_Sub1_Sub3_Sub2 arg0) {
		@Pc(16) Class5_Sub38 local16 = (Class5_Sub38) Static337.aClass335_25.method7766((long) arg0.anInt9469);
		if (local16 == null) {
			Static578.method7881(arg0.anIntArray527[0], 0, arg0, (Class41_Sub1_Sub1_Sub3_Sub1) null, arg0.aByte149, arg0.anIntArray528[0], (Class81) null);
		} else {
			local16.method5633();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZIIIIII)V")
	public static void method8098(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static655.aClass5_Sub36_29.aClass2_Sub6_5.method3364() != 0 && arg1 != 0 && Static331.anInt6013 < 50 && arg3 != -1) {
			Static515.aClass178Array2[Static331.anInt6013++] = new Class178((byte) 2, arg3, arg1, arg4, arg0, arg2, arg5, (Class41_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI)Z")
	public static boolean method8099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method8100(@OriginalArg(1) File arg0) {
		return Static464.method6868((int) arg0.length(), arg0);
	}
}
