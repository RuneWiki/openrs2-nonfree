import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!pa;")
	public static final Class183 aClass183_20 = new Class183(12, 7);

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "[Lclient!nd;")
	public static final Class160[] aClass160Array1 = new Class160[4];

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!of;")
	public static final Class174 aClass174_185 = new Class174("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
	public static int anInt6511 = 0;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!ip;")
	public static final Class111 aClass111_11 = new Class111("", 11);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
	public static int method5389() {
		@Pc(13) Class268 local13 = Static13.aClass268_2;
		synchronized (Static13.aClass268_2) {
			return Static13.aClass268_2.method6170();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIBI)I")
	public static int method5391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class65.anIntArray87[arg3 * 8192 / arg1] >> 1;
		return (arg0 * (65536 - local16) >> 16) + (arg2 * local16 >> 16);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIB)V")
	public static void method5392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(10, arg1);
		local8.method1003();
		local8.anInt972 = arg0;
		local8.anInt974 = arg2;
		local8.anInt970 = arg3;
	}
}
