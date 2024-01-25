import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_66 = new Class140(64);

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	public static int anInt2361 = -1;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_67 = new Class140(4);

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString98 = "Loading world list data";

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!eb;I)Lclient!jb;")
	public static Class10_Sub2 method2172(@OriginalArg(0) Class1_Sub7 arg0) {
		return new Class10_Sub2(arg0.method3090(), arg0.method3090(), arg0.method3090(), arg0.method3090(), arg0.method3137(), arg0.method3137(), arg0.method3141());
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)Lclient!rh;")
	public static Class1_Sub1_Sub17 method2174(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub17 local10 = (Class1_Sub1_Sub17) Static285.aClass156_12.method4258((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = Static88.aClass165_31.method4508(arg0, 1);
		} else {
			local25 = Static87.aClass165_29.method4508(arg0 & 0x7FFF, 1);
		}
		local10 = new Class1_Sub1_Sub17();
		if (local25 != null) {
			local10.method4713(new Class1_Sub7(local25));
		}
		if (arg0 >= 32768) {
			local10.method4724();
		}
		Static285.aClass156_12.method4256(local10, (long) arg0);
		return local10;
	}
}
