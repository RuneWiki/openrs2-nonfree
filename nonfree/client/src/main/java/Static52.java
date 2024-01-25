import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bo", name = "T", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_16 = new Class187(45, 11);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II[BB)[B")
	public static byte[] method800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) byte[] local7;
		if (arg1 <= 0) {
			local7 = arg2;
		} else {
			local7 = new byte[arg0];
			for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
				local7[local13] = arg2[local13 + arg1];
			}
		}
		@Pc(34) Class190 local34 = new Class190();
		local34.method3969();
		local34.method3972((long) (arg0 * 8), local7);
		@Pc(56) byte[] local56 = new byte[64];
		local34.method3967(local56);
		return local56;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(IZ)V")
	public static void method801(@OriginalArg(0) int arg0) {
		if (Static655.aClass5_Sub36_29.aClass2_Sub18_1.method7160() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static318.anInt2325) {
			return;
		}
		if (arg0 != -1) {
			@Pc(26) Class264 local26 = Static205.aClass363_1.method8239(arg0);
			@Pc(30) Class301 local30 = local26.method6552();
			if (local30 == null) {
				arg0 = -1;
			} else {
				Static150.aClass202_2.method4731(local30.method7221(), local30.method7232(), local30.method7234(), Static105.aCanvas2, new Point(local26.anInt7723, local26.anInt7718));
				Static318.anInt2325 = arg0;
			}
		}
		if (arg0 == -1 && Static318.anInt2325 != -1) {
			Static150.aClass202_2.method4731((int[]) null, -1, -1, Static105.aCanvas2, new Point());
			Static318.anInt2325 = -1;
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V")
	public static void method803() {
		for (@Pc(5) int local5 = 0; local5 < 100; local5++) {
			Static69.aClass295Array1[local5] = null;
		}
		Static155.anInt2639 = 0;
	}
}
