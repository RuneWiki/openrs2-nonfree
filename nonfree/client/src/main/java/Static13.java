import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!fha;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!oh;")
	public static Class273 aClass273_1 = null;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_5 = new Class349(43, 3);

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
	public static int anInt194 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!lb;[IIII[I)Lclient!me;")
	public static Class1_Sub2 method210(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(24) int local24;
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (!arg0.method9843(Static408.aClass295_11, Static243.aClass158_10)) {
			@Pc(22) int[] local22 = new int[arg2 * arg3];
			for (local24 = 0; local24 < arg3; local24++) {
				local35 = arg2 * local24 + arg1[local24];
				for (local37 = 0; local37 < arg4[local24]; local37++) {
					local22[local35++] = -16777216;
				}
			}
			return new Class1_Sub2(arg0, arg2, arg3, local22);
		}
		@Pc(74) byte[] local74 = new byte[arg2 * arg3];
		for (local24 = 0; local24 < arg3; local24++) {
			local35 = local24 * arg2 + arg1[local24];
			for (local37 = 0; local37 < arg4[local24]; local37++) {
				local74[local35++] = -1;
			}
		}
		return new Class1_Sub2(arg0, arg2, arg3, local74);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FZIBIIII)[I")
	public static int[] method211(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub11_Sub20 local10 = new Class2_Sub11_Sub20();
		local10.anInt7854 = 4;
		local10.anInt7849 = 35;
		local10.anInt7851 = 8;
		local10.anInt7859 = (int) (arg0 * 4096.0F);
		local10.anInt7860 = 8;
		local10.aBoolean687 = true;
		local10.method9530();
		Static7.method98(1, 2048);
		local10.method7010(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
	public static boolean method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static135.method1980(arg0, arg1)) {
			return Static71.method4092(arg1, arg0) | (arg0 & 0x9000) != 0 | Static267.method3771(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | Static561.method7806(arg0, arg1) | Static379.method5481(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!mv;)Z")
	public static boolean method213(@OriginalArg(1) int arg0, @OriginalArg(2) Class252 arg1) {
		Static23.aClass86_4.method7028(arg1.anIntArray474[arg0], arg1.anIntArray473[arg0], arg1.anIntArray472[arg0], Static370.anIntArray281);
		@Pc(22) int local22 = Static370.anIntArray281[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray114[arg0] = (short) (Static693.anInt10661 * Static370.anIntArray281[0] / local22 + Static101.anInt8907);
			arg1.aShortArray113[arg0] = (short) (Static370.anIntArray281[1] * Static485.anInt7770 / local22 + Static396.anInt6520);
			arg1.aShortArray112[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method215() {
		if (Static391.anInt6484 != 0) {
			Static560.aClass221_3.method5170();
			Static154.method2202();
			Static3.method48(15234);
		}
	}
}
