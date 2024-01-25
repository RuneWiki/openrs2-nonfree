import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
	public static int anInt2445 = 0;

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_21 = new Class198(8);

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString85 = "M";

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "Lclient!ef;")
	public static final Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
	public static int anInt2462 = 0;

	@OriginalMember(owner = "client!hd", name = "eb", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!ie;)I")
	public static int method2000(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(7) String local7 = Static23.method436(arg0);
		@Pc(9) int[] local9 = null;
		if (Static128.method2209(arg0.anInt2734)) {
			local9 = Static230.method5537((int) arg0.aLong100).anIntArray79;
		} else if (Static72.method1116(arg0.anInt2734)) {
			@Pc(64) Class5_Sub4_Sub4_Sub2 local64 = Static244.aClass5_Sub4_Sub4_Sub2Array1[(int) arg0.aLong100];
			if (local64 != null) {
				local9 = local64.aClass119_1.anIntArray249;
			}
		} else if (Static85.method1379(arg0.anInt2734)) {
			if (arg0.anInt2734 == 1011) {
				local9 = Static268.method4553((int) arg0.aLong100).anIntArray422;
			} else {
				local9 = Static268.method4553((int) (arg0.aLong100 >>> 32 & 0x7FFFFFFFL)).anIntArray422;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static48.method840(local9);
		}
		return Static191.aClass209_6.method5511(local7, Static274.aClass57Array22);
	}
}
