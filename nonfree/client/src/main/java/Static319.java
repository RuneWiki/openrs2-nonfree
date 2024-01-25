import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!mf", name = "H", descriptor = "[Lclient!in;")
	public static Class160[] aClass160Array2;

	@OriginalMember(owner = "client!mf", name = "O", descriptor = "[[Lclient!vv;")
	public static Class11_Sub1[][] aClass11_Sub1ArrayArray3;

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "Lclient!sea;")
	public static Class308 aClass308_113;

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "Lclient!ar;")
	public static final Class16 aClass16_3 = new Class16(128);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!hb;)V")
	public static void method4771(@OriginalArg(1) Class11_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(16) Class1_Sub4 local16 = (Class1_Sub4) Static60.aClass91_3.method2271((long) arg0.anInt7524);
		if (local16 == null) {
			Static224.method3330(null, arg0.anIntArray455[0], arg0, null, arg0.anIntArray454[0], 0, arg0.aByte113);
		} else {
			local16.method210();
		}
	}
}
