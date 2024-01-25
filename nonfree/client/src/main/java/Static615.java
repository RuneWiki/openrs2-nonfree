import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!us", name = "e", descriptor = "[I")
	public static final int[] anIntArray560 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!us", name = "o", descriptor = "I")
	public static int anInt10781 = -1;

	@OriginalMember(owner = "client!us", name = "r", descriptor = "Lclient!uf;")
	public static Class357 aClass357_163 = null;

	@OriginalMember(owner = "client!us", name = "v", descriptor = "[I")
	public static final int[] anIntArray561 = new int[32];

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I")
	public static int method9216() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(20) boolean local20 = false;
		if (Static96.aClass48_5.aBoolean75 && !Static96.aClass48_5.aBoolean76) {
			local7 = true;
			if (Static466.aClass2_Sub55_1.anInt11444 < 512 && Static466.aClass2_Sub55_1.anInt11444 != 0) {
				local7 = false;
			}
			if (Static72.aString13.startsWith("win")) {
				local20 = true;
				local9 = true;
			} else {
				local9 = true;
			}
		}
		if (Static397.aBoolean792) {
			local9 = false;
		}
		if (Static431.aBoolean188) {
			local7 = false;
		}
		if (Static412.aBoolean569) {
			local20 = false;
		}
		if (!local7 && !local9 && !local20) {
			return Static628.method9330();
		}
		@Pc(77) int local77 = -1;
		@Pc(79) int local79 = -1;
		@Pc(81) int local81 = -1;
		if (local7) {
			try {
				local77 = Static457.method7338(1000, 2);
			} catch (@Pc(90) Exception local90) {
			}
		}
		if (local20) {
			try {
				local81 = Static457.method7338(1000, 3);
				if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() == 3) {
					@Pc(107) Class99 local107 = Static607.aClass101_15.method8090();
					@Pc(112) long local112 = local107.aLong83 & 0xFFFFFFFFFFFFL;
					@Pc(115) int local115 = local107.anInt2735;
					if (local115 == 4318) {
						local9 &= local112 >= 64425238954L;
					} else if (local115 == 4098) {
						local9 &= local112 >= 60129613779L;
					}
				}
			} catch (@Pc(151) Exception local151) {
			}
		}
		if (local9) {
			try {
				local79 = Static457.method7338(1000, 1);
			} catch (@Pc(161) Exception local161) {
			}
		}
		if (local77 == -1 && local79 == -1 && local81 == -1) {
			return Static628.method9330();
		}
		local79 = (int) ((float) local79 * 1.1F);
		local81 = (int) ((float) local81 * 1.1F);
		if (local77 > local81 && local79 < local77) {
			return Static193.method3741(local77);
		} else if (local79 >= local81) {
			return Static653.method9596(local79, 1);
		} else {
			return Static653.method9596(local81, 3);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZIIII)V")
	public static void method9218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			Static567.method8614(arg2, arg3, Static186.anIntArrayArray12[arg1], arg0);
		} else {
			Static567.method8614(arg3, arg2, Static186.anIntArrayArray12[arg1], arg0);
		}
	}
}
