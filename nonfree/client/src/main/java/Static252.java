import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!po", name = "p", descriptor = "I")
	public static int anInt4998;

	@OriginalMember(owner = "client!po", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!po", name = "z", descriptor = "I")
	public static int anInt5004;

	@OriginalMember(owner = "client!po", name = "v", descriptor = "[I")
	public static final int[] anIntArray487 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!po", name = "y", descriptor = "Lclient!tn;")
	public static final Class190 aClass190_28 = new Class190(8);

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(II)Lclient!wk;")
	public static Class215 method4463(@OriginalArg(0) int arg0) {
		@Pc(10) Class215 local10 = (Class215) Static289.aClass109_52.method2857((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static284.aClass93_110.method2410(arg0, 36);
		local10 = new Class215();
		local10.anInt6765 = arg0;
		if (local28 != null) {
			local10.method5993(new Class5_Sub12(local28));
		}
		local10.method5991();
		Static289.aClass109_52.method2855((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!ij;Lclient!ij;I)V")
	public static void method4464(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1) {
		Static284.aClass93_110 = arg1;
		Static34.aClass93_12 = arg0;
		Static284.aClass93_110.method2418(36);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!rg;B)Lclient!wr;")
	public static Class7_Sub4 method4466(@OriginalArg(0) Class5_Sub12 arg0) {
		return new Class7_Sub4(arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5072(), arg0.method5115());
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method4467(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static247.method4421(arg1, 0, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)[Lclient!ip;")
	public static Class96[] method4468() {
		if (Static86.aClass96Array1 == null) {
			@Pc(5) Class96[] local5 = Static301.method5302(Static182.aClass139_5);
			@Pc(9) Class96[] local9 = new Class96[local5.length];
			@Pc(11) int local11 = 0;
			@Pc(57) int local57;
			@Pc(62) Class96 local62;
			label63: for (@Pc(13) int local13 = 0; local13 < local5.length; local13++) {
				@Pc(18) Class96 local18 = local5[local13];
				if ((local18.anInt2731 <= 0 || local18.anInt2731 >= 24) && local18.anInt2728 >= 800 && local18.anInt2734 >= 600 && (Static345.anInt6645 >= 96 || Static342.anInt6605 != 0 || local18.anInt2728 <= 1024 && local18.anInt2734 <= 768)) {
					for (local57 = 0; local57 < local11; local57++) {
						local62 = local9[local57];
						if (local18.anInt2728 == local62.anInt2728 && local18.anInt2734 == local62.anInt2734) {
							if (local62.anInt2731 < local18.anInt2731) {
								local9[local57] = local18;
							}
							continue label63;
						}
					}
					local9[local11] = local18;
					local11++;
				}
			}
			Static86.aClass96Array1 = new Class96[local11];
			Static368.method5427(local9, 0, Static86.aClass96Array1, 0, local11);
			@Pc(125) int[] local125 = new int[Static86.aClass96Array1.length];
			for (local57 = 0; local57 < Static86.aClass96Array1.length; local57++) {
				local62 = Static86.aClass96Array1[local57];
				local125[local57] = local62.anInt2728 * local62.anInt2734;
			}
			Static199.method3521(Static86.aClass96Array1, local125);
		}
		return Static86.aClass96Array1;
	}
}
