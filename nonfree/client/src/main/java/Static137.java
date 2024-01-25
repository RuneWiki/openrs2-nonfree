import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "Lclient!ew;")
	public static final Class89 aClass89_5 = new Class89(1);

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "Lclient!ew;")
	public static final Class89 aClass89_6 = new Class89(2);

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "Lclient!ew;")
	public static final Class89 aClass89_7 = new Class89(4);

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "Lclient!ew;")
	public static final Class89 aClass89_8 = new Class89(1);

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "Lclient!ew;")
	public static final Class89 aClass89_9 = new Class89(2);

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "Lclient!ew;")
	public static final Class89 aClass89_10 = new Class89(4);

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "Lclient!ew;")
	public static final Class89 aClass89_11 = new Class89(2);

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "Lclient!ew;")
	public static final Class89 aClass89_12 = new Class89(4);

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
	public static int anInt3519 = -1;

	@OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
	public static int anInt3520 = 0;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	public static void method3122() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static394.anInt7540; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static462.anInt8391; local13++) {
				if (Static164.method7303(local7, true, local13, local9, Static170.aClass106ArrayArrayArray1)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
	public static void method3123() {
		for (@Pc(7) int local7 = 0; local7 < Static244.aByteArrayArrayArray10.length; local7++) {
			for (@Pc(16) int local16 = 0; local16 < Static244.aByteArrayArrayArray10[0].length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static244.aByteArrayArrayArray10[0][0].length; local20++) {
					Static244.aByteArrayArrayArray10[local7][local16][local20] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V")
	public static void method3124() {
		for (@Pc(10) Class3_Sub1_Sub10 local10 = (Class3_Sub1_Sub10) Static379.aClass30_9.method780(); local10 != null; local10 = (Class3_Sub1_Sub10) Static379.aClass30_9.method783()) {
			if (local10.anInt5812 > 1) {
				local10.anInt5812 = 0;
				Static54.aClass112_23.method3636(((Class3_Sub1_Sub4) local10.aClass30_7.aClass3_Sub1_7.aClass3_Sub1_66).aLong73, local10);
				local10.aClass30_7.method778();
			}
		}
		Static462.anInt8390 = 0;
		Static443.anInt8026 = 0;
		Static187.aClass276_28.method6910();
		Static107.aClass307_15.method7427();
		Static379.aClass30_9.method778();
		Static445.method6747(Static568.aClass3_Sub1_Sub4_4);
	}
}
