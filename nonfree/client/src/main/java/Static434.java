import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_230 = new Class88("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_73 = new Class77(70, 2);

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "[I")
	public static final int[] anIntArray601 = new int[14];

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method6610(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static475.method7161(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg1 != arg0.charAt(local25); local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)Lclient!vj;")
	public static Class7_Sub7 method6611() {
		@Pc(12) Class7_Sub7 local12 = (Class7_Sub7) Static422.aClass149_6.method3980();
		if (local12 == null) {
			return new Class7_Sub7();
		} else {
			Static435.anInt8018--;
			return local12;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIII)V")
	public static void method6613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static24.anInt388; local12++) {
			@Pc(18) Rectangle local18 = Class101.aRectangleArray1[local12];
			if (arg1 < local18.x + local18.width && arg1 + arg2 > local18.x && local18.height + local18.y > arg0 && local18.y < arg3 + arg0) {
				Static49.aBooleanArray8[local12] = true;
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!k;III[Z)V")
	public static void method6614(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static51.aClass215Array6 == Static67.aClass215Array2) {
			return;
		}
		@Pc(9) int local9 = Static155.aClass215Array5[arg1].aa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class215 local22 = Static155.aClass215Array5[local11];
				if (local22 != null) {
					local22.F(arg0, arg2, local9 - local22.aa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
