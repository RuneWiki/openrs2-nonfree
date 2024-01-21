import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	public static int anInt1068 = 0;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt1070 = 0;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "[I")
	public static final int[] anIntArray99 = new int[100];

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)[Lclient!ji;")
	public static Class5_Sub2_Sub10[] method880() {
		@Pc(16) Class5_Sub2_Sub10[] local16 = new Class5_Sub2_Sub10[Static99.anInt2138];
		for (@Pc(18) int local18 = 0; local18 < Static99.anInt2138; local18++) {
			@Pc(28) int local28 = Static210.anIntArray84[local18] * Static153.anIntArray337[local18];
			@Pc(32) byte[] local32 = Static191.aByteArrayArray9[local18];
			@Pc(35) int[] local35 = new int[local28];
			for (@Pc(37) int local37 = 0; local37 < local28; local37++) {
				local35[local37] = Static3.anIntArray9[local32[local37] & 0xFF];
			}
			local16[local18] = new Class5_Sub2_Sub10_Sub1(Static58.anInt1319, Static140.anInt2921, Static146.anIntArray320[local18], Static5.anIntArray10[local18], Static153.anIntArray337[local18], Static210.anIntArray84[local18], local35);
		}
		Static85.method1452();
		return local16;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBI)V")
	public static void method882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static6.anInt151 == 0 || arg0 == 0 || Static198.anInt3860 >= 50 || arg2 == -1) {
			return;
		}
		Static110.anIntArray255[Static198.anInt3860] = arg2;
		Static27.anIntArray34[Static198.anInt3860] = arg0;
		Static103.anIntArray232[Static198.anInt3860] = arg1;
		Static184.aClass21Array1[Static198.anInt3860] = null;
		Static173.anIntArray365[Static198.anInt3860] = 0;
		Static198.anInt3860++;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)I")
	public static int method883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 65536 - Class80.anIntArray327[arg0 * 1024 / arg3] >> 1;
		return (arg1 * local12 >> 16) + (arg2 * (65536 - local12) >> 16);
	}
}
