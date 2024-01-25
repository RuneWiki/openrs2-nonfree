import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
	public static int anInt8404;

	@OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
	public static int anInt8411;

	@OriginalMember(owner = "client!qga", name = "j", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_9 = new Class6(9, 2);

	@OriginalMember(owner = "client!qga", name = "l", descriptor = "[I")
	public static final int[] anIntArray552 = new int[2];

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZZ)V")
	public static void method7120(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) Class2_Sub24 local10 = Static628.method9105(arg0, arg1);
		if (local10 != null) {
			for (@Pc(19) int local19 = 0; local19 < local10.anIntArray263.length; local19++) {
				local10.anIntArray263[local19] = -1;
				local10.anIntArray264[local19] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)V")
	public static void method7121() {
		Static185.method3872();
		Static487.aBoolean676 = false;
	}
}
