import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "Lclient!b;")
	public static Class6 aClass6_35;

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_8;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
	public static int anInt1276;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
	public static int anInt1270 = 0;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
	public static int anInt1272 = 0;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_582 = Static193.method3027("Schlie-8en");

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "Z")
	public static boolean aBoolean78 = false;

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_583 = Static193.method3027(" <col=ffffff>");

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIILclient!m;IJIIII)Z")
	public static boolean method918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static200.method3178(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Lclient!wf;")
	public static Class99 method919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt827; local13++) {
			@Pc(19) Class99 local19 = local7.aClass99Array1[local13];
			if ((local19.aLong144 >> 29 & 0x3L) == 2L && local19.anInt4226 == arg1 && local19.anInt4239 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIZZ)V")
	public static void method923(@OriginalArg(3) boolean arg0) {
		Static91.anInt1796 = 22050;
		Static150.aBoolean144 = arg0;
		Static176.anInt3589 = 2;
	}
}
