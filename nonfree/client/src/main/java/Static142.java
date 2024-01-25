import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
	public static int anInt2688 = -1;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "Lclient!de;")
	public static final Class70 aClass70_2 = new Class70();

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public static void method2218() {
		if (!Static492.aBoolean626) {
			Static492.aBoolean626 = true;
			Static117.aFloat269 += (-Static117.aFloat269 - 24.0F) / 2.0F;
			Static137.aBoolean207 = true;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(JII)Lclient!gaa;")
	public static Class14_Sub3_Sub9 method2219(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class14_Sub3_Sub9 local14 = (Class14_Sub3_Sub9) Static52.aClass187_8.method4078(arg0 | (long) arg1 << 56);
		if (local14 == null) {
			local14 = new Class14_Sub3_Sub9(arg1, arg0);
			Static52.aClass187_8.method4077(local14.aLong305, local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIII)V")
	public static void method2221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class14_Sub3_Sub9 local9 = method2219((long) arg0, 4);
		local9.method2817();
		local9.anInt3413 = arg1;
		local9.anInt3419 = arg2;
		local9.anInt3409 = arg3;
	}
}
