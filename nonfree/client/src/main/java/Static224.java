import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame6;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "[Lclient!rs;")
	public static Class260[] aClass260Array1;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_191 = new Class296(59, -1);

	@OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
	public static final int[] anIntArray439 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!hda;)Ljava/lang/String;")
	public static String method3889(@OriginalArg(1) Class1_Sub24 arg0) {
		return arg0.aString35 == null || arg0.aString35.length() <= 0 ? arg0.aString36 : arg0.aString36 + Static229.aClass306_55.method7165(Static179.anInt3168) + arg0.aString35;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!dp;")
	public static Class69 method3891(@OriginalArg(1) int arg0) {
		@Pc(10) Class69 local10 = (Class69) Static104.aClass313_9.method7406((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static546.aClass171_61.method4339(0, arg0);
		local10 = new Class69();
		if (local20 != null) {
			local10.method1644(new Class1_Sub6(local20));
		}
		local10.method1645();
		Static104.aClass313_9.method7399((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BIIIZILclient!kr;)V")
	public static void method3892(@OriginalArg(2) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class171 arg2) {
		Static302.anInt5579 = 1;
		Static38.anInt834 = 0;
		Static55.aBoolean70 = false;
		Static351.aClass171_102 = arg2;
		Static215.anInt4126 = arg0;
		Static101.anInt7631 = 2;
		Static101.anInt7625 = arg1;
	}
}
