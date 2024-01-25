import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!po", name = "r", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!po", name = "A", descriptor = "Lclient!ma;")
	public static Class210 aClass210_1;

	@OriginalMember(owner = "client!po", name = "B", descriptor = "[Lclient!wj;")
	public static Class372[] aClass372Array1;

	@OriginalMember(owner = "client!po", name = "y", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_37 = new Class233(8);

	@OriginalMember(owner = "client!po", name = "z", descriptor = "I")
	public static int anInt7801 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIILclient!wr;Lclient!wr;)V")
	public static void method6539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1_Sub2 arg3, @OriginalArg(4) Class11_Sub1_Sub2 arg4) {
		@Pc(4) Class217 local4 = Static334.method5171(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass11_Sub1_Sub2_1 = arg3;
		local4.aClass11_Sub1_Sub2_2 = arg4;
		@Pc(19) int local19 = Static331.aClass112Array3 == Static164.aClass112Array1 ? 1 : 0;
		if (!arg3.method8306()) {
			Static483.aClass11_Sub1ArrayArray3[local19][Static429.anIntArray527[local19]++] = arg3;
		} else if (arg3.method8310()) {
			Static146.aClass11_Sub1ArrayArray1[local19][Static442.anIntArray535[local19]++] = arg3;
		} else {
			Static317.aClass11_Sub1ArrayArray2[local19][Static336.anIntArray411[local19]++] = arg3;
			Static445.aBoolean594 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8306()) {
			if (arg4.method8310()) {
				Static146.aClass11_Sub1ArrayArray1[local19][Static442.anIntArray535[local19]++] = arg4;
				return;
			}
			Static317.aClass11_Sub1ArrayArray2[local19][Static336.anIntArray411[local19]++] = arg4;
			Static445.aBoolean594 = true;
			return;
		}
		Static483.aClass11_Sub1ArrayArray3[local19][Static429.anIntArray527[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(III)Z")
	public static boolean method6540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static407.method6262(arg0, arg1) | Static191.method5132(arg0, arg1) | Static37.method811(arg1, arg0)) & Static504.method7816(arg0, arg1);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZZ)V")
	public static void method6541(@OriginalArg(0) boolean arg0) {
		Static316.aClass6_24.method6695(Static167.aClass87_3.method7951());
		@Pc(10) int[] local10 = Static167.aClass87_3.Y();
		Static194.anInt4181 = local10[0];
		Static566.anInt2120 = local10[1];
		Static220.anInt4574 = local10[2];
		Static205.anInt4328 = local10[3];
		if (arg0) {
			Static167.aClass87_3.DA(Static283.anInt5362, Static456.anInt7968, Static323.anInt5853, Static399.anInt7127);
			Static627.method8471(Static463.aDouble21);
		} else {
			Static167.aClass87_3.DA(Static98.anInt1918, Static569.anInt9376, Static475.anInt8806, Static195.anInt9462);
			Static627.method8471(Static617.aDouble24);
		}
	}
}
