import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "B")
	private static byte aByte29 = 4;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!ub;)V")
	public static void method260(@OriginalArg(0) byte arg0, @OriginalArg(1) Class39 arg1) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg1.method528(aByte29, "base_head.dat", null), 0);
			@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg1.method528(aByte29, "base_type.dat", null), 0);
			if (arg0 != 8) {
				for (@Pc(26) int local26 = 1; local26 > 0; local26++) {
				}
			}
			@Pc(41) Class1_Sub3_Sub3 local41 = new Class1_Sub3_Sub3(arg1.method528(aByte29, "base_label.dat", null), 0);
			@Pc(44) int local44 = local11.method385();
			@Pc(47) int local47 = local11.method385();
			aClass10Array1 = new Class10[local47 + 1];
			for (@Pc(54) int local54 = 0; local54 < local44; local54++) {
				@Pc(59) int local59 = local11.method385();
				@Pc(62) int local62 = local11.method383();
				@Pc(65) int[] local65 = new int[local62];
				@Pc(68) int[][] local68 = new int[local62][];
				for (@Pc(70) int local70 = 0; local70 < local62; local70++) {
					local65[local70] = local21.method383();
					@Pc(80) int local80 = local41.method383();
					local68[local70] = new int[local80];
					for (@Pc(87) int local87 = 0; local87 < local80; local87++) {
						local68[local70][local87] = local41.method383();
					}
				}
				aClass10Array1[local59] = new Class10();
				aClass10Array1[local59].anInt379 = local62;
				aClass10Array1[local59].anIntArray128 = local65;
				aClass10Array1[local59].anIntArrayArray11 = local68;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("9241, " + arg0 + ", " + arg1 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	private Class10() {
	}
}
