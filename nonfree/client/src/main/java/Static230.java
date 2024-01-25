import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
	public static int anInt5187;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "J")
	public static long aLong111;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!us;")
	public static final Class344 aClass344_56 = new Class344(43, -1);

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	public static int anInt5186 = 0;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!us;")
	public static final Class344 aClass344_57 = new Class344(1, 2);

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "Lclient!us;")
	public static final Class344 aClass344_58 = new Class344(14, 4);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!kba;BI)V")
	public static void method4386(@OriginalArg(0) Class2_Sub3_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		if (arg0.anInt6278 > Static251.anInt5580) {
			Static561.method7910(arg0);
		} else if (Static251.anInt5580 > arg0.anInt6290) {
			Static24.method417(false, arg0);
			local13 = Static363.anInt6997;
			local11 = Static344.anInt6771;
		} else {
			Static272.method4934(arg0);
		}
		if (arg0.anInt10428 < 512 || arg0.anInt10424 < 512 || Static394.anInt7540 * 512 - 512 <= arg0.anInt10428 || Static462.anInt8391 * 512 - 512 <= arg0.anInt10424) {
			arg0.anIntArray376 = null;
			arg0.anInt6278 = 0;
			local13 = 0;
			arg0.anInt6306 = -1;
			local11 = -1;
			arg0.anInt6321 = -1;
			arg0.anInt6299 = -1;
			arg0.anInt6290 = 0;
			arg0.anInt10428 = arg0.anIntArray378[0] * 512 + arg0.method5308() * 256;
			arg0.anInt10424 = arg0.anIntArray377[0] * 512 + arg0.method5308() * 256;
			arg0.method5303();
		}
		if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 == arg0 && (arg0.anInt10428 < 6144 || arg0.anInt10424 < 6144 || (Static394.anInt7540 - 12) * 512 <= arg0.anInt10428 || Static462.anInt8391 * 512 - 6144 <= arg0.anInt10424)) {
			arg0.anInt6321 = -1;
			arg0.anIntArray376 = null;
			local13 = 0;
			local11 = -1;
			arg0.anInt6290 = 0;
			arg0.anInt6278 = 0;
			arg0.anInt6306 = -1;
			arg0.anInt6299 = -1;
			arg0.anInt10428 = arg0.anIntArray378[0] * 512 + arg0.method5308() * 256;
			arg0.anInt10424 = arg0.anIntArray377[0] * 512 + arg0.method5308() * 256;
			arg0.method5303();
		}
		@Pc(216) int local216 = Static633.method8557(arg0);
		Static606.method8264(arg0);
		Static521.method7465(local11, local13, local216, arg0);
		Static321.method4756(local11, arg0);
		Static342.method5640(arg0);
	}
}
