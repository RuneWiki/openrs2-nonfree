import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	public static int anInt973;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!me;")
	public static Class1_Sub11_Sub2 aClass1_Sub11_Sub2_1;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
	public static int anInt974;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	public static int anInt969 = 0;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!ed;")
	public static Class23 aClass23_377 = Static169.method2903("VOLL");

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public static int anInt970 = 0;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!td;")
	public static Class79 aClass79_4 = new Class79(30);

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Lclient!ff;")
	public static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_2 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "[J")
	public static long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_378 = Static169.method2903("k");

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "J")
	public static long aLong30 = 0L;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(JI)V")
	public static void method583(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static40.method669(arg0 - 1L);
			Static40.method669(1L);
		} else {
			Static40.method669(arg0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method584() {
		aClass1_Sub11_Sub2_1 = null;
		aClass23_377 = null;
		aClass23_378 = null;
		aClass79_4 = null;
		aLongArray2 = null;
		aClass1_Sub8_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)V")
	public static void method585(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub21 local12 = (Class1_Sub21) Static82.aClass10_6.method256((long) arg0);
		if (local12 != null) {
			for (@Pc(23) int local23 = 0; local23 < local12.anIntArray513.length; local23++) {
				local12.anIntArray513[local23] = -1;
				local12.anIntArray515[local23] = 0;
			}
		}
	}
}
