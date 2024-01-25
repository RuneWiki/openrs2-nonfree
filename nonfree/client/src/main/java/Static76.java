import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dq", name = "x", descriptor = "Lclient!ih;")
	public static Class116 aClass116_34;

	@OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
	public static int anInt7822;

	@OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
	public static int anInt7823;

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_415 = new Class123(100, 12);

	@OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
	public static int anInt7824 = -1;

	@OriginalMember(owner = "client!dq", name = "F", descriptor = "[Lclient!kt;")
	public static final Class6_Sub2_Sub8[] aClass6_Sub2_Sub8Array14 = new Class6_Sub2_Sub8[14];

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	public static void method6388() {
		Static47.aClass15_1.method6105();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static322.aLongArray5[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static405.aLongArray8[local22] = 0L;
		}
		Static254.anInt4642 = 0;
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(B)V")
	public static void method6393() {
		for (@Pc(3) int local3 = 0; local3 < Static415.anInt7434; local3++) {
			@Pc(14) Class241 local14 = Static302.aClass241Array1[local3];
			if (local14.aByte102 == 2) {
				if (local14.aClass6_Sub4_Sub1_4 == null) {
					local14.anInt7113 = Integer.MIN_VALUE;
				} else {
					Static360.aClass6_Sub4_Sub4_2.method5907(local14.aClass6_Sub4_Sub1_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "([Ljava/lang/Object;B[J)V")
	public static void method6394(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static84.method1578(0, arg1, arg1.length - 1, arg0);
	}
}
