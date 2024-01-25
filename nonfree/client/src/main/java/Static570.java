import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
	public static int anInt9810 = 0;

	@OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
	public static int anInt9813 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Lclient!jb;")
	public static Class15_Sub1_Sub4 method7926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class56 local7 = Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!tp;III)V")
	public static void method7927(@OriginalArg(0) Class331 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static59.anInt1902 = arg1;
		Static547.aClass331_17 = arg0;
		Static101.anInt2722 = arg2;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)I")
	public static int method7928(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
