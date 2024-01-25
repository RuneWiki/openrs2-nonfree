import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!vja", name = "n", descriptor = "J")
	public static long aLong284;

	@OriginalMember(owner = "client!vja", name = "p", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_216 = new Class151(128, -1);

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(I)[Lclient!iga;")
	public static Class164[] method8479() {
		return new Class164[] { Static51.aClass164_1, Static51.aClass164_2, Static51.aClass164_3, Static51.aClass164_4, Static51.aClass164_5, Static51.aClass164_6, Static51.aClass164_7, Static51.aClass164_8, Static51.aClass164_9, Static51.aClass164_10, Static51.aClass164_11, Static51.aClass164_12, Static51.aClass164_13 };
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(II)I")
	public static int method8480(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!vja", name = "c", descriptor = "(II)V")
	public static void method8481(@OriginalArg(1) int arg0) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg0, 11);
		local9.method3956();
	}
}
