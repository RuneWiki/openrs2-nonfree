import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!ov", name = "P", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!ov", name = "Q", descriptor = "Lclient!qv;")
	public static Class214 aClass214_171;

	@OriginalMember(owner = "client!ov", name = "A", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_73 = new Class212(54, 3);

	@OriginalMember(owner = "client!ov", name = "M", descriptor = "I")
	public static int anInt5468 = 0;

	@OriginalMember(owner = "client!ov", name = "O", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_39 = new Class83(10);

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(IB)I")
	public static int method4544(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZLclient!sw;ZZ)V")
	public static void method4546(@OriginalArg(1) Class4_Sub39 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt6721;
		@Pc(12) int local12 = (int) arg0.aLong228;
		arg0.method6330();
		if (arg1) {
			Static106.method6188(local8);
		}
		Static110.method2181(local8);
		@Pc(27) Class240 local27 = Static92.method1820(local12);
		if (local27 != null) {
			Static273.method4374(local27);
		}
		Static13.method195();
		if (!arg2 && Static248.anInt4793 != -1) {
			Static132.method2437(Static248.anInt4793, 1);
		}
		@Pc(53) Class225 local53 = new Class225(Static157.aClass96_22);
		for (@Pc(62) Class4_Sub39 local62 = (Class4_Sub39) local53.method5163(); local62 != null; local62 = (Class4_Sub39) local53.method5165()) {
			if (!local62.method6325()) {
				local62 = (Class4_Sub39) local53.method5163();
				if (local62 == null) {
					return;
				}
			}
			if (local62.anInt6722 == 3) {
				@Pc(84) int local84 = (int) local62.aLong228;
				if (local84 >>> 16 == local8) {
					method4546(local62, true, arg2);
				}
			}
		}
	}
}
