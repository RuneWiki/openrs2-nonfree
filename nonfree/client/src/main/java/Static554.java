import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "Lclient!jo;")
	public static Class168 aClass168_120;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "Z")
	public static boolean aBoolean702 = false;

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_114 = new Class181(16, 8);

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "[Lclient!am;")
	public static final Class16[] aClass16Array2 = new Class16[14];

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "[Lclient!ul;")
	public static final Class318[] aClass318Array1 = new Class318[34];

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "Lclient!fv;")
	public static final Class112 aClass112_16 = new Class112(9, 0, 4, 1);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZI)V")
	public static void method7901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(5, arg1);
		local8.method3826();
		local8.anInt4403 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZLclient!jo;Ljava/lang/String;I)Lclient!kh;")
	public static Class183 method7902(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) String arg2) {
		@Pc(10) int local10 = arg1.method4432(arg2);
		if (local10 == -1) {
			return new Class183(0);
		}
		@Pc(24) int[] local24 = arg1.method4424(local10);
		@Pc(30) Class183 local30 = new Class183(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		while (true) {
			while (local30.anInt5334 > local32) {
				@Pc(51) Class6_Sub26 local51 = new Class6_Sub26(arg1.method4435(local24[local34++], local10));
				@Pc(55) int local55 = local51.method5000();
				@Pc(61) int local61 = local51.method4999();
				@Pc(67) int local67 = local51.method4966();
				if (!arg0 && local67 == 1) {
					local30.anInt5334--;
				} else {
					local30.anIntArray398[local32] = local55;
					local30.anIntArray397[local32] = local61;
					local32++;
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)V")
	public static void method7903(@OriginalArg(0) int arg0) {
		if (Static49.anInt1353 == 1) {
			Static103.anInt2393 = arg0;
		} else if (Static49.anInt1353 == 2 || Static49.anInt1353 == 3) {
			Static443.anInt8147 = arg0;
		}
	}
}
