import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
	public static int anInt5269;

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_40 = new Class216();

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "Lclient!se;")
	public static final Class179 aClass179_9 = new Class179(128);

	@OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
	public static int anInt5270 = 16777215;

	@OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
	public static int anInt5271 = 0;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
	public static void method4739() {
		for (@Pc(8) int local8 = 0; local8 < Static95.anInt6378; local8++) {
			@Pc(14) int local14 = Static102.anIntArray217[local8];
			@Pc(18) Class62_Sub1_Sub2_Sub2 local18 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local14];
			@Pc(22) int local22 = Static269.aClass2_Sub10_Sub1_3.method4421();
			if ((local22 & 0x8) != 0) {
				local22 += Static269.aClass2_Sub10_Sub1_3.method4421() << 8;
			}
			Static159.method3015(local22, local18, local14);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	public static void method4740(@OriginalArg(0) int arg0) {
		Static120.anInt2601 = -1;
		Static109.anInt2412 = arg0;
		Static120.anInt2601 = -1;
		Static19.method675();
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)V")
	public static void method4741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass62_Sub5_2 != null) {
			local7.aClass62_Sub5_2 = null;
		}
		if (local7.aClass62_Sub5_1 != null) {
			local7.aClass62_Sub5_1 = null;
		}
	}
}
