import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jha", name = "o", descriptor = "Lclient!kt;")
	public static final Class178 aClass178_6 = new Class178(1);

	@OriginalMember(owner = "client!jha", name = "s", descriptor = "I")
	public static int anInt5776 = -1;

	@OriginalMember(owner = "client!jha", name = "t", descriptor = "I")
	public static int anInt5777 = -1;

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(I)V")
	public static void method4833() {
		for (@Pc(3) int local3 = 0; local3 < Static123.anInt3102; local3++) {
			@Pc(15) int local15 = Static364.method5868(local3 + Static471.anInt5158, Static123.anInt3102) * Static354.anInt6877;
			for (@Pc(17) int local17 = 0; local17 < Static354.anInt6877; local17++) {
				@Pc(28) int local28 = local15 + Static364.method5868(Static309.anInt6228 + local17, Static354.anInt6877);
				if (Static409.anInt7607 == Static326.anIntArray304[local28]) {
					Static320.anInterface20Array1[local28].method8480(0, 0, Static361.anInt6971, Static633.anInt10652, Static361.anInt6971 * local17, local3 * Static633.anInt10652);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)Z")
	public static boolean method4834(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIB)Z")
	public static boolean method4837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
