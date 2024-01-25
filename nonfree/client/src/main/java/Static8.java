import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
	public static int anInt153;

	@OriginalMember(owner = "client!afa", name = "n", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!afa", name = "j", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_3 = new Class215(90, 10);

	@OriginalMember(owner = "client!afa", name = "o", descriptor = "I")
	public static int anInt156 = -1;

	@OriginalMember(owner = "client!afa", name = "s", descriptor = "Lclient!wu;")
	public static final Class379 aClass379_1 = new Class379(128);

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZIII)I")
	public static int method206(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class2_Sub24 local13 = Static628.method9105(arg1, arg0);
		if (local13 == null) {
			return -1;
		} else if (arg2 >= 0 && local13.anIntArray263.length > arg2) {
			return local13.anIntArray263[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V")
	public static void method208() {
		if (Static69.anInt2216 == 1 || Static69.anInt2216 == 3 || Static69.anInt2216 != Static314.anInt6440 && (Static69.anInt2216 == 0 || Static314.anInt6440 == 0)) {
			Static474.anInt8881 = 0;
			Static398.anInt7589 = 0;
			Static600.aClass99_79.method3057();
		}
		Static314.anInt6440 = Static69.anInt2216;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZILclient!kda;)V")
	public static void method210(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub3_Sub3 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt6042 > Static407.anInt7704) {
			Static145.method3219(arg1);
		} else if (arg1.anInt6091 >= Static407.anInt7704) {
			Static344.method5905(arg1);
		} else {
			Static505.method7792(false, arg1);
			local7 = Static56.anInt1903;
			local9 = Static133.anInt3322;
		}
		if (arg1.anInt10303 < 512 || arg1.anInt10310 < 512 || arg1.anInt10303 >= Static47.anInt1794 * 512 - 512 || arg1.anInt10310 >= Static209.anInt4742 * 512 - 512) {
			arg1.anInt6084 = -1;
			arg1.anInt6091 = 0;
			local9 = 0;
			local7 = -1;
			arg1.anIntArray349 = null;
			arg1.anInt6065 = -1;
			arg1.anInt6079 = -1;
			arg1.anInt6042 = 0;
			arg1.anInt10303 = arg1.anIntArray358[0] * 512 + arg1.method5214() * 256;
			arg1.anInt10310 = arg1.anIntArray357[0] * 512 + arg1.method5214() * 256;
			arg1.method5205();
		}
		if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 == arg1 && (arg1.anInt10303 < 6144 || arg1.anInt10310 < 6144 || (Static47.anInt1794 - 12) * 512 <= arg1.anInt10303 || (Static209.anInt4742 - 12) * 512 <= arg1.anInt10310)) {
			arg1.anInt6084 = -1;
			local7 = -1;
			arg1.anInt6091 = 0;
			arg1.anInt6065 = -1;
			arg1.anInt6042 = 0;
			local9 = 0;
			arg1.anIntArray349 = null;
			arg1.anInt6079 = -1;
			arg1.anInt10303 = arg1.anIntArray358[0] * 512 + arg1.method5214() * 256;
			arg1.anInt10310 = arg1.anIntArray357[0] * 512 + arg1.method5214() * 256;
			arg1.method5205();
		}
		@Pc(225) int local225 = Static186.method3881(arg1);
		Static84.method2412(arg1);
		Static292.method5258(local7, local225, arg1, local9);
		Static83.method2401(arg1, local7);
		Static518.method7859(arg1);
	}
}
