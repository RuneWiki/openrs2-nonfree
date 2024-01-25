import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "Lclient!nl;")
	public static Class171 aClass171_41;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
	public static int anInt3177;

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_54 = new Class11(40, -1);

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_69 = new Class205(52, 12);

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_55 = new Class11(22, -1);

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_56 = new Class11(58, 7);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!vh;B)I")
	public static int method2919(@OriginalArg(0) Class2_Sub16_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method5380(2);
		@Pc(27) int local27;
		if (local15 == 0) {
			local27 = 0;
		} else if (local15 == 1) {
			local27 = arg0.method5380(5);
		} else if (local15 == 2) {
			local27 = arg0.method5380(8);
		} else {
			local27 = arg0.method5380(11);
		}
		return local27;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	public static void method2923() {
		Static141.aClass246_7.method5610();
	}
}
