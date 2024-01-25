import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Z")
	public static boolean aBoolean711 = false;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_151 = new Class90(100, 2);

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_152 = new Class90(94, 8);

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "[I")
	public static final int[] anIntArray588 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZII)V")
	public static void method8151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub6_Sub5 local13 = Static396.method6079(arg1, 1);
		local13.method2303();
		local13.anInt2865 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	public static void method8152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg0, 7);
		local8.method2303();
		local8.anInt2865 = arg1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Z")
	public static boolean method8155(@OriginalArg(1) int arg0) {
		return arg0 == 13 || arg0 == 10 || arg0 == 1009 || arg0 == 23 || arg0 == 44;
	}
}
