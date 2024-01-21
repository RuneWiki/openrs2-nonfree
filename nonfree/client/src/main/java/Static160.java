import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_7;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "J")
	public static long aLong61;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "[I")
	public static int[] anIntArray187;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
	public static int anInt1995;

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] aClass2_Sub1_Sub7_Sub4Array7;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "Lclient!md;")
	public static final Class51 aClass51_4 = new Class51(4096);

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_491 = Static158.method3034("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
	public static int anInt1994 = 0;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
	public static int anInt1996 = -1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)J")
	public static long method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass52_1 == null ? 0L : local7.aClass52_1.aLong105;
	}
}
