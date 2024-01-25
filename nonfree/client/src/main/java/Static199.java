import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "[Lclient!em;")
	public static Class68[] aClass68Array2;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "Lclient!rs;")
	public static Class220 aClass220_2;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "Lclient!al;")
	public static final Class10 aClass10_22 = new Class10("runescape", 0);

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	public static int anInt3821 = 0;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[8];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIB)Z")
	public static boolean method3100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static151.method2523(arg0, arg1) || Static117.method2084(arg1, arg0) || Static378.method5080(arg1, arg0);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
	public static void method3101(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub5_Sub13 local13 = Static208.method3306(arg0, 11);
		local13.method4545();
	}
}
