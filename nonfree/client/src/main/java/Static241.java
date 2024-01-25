import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!kba", name = "F", descriptor = "I")
	public static int anInt4829 = 0;

	@OriginalMember(owner = "client!kba", name = "G", descriptor = "Lclient!im;")
	public static final Class140 aClass140_72 = new Class140(73, -1);

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)V")
	public static void method4170() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static170.aBooleanArray18[local3] = false;
		}
		Static385.anInt6976 = 0;
		Static259.anInt5038 = -1;
		Static127.anInt4399 = 0;
		Static448.anInt7701 = 1;
		Static54.anInt1079 = -1;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(III)Z")
	public static boolean method4171(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
