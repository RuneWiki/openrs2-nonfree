import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method260(@OriginalArg(0) Class39 arg0) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(0, arg0.method528("base_head.dat", null));
			@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(0, arg0.method528("base_type.dat", null));
			@Pc(40) Class1_Sub3_Sub3 local40 = new Class1_Sub3_Sub3(0, arg0.method528("base_label.dat", null));
			@Pc(43) int local43 = local11.method385();
			@Pc(46) int local46 = local11.method385();
			aClass10Array1 = new Class10[local46 + 1];
			for (@Pc(53) int local53 = 0; local53 < local43; local53++) {
				@Pc(58) int local58 = local11.method385();
				@Pc(61) int local61 = local11.method383();
				@Pc(64) int[] local64 = new int[local61];
				@Pc(67) int[][] local67 = new int[local61][];
				for (@Pc(69) int local69 = 0; local69 < local61; local69++) {
					local64[local69] = local21.method383();
					@Pc(79) int local79 = local40.method383();
					local67[local69] = new int[local79];
					for (@Pc(86) int local86 = 0; local86 < local79; local86++) {
						local67[local69][local86] = local40.method383();
					}
				}
				aClass10Array1[local58] = new Class10();
				aClass10Array1[local58].anInt385 = local61;
				aClass10Array1[local58].anIntArray128 = local64;
				aClass10Array1[local58].anIntArrayArray11 = local67;
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("53565, " + arg0 + ", " + 0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	private Class10() {
	}
}
