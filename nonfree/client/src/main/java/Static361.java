import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[Lclient!hd;")
	public static Class103_Sub1[] aClass103_Sub1Array4;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!ln;")
	public static Class157 aClass157_7;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_94 = new Class177(29, -1);

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public static int anInt6653 = -1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)Z")
	public static boolean method5080(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Z")
	public static boolean method5081() {
		return Static126.anInt2794 > 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIBLclient!id;)V")
	public static void method5082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub21 arg3) {
		@Pc(16) long local16 = (long) (arg1 | arg0 << 14 | arg2 << 28);
		@Pc(22) Class1_Sub14 local22 = (Class1_Sub14) Static156.aClass38_16.method765(local16);
		if (local22 == null) {
			local22 = new Class1_Sub14();
			Static156.aClass38_16.method766(local22, local16);
			local22.aClass203_9.method4551(arg3);
			return;
		}
		@Pc(53) Class168 local53 = Static43.aClass57_1.method1414(arg3.anInt3507);
		@Pc(56) int local56 = local53.anInt4845;
		if (local53.anInt4854 == 1) {
			local56 *= arg3.anInt3508 + 1;
		}
		for (@Pc(73) Class1_Sub21 local73 = (Class1_Sub21) local22.aClass203_9.method4548(); local73 != null; local73 = (Class1_Sub21) local22.aClass203_9.method4545()) {
			local53 = Static43.aClass57_1.method1414(local73.anInt3507);
			@Pc(84) int local84 = local53.anInt4845;
			if (local53.anInt4854 == 1) {
				local84 *= local73.anInt3508 + 1;
			}
			if (local56 > local84) {
				Static28.method564(local73, arg3);
				return;
			}
		}
		local22.aClass203_9.method4551(arg3);
	}
}
