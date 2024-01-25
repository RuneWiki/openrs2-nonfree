import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "[Lclient!f;")
	public static Class5[] aClass5Array18;

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
	public static int anInt8882;

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "Lclient!em;")
	public static final Class83 aClass83_190 = new Class83(114, -1);

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "[I")
	public static final int[] anIntArray544 = new int[8];

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "[I")
	public static final int[] anIntArray545 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
	public static int anInt8881 = 0;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!uea;")
	public static RuntimeException_Sub1 method7176(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString98 = local9.aString98 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZZI)V")
	public static void method7177(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub45 local8 = Static365.method5366(arg1, arg0);
		if (local8 != null) {
			local8.method7908();
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!sea;ILclient!fa;)V")
	public static void method7178(@OriginalArg(0) Class308 arg0, @OriginalArg(2) Interface9 arg1) {
		Static81.aClass308_32 = arg0;
		Static231.anInterface9_5 = arg1;
	}
}
