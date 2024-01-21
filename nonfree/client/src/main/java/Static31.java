import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!ra;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	public static int anInt749;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!bc;")
	public static Class1 aClass1_4;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	public static int anInt745 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	public static int anInt747 = 1;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public static int anInt748 = 1;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_231 = Static120.method1824("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public static int anInt751 = -1;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_232 = Static120.method1824("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_233 = Static120.method1824("<col=ffffff>");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Z")
	public static boolean method495(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)J")
	public static long method496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass13_1 == null ? 0L : local7.aClass13_1.aLong16;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!bc;)V")
	public static void method497(@OriginalArg(1) Class1 arg0) {
		Static137.aClass1_22 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method498(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static176.method2827(local13) : local13;
		} else if (arg0 instanceof Class48) {
			@Pc(32) Class48 local32 = (Class48) arg0;
			return local32.method3023();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
