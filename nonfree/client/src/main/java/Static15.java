import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public static int anInt602;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
	public static int anInt605;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!kd;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Lclient!id;")
	private static Class34 aClass34_310 = Static9.method266("as it was used to break our rules)3");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Lclient!id;")
	public static Class34 aClass34_307 = aClass34_310;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public static int anInt600 = 0;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
	public static int[] anIntArray57 = new int[32];

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "Lclient!id;")
	private static Class34 aClass34_311 = Static9.method266("flash1:");

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_308 = aClass34_311;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!id;")
	public static Class34 aClass34_309 = Static9.method266("m");

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "[I")
	public static int[] anIntArray58 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "[I")
	public static int[] anIntArray60 = new int[200];

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
	public static int anInt614 = 1;

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "Lclient!id;")
	public static Class34 aClass34_312 = aClass34_311;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method359() {
		aClass34_307 = null;
		aClass34_311 = null;
		anIntArray57 = null;
		aClass42_1 = null;
		aClass34_308 = null;
		aClass34_312 = null;
		aClass34_309 = null;
		aClass34_310 = null;
		anIntArray58 = null;
		anIntArray60 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Lclient!id;")
	public static Class34 method360(@OriginalArg(1) int arg0) {
		return Static71.aClass34Array16[arg0].method982() > 0 ? Static91.method1554(new Class34[] { Static59.aClass34Array12[arg0], Static90.aClass34_1585, Static71.aClass34Array16[arg0] }) : Static59.aClass34Array12[arg0];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZLclient!of;)Lclient!id;")
	public static Class34 method361(@OriginalArg(2) Class1_Sub19 arg0) {
		try {
			@Pc(7) Class34 local7 = new Class34();
			local7.anInt1553 = arg0.method2078();
			if (local7.anInt1553 > 32767) {
				local7.anInt1553 = 32767;
			}
			local7.aByteArray20 = new byte[local7.anInt1553];
			arg0.anInt3111 += Static95.aClass21_1.method568(0, local7.aByteArray20, arg0.anInt3111, local7.anInt1553, arg0.aByteArray42);
			return local7;
		} catch (@Pc(53) Exception local53) {
			return Static89.aClass34_981;
		}
	}
}
