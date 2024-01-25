import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
	public static int anInt8938;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
	public static int anInt8936 = 0;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_85 = new Class187(56, 2);

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_86 = new Class187(83, -1);

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_272 = new Class196(71, 10);

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "Lclient!rh;")
	public static final Class307 aClass307_16 = new Class307(13, 0, 1, 0);

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "[Lclient!co;")
	public static final Class65[] aClass65Array1 = new Class65[14];

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public static void method7533() {
		Static130.aClass124_20.method2567();
		Static252.anInt4009 = 0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZZLjava/lang/String;Lclient!cb;)Lclient!dia;")
	public static Class79 method7534(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class50 arg2) {
		@Pc(8) int local8 = arg2.method900(arg1);
		if (local8 == -1) {
			return new Class79(0);
		}
		@Pc(27) int[] local27 = arg2.method905(local8);
		@Pc(33) Class79 local33 = new Class79(local27.length);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		while (true) {
			while (local35 < local33.anInt1866) {
				@Pc(50) Class5_Sub15 local50 = new Class5_Sub15(arg2.method916(local27[local37++], local8));
				@Pc(54) int local54 = local50.method3671();
				@Pc(58) int local58 = local50.method3698();
				@Pc(62) int local62 = local50.method3642();
				if (!arg0 && local62 == 1) {
					local33.anInt1866--;
				} else {
					local33.anIntArray94[local35] = local54;
					local33.anIntArray95[local35] = local58;
					local35++;
				}
			}
			return local33;
		}
	}
}
