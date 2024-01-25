import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "[Lclient!so;")
	public static Class124_Sub1[] aClass124_Sub1Array2;

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "Lclient!bg;")
	public static Class25_Sub1_Sub1_Sub1 aClass25_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_140 = new Class211(74, 6);

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
	public static int anInt5435 = 500;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
	public static int anInt5438 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
	public static int method4704() {
		return 2;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZI)V")
	public static void method4705(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub37 local8 = Static367.method5078(arg0, arg1);
		if (local8 != null) {
			local8.method5577();
		}
	}
}
