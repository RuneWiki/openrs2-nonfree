import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
	public static int anInt2784;

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
	public static int anInt2793;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "Lclient!as;")
	public static Class16 aClass16_3;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
	public static int anInt2794;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "Lclient!kc;")
	public static Class130 aClass130_4;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)I")
	public static int method2292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public static void method2293() {
		if (Static66.aClass164_2.method5328()) {
			Static88.method1338();
			Static66.aClass164_2.method5322(Static177.aCanvas3);
			Static262.method5507();
		} else {
			Static75.method1176(Static25.anInt394);
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	public static void method2294() {
		@Pc(15) int local15 = Static331.anInt5548;
		@Pc(17) int[] local17 = Static345.anIntArray681;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(27) Class25_Sub1_Sub1_Sub1 local27 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local17[local19]];
			if (local27 != null) {
				Static268.method4137(local27.method1877(), local27);
			}
		}
	}
}
