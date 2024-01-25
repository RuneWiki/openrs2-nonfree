import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!np", name = "s", descriptor = "[I")
	public static int[] anIntArray815;

	@OriginalMember(owner = "client!np", name = "A", descriptor = "I")
	public static int anInt4181;

	@OriginalMember(owner = "client!np", name = "K", descriptor = "I")
	public static int anInt4191;

	@OriginalMember(owner = "client!np", name = "L", descriptor = "I")
	public static int anInt4192;

	@OriginalMember(owner = "client!np", name = "N", descriptor = "I")
	public static int anInt4194;

	@OriginalMember(owner = "client!np", name = "z", descriptor = "Lclient!wk;")
	public static final Class246 aClass246_23 = new Class246(16);

	@OriginalMember(owner = "client!np", name = "M", descriptor = "I")
	public static int anInt4193 = 100;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!nl;Lclient!nl;I)I")
	public static int method3812(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class171 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method3739(Static255.anInt4502)) {
			local5++;
		}
		if (arg1.method3739(Static208.anInt3820)) {
			local5++;
		}
		if (arg1.method3739(Static185.anInt3487)) {
			local5++;
		}
		if (arg0.method3739(Static255.anInt4502)) {
			local5++;
		}
		if (arg0.method3739(Static208.anInt3820)) {
			local5++;
		}
		if (arg0.method3739(Static185.anInt3487)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
	public static void method3813() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static88.aBooleanArray12[local3] = false;
		}
		Static79.anInt4624 = 1;
		Static334.anInt5726 = -1;
		Class2_Sub4_Sub22.lb = -1;
		Static111.anInt2355 = 0;
		Static131.anInt2701 = 0;
	}
}
