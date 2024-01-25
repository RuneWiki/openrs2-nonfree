import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!wn", name = "sc", descriptor = "I")
	public static int anInt6967 = 0;

	@OriginalMember(owner = "client!wn", name = "Ic", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_226 = new Class221(104, 0);

	@OriginalMember(owner = "client!wn", name = "Nc", descriptor = "I")
	public static int anInt6987 = 0;

	@OriginalMember(owner = "client!wn", name = "Oc", descriptor = "Lclient!jg;")
	public static Class107 aClass107_60 = new Class107(64);

	@OriginalMember(owner = "client!wn", name = "Pc", descriptor = "I")
	public static int anInt6988 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!iq;Lclient!iq;)V")
	public static void method5789(@OriginalArg(1) Class104 arg0, @OriginalArg(2) Class104 arg1) {
		Static6.aClass104_1 = arg0;
		Static272.aClass104_121 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!ve;")
	public static Class25 method5792(@OriginalArg(0) Component arg0) {
		return new Class25_Sub1(arg0);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)Lclient!fi;")
	public static Class2_Sub9_Sub5 method5798(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub9_Sub5 local10 = (Class2_Sub9_Sub5) Static294.aClass107_45.method3021((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static18.aClass104_13.method2756(26, arg0);
		local10 = new Class2_Sub9_Sub5();
		if (local20 != null) {
			local10.method1888(new Class2_Sub12(local20));
		}
		Static294.aClass107_45.method3018((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "()V")
	public static void method5799() {
		Static43.method2355(Static32.anInt516);
	}
}
