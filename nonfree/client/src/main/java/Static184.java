import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "Lclient!hd;")
	public static final Class145 aClass145_7 = new Class145(1);

	@OriginalMember(owner = "client!fla", name = "v", descriptor = "J")
	public static long aLong116 = 0L;

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(I)V")
	public static void method2803() {
		@Pc(10) Class3_Sub53 local10;
		for (local10 = (Class3_Sub53) Static423.aClass357_43.method8391(); local10 != null; local10 = (Class3_Sub53) Static423.aClass357_43.method8392()) {
			if (local10.aBoolean745) {
				local10.method9446();
			} else {
				local10.aBoolean746 = true;
				if (local10.anInt10319 >= 0 && local10.anInt10317 >= 0 && local10.anInt10319 < Static362.anInt8653 && local10.anInt10317 < Static206.anInt11291) {
					Static191.method2895(local10);
				}
			}
		}
		for (local10 = (Class3_Sub53) Static3.aClass357_1.method8391(); local10 != null; local10 = (Class3_Sub53) Static3.aClass357_1.method8392()) {
			if (local10.aBoolean745) {
				local10.method9446();
			} else {
				local10.aBoolean746 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(IIB)V")
	public static void method2809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(6, (long) arg0);
		local9.method630();
		local9.anInt803 = arg1;
	}
}
