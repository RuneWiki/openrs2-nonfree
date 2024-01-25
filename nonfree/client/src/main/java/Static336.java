import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray2;

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "Lclient!bs;")
	public static final Class37 aClass37_4 = new Class37("runescape", 0);

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
	public static void method5245() {
		Static560.anInt9247 = 1;
		Static193.anInt9352 = -1;
		if (Static70.aString27 == null) {
			Static305.method1149(35);
		} else {
			@Pc(28) Class6_Sub21 local28 = new Class6_Sub21(Static185.method3398(Static418.method5986(Static70.aString27)));
			@Pc(32) long local32 = local28.method6018();
			Static583.aLong261 = local28.method6018();
			Static17.method406(Static404.method5929(local32), "", true);
		}
	}
}
