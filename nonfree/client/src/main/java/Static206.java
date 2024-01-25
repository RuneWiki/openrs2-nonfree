import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!vq;")
	public static Class217 aClass217_177;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[200];

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[[I)V")
	public static void method4906(@OriginalArg(1) int[][] arg0) {
		Static43.anIntArrayArray57 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!gt;Z)V")
	public static void method4914(@OriginalArg(0) Class75 arg0) {
		@Pc(7) Class183 local7 = null;
		try {
			@Pc(11) Class121 local11 = arg0.method2370();
			while (local11.anInt3693 == 0) {
				Static135.method2737(1L);
			}
			if (local11.anInt3693 == 1) {
				local7 = (Class183) local11.anObject2;
				@Pc(39) Class1_Sub7 local39 = Static44.method1072();
				local7.method4937(0, local39.anInt2219, local39.aByteArray41);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local7 != null) {
				local7.method4934();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BIIII)I")
	public static int method4917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xF;
		@Pc(24) int local24 = local7 >= 8 ? arg0 : arg2;
		@Pc(45) int local45 = local7 < 4 ? arg0 : local7 == 12 || local7 == 14 ? arg2 : arg3;
		return ((local7 & 0x2) == 0 ? local45 : -local45) + ((local7 & 0x1) == 0 ? local24 : -local24);
	}
}
