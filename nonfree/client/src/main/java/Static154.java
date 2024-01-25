import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "Lclient!gb;")
	public static Class71 aClass71_5;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
	public static int anInt6530;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Lclient!bi;")
	public static final Class2_Sub5 aClass2_Sub5_3 = new Class2_Sub5(0, -1);

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
	public static int anInt6526 = 0;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
	public static final int[] anIntArray477 = new int[5];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!tq;II)Lclient!th;")
	public static Class188 method5669(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1) {
		@Pc(9) byte[] local9 = arg1.method5459(arg0, 0);
		return local9 == null ? null : new Class188(local9);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
	public static void method5673() {
		Static210.aClass199_20.method5750();
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
	public static void method5676() {
		Static95.anInt6378 = 0;
		Static322.anInt6489 = 0;
		Static302.method5308();
		Static41.method967();
		Static345.method836();
		Static260.method4739();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static322.anInt6489; local21++) {
			local27 = Static159.anIntArray272[local21];
			if (Static129.aClass62_Sub1_Sub2_Sub2Array1[local27].anInt5333 != Static212.anInt4090) {
				if (Static129.aClass62_Sub1_Sub2_Sub2Array1[local27].anInt5392 > 0) {
					Static105.method2328(Static129.aClass62_Sub1_Sub2_Sub2Array1[local27]);
				}
				Static129.aClass62_Sub1_Sub2_Sub2Array1[local27] = null;
			}
		}
		if (Static71.anInt1574 != Static269.aClass2_Sub10_Sub1_3.anInt4807) {
			throw new RuntimeException("gpp1 pos:" + Static269.aClass2_Sub10_Sub1_3.anInt4807 + " psize:" + Static71.anInt1574);
		}
		for (local27 = 0; local27 < Static214.anInt4133; local27++) {
			if (Static129.aClass62_Sub1_Sub2_Sub2Array1[Static103.anIntArray218[local27]] == null) {
				throw new RuntimeException("gpp2 pos:" + local27 + " size:" + Static214.anInt4133);
			}
		}
	}
}
