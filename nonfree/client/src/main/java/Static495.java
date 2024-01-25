import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_165 = new Class126(92, -1);

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BILjava/lang/String;)Lclient!gd;")
	public static Class46 method7039(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class46 local13;
		try {
			local13 = (Class46) Class.forName("Class46_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class46_Sub2();
		}
		local13.aString104 = arg1;
		local13.anInt7975 = arg0;
		return local13;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	public static void method7040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class3_Sub44 local20 = Static275.method5689(Static177.aClass376_49, Static540.aClass282_4);
		local20.aClass3_Sub17_Sub2_3.method4886(arg0);
		local20.aClass3_Sub17_Sub2_3.method4833(arg1);
		Static616.method8089(local20);
	}
}
