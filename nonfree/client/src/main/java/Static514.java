import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
	public static int anInt8839;

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "Lclient!lj;")
	public static final Class210 aClass210_13 = new Class210(0, 2, 2, 1);

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
	public static int anInt8838 = -1;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIILclient!dd;Lclient!ba;)V")
	public static void method7259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class68 arg3, @OriginalArg(5) Class9 arg4) {
		if (arg4 != null) {
			arg3.method2049(arg4.K(), arg4.M(), arg4.EA(), arg4.ZA(), arg1, arg2, arg0, arg4.DA(), arg4.ha(), arg4.LA());
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B[BI)[B")
	public static byte[] method7260(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static602.method1586(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)I")
	public static int method7261(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public static void method7262() {
		Static245.method4153(false);
		if (Static229.anInt4707 >= 0 && Static229.anInt4707 != 0) {
			Static8.method7640(Static229.anInt4707);
			Static229.anInt4707 = -1;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
	public static void method7263() {
		for (@Pc(14) Class4_Sub37 local14 = (Class4_Sub37) Static263.aClass124_53.method3267(); local14 != null; local14 = (Class4_Sub37) Static263.aClass124_53.method3273()) {
			if (local14.anInt7093 == -1) {
				local14.anInt7090 = 0;
				if (local14.anInt7084 >= 0 && local14.anInt7086 >= 0 && local14.anInt7084 < Static38.anInt740 && Static38.anInt741 > local14.anInt7086) {
					Static568.method7793(local14);
				}
			} else {
				local14.method8013();
			}
		}
	}
}
