import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static727 {

	@OriginalMember(owner = "client!za", name = "k", descriptor = "I")
	public static final int anInt11271 = 1337;

	@OriginalMember(owner = "client!za", name = "l", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_114 = new Class144(29, 7);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(BLclient!dga;)V")
	public static void method9600(@OriginalArg(1) Class3_Sub7_Sub5 arg0) {
		arg0.method9251();
		@Pc(10) boolean local10 = false;
		for (@Pc(23) Class3_Sub7_Sub5 local23 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3334(); local23 != null; local23 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3332()) {
			if (Static380.method5127(local23.method2138(), arg0.method2138())) {
				local10 = true;
				Static461.method6257(local23, arg0);
				break;
			}
		}
		if (!local10) {
			Static242.aClass147_2.method3335(arg0);
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIZI)V")
	public static void method9602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static287.anInt4415 = arg0;
		Static528.anInt8244 = arg1;
		Static114.anInt2375 = arg3;
		Static332.anInt5343 = arg2;
		Static25.anInt766 = arg5;
		if (arg4 && Static287.anInt4415 >= 100) {
			Static305.anInt4908 = Static114.anInt2375 * 512 + 256;
			Static263.anInt4101 = Static528.anInt8244 * 512 + 256;
			Static490.anInt7687 = Static77.method1633(Static263.anInt4101, Static305.anInt4908, Static723.anInt11225) - Static332.anInt5343;
		}
		Static262.anInt4081 = 2;
		Static358.anInt5640 = -1;
		Static494.anInt7853 = -1;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method9603(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static444.method5884(arg1, arg0, 0, arg0.length - 1);
	}
}
