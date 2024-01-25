import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!p", name = "g", descriptor = "Z")
	public static boolean aBoolean482;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!dn;")
	public static Class69 aClass69_72;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_100 = new Class45("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_335 = new Class305(95, 1);

	@OriginalMember(owner = "client!p", name = "e", descriptor = "F")
	public static float aFloat141 = 1.0F;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "I")
	public static int anInt6516 = -1;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IBIIIII)Lclient!mv;")
	public static Class103 method5868(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg0 * 76724863L ^ (long) arg2 * 986053L ^ (long) arg4 * 97549L ^ (long) arg3 * 67481L ^ (long) arg1 * 475427L ^ (long) arg5 * 32147369L;
		@Pc(39) Class103 local39 = (Class103) Static480.aClass277_65.method7014(local33);
		if (local39 == null) {
			local39 = Static247.aClass4_7.method7172(arg3, arg4, arg1, arg2, arg5, arg0);
			Static480.aClass277_65.method7016(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method5869() {
		for (@Pc(15) Class1_Sub37 local15 = (Class1_Sub37) Static307.aClass295_34.method7543(); local15 != null; local15 = (Class1_Sub37) Static307.aClass295_34.method7540()) {
			if (local15.aBoolean453) {
				local15.method5395();
			}
		}
		for (@Pc(37) Class1_Sub37 local37 = (Class1_Sub37) Static406.aClass295_44.method7543(); local37 != null; local37 = (Class1_Sub37) Static406.aClass295_44.method7540()) {
			if (local37.aBoolean453) {
				local37.method5395();
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!os;I)Lclient!vu;")
	public static Class22_Sub4 method5870(@OriginalArg(0) Class1_Sub17 arg0) {
		return new Class22_Sub4(arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4486(), arg0.method4486(), arg0.method4487());
	}
}
