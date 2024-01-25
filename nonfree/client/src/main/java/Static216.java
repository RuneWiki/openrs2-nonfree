import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	public static int anInt3459;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!gq;")
	public static final Class139 aClass139_2 = new Class139(1);

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	public static int anInt3456 = 0;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_46 = new Class187(73, 0);

	@OriginalMember(owner = "client!he", name = "k", descriptor = "J")
	public static long aLong124 = 0L;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	public static int anInt3460 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method3090(@OriginalArg(1) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static369.anInt6462;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(19) Class69 local19 = Static135.aClass250_1.method5938(arg0[local11]);
			if (local19.anInt1478 != -1) {
				@Pc(32) Class59 local32 = (Class59) Static35.aClass265_2.method6577((long) local19.anInt1478);
				if (local32 == null) {
					@Pc(40) Class301 local40 = Static684.method7228(Static471.aClass50_136, local19.anInt1478, 0);
					if (local40 != null) {
						local32 = Static563.aClass143_13.method6247(local40, true);
						Static35.aClass265_2.method6566(local32, (long) local19.anInt1478);
					}
				}
				if (local32 != null) {
					Static113.aClass59Array2[local9] = local32;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}
}
