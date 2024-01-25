import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
	public static int anInt7302 = 100;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_179 = new Class12(44, -1);

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "[I")
	public static final int[] anIntArray492 = new int[200];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIZ)V")
	public static void method5713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1007) {
			Static298.method4069(Static287.aClass182_6, arg0, arg2);
		} else if (arg1 == 1001) {
			Static298.method4069(Static199.aClass182_4, arg0, arg2);
		} else if (arg1 == 1010) {
			Static298.method4069(Static189.aClass182_3, arg0, arg2);
		} else if (arg1 == 1003) {
			Static298.method4069(Static113.aClass182_2, arg0, arg2);
		} else if (arg1 == 1004) {
			Static298.method4069(Static345.aClass182_8, arg0, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
	public static void method5714() {
		Static203.method4783(10);
		Static218.method3187();
		System.gc();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method5716(@OriginalArg(1) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static240.anInt6651;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class20 local27 = Static300.aClass223_1.method4921(arg0[local18]);
			if (local27.anInt463 != -1) {
				@Pc(39) Class6 local39 = (Class6) Static250.aClass102_32.method2258((long) local27.anInt463);
				if (local39 == null) {
					@Pc(47) Class72 local47 = Static460.method1572(Static448.aClass82_104, local27.anInt463, 0);
					if (local47 != null) {
						local39 = Static185.aClass34_7.method5756(local47);
						Static250.aClass102_32.method2272((long) local27.anInt463, local39);
					}
				}
				if (local39 != null) {
					Static57.aClass6Array3[local16] = local39;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}
}
