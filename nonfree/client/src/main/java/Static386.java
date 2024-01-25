import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "Lclient!kd;")
	public static Class6 aClass6_27;

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "[I")
	public static int[] anIntArray467 = new int[2];

	@OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
	public static int anInt6957 = 0;

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
	public static int anInt6960 = -60;

	@OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
	public static int anInt6961 = 765;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIZZI)I")
	public static int method5816(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(8) Class2_Sub22 local8 = Static284.method8371(false, arg2);
		if (local8 == null) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local8.anIntArray219.length; local21++) {
			if (local8.anIntArray219[local21] >= 0 && local8.anIntArray219[local21] < Static570.aClass267_2.anInt7871) {
				@Pc(49) Class245 local49 = Static570.aClass267_2.method6597(local8.anIntArray219[local21]);
				@Pc(59) int local59 = local49.method6277(arg0, Static584.aClass206_2.method4916(arg0).anInt2016);
				if (arg1) {
					local19 += local8.anIntArray220[local21] * local59;
				} else {
					local19 += local59;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5817(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			@Pc(20) char local20 = arg0.charAt(local15);
			if (local20 == '<' || local20 == '>') {
				local8 += 3;
			}
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(local6 + local8);
		for (@Pc(40) int local40 = 0; local40 < local6; local40++) {
			@Pc(45) char local45 = arg0.charAt(local40);
			if (local45 == '<') {
				local38.append("<lt>");
			} else if (local45 == '>') {
				local38.append("<gt>");
			} else {
				local38.append(local45);
			}
		}
		return local38.toString();
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(Z)V")
	public static void method5818() {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			Static276.aBooleanArray32[local1] = false;
		}
		Static644.anInt10296 = -1;
		Static23.anInt718 = -1;
		Static144.anInt3307 = -1;
		Static160.anInt3633 = -1;
		Static259.anInt5081 = 0;
		Static2.anInt31 = 1;
		Static126.anInt2936 = 0;
	}
}
