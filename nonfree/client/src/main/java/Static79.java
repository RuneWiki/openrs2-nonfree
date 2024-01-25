import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!ui;")
	public static Class230 aClass230_28;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "Lclient!iu;")
	public static Class112 aClass112_2;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_29 = new Class211(104, 4);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILclient!ui;)Lclient!is;")
	public static Class110 method1198(@OriginalArg(1) int arg0, @OriginalArg(2) Class230 arg1) {
		@Pc(13) byte[] local13 = arg1.method4961(arg0);
		return local13 == null ? null : new Class110(local13);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!je;)Z")
	public static boolean method1203(@OriginalArg(1) Class117 arg0) {
		if (arg0.anInt3064 == Static307.anInt5746) {
			Static186.anInt3265 = 250;
			return true;
		} else {
			return false;
		}
	}
}
