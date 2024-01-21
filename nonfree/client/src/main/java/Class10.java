import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private static int anInt269 = -377;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	public int anInt270;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Lclient!e;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	public int anInt271;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "[I")
	public int[] anIntArray111;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!tb;)V")
	public static void method193(@OriginalArg(1) Class34 arg0) {
		@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg0.method428(null, "frame_head.dat"), (byte) 63);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method428(null, "frame_tran1.dat"), (byte) 63);
		@Pc(31) Class1_Sub3_Sub3 local31 = new Class1_Sub3_Sub3(arg0.method428(null, "frame_tran2.dat"), (byte) 63);
		@Pc(46) Class1_Sub3_Sub3 local46 = new Class1_Sub3_Sub3(arg0.method428(null, "frame_del.dat"), (byte) 63);
		@Pc(49) int local49 = local11.method333();
		@Pc(52) int local52 = local11.method333();
		aClass10Array1 = new Class10[local52 + 1];
		@Pc(60) int[] local60 = new int[500];
		@Pc(63) int[] local63 = new int[500];
		@Pc(66) int[] local66 = new int[500];
		@Pc(69) int[] local69 = new int[500];
		for (@Pc(71) int local71 = 0; local71 < local49; local71++) {
			@Pc(76) int local76 = local11.method333();
			@Pc(84) Class10 local84 = aClass10Array1[local76] = new Class10();
			local84.anInt270 = local46.method331();
			@Pc(91) int local91 = local11.method333();
			@Pc(95) Class8 local95 = Class8.aClass8Array1[local91];
			local84.aClass8_1 = local95;
			@Pc(101) int local101 = local11.method331();
			@Pc(103) int local103 = -1;
			@Pc(105) int local105 = 0;
			@Pc(112) int local112;
			for (@Pc(107) int local107 = 0; local107 < local101; local107++) {
				local112 = local21.method331();
				if (local112 > 0) {
					if (local95.anIntArray109[local107] != 0) {
						for (@Pc(123) int local123 = local107 - 1; local123 > local103; local123--) {
							if (local95.anIntArray109[local123] == 0) {
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
					if (local95.anIntArray109[local60[local105]] == 3) {
						local159 = 128;
					}
					if ((local112 & 0x1) == 0) {
						local63[local105] = local159;
					} else {
						local63[local105] = local31.method344();
					}
					if ((local112 & 0x2) == 0) {
						local66[local105] = local159;
					} else {
						local66[local105] = local31.method344();
					}
					if ((local112 & 0x4) == 0) {
						local69[local105] = local159;
					} else {
						local69[local105] = local31.method344();
					}
					local103 = local107;
					local105++;
				}
			}
			local84.anInt271 = local105;
			local84.anIntArray111 = new int[local105];
			local84.anIntArray112 = new int[local105];
			local84.anIntArray113 = new int[local105];
			local84.anIntArray114 = new int[local105];
			for (local112 = 0; local112 < local105; local112++) {
				local84.anIntArray111[local112] = local60[local112];
				local84.anIntArray112[local112] = local63[local112];
				local84.anIntArray113[local112] = local66[local112];
				local84.anIntArray114[local112] = local69[local112];
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	private Class10() {
	}
}
