import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "[I")
	public static int[] anIntArray890;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "[I")
	public static int[] anIntArray891;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "[I")
	public static final int[] anIntArray889 = new int[14];

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_67 = new Class32("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "J")
	public static long aLong152 = -1L;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_71 = new Class11(30, -1);

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!tq;ILjava/awt/Canvas;)Lclient!vc;")
	public static Class63 method4041(@OriginalArg(1) Interface9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class63_Sub1(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILclient!em;)V")
	public static void method4045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub3 arg3) {
		@Pc(4) Class251 local4 = Static377.method4610(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub3_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!vh;)V")
	public static void method4051(@OriginalArg(1) Class2_Sub16_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static299.anInt5124; local3++) {
			@Pc(9) int local9 = Static294.anIntArray1002[local3];
			@Pc(13) Class1_Sub5_Sub1_Sub1 local13 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local9];
			@Pc(17) int local17 = arg0.method5350();
			if ((local17 & 0x40) != 0) {
				local17 += arg0.method5350() << 8;
			}
			Static4.method94(local13, local17, arg0, local9);
		}
	}
}
