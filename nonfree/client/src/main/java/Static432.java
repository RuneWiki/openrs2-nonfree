import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "[[[Lclient!ev;")
	public static Class75[][][] aClass75ArrayArrayArray6;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray45;

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
	public static int anInt7151;

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "[B")
	public static final byte[] aByteArray86 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_102 = new Class146(58, 1);

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
	public static void method5738(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class4 local11 = Static159.aClass67_18.method1428(); local11 != null; local11 = Static159.aClass67_18.method1424()) {
			if ((local11.aLong227 >> 48 & 0xFFFFL) == (long) arg0) {
				local11.method6059();
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
	public static void method5739() {
		Static242.aClass137_44.method2739();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ba;III[Z)Z")
	public static boolean method5741(@OriginalArg(0) Class4_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static278.aClass41Array3 != Static169.aClass41Array1) {
			@Pc(11) int local11 = Static228.aClass41Array2[arg1].a(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class41 local18 = Static228.aClass41Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.a(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5562(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.b(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
	public static void method5742() {
		Static242.aClass137_44.method2737();
	}
}
