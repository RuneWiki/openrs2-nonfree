import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
	public static int anInt8821;

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "Lclient!ai;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "Lclient!pha;")
	public static final Class276 aClass276_12 = new Class276("", 18);

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "[I")
	public static final int[] anIntArray652 = new int[2];

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
	public static void method7322() {
		@Pc(5) Class264 local5 = Static324.aClass264_38;
		synchronized (Static324.aClass264_38) {
			Static324.aClass264_38.method6360();
		}
		local5 = Static263.aClass264_31;
		synchronized (Static263.aClass264_31) {
			Static263.aClass264_31.method6360();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!td;IIIBI)Ljava/awt/Frame;")
	public static Frame method7323(@OriginalArg(0) Class333 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method8144()) {
			return null;
		}
		@Pc(17) Class235[] local17 = Static361.method5487(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt6838 == arg3 && local17[local25].anInt6833 == arg2 && (!local23 || local17[local25].anInt6837 > arg1)) {
				local23 = true;
				arg1 = local17[local25].anInt6837;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(91) Class150 local91 = arg0.method8145(arg1, arg3, arg2);
		while (local91.anInt4247 == 0) {
			Static20.method9254(10L);
		}
		@Pc(111) Frame local111 = (Frame) local91.anObject8;
		if (local111 == null) {
			return null;
		} else if (local91.anInt4247 == 2) {
			Static100.method1801(local111, arg0);
			return null;
		} else {
			return local111;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)B")
	public static byte method7324(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)V")
	public static void method7325() {
		for (@Pc(6) Class14_Sub3_Sub11 local6 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6318(); local6 != null; local6 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6311()) {
			if (Static313.method7481(local6.anInt4752)) {
				Static345.method5297(local6);
			}
		}
	}
}
