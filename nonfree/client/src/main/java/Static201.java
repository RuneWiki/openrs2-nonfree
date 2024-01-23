import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "Lclient!gi;")
	public static Class39 aClass39_6;

	@OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
	public static int anInt4512;

	@OriginalMember(owner = "client!ui", name = "K", descriptor = "[Lclient!rc;")
	public static Class2_Sub2_Sub16[] aClass2_Sub2_Sub16Array19;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "Lclient!i;")
	public static Class41 aClass41_1202 = Static184.method2923("cross");

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "Lclient!wi;")
	public static Class108 aClass108_17 = new Class108();

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "Lclient!i;")
	public static Class41 aClass41_1203 = Static184.method2923("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!ui", name = "I", descriptor = "Lclient!i;")
	private static Class41 aClass41_1204 = Static184.method2923("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ui", name = "M", descriptor = "Lclient!i;")
	public static Class41 aClass41_1205 = aClass41_1204;

	@OriginalMember(owner = "client!ui", name = "P", descriptor = "Lclient!i;")
	public static Class41 aClass41_1206 = Static184.method2923(" ");

	@OriginalMember(owner = "client!ui", name = "S", descriptor = "Lclient!i;")
	public static Class41 aClass41_1207 = Static184.method2923("cookieprefix");

	@OriginalMember(owner = "client!ui", name = "T", descriptor = "Lclient!i;")
	public static Class41 aClass41_1208 = Static184.method2923("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIILclient!nc;Lclient!nc;IIIIJ)V")
	public static void method3128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) Class12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class35 local6 = new Class35();
		local6.aLong44 = arg10;
		local6.anInt1608 = arg1 * 128 + 64;
		local6.anInt1609 = arg2 * 128 + 64;
		local6.anInt1615 = arg3;
		local6.aClass12_1 = arg4;
		local6.aClass12_2 = arg5;
		local6.anInt1611 = arg6;
		local6.anInt1617 = arg7;
		local6.anInt1616 = arg8;
		local6.anInt1614 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static27.aClass2_Sub7ArrayArrayArray4[local46][arg1][arg2] == null) {
				Static27.aClass2_Sub7ArrayArrayArray4[local46][arg1][arg2] = new Class2_Sub7(local46, arg1, arg2);
			}
		}
		Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2].aClass35_1 = local6;
	}
}
