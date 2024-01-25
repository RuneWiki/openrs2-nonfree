import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "[I")
	public static int[] anIntArray452;

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
	public static int anInt5776;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_137 = new Class140("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ro", name = "w", descriptor = "[[B")
	public static final byte[][] aByteArrayArray19 = new byte[250][];

	@OriginalMember(owner = "client!ro", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[200];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BZLjava/lang/String;Lclient!iq;)Lclient!tn;")
	public static Class194 method4846(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class104 arg2) {
		@Pc(10) int local10 = arg2.method2769(arg1);
		if (local10 == -1) {
			return new Class194(0);
		}
		@Pc(28) int[] local28 = arg2.method2763(local10);
		@Pc(34) Class194 local34 = new Class194(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local34.anInt6208 > local36) {
				@Pc(52) Class2_Sub12 local52 = new Class2_Sub12(arg2.method2756(local10, local28[local38++]));
				@Pc(56) int local56 = local52.method3135();
				@Pc(60) int local60 = local52.method3104();
				@Pc(64) int local64 = local52.method3124();
				if (!arg0 && local64 == 1) {
					local34.anInt6208--;
				} else {
					local34.anIntArray480[local36] = local56;
					local34.anIntArray479[local36] = local60;
					local36++;
				}
			}
			return local34;
		}
	}
}
