import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jn", name = "L", descriptor = "Lclient!jt;")
	public static Class159 aClass159_9;

	@OriginalMember(owner = "client!jn", name = "H", descriptor = "Lclient!pu;")
	public static Class268 aClass268_3 = new Class268(8);

	@OriginalMember(owner = "client!jn", name = "K", descriptor = "Lclient!nha;")
	public static final Class222 aClass222_3 = Static482.method7112();

	@OriginalMember(owner = "client!jn", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString109 = null;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Z")
	public static boolean method8428(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!oi;B)V")
	public static void method8429(@OriginalArg(0) Class9_Sub4_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class9_Sub4_Sub2_Sub1_Sub1) {
			@Pc(37) Class9_Sub4_Sub2_Sub1_Sub1 local37 = (Class9_Sub4_Sub2_Sub1_Sub1) arg0;
			if (local37.aClass158_1 == null) {
				return;
			}
			Static112.method8726(local37, local37.aByte135 != Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135);
		} else if (arg0 instanceof Class9_Sub4_Sub2_Sub1_Sub2) {
			@Pc(18) Class9_Sub4_Sub2_Sub1_Sub2 local18 = (Class9_Sub4_Sub2_Sub1_Sub2) arg0;
			Static321.method5334(local18.aByte135 != Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135, local18);
			return;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)I")
	public static int method8431(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIBLclient!ca;)V")
	public static void method8432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class40 arg2) {
		Static144.aClass40ArrayArray12[arg1][arg0] = arg2;
	}
}
