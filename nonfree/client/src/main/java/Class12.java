import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "[Lclient!g;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public int anInt407;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt408;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ub;Z)V")
	public static void method276(@OriginalArg(0) Class39 arg0) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "frame_head.dat"));
			@Pc(30) Class1_Sub3_Sub3 local30 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "frame_tran1.dat"));
			@Pc(40) Class1_Sub3_Sub3 local40 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "frame_tran2.dat"));
			@Pc(50) Class1_Sub3_Sub3 local50 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "frame_del.dat"));
			@Pc(53) int local53 = local11.method393();
			@Pc(56) int local56 = local11.method393();
			aClass12Array1 = new Class12[local56 + 1];
			@Pc(64) int[] local64 = new int[500];
			@Pc(67) int[] local67 = new int[500];
			@Pc(70) int[] local70 = new int[500];
			@Pc(73) int[] local73 = new int[500];
			for (@Pc(75) int local75 = 0; local75 < local53; local75++) {
				@Pc(80) int local80 = local11.method393();
				@Pc(88) Class12 local88 = aClass12Array1[local80] = new Class12();
				local88.anInt407 = local50.method391();
				@Pc(95) int local95 = local11.method393();
				@Pc(99) Class10 local99 = Class10.aClass10Array1[local95];
				local88.aClass10_1 = local99;
				@Pc(105) int local105 = local11.method391();
				@Pc(107) int local107 = -1;
				@Pc(109) int local109 = 0;
				@Pc(116) int local116;
				for (@Pc(111) int local111 = 0; local111 < local105; local111++) {
					local116 = local30.method391();
					if (local116 > 0) {
						if (local99.anIntArray128[local111] != 0) {
							for (@Pc(127) int local127 = local111 - 1; local127 > local107; local127--) {
								if (local99.anIntArray128[local127] == 0) {
									local64[local109] = local127;
									local67[local109] = 0;
									local70[local109] = 0;
									local73[local109] = 0;
									local109++;
									break;
								}
							}
						}
						local64[local109] = local111;
						@Pc(163) short local163 = 0;
						if (local99.anIntArray128[local64[local109]] == 3) {
							local163 = 128;
						}
						if ((local116 & 0x1) == 0) {
							local67[local109] = local163;
						} else {
							local67[local109] = local40.method404();
						}
						if ((local116 & 0x2) == 0) {
							local70[local109] = local163;
						} else {
							local70[local109] = local40.method404();
						}
						if ((local116 & 0x4) == 0) {
							local73[local109] = local163;
						} else {
							local73[local109] = local40.method404();
						}
						local107 = local111;
						local109++;
					}
				}
				local88.anInt408 = local109;
				local88.anIntArray130 = new int[local109];
				local88.anIntArray131 = new int[local109];
				local88.anIntArray132 = new int[local109];
				local88.anIntArray133 = new int[local109];
				for (local116 = 0; local116 < local109; local116++) {
					local88.anIntArray130[local116] = local64[local116];
					local88.anIntArray131[local116] = local67[local116];
					local88.anIntArray132[local116] = local70[local116];
					local88.anIntArray133[local116] = local73[local116];
				}
			}
		} catch (@Pc(286) RuntimeException local286) {
			signlink.reporterror("78865, " + arg0 + ", " + true + ", " + local286.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
