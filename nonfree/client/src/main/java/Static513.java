import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!nd;")
	public static Class238 aClass238_243;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Lclient!hb;")
	public static Class139 aClass139_7;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!s", name = "m", descriptor = "I")
	public static int anInt8649 = 100;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray105 = new int[6][];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B[[I)V")
	public static void method7443(@OriginalArg(1) int[][] arg0) {
		Static349.anIntArrayArray71 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
	public static void method7449() {
		@Pc(3) int local3;
		if (Static146.aClass62Array1 != null) {
			for (local3 = 0; local3 < Static608.anInt10054; local3++) {
				Static146.aClass62Array1[local3] = null;
			}
			Static146.aClass62Array1 = null;
		}
		if (Static566.aClass62Array4 != null) {
			for (local3 = 0; local3 < Static116.anInt2476; local3++) {
				Static566.aClass62Array4[local3] = null;
			}
			Static566.aClass62Array4 = null;
		}
		if (Static526.aClass62Array3 != null) {
			for (local3 = 0; local3 < Static397.anInt6835; local3++) {
				Static526.aClass62Array3[local3] = null;
			}
			Static526.aClass62Array3 = null;
		}
		Static167.anIntArrayArrayArray8 = null;
		Static179.anInt3584 = -1;
		Static317.anInt5596 = -1;
		Static649.anIntArray744 = null;
		Static342.aClass62Array2 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZI)Lclient!nd;")
	public static Class238 method7452(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class349 local5 = null;
		if (Static267.aClass204_3 != null) {
			local5 = new Class349(arg2, Static267.aClass204_3, Static131.aClass204Array1[arg2], 1000000);
		}
		Static59.aClass87_Sub1Array4[arg2] = Static93.aClass89_1.method2196(local5, Static358.aClass349_4, arg2);
		Static59.aClass87_Sub1Array4[arg2].method5184();
		return new Class238(Static59.aClass87_Sub1Array4[arg2], arg1, arg0);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Lclient!wf;")
	public static Class362_Sub1 method7454() {
		Static339.anInt5965 = 0;
		return Static516.method7305();
	}
}
