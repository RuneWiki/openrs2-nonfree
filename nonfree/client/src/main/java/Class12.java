import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[Lclient!g;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Z")
	private static boolean aBoolean102 = true;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt389;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!ub;)V")
	public static void method263(@OriginalArg(0) byte arg0, @OriginalArg(1) Class39 arg1) {
		try {
			if (arg0 == 6) {
				@Pc(6) boolean local6 = false;
			}
			@Pc(24) Class1_Sub3_Sub3 local24 = new Class1_Sub3_Sub3(arg1.method516("frame_head.dat", null), aBoolean102);
			@Pc(34) Class1_Sub3_Sub3 local34 = new Class1_Sub3_Sub3(arg1.method516("frame_tran1.dat", null), aBoolean102);
			@Pc(44) Class1_Sub3_Sub3 local44 = new Class1_Sub3_Sub3(arg1.method516("frame_tran2.dat", null), aBoolean102);
			@Pc(54) Class1_Sub3_Sub3 local54 = new Class1_Sub3_Sub3(arg1.method516("frame_del.dat", null), aBoolean102);
			@Pc(57) int local57 = local24.method374();
			@Pc(60) int local60 = local24.method374();
			aClass12Array1 = new Class12[local60 + 1];
			@Pc(68) int[] local68 = new int[500];
			@Pc(71) int[] local71 = new int[500];
			@Pc(74) int[] local74 = new int[500];
			@Pc(77) int[] local77 = new int[500];
			for (@Pc(79) int local79 = 0; local79 < local57; local79++) {
				@Pc(84) int local84 = local24.method374();
				@Pc(92) Class12 local92 = aClass12Array1[local84] = new Class12();
				local92.anInt389 = local54.method372();
				@Pc(99) int local99 = local24.method374();
				@Pc(103) Class10 local103 = Class10.aClass10Array1[local99];
				local92.aClass10_1 = local103;
				@Pc(109) int local109 = local24.method372();
				@Pc(111) int local111 = -1;
				@Pc(113) int local113 = 0;
				@Pc(120) int local120;
				for (@Pc(115) int local115 = 0; local115 < local109; local115++) {
					local120 = local34.method372();
					if (local120 > 0) {
						if (local103.anIntArray128[local115] != 0) {
							for (@Pc(131) int local131 = local115 - 1; local131 > local111; local131--) {
								if (local103.anIntArray128[local131] == 0) {
									local68[local113] = local131;
									local71[local113] = 0;
									local74[local113] = 0;
									local77[local113] = 0;
									local113++;
									break;
								}
							}
						}
						local68[local113] = local115;
						@Pc(167) short local167 = 0;
						if (local103.anIntArray128[local68[local113]] == 3) {
							local167 = 128;
						}
						if ((local120 & 0x1) == 0) {
							local71[local113] = local167;
						} else {
							local71[local113] = local44.method385();
						}
						if ((local120 & 0x2) == 0) {
							local74[local113] = local167;
						} else {
							local74[local113] = local44.method385();
						}
						if ((local120 & 0x4) == 0) {
							local77[local113] = local167;
						} else {
							local77[local113] = local44.method385();
						}
						local111 = local115;
						local113++;
					}
				}
				local92.anInt390 = local113;
				local92.anIntArray130 = new int[local113];
				local92.anIntArray131 = new int[local113];
				local92.anIntArray132 = new int[local113];
				local92.anIntArray133 = new int[local113];
				for (local120 = 0; local120 < local113; local120++) {
					local92.anIntArray130[local120] = local68[local120];
					local92.anIntArray131[local120] = local71[local120];
					local92.anIntArray132[local120] = local74[local120];
					local92.anIntArray133[local120] = local77[local120];
				}
			}
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("47342, " + arg0 + ", " + arg1 + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
