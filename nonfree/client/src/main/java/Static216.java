import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!np", name = "c", descriptor = "Z")
	public static boolean aBoolean369;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "Lclient!wk;")
	public static Class214 aClass214_3;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "Lclient!bj;")
	public static Class26 aClass26_52 = new Class26(128);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public static void method4852() {
		@Pc(5) Class26 local5 = Static34.aClass26_4;
		synchronized (Static34.aClass26_4) {
			Static34.aClass26_4.method328();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIB[B)Ljava/lang/String;")
	public static String method4853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg0; local20++) {
			@Pc(31) int local31 = arg2[arg1 + local20] & 0xFF;
			if (local31 != 0) {
				if (local31 >= 128 && local31 < 160) {
					@Pc(50) char local50 = Static102.aCharArray2[local31 - 128];
					if (local50 == '\u0000') {
						local50 = '?';
					}
					local31 = local50;
				}
				local8[local18++] = (char) local31;
			}
		}
		return new String(local8, 0, local18);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!nq;)V")
	public static void method4854(@OriginalArg(1) Class144 arg0) {
		Static202.aClass144_60 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)V")
	public static void method4855() {
		@Pc(1) Class26 local1 = Static59.aClass26_5;
		synchronized (Static59.aClass26_5) {
			Static59.aClass26_5.method329(5);
		}
		local1 = Static185.aClass26_33;
		synchronized (Static185.aClass26_33) {
			Static185.aClass26_33.method329(5);
		}
		@Pc(41) Class26 local41 = Static222.aClass26_43;
		synchronized (Static222.aClass26_43) {
			Static222.aClass26_43.method329(5);
		}
	}
}
