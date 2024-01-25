import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[8];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIIBLjava/lang/String;)V")
	public static void method6572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) String arg6) {
		@Pc(15) Class28_Sub6 local15 = new Class28_Sub6();
		local15.aString61 = arg6;
		local15.anInt7470 = arg3;
		local15.anInt7469 = arg0;
		local15.anInt7471 = arg1;
		local15.anInt7468 = arg5 + Static26.anInt350;
		local15.anInt7467 = arg2;
		local15.anInt7465 = arg4;
		Static394.aClass156_4.method3774(local15);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)Z")
	public static boolean method6574() {
		return Static26.anInt352 != 0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	public static void method6575() {
		Static619.aBoolean858 = true;
	}
}
