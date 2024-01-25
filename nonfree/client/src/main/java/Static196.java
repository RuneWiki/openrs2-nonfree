import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Lclient!rk;")
	public static Class180 aClass180_52;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Z")
	public static boolean aBoolean299 = true;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Z")
	public static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!fi;")
	public static final Class74 aClass74_30 = new Class74();

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public static int anInt3868 = 0;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V")
	public static void method3494() {
		@Pc(1) Class103 local1 = Static283.aClass103_59;
		synchronized (Static283.aClass103_59) {
			Static283.aClass103_59.method2678();
		}
		local1 = Static41.aClass103_12;
		synchronized (Static41.aClass103_12) {
			Static41.aClass103_12.method2678();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/lang/Object;Z)[B")
	public static byte[] method3495(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static165.method3170(local18) : local18;
		} else if (arg0 instanceof Class189) {
			@Pc(32) Class189 local32 = (Class189) arg0;
			return local32.method4857();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
