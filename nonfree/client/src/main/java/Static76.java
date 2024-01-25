import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_42 = new Class140(64);

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	public static int anInt1538 = 0;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString60 = "M";

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZI)I")
	public static int method1468(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub38 local12 = (Class1_Sub38) Static338.aClass26_33.method870((long) arg0);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local12.anIntArray763.length; local20++) {
			if (local12.anIntArray763[local20] >= 0 && Static279.anInt5425 > local12.anIntArray763[local20]) {
				@Pc(40) Class61 local40 = Static241.method4285(local12.anIntArray763[local20]);
				@Pc(51) int local51 = local40.method1732(arg2, Static305.method5149(arg2).anInt5480);
				if (arg1) {
					local18 += local51 * local12.anIntArray762[local20];
				} else {
					local18 += local51;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public static void method1469() {
		Static94.anInt1845 = -1;
		Static152.anInt3053 = -1;
		Static298.anInt5959 = 0;
	}
}
