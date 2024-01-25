import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!mh", name = "kb", descriptor = "Lclient!oa;")
	public static Class210 aClass210_4;

	@OriginalMember(owner = "client!mh", name = "Bb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26;

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "Lclient!vm;")
	public static final Class307 aClass307_7 = new Class307();

	@OriginalMember(owner = "client!mh", name = "db", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_88 = new Class6(94, -2);

	@OriginalMember(owner = "client!mh", name = "ob", descriptor = "Lclient!h;")
	public static final Class114 aClass114_110 = new Class114("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!mh", name = "Db", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_14 = new Class16(2);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method5019(@OriginalArg(1) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static47.anInt1414;
		for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
			@Pc(27) Class84 local27 = Static182.aClass133_1.method3772(arg0[local19]);
			if (local27.anInt2865 != -1) {
				@Pc(39) Class12 local39 = (Class12) Static536.aClass316_63.method7799((long) local27.anInt2865);
				if (local39 == null) {
					@Pc(47) Class242 local47 = Static559.method5942(Static390.aClass160_80, local27.anInt2865, 0);
					if (local47 != null) {
						local39 = Static478.aClass9_10.method7625(local47);
						Static536.aClass316_63.method7792((long) local27.anInt2865, local39);
					}
				}
				if (local39 != null) {
					Static274.aClass12Array17[local9] = local39;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}
}
