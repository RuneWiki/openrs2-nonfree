import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!nk;")
	public static final Class174 aClass174_5 = new Class174("LIVE", 0);

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_78 = new Class254(65, 15);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!ir;)V")
	public static void method3008(@OriginalArg(1) Class47_Sub1_Sub5 arg0) {
		@Pc(9) int local9 = arg0.anInt5344 - Static123.anInt2333;
		@Pc(23) int local23 = arg0.anInt5394 * 128 + arg0.method4317() * 64;
		@Pc(36) int local36 = arg0.anInt5342 * 128 + arg0.method4317() * 64;
		arg0.anInt5419 = 0;
		arg0.anInt7066 += (local36 - arg0.anInt7066) / local9;
		arg0.anInt7060 += (local23 - arg0.anInt7060) / local9;
		if (arg0.anInt5355 == 0) {
			arg0.method4321(8192);
		}
		if (arg0.anInt5355 == 1) {
			arg0.method4321(12288);
		}
		if (arg0.anInt5355 == 2) {
			arg0.method4321(0);
		}
		if (arg0.anInt5355 == 3) {
			arg0.method4321(4096);
		}
	}
}
