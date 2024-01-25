import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!ta;")
	public static Class59 aClass59_4;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	public static int anInt8840 = 0;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[100];

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Z")
	public static boolean aBoolean659 = false;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public static int anInt8842 = -1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method7260(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg0, 3);
		local8.method6211();
		local8.aString61 = arg1;
	}
}
