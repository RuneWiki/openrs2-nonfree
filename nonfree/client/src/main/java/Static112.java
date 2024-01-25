import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "Lclient!wr;")
	public static Class220 aClass220_1 = new Class220();

	@OriginalMember(owner = "client!he", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[112];

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	public static void method1809() {
		Static211.aClass37_69.method914();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public static void method1810() {
		if (Static217.aClass105_5 == null) {
			return;
		}
		Static88.aClass122_1.method2619();
		Static60.method1146();
		Static329.method5542();
		Static206.method3702();
		Static354.method5861();
		Static53.method1078();
		if (Static126.aClass199_1 != null) {
			Static126.aClass199_1.method5371();
		}
		Static325.method2375();
		Static14.method208();
		Static20.method357();
		Static353.method5842(false);
		Static40.method852();
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			@Pc(39) Class10_Sub1_Sub2_Sub2 local39 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local33];
			if (local39 != null) {
				local39.anInterface4_3 = null;
				for (@Pc(46) int local46 = 0; local46 < local39.aClass40Array3.length; local46++) {
					local39.aClass40Array3[local46] = null;
				}
			}
		}
		for (@Pc(67) int local67 = 0; local67 < Static178.aClass10_Sub1_Sub2_Sub1Array1.length; local67++) {
			@Pc(73) Class10_Sub1_Sub2_Sub1 local73 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local67];
			if (local73 != null) {
				for (@Pc(77) int local77 = 0; local77 < local73.aClass40Array3.length; local77++) {
					local73.aClass40Array3[local77] = null;
				}
			}
		}
		Static217.aClass105_5.method4299();
		Static217.aClass105_5 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BIIIII)V")
	public static void method1811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(38) int local38 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg4 << 1) - 3);
		@Pc(77) int local77 = local55;
		@Pc(92) int local92;
		@Pc(101) int local101;
		if (arg2 >= Static41.anInt1131 && arg2 <= Static165.anInt3409) {
			local92 = Static54.method1088(Static60.anInt1399, arg3 + arg1, Static138.anInt6334);
			local101 = Static54.method1088(Static60.anInt1399, arg3 - arg1, Static138.anInt6334);
			Static244.method5351(local101, local92, Static319.anIntArrayArray31[arg2], arg0);
		}
		@Pc(119) int local119 = local51 * (arg4 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local77;
					local63 += local55;
					local77 += local55;
					local7++;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local38 += local63;
				local77 += local55;
				local63 += local55;
				local7++;
			}
			local38 += -local119;
			local47 += -local71;
			local71 -= local51;
			local119 -= local51;
			local9--;
			local92 = arg2 - local9;
			local101 = arg2 + local9;
			if (local101 >= Static41.anInt1131 && Static165.anInt3409 >= local92) {
				@Pc(216) int local216 = Static54.method1088(Static60.anInt1399, arg3 + local7, Static138.anInt6334);
				@Pc(225) int local225 = Static54.method1088(Static60.anInt1399, arg3 - local7, Static138.anInt6334);
				if (local92 >= Static41.anInt1131) {
					Static244.method5351(local225, local216, Static319.anIntArrayArray31[local92], arg0);
				}
				if (local101 <= Static165.anInt3409) {
					Static244.method5351(local225, local216, Static319.anIntArrayArray31[local101], arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!nj;B)Lclient!mo;")
	public static Class49_Sub2 method1813(@OriginalArg(0) Class1_Sub21 arg0) {
		return new Class49_Sub2(arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5705(), arg0.method5705(), arg0.method5720());
	}
}
