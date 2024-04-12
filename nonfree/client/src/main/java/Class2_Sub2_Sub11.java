import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "Lclient!o;")
	public static Class40 aClass40_330 = Static12.method257("@gre@World");

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "Lclient!o;")
	public static Class40 aClass40_331 = Static12.method257("Welcome to RuneScape");

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
	public static int anInt1075 = 0;

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Lclient!o;")
	public static Class40 aClass40_332 = Static12.method257("cross");

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
	public static int anInt1080 = 0;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	public static int anInt1077 = 0;

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "Lclient!o;")
	public static Class40 aClass40_334 = Static12.method257("shake:");

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "Lclient!o;")
	public static Class40 aClass40_333 = Static12.method257(" with)3)3)3");

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "Lclient!o;")
	public static Class40 aClass40_335 = Static12.method257("(U(Y");

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
	public int anInt1076 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!eb;Z)V", line = 57)
	public void method788(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1708();
			if (local5 == 0) {
				return;
			}
			this.method789(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!eb;II)V", line = 96)
	private void method789(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1076 = arg0.method1704();
		}
	}
}
