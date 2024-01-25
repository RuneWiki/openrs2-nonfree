import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!en", name = "c", descriptor = "Lclient!sea;")
	public static Class308 aClass308_49;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	public static int anInt2518;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!ni;Lclient!lh;)Lclient!ba;")
	public static Class1_Sub9 method2194(@OriginalArg(1) Class235 arg0, @OriginalArg(2) Class208 arg1) {
		@Pc(8) Class1_Sub9 local8 = Static184.method2976();
		local8.anInt634 = arg1.anInt5341;
		local8.aClass208_12 = arg1;
		if (local8.anInt634 == -1) {
			local8.aClass1_Sub3_Sub1_1 = new Class1_Sub3_Sub1(260);
		} else if (local8.anInt634 == -2) {
			local8.aClass1_Sub3_Sub1_1 = new Class1_Sub3_Sub1(10000);
		} else if (local8.anInt634 <= 18) {
			local8.aClass1_Sub3_Sub1_1 = new Class1_Sub3_Sub1(20);
		} else if (local8.anInt634 <= 98) {
			local8.aClass1_Sub3_Sub1_1 = new Class1_Sub3_Sub1(100);
		} else {
			local8.aClass1_Sub3_Sub1_1 = new Class1_Sub3_Sub1(260);
		}
		local8.aClass1_Sub3_Sub1_1.method4991(arg0);
		local8.aClass1_Sub3_Sub1_1.method4990(local8.aClass208_12.method4400());
		local8.anInt633 = 0;
		return local8;
	}
}
