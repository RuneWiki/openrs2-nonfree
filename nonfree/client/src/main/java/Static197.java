import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
	public static int anInt3553 = 0;

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "Lclient!dc;")
	public static final Class1_Sub9 aClass1_Sub9_1 = new Class1_Sub9(0, 0);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)I")
	public static int method3042() {
		return 2;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)V")
	public static void method3043(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static131.aClass137ArrayArrayArray2 = Static33.aClass137ArrayArrayArray1;
			Static256.aClass70Array2 = Static315.aClass70Array3;
		} else {
			Static131.aClass137ArrayArrayArray2 = Static346.aClass137ArrayArrayArray3;
			Static256.aClass70Array2 = Static60.aClass70Array1;
		}
		Static29.anInt482 = Static131.aClass137ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
	public static void method3044() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static204.aBooleanArray15[local3] = true;
		}
	}
}
