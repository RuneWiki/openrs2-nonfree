import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
	public static int anInt6089;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(Z)V")
	public static void method5410() {
		Static187.aString36 = "";
		Static314.aString72 = "";
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!iu;Z)V")
	public static void method5411(@OriginalArg(0) Class4_Sub3_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort108; local2 <= arg0.aShort107; local2++) {
			for (@Pc(6) int local6 = arg0.aShort109; local6 <= arg0.aShort110; local6++) {
				@Pc(16) Class89 local16 = Static63.aClass89ArrayArrayArray1[arg0.aByte146][local2][local6];
				if (local16 != null) {
					@Pc(21) Class58 local21 = local16.aClass58_2;
					@Pc(23) Class58 local23 = null;
					while (local21 != null) {
						if (local21.aClass4_Sub3_Sub3_1 == arg0) {
							if (local23 == null) {
								local16.aClass58_2 = local21.aClass58_1;
							} else {
								local23.aClass58_1 = local21.aClass58_1;
							}
							local21.method1088();
							break;
						}
						local23 = local21;
						local21 = local21.aClass58_1;
					}
				}
			}
		}
		if (!arg1) {
			Static50.method919(arg0);
		}
	}
}
