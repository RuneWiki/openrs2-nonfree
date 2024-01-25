import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "Lclient!im;")
	public static final Class140 aClass140_70 = new Class140(8, 3);

	@OriginalMember(owner = "client!jv", name = "E", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[100];

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)V")
	public static void method4129() {
		if (Static254.aBoolean350) {
			return;
		}
		Static282.aBoolean555 = true;
		if (Static544.aClass1_Sub22_Sub1_1.aBoolean389) {
			Static404.aFloat156 = (int) Static404.aFloat156 + 191 & 0xFFFFFF80;
		} else {
			Static71.aFloat15 += (24.0F - Static71.aFloat15) / 2.0F;
		}
		Static254.aBoolean350 = true;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method4130(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static178.method2663(local18) : local18;
		} else if (arg0 instanceof Class233) {
			@Pc(32) Class233 local32 = (Class233) arg0;
			return local32.method5445();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
