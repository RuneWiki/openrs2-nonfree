import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	public static int anInt157;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public static int anInt152 = 0;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public static int anInt154 = 0;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
	public static int anInt156 = 0;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
	public static int anInt159 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
	public static void method212() {
		for (@Pc(1) int local1 = 0; local1 < Static346.anInt6897; local1++) {
			@Pc(6) Class62_Sub1 local6 = Static355.aClass62_Sub1Array3[local1];
			Static28.method752(local6);
			Static355.aClass62_Sub1Array3[local1] = null;
		}
		Static346.anInt6897 = 0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!tq;Lclient!tq;IBZ)V")
	public static void method214(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2) {
		Static110.aClass191_72 = arg1;
		Static130.anInt4899 = arg2;
		Static125.aBoolean236 = true;
		Static94.aClass191_61 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	public static void method215(@OriginalArg(1) int arg0) {
		Static133.anInt2775 = arg0;
		Static122.aClass119_139.method3304();
	}
}
