import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!ql", name = "V", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_160 = new Class107(100, 0);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)V")
	public static void method4653(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub6 local12 = Static371.method5808(2, arg0);
		local12.method1775();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
	public static void method4656(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static164.anInt3043 = 1;
		Static134.anInt2694 = -1;
		Static228.method3481(arg0, arg1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ul;IZIII)V")
	public static void method4657(@OriginalArg(0) Class246 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static286.anInt5015 = 0;
		Static390.anInt6278 = 1;
		Static23.anInt5191 = 10000;
		Static157.aClass246_114 = arg0;
		Static59.aBoolean86 = false;
		Static152.anInt2905 = arg2;
		Static53.anInt991 = arg1;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III[B)[B")
	public static byte[] method4662(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[32768];
		Static468.method4329(arg1, arg0, local14, 0, 32768);
		return local14;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	public static void method4663() {
		for (@Pc(11) int local11 = 0; local11 < Static5.anInt163; local11++) {
			@Pc(17) int local17 = Static331.anIntArray648[local11];
			@Pc(21) Class31_Sub2_Sub1_Sub2 local21 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local17];
			if (local21 != null) {
				Static383.method5182(local21.aClass53_1.anInt1728, local21);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!od;Ljava/lang/Object;B)V")
	public static void method4664(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static224.method3441(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
