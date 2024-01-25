import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!ra;")
	public static Class170 aClass170_92;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Lclient!en;")
	public static Class59 aClass59_7;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!ra;")
	public static Class170 aClass170_93;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
	public static int anInt5401 = 0;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "[Lclient!pi;")
	public static final Class159_Sub1[] aClass159_Sub1Array1 = new Class159_Sub1[29];

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)V")
	public static void method4707(@OriginalArg(0) boolean arg0) {
		Static153.method2894();
		if (Static247.anInt3874 != 30 && Static247.anInt3874 != 25) {
			return;
		}
		Static256.anInt4995++;
		if (Static256.anInt4995 < 50 && !arg0) {
			return;
		}
		Static256.anInt4995 = 0;
		if (!Static222.aBoolean326 && Static95.aClass68_23 != null) {
			Static335.aClass5_Sub1_Sub1_3.method174(111);
			try {
				Static95.aClass68_23.method2002(Static335.aClass5_Sub1_Sub1_3.anInt2029, Static335.aClass5_Sub1_Sub1_3.aByteArray18);
				Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
			} catch (@Pc(53) IOException local53) {
				Static222.aBoolean326 = true;
			}
		}
		Static153.method2894();
	}
}
