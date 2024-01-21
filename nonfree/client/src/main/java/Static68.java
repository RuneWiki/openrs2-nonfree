import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!he", name = "ib", descriptor = "I")
	public static int anInt1520;

	@OriginalMember(owner = "client!he", name = "ob", descriptor = "Lclient!qf;")
	public static Class77 aClass77_3;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_581 = Static120.method1824("Your account is already logged in)3");

	@OriginalMember(owner = "client!he", name = "O", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_582 = Static120.method1824("Loaded fonts");

	@OriginalMember(owner = "client!he", name = "T", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_584 = Static120.method1824("glow3:");

	@OriginalMember(owner = "client!he", name = "S", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_583 = aClass80_584;

	@OriginalMember(owner = "client!he", name = "U", descriptor = "Lclient!rd;")
	public static Class80 aClass80_585 = aClass80_581;

	@OriginalMember(owner = "client!he", name = "V", descriptor = "Lclient!rd;")
	public static Class80 aClass80_586 = aClass80_584;

	@OriginalMember(owner = "client!he", name = "W", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_587 = Static120.method1824("VOLL");

	@OriginalMember(owner = "client!he", name = "db", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_588 = Static120.method1824("mapfunction");

	@OriginalMember(owner = "client!he", name = "jb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_589 = Static120.method1824("Spieler");

	@OriginalMember(owner = "client!he", name = "lb", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!he", name = "mb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_590 = aClass80_582;

	@OriginalMember(owner = "client!he", name = "nb", descriptor = "I")
	public static int anInt1522 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!rd;I)V")
	public static void method1025(@OriginalArg(0) Class80 arg0) {
		if (Static153.aClass3_Sub9Array2 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method2441();
		if (local14 == 0L) {
			return;
		}
		while (Static153.aClass3_Sub9Array2.length > local10 && local14 != Static153.aClass3_Sub9Array2[local10].aLong154) {
			local10++;
		}
		if (local10 < Static153.aClass3_Sub9Array2.length && Static153.aClass3_Sub9Array2[local10] != null) {
			Static146.aClass3_Sub17_Sub1_3.method2146(231);
			Static146.aClass3_Sub17_Sub1_3.method2112(Static153.aClass3_Sub9Array2[local10].aLong154);
		}
	}
}
