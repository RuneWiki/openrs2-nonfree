import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "Lclient!kaa;")
	public static Class168 aClass168_10;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	public static int anInt8339;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIII)V")
	public static void method6768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static401.method5861(arg0, 4);
		local8.method2582();
		local8.anInt2944 = arg2;
		local8.anInt2942 = arg1;
		local8.anInt2947 = arg3;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
	public static void method6772() {
		Static441.method6276(false);
		if (Static378.anInt6664 >= 0 && Static378.anInt6664 != 0) {
			Static293.method4707(Static378.anInt6664);
			Static378.anInt6664 = -1;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
	public static void method6773() {
		Static180.anIntArray220 = null;
		Static253.aBoolean348 = false;
		Static305.anIntArray53 = null;
		Static461.anIntArray580 = null;
		Static27.anIntArray40 = null;
		Static133.anIntArray179 = null;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!bl;")
	public static Class33 method6774(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class33 local8;
		try {
			local8 = (Class33) Class.forName("Class33_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class33_Sub2();
		}
		local8.aString35 = arg0;
		local8.anInt4735 = arg1;
		return local8;
	}
}
