import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
	public static int anInt6016;

	@OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
	public static int anInt6019;

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "Lclient!qg;")
	public static Class131 aClass131_26 = new Class131();

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
	public static int anInt6015 = 0;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)Lclient!bh;")
	public static Class19 method4663(@OriginalArg(1) int arg0) {
		@Pc(6) Class19 local6 = (Class19) Static153.aClass155_30.method4358((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = Static295.aClass83_101.method2306(3, arg0);
		local6 = new Class19();
		if (local22 != null) {
			local6.method386(new Class1_Sub16(local22));
		}
		Static153.aClass155_30.method4360((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B[Lclient!n;Lclient!kb;)V")
	public static void method4665(@OriginalArg(1) Class1_Sub2_Sub14_Sub1[] arg0, @OriginalArg(2) Class83 arg1) {
		Static112.aClass83_72 = arg1;
		Static3.aClass1_Sub2_Sub14_Sub1Array1 = arg0;
		Static88.aBooleanArray10 = new boolean[Static3.aClass1_Sub2_Sub14_Sub1Array1.length];
		Static146.aClass117_11.method3440();
		@Pc(26) int local26 = Static112.aClass83_72.method2322("details");
		@Pc(31) int[] local31 = Static112.aClass83_72.method2326(local26);
		for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
			Static146.aClass117_11.method3445(Static8.method3514(local31[local33], new Class1_Sub16(Static112.aClass83_72.method2306(local26, local31[local33]))), (long) local31[local33]);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Z")
	public static boolean method4666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static218.aBoolean267) {
			return false;
		}
		@Pc(14) int local14 = arg1 >> 16;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		if (Static81.aClass116ArrayArray1[local14] == null || Static81.aClass116ArrayArray1[local14][local23] == null) {
			return false;
		}
		@Pc(44) Class116 local44 = Static81.aClass116ArrayArray1[local14][local23];
		@Pc(56) int local56;
		if (arg0 == -1 && local44.anInt4376 == 0) {
			for (local56 = 0; local56 < Static111.anInt2398; local56++) {
				if (Static213.aShortArray71[local56] == 19 || Static213.aShortArray71[local56] == 1006 || Static213.aShortArray71[local56] == 59 || Static213.aShortArray71[local56] == 2 || Static213.aShortArray71[local56] == 31) {
					for (@Pc(159) Class116 local159 = Static115.method1897(Static52.anIntArray147[local56]); local159 != null; local159 = Static177.method3225(local159)) {
						if (local159.anInt4290 == local44.anInt4290) {
							return true;
						}
					}
				}
			}
		} else {
			for (local56 = 0; local56 < Static111.anInt2398; local56++) {
				if (arg0 == Static218.anIntArray494[local56] && local44.anInt4290 == Static52.anIntArray147[local56] && (Static213.aShortArray71[local56] == 19 || Static213.aShortArray71[local56] == 1006 || Static213.aShortArray71[local56] == 59 || Static213.aShortArray71[local56] == 2 || Static213.aShortArray71[local56] == 31)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)I")
	public static int method4667() {
		return 6;
	}
}
