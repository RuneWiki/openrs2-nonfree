import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "F")
	public static float aFloat98;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "[Lclient!ee;")
	public static Class9_Sub1[] aClass9_Sub1Array4;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!qn;")
	public static final Class313 aClass313_26 = new Class313(8);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BI)I")
	public static int method4980(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(30) int local30 = (local10 >>> 2 & 0x33333333) + (local10 & 0x33333333);
		@Pc(39) int local39 = local30 + (local30 >>> 4) & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILclient!ik;IIZ)V")
	public static void method4981(@OriginalArg(0) int arg0, @OriginalArg(2) Class182 arg1, @OriginalArg(3) int arg2) {
		Static46.method1228(arg0, arg1, arg2, (long) 0);
	}
}
