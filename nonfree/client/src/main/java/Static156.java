import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
	public static int anInt2980;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "Lclient!qa;")
	public static Class30 aClass30_7;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "[I")
	public static int[] anIntArray249;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString26 = null;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_40 = new Class242("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "Z")
	public static boolean aBoolean213 = false;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIBII)V")
	public static void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class4_Sub1_Sub8 local13 = Static416.method5456(arg0, 4);
		local13.method2762();
		local13.anInt3610 = arg2;
		local13.anInt3611 = arg1;
		local13.anInt3607 = arg3;
	}
}
