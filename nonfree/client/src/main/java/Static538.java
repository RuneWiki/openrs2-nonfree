import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!uf", name = "V", descriptor = "Lclient!ps;")
	public static Class262 aClass262_7;

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!uf", name = "S", descriptor = "Z")
	public static boolean aBoolean626 = false;

	@OriginalMember(owner = "client!uf", name = "U", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_296 = new Class123(86, 14);

	@OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
	public static int anInt9387 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!jga;")
	public static RuntimeException_Sub1 method7361(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString118 = local9.aString118 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public static void method7362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class25_Sub4 local12 = new Class25_Sub4();
		local12.anInt2714 = Static397.anInt6998 + arg5;
		local12.anInt2717 = arg2;
		local12.anInt2715 = arg3;
		local12.anInt2718 = arg1;
		local12.aString62 = arg4;
		local12.anInt2720 = arg6;
		local12.anInt2722 = arg0;
		Static6.aClass269_1.method5977(local12);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)I")
	public static int method7366(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}
}
