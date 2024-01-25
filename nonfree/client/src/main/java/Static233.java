import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
	public static int anInt4556;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
	public static int anInt4557;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	public static int anInt4558;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "[S")
	public static short[] aShortArray95;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "Lclient!mo;")
	public static Class143 aClass143_86;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "Lclient!mo;")
	public static Class143 aClass143_87;

	@OriginalMember(owner = "client!ol", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString171 = "white:";

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lclient!gn;")
	public static Class79 method4080(@OriginalArg(0) int arg0) {
		@Pc(5) Class11 local5 = Static277.aClass11_121;
		@Pc(19) Class79 local19;
		synchronized (Static277.aClass11_121) {
			local19 = (Class79) Static277.aClass11_121.method209((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(39) byte[] local39 = Static118.aClass143_58.method3745(Static272.method4618(arg0), Static14.method337(arg0));
		local19 = new Class79();
		local19.anInt2347 = arg0;
		if (local39 != null) {
			local19.method2294(new Class14_Sub4(local39));
		}
		local19.method2298();
		@Pc(60) Class11 local60 = Static277.aClass11_121;
		synchronized (Static277.aClass11_121) {
			Static277.aClass11_121.method219((long) arg0, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)I")
	public static int method4081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static135.anIntArray263[arg0 & 0x3] : Static312.anIntArray537[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)V")
	public static void method4087() {
		@Pc(5) Class11 local5 = Static189.aClass11_134;
		synchronized (Static189.aClass11_134) {
			Static189.aClass11_134.method215(5);
		}
	}
}
