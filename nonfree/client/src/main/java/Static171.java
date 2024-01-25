import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "Lclient!tp;")
	public static Class5_Sub49 aClass5_Sub49_1;

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString38 = null;

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_94 = new Class87(30);

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[100];

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_95 = new Class87(64);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIB)Z")
	public static boolean method2660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(25) boolean local25 = (arg0 & 0x37) == 0 ? Static532.method7864(arg1, arg0) : Static16.method230(arg0, arg1);
		return local25 | Static351.method5255(arg1, arg0) | (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method2662(@OriginalArg(0) Class133 arg0) {
		if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 != Static310.anInt5363 && (Static421.aClass217ArrayArrayArray5 != null && Static230.method3860(arg0, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132))) {
			Static310.anInt5363 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132;
		}
	}
}
