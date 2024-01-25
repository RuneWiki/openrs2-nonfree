import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
	public static int anInt6709;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "[[Lclient!ts;")
	public static Class239[][] aClass239ArrayArray2;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!ts;")
	public static Class239 aClass239_11 = null;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_134 = new Class92(59, 4);

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "[Lclient!rq;")
	public static final Class216[] aClass216Array1 = new Class216[2048];

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_135 = new Class92(56, 7);

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZC)I")
	public static int method5585(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZ)V")
	public static void method5589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class6_Sub2_Sub7 local15 = Static212.method3218(arg1, 1);
		local15.method3088();
		local15.anInt3749 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	public static void method5590() {
		@Pc(5) Class44 local5 = Static79.aClass44_6;
		synchronized (Static79.aClass44_6) {
			Static79.aClass44_6.method1348();
		}
		local5 = Static415.aClass44_53;
		synchronized (Static415.aClass44_53) {
			Static415.aClass44_53.method1348();
		}
	}
}
