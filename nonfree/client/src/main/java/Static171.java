import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!io", name = "N", descriptor = "Lclient!ul;")
	public static Class246 aClass246_99;

	@OriginalMember(owner = "client!io", name = "S", descriptor = "Lclient!sk;")
	public static Class1_Sub39 aClass1_Sub39_1;

	@OriginalMember(owner = "client!io", name = "Q", descriptor = "F")
	public static float aFloat33 = 1.0F;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	public static void method2754() {
		for (@Pc(8) int local8 = 0; local8 < Static2.aByteArrayArrayArray1.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static2.aByteArrayArrayArray1[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static2.aByteArrayArrayArray1[0][0].length; local16++) {
					Static2.aByteArrayArrayArray1[local8][local12][local16] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(III)Z")
	public static boolean method2755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static23.method4301(arg0, arg1) || Static196.method3038(arg1, arg0);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lclient!nb;")
	public static Class114 method2756(@OriginalArg(0) Component arg0) {
		return new Class114_Sub1(arg0, true);
	}
}
