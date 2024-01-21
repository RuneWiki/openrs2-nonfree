import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public static int anInt4111;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	public static int anInt4113;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1521 = Static161.method2452("huffman");

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1522 = Static161.method2452(":assist:");

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1523 = Static161.method2452("Cabbage");

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1524 = Static161.method2452("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "[[B")
	public static final byte[][] aByteArrayArray10 = new byte[1000][];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BII)I")
	public static int method3127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class5_Sub17 local15 = (Class5_Sub17) Static38.aClass75_5.method2072((long) arg1);
		if (local15 == null) {
			return 0;
		} else if (arg0 >= 0 && local15.anIntArray231.length > arg0) {
			return local15.anIntArray231[arg0];
		} else {
			return 0;
		}
	}
}
