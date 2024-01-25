import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "Lclient!g;")
	public static Class127 aClass127_8;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString72;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)Lclient!eo;")
	public static Class106 method6487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class106 local15 = new Class106();
		local15.anInt3007 = -1;
		local15.anInt3014 = arg0 + 6;
		local15.anInt3006 = -1;
		local15.anInt3004 = arg1 + 1 + 5;
		local15.anIntArrayArray8 = new int[local15.anInt3004][local15.anInt3014];
		local15.method2663();
		return local15;
	}
}
