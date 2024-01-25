import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
	public static int anInt687;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_14 = new Class2(18, 8);

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!sl;")
	public static final Class229 aClass229_1 = new Class229("", 15);

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method570() {
		Static89.anInt1837 = -1;
		Static57.anInt986 = 0;
		Static153.anInt5631 = -1;
		Static355.anInt3620 = -1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
	public static void method572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class7_Sub4_Sub14 local10 = Static54.method750(arg0, 7);
		local10.method4716();
		local10.anInt5868 = arg1;
	}
}
