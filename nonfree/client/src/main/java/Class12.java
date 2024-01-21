import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private static int anInt403;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[Lclient!g;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "B")
	private static byte aByte32 = 4;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt404;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt405;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!ub;)V")
	public static void method274(@OriginalArg(0) byte arg0, @OriginalArg(1) Class39 arg1) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg1.method528(aByte32, "frame_head.dat", null), 0);
			@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg1.method528(aByte32, "frame_tran1.dat", null), 0);
			@Pc(31) Class1_Sub3_Sub3 local31 = new Class1_Sub3_Sub3(arg1.method528(aByte32, "frame_tran2.dat", null), 0);
			@Pc(41) Class1_Sub3_Sub3 local41 = new Class1_Sub3_Sub3(arg1.method528(aByte32, "frame_del.dat", null), 0);
			@Pc(44) int local44 = local11.method385();
			@Pc(47) int local47 = local11.method385();
			aClass12Array1 = new Class12[local47 + 1];
			if (arg0 != 8) {
				anInt403 = 62;
			}
			@Pc(60) int[] local60 = new int[500];
			@Pc(63) int[] local63 = new int[500];
			@Pc(66) int[] local66 = new int[500];
			@Pc(69) int[] local69 = new int[500];
			for (@Pc(71) int local71 = 0; local71 < local44; local71++) {
				@Pc(76) int local76 = local11.method385();
				@Pc(84) Class12 local84 = aClass12Array1[local76] = new Class12();
				local84.anInt404 = local41.method383();
				@Pc(91) int local91 = local11.method385();
				@Pc(95) Class10 local95 = Class10.aClass10Array1[local91];
				local84.aClass10_1 = local95;
				@Pc(101) int local101 = local11.method383();
				@Pc(103) int local103 = -1;
				@Pc(105) int local105 = 0;
				@Pc(112) int local112;
				for (@Pc(107) int local107 = 0; local107 < local101; local107++) {
					local112 = local21.method383();
					if (local112 > 0) {
						if (local95.anIntArray128[local107] != 0) {
							for (@Pc(123) int local123 = local107 - 1; local123 > local103; local123--) {
								if (local95.anIntArray128[local123] == 0) {
									local60[local105] = local123;
									local63[local105] = 0;
									local66[local105] = 0;
									local69[local105] = 0;
									local105++;
									break;
								}
							}
						}
						local60[local105] = local107;
						@Pc(159) short local159 = 0;
						if (local95.anIntArray128[local60[local105]] == 3) {
							local159 = 128;
						}
						if ((local112 & 0x1) == 0) {
							local63[local105] = local159;
						} else {
							local63[local105] = local31.method396();
						}
						if ((local112 & 0x2) == 0) {
							local66[local105] = local159;
						} else {
							local66[local105] = local31.method396();
						}
						if ((local112 & 0x4) == 0) {
							local69[local105] = local159;
						} else {
							local69[local105] = local31.method396();
						}
						local103 = local107;
						local105++;
					}
				}
				local84.anInt405 = local105;
				local84.anIntArray130 = new int[local105];
				local84.anIntArray131 = new int[local105];
				local84.anIntArray132 = new int[local105];
				local84.anIntArray133 = new int[local105];
				for (local112 = 0; local112 < local105; local112++) {
					local84.anIntArray130[local112] = local60[local112];
					local84.anIntArray131[local112] = local63[local112];
					local84.anIntArray132[local112] = local66[local112];
					local84.anIntArray133[local112] = local69[local112];
				}
			}
		} catch (@Pc(282) RuntimeException local282) {
			signlink.reporterror("46159, " + arg0 + ", " + arg1 + ", " + local282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
