import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "Lclient!qe;")
	public static Class199 aClass199_13;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame12;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_202 = new Class81(62, 6);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)V")
	public static void method6009(@OriginalArg(1) byte arg0) {
		if (Static440.aByteArrayArrayArray17 == null) {
			Static440.aByteArrayArrayArray17 = new byte[4][Static81.anInt1950][Static171.anInt3288];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(20) int local20 = 0; local20 < Static81.anInt1950; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static171.anInt3288; local24++) {
					Static440.aByteArrayArrayArray17[local14][local20][local24] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "()V")
	public static void method6013() {
		for (@Pc(1) int local1 = 0; local1 < Static450.anInt7838; local1++) {
			@Pc(6) Class4_Sub2 local6 = Static428.aClass4_Sub2Array3[local1];
			Static389.method5364(local6);
			Static428.aClass4_Sub2Array3[local1] = null;
		}
		Static450.anInt7838 = 0;
	}
}
