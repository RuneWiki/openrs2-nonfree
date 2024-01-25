import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)V")
	public static void method325(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(6, arg0);
		local8.method3062();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method328() {
		return Static325.aBoolean431 || Static268.aClass4_Sub18_2 == null ? "" : Static268.aClass4_Sub18_2.aString27;
	}
}
