import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "[Lclient!fa;")
	public static Class23[] aClass23Array2;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_2;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!sa;")
	public static Class72 aClass72_13 = new Class72(50);

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "[[S")
	public static short[][] aShortArrayArray36 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "[I")
	public static int[] anIntArray144 = new int[1000];

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "Lclient!cd;")
	public static Class10 aClass10_577 = Static51.method932("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "Lclient!cd;")
	public static Class10 aClass10_578 = Static51.method932(":chalreq:");

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
	public static int anInt1254 = 0;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	public static void method957() {
		aClass2_Sub1_Sub4_Sub3_2 = null;
		aClass72_13 = null;
		aClass10_578 = null;
		aShortArrayArray36 = null;
		aClass10_577 = null;
		aClass23Array2 = null;
		anIntArray144 = null;
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	public static void method958() {
		for (@Pc(3) int local3 = 0; local3 < Static97.anInt2273; local3++) {
			@Pc(9) int local9 = Static142.anIntArray334[local3];
			@Pc(13) Class2_Sub1_Sub3_Sub2_Sub1 local13 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local9];
			@Pc(17) int local17 = Static75.aClass2_Sub11_Sub1_1.method1461();
			if ((local17 & 0x10) != 0) {
				local17 += Static75.aClass2_Sub11_Sub1_1.method1461() << 8;
			}
			Static47.method882(local13, local9, local17);
		}
	}
}
