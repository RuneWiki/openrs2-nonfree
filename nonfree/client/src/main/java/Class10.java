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
	private int anInt296;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method229(@OriginalArg(0) int arg0, @OriginalArg(1) Class36 arg1) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg1.method479((byte) 6, null, "base_head.dat"), 4);
			@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg1.method479((byte) 6, null, "base_type.dat"), 4);
			@Pc(31) Class1_Sub3_Sub3 local31 = new Class1_Sub3_Sub3(arg1.method479((byte) 6, null, "base_label.dat"), 4);
			@Pc(34) int local34 = local11.method382();
			@Pc(38) boolean local38 = false;
			@Pc(41) int local41 = local11.method382();
			aClass10Array1 = new Class10[local41 + 1];
			for (@Pc(48) int local48 = 0; local48 < local34; local48++) {
				@Pc(53) int local53 = local11.method382();
				@Pc(56) int local56 = local11.method380();
				@Pc(59) int[] local59 = new int[local56];
				@Pc(62) int[][] local62 = new int[local56][];
				for (@Pc(64) int local64 = 0; local64 < local56; local64++) {
					local59[local64] = local21.method380();
					@Pc(74) int local74 = local31.method380();
					local62[local64] = new int[local74];
					for (@Pc(81) int local81 = 0; local81 < local74; local81++) {
						local62[local64][local81] = local31.method380();
					}
				}
				aClass10Array1[local53] = new Class10();
				aClass10Array1[local53].anInt296 = local56;
				aClass10Array1[local53].anIntArray115 = local59;
				aClass10Array1[local53].anIntArrayArray12 = local62;
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("55796, " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	private Class10() {
	}
}
