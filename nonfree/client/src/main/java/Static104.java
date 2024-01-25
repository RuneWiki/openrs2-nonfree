import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_62 = new Class48(74, 8);

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_41 = new Class211(1, 3);

	@OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
	public static int anInt1830 = 0;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "[Lclient!nh;")
	public static final Class56_Sub1[] aClass56_Sub1Array1 = new Class56_Sub1[29];

	@OriginalMember(owner = "client!fn", name = "C", descriptor = "J")
	public static long aLong56 = -1L;

	@OriginalMember(owner = "client!fn", name = "F", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_42 = new Class211(68, 20);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
	public static void method1484() {
		@Pc(8) Class208[] local8 = Class1_Sub6_Sub13.aClass208Array1;
		synchronized (Class1_Sub6_Sub13.aClass208Array1) {
			for (@Pc(12) int local12 = 0; local12 < Class1_Sub6_Sub13.aClass208Array1.length; local12++) {
				Class1_Sub6_Sub13.aClass208Array1[local12] = new Class208();
				Static262.anIntArray742[local12] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1485(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub6_Sub11 local13 = Static295.method4455(arg1, 3);
		local13.method3004();
		local13.aString45 = arg0;
	}
}
