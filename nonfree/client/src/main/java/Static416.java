import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!uq", name = "U", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!uq", name = "A", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_198 = new Class158("K", "T", "K", "K");

	@OriginalMember(owner = "client!uq", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[200];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	public static void method5648() {
		Static81.method1504();
		for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
			Static19.aClass120Array1[local6].method3044();
		}
		Static249.method3728();
		Static312.method4476();
		System.gc();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static313.method4479(arg1, arg0) | (arg1 & 0x800) != 0 || Static427.method5765(arg0, arg1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[[[Lclient!ut;)V")
	public static void method5655(@OriginalArg(1) Class252[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class252[][] local6 = arg0[local1];
			for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
				for (@Pc(11) int local11 = 0; local11 < local6[local8].length; local11++) {
					@Pc(18) Class252 local18 = local6[local8][local11];
					if (local18 != null) {
						if (local18.aClass30_Sub4_2 instanceof Interface5) {
							((Interface5) local18.aClass30_Sub4_2).method5734();
						}
						if (local18.aClass30_Sub2_2 instanceof Interface5) {
							((Interface5) local18.aClass30_Sub2_2).method5734();
						}
						if (local18.aClass30_Sub2_3 instanceof Interface5) {
							((Interface5) local18.aClass30_Sub2_3).method5734();
						}
						if (local18.aClass30_Sub3_3 instanceof Interface5) {
							((Interface5) local18.aClass30_Sub3_3).method5734();
						}
						if (local18.aClass30_Sub3_2 instanceof Interface5) {
							((Interface5) local18.aClass30_Sub3_2).method5734();
						}
						for (@Pc(74) Class208 local74 = local18.aClass208_3; local74 != null; local74 = local74.aClass208_2) {
							@Pc(78) Class30_Sub1 local78 = local74.aClass30_Sub1_1;
							if (local78 instanceof Interface5) {
								((Interface5) local78).method5734();
							}
						}
					}
				}
			}
		}
	}
}
