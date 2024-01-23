import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
	public static int anInt152;

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
	public static int anInt155;

	@OriginalMember(owner = "client!hg", name = "O", descriptor = "Lclient!ii;")
	public static Class1_Sub10_Sub2 aClass1_Sub10_Sub2_2;

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString13 = "Loaded title screen";

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
	public static int anInt163 = 0;

	@OriginalMember(owner = "client!hg", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString14 = "rating: ";

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)V")
	public static void method202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static90.anIntArray207[arg1] = arg0;
		@Pc(14) Class1_Sub15 local14 = (Class1_Sub15) Static37.aClass186_4.method4570((long) arg1);
		if (local14 == null) {
			local14 = new Class1_Sub15(4611686018427387905L);
			Static37.aClass186_4.method4575((long) arg1, local14);
		} else if (local14.aLong99 != 4611686018427387905L) {
			local14.aLong99 = Static258.method3967() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	public static void method203() {
		Static289.aClass89_47.method2273(5);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIII)V")
	public static void method204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class9 local3 = new Class9();
		local3.anInt291 = arg1 / 128;
		local3.anInt288 = arg2 / 128;
		local3.anInt280 = arg3 / 128;
		local3.anInt299 = arg4 / 128;
		local3.anInt295 = arg0;
		local3.anInt292 = arg1;
		local3.anInt278 = arg2;
		local3.anInt287 = arg3;
		local3.anInt277 = arg4;
		local3.anInt289 = arg5;
		local3.anInt282 = arg6;
		Static41.aClass9Array1[Static13.anInt357++] = local3;
	}
}
