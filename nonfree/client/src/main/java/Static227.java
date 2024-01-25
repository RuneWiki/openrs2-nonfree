import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!is", name = "Y", descriptor = "Lclient!mo;")
	public static final Class221 aClass221_10 = new Class221(16);

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(B)V")
	public static void method3700() {
		for (@Pc(17) Class4_Sub6_Sub9 local17 = (Class4_Sub6_Sub9) Static247.aClass22_27.method895(); local17 != null; local17 = (Class4_Sub6_Sub9) Static247.aClass22_27.method889()) {
			@Pc(22) Class21_Sub1_Sub1_Sub2 local22 = local17.aClass21_Sub1_Sub1_Sub2_1;
			if (local22.aBoolean316) {
				local17.method8193();
				local22.method3677();
			} else if (Static306.anInt6122 >= local22.anInt4736) {
				local22.method3673(Static92.anInt8628);
				if (local22.aBoolean316) {
					local17.method8193();
				} else {
					Static542.method7597(local22, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(II)Lclient!ej;")
	public static Class21_Sub4 method3708(@OriginalArg(1) int arg0) {
		@Pc(7) Class158[] local7 = client.aClass158Array1;
		synchronized (client.aClass158Array1) {
			@Pc(32) Class21_Sub4 local32;
			if (client.aClass158Array1.length <= arg0 || client.aClass158Array1[arg0].method3718()) {
				local32 = new Class21_Sub4();
				local32.aClass21_Sub7Array1 = new Class21_Sub7[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass21_Sub7Array1[local38] = new Class21_Sub7();
				}
			} else {
				local32 = (Class21_Sub4) client.aClass158Array1[arg0].method3722();
				local32.method8246();
				@Pc(71) int local71 = Static121.anIntArray128[arg0]--;
			}
			return local32;
		}
	}
}
