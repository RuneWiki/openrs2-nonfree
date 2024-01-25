import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	public static int anInt5392;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method4520(@OriginalArg(0) String arg0) {
		return Static568.method8171(arg0, 16);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method4521(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local10 = (long) arg0.charAt(local19) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(II)Lclient!ej;")
	public static Class93 method4523(@OriginalArg(1) int arg0) {
		@Pc(10) Class93 local10 = (Class93) Static158.aClass264_20.method6367((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static654.aClass386_138.method9196(arg0, 1);
		local10 = new Class93();
		local10.anInt2593 = arg0;
		if (local20 != null) {
			local10.method2154(new Class14_Sub29(local20));
		}
		local10.method2157();
		if (local10.anInt2590 == 2 && Static609.aClass187_79.method4078((long) arg0) == null) {
			Static609.aClass187_79.method4077((long) arg0, new Class14_Sub18(Static571.anInt9832));
			Static397.aClass93Array1[Static571.anInt9832++] = local10;
		}
		Static158.aClass264_20.method6364((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	public static void method4524() {
		Static445.method5103();
	}
}
