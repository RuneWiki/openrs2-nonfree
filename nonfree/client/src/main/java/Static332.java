import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_93 = new Class96("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
	public static int anInt6038 = 0;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI[BI)Ljava/lang/String;")
	public static String method4783(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(28) int local28 = arg1[arg0 + local17] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(46) char local46 = Static393.aCharArray4[local28 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local28 = local46;
				}
				local8[local10++] = (char) local28;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!bo;BIILclient!qa;)V")
	public static void method4784(@OriginalArg(0) int arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class121 arg4) {
		@Pc(9) Class53 local9 = Static50.aClass177_1.method3799(arg1.anInt536);
		if (local9.anInt1219 == -1) {
			return;
		}
		if (arg1.aBoolean38) {
			@Pc(27) int local27 = arg0 + arg1.anInt533;
			arg0 = local27 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(39) Class78 local39 = local9.method995(arg1.aBoolean48, arg4, arg0);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg1.anInt532;
		@Pc(48) int local48 = arg1.anInt542;
		if ((arg0 & 0x1) == 1) {
			local45 = arg1.anInt542;
			local48 = arg1.anInt532;
		}
		@Pc(64) int local64 = local39.ja();
		@Pc(67) int local67 = local39.JA();
		if (local9.aBoolean106) {
			local67 = local48 * 4;
			local64 = local45 * 4;
		}
		if (local9.anInt1220 == 0) {
			local39.method6001(arg3, arg2 - (local48 - 1) * 4, local64, local67);
		} else {
			local39.M(arg3, arg2 - (local48 - 1) * 4, local64, local67, 0, local9.anInt1220 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
	public static void method4786() {
		Static364.method5172();
		Static442.method5918();
	}
}
