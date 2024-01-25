import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_45 = new Class200(63, 6);

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
	public static final int anInt3578 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!ip;)V")
	public static void method3213(@OriginalArg(1) Class3_Sub4_Sub13 arg0) {
		if (arg0 == null) {
			return;
		}
		Static464.aClass223_49.method5868(arg0);
		Static160.anInt3142++;
		@Pc(43) Class3_Sub4_Sub1 local43;
		if (arg0.aBoolean308 || "".equals(arg0.aString55)) {
			local43 = new Class3_Sub4_Sub1(arg0.aString55);
			Static157.anInt3113++;
		} else {
			@Pc(37) long local37 = arg0.aLong135;
			for (local43 = (Class3_Sub4_Sub1) Static458.aClass280_34.method7107(local37); local43 != null && !local43.aString2.equals(arg0.aString55); local43 = (Class3_Sub4_Sub1) Static458.aClass280_34.method7105()) {
			}
			if (local43 == null) {
				local43 = (Class3_Sub4_Sub1) Static209.aClass102_25.method2677(local37);
				if (local43 != null && !local43.aString2.equals(arg0.aString55)) {
					local43 = null;
				}
				if (local43 == null) {
					local43 = new Class3_Sub4_Sub1(arg0.aString55);
				}
				Static458.aClass280_34.method7109(local43, local37);
				Static157.anInt3113++;
			}
		}
		if (local43.method895(arg0)) {
			Static280.method4535(local43);
		}
	}
}
