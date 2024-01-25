import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7;

	@OriginalMember(owner = "client!fq", name = "q", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_40;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Lclient!nh;")
	public static final Class219 aClass219_10 = new Class219(1);

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_51 = new Class47(81, 8);

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
	public static void method2814(@OriginalArg(0) int arg0) {
		Static128.anInt2923 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static401.anInt7022; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static555.anInt9182; local6++) {
				if (Static270.aClass276ArrayArrayArray2[arg0][local3][local6] == null) {
					Static270.aClass276ArrayArrayArray2[arg0][local3][local6] = new Class276(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZIZLclient!cd;)V")
	public static void method2815(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class6_Sub11 arg2) {
		@Pc(8) int local8 = arg2.anInt1216;
		@Pc(12) int local12 = (int) arg2.aLong263;
		arg2.method7804();
		if (arg1) {
			Static438.method6243(local8);
		}
		Static147.method7404(local8);
		@Pc(27) Class292 local27 = Static367.method5505(local12);
		if (local27 != null) {
			Static464.method6502(local27);
		}
		Static285.method4650();
		if (!arg0 && Static468.anInt8036 != -1) {
			Static201.method3632(Static468.anInt8036, 1);
		}
		@Pc(49) Class255 local49 = new Class255(Static224.aClass128_23);
		for (@Pc(54) Class6_Sub11 local54 = (Class6_Sub11) local49.method5928(); local54 != null; local54 = (Class6_Sub11) local49.method5925()) {
			if (!local54.method7803()) {
				local54 = (Class6_Sub11) local49.method5928();
				if (local54 == null) {
					break;
				}
			}
			if (local54.anInt1217 == 3) {
				@Pc(79) int local79 = (int) local54.aLong263;
				if (local8 == local79 >>> 16) {
					method2815(arg0, true, local54);
				}
			}
		}
	}
}
