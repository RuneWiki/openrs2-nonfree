import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!tq", name = "ab", descriptor = "I")
	public static int anInt6075;

	@OriginalMember(owner = "client!tq", name = "U", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_101 = new Class37(64);

	@OriginalMember(owner = "client!tq", name = "eb", descriptor = "I")
	public static int anInt6079 = 0;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)I")
	public static int method5262(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!nj;B)Ljava/lang/String;")
	public static String method5264(@OriginalArg(0) Class1_Sub21 arg0) {
		return Static142.method2377(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIILclient!ps;)V")
	public static void method5265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(8) Class15 local8 = arg2.method4337(Static217.aClass105_5);
		if (local8 == null) {
			return;
		}
		Static217.aClass105_5.method4268(arg0, arg1, arg2.anInt4991 + arg0, arg1 + arg2.anInt4935);
		if (Static38.anInt3168 >= 3) {
			Static217.aClass105_5.method4244(local8, arg0, arg1);
		} else {
			Static20.aClass8_2.method4388((float) arg0 + (float) arg2.anInt4991 / 2.0F, (float) arg2.anInt4935 / 2.0F + (float) arg1, ((int) -Static143.aFloat21 & 0x3FFF) << 2, local8, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)V")
	public static void method5266() {
		if (Static302.anInt6039 == 5) {
			Static302.anInt6039 = 6;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIII)V")
	public static void method5267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class10_Sub4 local13 = local7.aClass10_Sub4_2;
		@Pc(16) Class10_Sub4 local16 = local7.aClass10_Sub4_1;
		if (local13 != null) {
			local13.anInt6335 = local13.anInt6335 * arg3 / 16;
			local13.anInt6333 = local13.anInt6333 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt6335 = local16.anInt6335 * arg3 / 16;
			local16.anInt6333 = local16.anInt6333 * arg3 / 16;
		}
	}
}
