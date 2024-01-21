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
	private int anInt382;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ub;Z)V")
	public static void method261(@OriginalArg(0) Class39 arg0) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "base_head.dat"));
			@Pc(27) Class1_Sub3_Sub3 local27 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "base_type.dat"));
			@Pc(37) Class1_Sub3_Sub3 local37 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "base_label.dat"));
			@Pc(40) int local40 = local11.method393();
			@Pc(43) int local43 = local11.method393();
			aClass10Array1 = new Class10[local43 + 1];
			for (@Pc(50) int local50 = 0; local50 < local40; local50++) {
				@Pc(55) int local55 = local11.method393();
				@Pc(58) int local58 = local11.method391();
				@Pc(61) int[] local61 = new int[local58];
				@Pc(64) int[][] local64 = new int[local58][];
				for (@Pc(66) int local66 = 0; local66 < local58; local66++) {
					local61[local66] = local27.method391();
					@Pc(76) int local76 = local37.method391();
					local64[local66] = new int[local76];
					for (@Pc(83) int local83 = 0; local83 < local76; local83++) {
						local64[local66][local83] = local37.method391();
					}
				}
				aClass10Array1[local55] = new Class10();
				aClass10Array1[local55].anInt382 = local58;
				aClass10Array1[local55].anIntArray128 = local61;
				aClass10Array1[local55].anIntArrayArray11 = local64;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("43531, " + arg0 + ", " + true + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	private Class10() {
	}
}
