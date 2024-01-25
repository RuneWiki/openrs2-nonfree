import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "J")
	public static long aLong191;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4799(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub24 local10 = (Class3_Sub24) Static699.aClass136_50.method3503((long) arg0);
		if (local10 != null) {
			@Pc(19) Class3_Sub8_Sub1 local19 = local10.aClass78_Sub1_1.method2104();
			if (local19 != null) {
				@Pc(26) double local26 = local10.aClass78_Sub1_1.method2107();
				if (local26 >= (double) local19.method503() && local26 <= (double) local19.method502()) {
					return local19.method504();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method4800() {
		return Static555.aBoolean678 || Static693.aClass3_Sub4_Sub5_4 == null ? "" : Static693.aClass3_Sub4_Sub5_4.aString48;
	}
}
