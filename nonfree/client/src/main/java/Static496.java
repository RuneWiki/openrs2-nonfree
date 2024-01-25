import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_90 = new Class46(13, 7);

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "Z")
	public static boolean aBoolean638 = false;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!ofa;I)Lclient!eba;")
	public static Class85 method7419(@OriginalArg(0) Class5_Sub22 arg0) {
		@Pc(7) Class85 local7 = new Class85();
		local7.anInt2153 = arg0.method5968();
		local7.aClass5_Sub5_Sub13_1 = Static474.aClass66_2.method1367(local7.anInt2153);
		return local7;
	}
}
