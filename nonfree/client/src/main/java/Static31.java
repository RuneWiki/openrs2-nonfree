import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "Lclient!he;")
	public static Class100 aClass100_6;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	public static int anInt886 = 0;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
	public static int anInt889 = 0;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "[B")
	public static final byte[] aByteArray17 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_10 = new Class92(75, 3);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!bn;)V")
	public static void method758(@OriginalArg(1) Class3_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt6570 - Static66.anInt1741;
		@Pc(20) int local20 = arg0.anInt6536 * 128 + arg0.method5521() * 64;
		@Pc(31) int local31 = arg0.anInt6554 * 128 + arg0.method5521() * 64;
		arg0.anInt7207 += (local31 - arg0.anInt7207) / local9;
		arg0.anInt6612 = 0;
		arg0.anInt7202 += (local20 - arg0.anInt7202) / local9;
		if (arg0.anInt6580 == 0) {
			arg0.method5523(8192);
		}
		if (arg0.anInt6580 == 1) {
			arg0.method5523(12288);
		}
		if (arg0.anInt6580 == 2) {
			arg0.method5523(0);
		}
		if (arg0.anInt6580 == 3) {
			arg0.method5523(4096);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)I")
	public static int method761(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}
}
