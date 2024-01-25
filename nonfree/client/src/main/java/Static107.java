import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
	public static int anInt2270;

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_55 = new Class7("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method1961(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(38) int local38 = arg0 / 10;
		while (local38 != 0) {
			local38 /= 10;
			local34++;
		}
		@Pc(49) char[] local49 = new char[local34];
		local49[0] = '+';
		for (@Pc(65) int local65 = local34 - 1; local65 > 0; local65--) {
			@Pc(68) int local68 = arg0;
			arg0 /= 10;
			@Pc(78) int local78 = local68 - arg0 * 10;
			if (local78 >= 10) {
				local49[local65] = (char) (local78 + 87);
			} else {
				local49[local65] = (char) (local78 + 48);
			}
		}
		return new String(local49);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1963(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class1_Sub5 local13 = new Class1_Sub5(arg0);
		@Pc(17) int local17 = local13.method5366();
		@Pc(21) int local21 = local13.method5407();
		if (local21 < 0 || Static309.anInt5334 != 0 && Static309.anInt5334 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(44) byte[] local44 = new byte[local21];
			local13.method5391(local44, local21);
			return local44;
		} else {
			@Pc(56) int local56 = local13.method5407();
			if (local56 < 0 || Static309.anInt5334 != 0 && local56 > Static309.anInt5334) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local56];
			if (local17 == 1) {
				Static430.method5693(local73, local56, arg0, local21);
			} else {
				Static363.aClass176_4.method4033(local73, local13);
			}
			return local73;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)Z")
	public static boolean method1964() {
		return Static390.anInt6278 == 0 ? Static244.aClass1_Sub19_Sub4_2.method3655() : true;
	}
}
