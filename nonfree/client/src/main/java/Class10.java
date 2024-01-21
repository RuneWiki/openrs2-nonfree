import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private static int anInt364 = 4;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Z")
	private static boolean aBoolean95 = true;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!ub;)V")
	public static void method249(@OriginalArg(0) byte arg0, @OriginalArg(1) Class39 arg1) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg1.method516("base_head.dat", null), aBoolean95);
			@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg1.method516("base_type.dat", null), aBoolean95);
			@Pc(31) Class1_Sub3_Sub3 local31 = new Class1_Sub3_Sub3(arg1.method516("base_label.dat", null), aBoolean95);
			@Pc(34) int local34 = local11.method374();
			if (arg0 == 6) {
				@Pc(39) boolean local39 = false;
			} else {
				anInt364 = 266;
			}
			@Pc(46) int local46 = local11.method374();
			aClass10Array1 = new Class10[local46 + 1];
			for (@Pc(53) int local53 = 0; local53 < local34; local53++) {
				@Pc(58) int local58 = local11.method374();
				@Pc(61) int local61 = local11.method372();
				@Pc(64) int[] local64 = new int[local61];
				@Pc(67) int[][] local67 = new int[local61][];
				for (@Pc(69) int local69 = 0; local69 < local61; local69++) {
					local64[local69] = local21.method372();
					@Pc(79) int local79 = local31.method372();
					local67[local69] = new int[local79];
					for (@Pc(86) int local86 = 0; local86 < local79; local86++) {
						local67[local69][local86] = local31.method372();
					}
				}
				aClass10Array1[local58] = new Class10();
				aClass10Array1[local58].anInt365 = local61;
				aClass10Array1[local58].anIntArray128 = local64;
				aClass10Array1[local58].anIntArrayArray11 = local67;
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("55222, " + arg0 + ", " + arg1 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	private Class10() {
	}
}
