import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!im", name = "n", descriptor = "Lclient!ci;")
	public static Class42 aClass42_4;

	@OriginalMember(owner = "client!im", name = "x", descriptor = "I")
	public static int anInt3055;

	@OriginalMember(owner = "client!im", name = "w", descriptor = "[Lclient!nr;")
	public static final Class113_Sub1[] aClass113_Sub1Array1 = new Class113_Sub1[30];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2646(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		@Pc(12) int local12 = local8.method4548();
		@Pc(21) int local21 = local8.method4500();
		if (local21 < 0 || Static413.anInt7253 != 0 && Static413.anInt7253 < local21) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(44) byte[] local44 = new byte[local21];
			local8.method4511(local44, local21);
			return local44;
		} else {
			@Pc(58) int local58 = local8.method4500();
			if (local58 < 0 || Static413.anInt7253 != 0 && Static413.anInt7253 < local58) {
				throw new RuntimeException();
			}
			@Pc(75) byte[] local75 = new byte[local58];
			if (local12 == 1) {
				Static408.method5542(local75, local58, arg0, local21);
			} else {
				Static182.aClass11_1.method231(local8, local75);
			}
			return local75;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)I")
	public static int method2648(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
