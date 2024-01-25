import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_63 = new Class242(20, -1);

	@OriginalMember(owner = "client!lb", name = "R", descriptor = "Lclient!du;")
	public static final Class62 aClass62_27 = new Class62(3, 19);

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_143 = new Class67(102, 2);

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
	public static int anInt4148 = 0;

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_144 = new Class67(25, 4);

	@OriginalMember(owner = "client!lb", name = "W", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIILclient!fu;)V")
	public static void method3280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class87 arg3) {
		for (@Pc(15) Class1_Sub35 local15 = (Class1_Sub35) Static463.aClass14_53.method203(); local15 != null; local15 = (Class1_Sub35) Static463.aClass14_53.method208()) {
			if (local15.anInt5291 == arg1 && local15.anInt5300 == arg2 << 7 && arg0 << 7 == local15.anInt5299 && local15.aClass87_1.anInt1925 == arg3.anInt1925) {
				if (local15.aClass1_Sub9_Sub4_3 != null) {
					Static123.aClass1_Sub9_Sub1_1.method4263(local15.aClass1_Sub9_Sub4_3);
					local15.aClass1_Sub9_Sub4_3 = null;
				}
				if (local15.aClass1_Sub9_Sub4_2 != null) {
					Static123.aClass1_Sub9_Sub1_1.method4263(local15.aClass1_Sub9_Sub4_2);
					local15.aClass1_Sub9_Sub4_2 = null;
				}
				local15.method5953();
				return;
			}
		}
	}
}
