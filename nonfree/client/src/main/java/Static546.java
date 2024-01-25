import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "Lclient!ga;")
	public static Class111 aClass111_117;

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject21;

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_216 = new Class81(49, -2);

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[4];

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
	public static void method7407() {
		@Pc(7) Class349[] local7 = Class1_Sub3_Sub19.aClass349Array1;
		synchronized (Class1_Sub3_Sub19.aClass349Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class1_Sub3_Sub19.aClass349Array1.length; local11++) {
				Class1_Sub3_Sub19.aClass349Array1[local11] = new Class349();
				Static371.anIntArray440[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIBII)V")
	public static void method7410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub3_Sub1 local12 = Static374.method5445(10, arg3);
		local12.method491();
		local12.anInt545 = arg1;
		local12.anInt548 = arg0;
		local12.anInt549 = arg2;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!fca;ZZ)V")
	public static void method7412(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt2681;
		@Pc(12) int local12 = (int) arg0.aLong425;
		arg0.method7878();
		if (arg1) {
			Static208.method7272(local8);
		}
		Static83.method1701(local8);
		@Pc(29) Class365 local29 = Static374.method5437(local12);
		if (local29 != null) {
			Static201.method5537(local29);
		}
		Static98.method1830();
		if (!arg2 && Static219.anInt4263 != -1) {
			Static463.method6579(Static219.anInt4263, 1);
		}
		@Pc(52) Class282 local52 = new Class282(Static68.aClass356_4);
		for (@Pc(67) Class1_Sub16 local67 = (Class1_Sub16) local52.method6389(); local67 != null; local67 = (Class1_Sub16) local52.method6394()) {
			if (!local67.method7877()) {
				local67 = (Class1_Sub16) local52.method6389();
				if (local67 == null) {
					return;
				}
			}
			if (local67.anInt2683 == 3) {
				@Pc(91) int local91 = (int) local67.aLong425;
				if (local8 == local91 >>> 16) {
					method7412(local67, true, arg2);
				}
			}
		}
	}
}
