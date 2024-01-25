import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!to", name = "r", descriptor = "I")
	public static int anInt8645;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_13 = new Class316(7, 16);

	@OriginalMember(owner = "client!to", name = "s", descriptor = "I")
	public static int anInt8646 = 0;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(ZB)V")
	public static void method7074(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static226.aClass1_Sub6_Sub11_2 != null) {
			Static593.anInt9646 = Static226.aClass1_Sub6_Sub11_2.anInt6669;
		} else {
			Static593.anInt9646 = -1;
		}
		Static226.aClass1_Sub6_Sub11_2 = null;
		Static497.aClass353_44 = null;
		Static271.anInt4778 = 0;
		Static323.aClass341_14 = null;
		Static226.method5087();
		Static226.aClass353_46.method7680();
		Static575.aClass31_11 = null;
		Static470.aClass31_10 = null;
		Static564.aClass22_35 = null;
		Static493.anInt8491 = -1;
		Static343.aClass31_5 = null;
		Static134.anInt2584 = -1;
		Static358.aClass31_7 = null;
		Static17.aClass31_1 = null;
		Static517.aClass31_12 = null;
		Static215.aClass31_2 = null;
		Static395.aClass31_8 = null;
		Static226.aClass13_2 = null;
		if (Static226.aClass273_2 != null) {
			Static226.aClass273_2.method5841();
			Static226.aClass273_2.method5839(128, 64);
		}
		if (Static226.aClass257_2 != null) {
			Static226.aClass257_2.method5594(64, 64);
		}
		if (Static226.aClass96_3 != null) {
			Static226.aClass96_3.method1928(64);
		}
		Static499.aClass241_5.method4895(64);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIILclient!ft;)Ljava/awt/Frame;")
	public static Frame method7075(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class109 arg3) {
		if (!arg3.method2179()) {
			return null;
		}
		@Pc(19) Class359[] local19 = Static492.method7380(arg3);
		if (local19 == null) {
			return null;
		}
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local19.length; local27++) {
			if (arg1 == local19[local27].anInt9567 && arg2 == local19[local27].anInt9566 && (!local25 || local19[local27].anInt9568 > arg0)) {
				local25 = true;
				arg0 = local19[local27].anInt9568;
			}
		}
		if (!local25) {
			return null;
		}
		@Pc(96) Class260 local96 = arg3.method2171(arg1, arg2, arg0);
		while (local96.anInt7041 == 0) {
			Static391.method5400(10L);
		}
		@Pc(122) Frame local122 = (Frame) local96.anObject16;
		if (local122 == null) {
			return null;
		} else if (local96.anInt7041 == 2) {
			Static448.method6203(arg3, local122);
			return null;
		} else {
			return local122;
		}
	}
}
