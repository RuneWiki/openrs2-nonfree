import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public static int anInt160;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!dn;")
	public static Class56 aClass56_5;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_7 = new Class92(67, -1);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public static void method160(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static139.method2522(9, arg0);
		local13.method1563();
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Lclient!lk;")
	public static Class145_Sub1 method161() {
		return Static279.aClass145_Sub1Array9.length > Static191.anInt3840 ? Static279.aClass145_Sub1Array9[Static191.anInt3840++] : null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB)V")
	public static void method162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class3_Sub3_Sub7 local16 = Static139.method2522(5, arg1);
		local16.method1570();
		local16.anInt1933 = arg0;
	}
}
