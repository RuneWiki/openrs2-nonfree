import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	public static int anInt6591;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "[Lclient!tn;")
	public static Class229[] aClass229Array1;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!hh;")
	public static Class109 aClass109_81;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method5152() {
		if (Static213.anInt3819 <= 0) {
			Static138.aString88 = "";
			return;
		}
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < Static71.aStringArray12.length; local10++) {
			if (Static71.aStringArray12[local10].startsWith("--> ")) {
				@Pc(21) int local21 = ~Static213.anInt3819;
				local8++;
				if (local21 == ~local8) {
					Static138.aString88 = Static71.aStringArray12[local10].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZBLclient!cp;ILclient!cp;I)I")
	public static int method5153(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class48_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class48_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static115.method1798(arg2, arg0, arg3, arg4);
		if (local10 != 0) {
			return arg0 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static115.method1798(arg2, arg1, arg5, arg4);
			return arg1 ? -local40 : local40;
		}
	}
}
