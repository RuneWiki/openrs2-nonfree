import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!kl;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "Lclient!nr;")
	public static Class223 aClass223_5;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
	public static int anInt6021 = 0;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
	public static int anInt6022 = 100;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
	public static int anInt6024 = 765;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!er;IIIB)Lclient!cea;")
	public static Class50_Sub1_Sub1 method4885(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aBoolean206 || Static249.method6960(arg1) && Static249.method6960(arg2)) {
			return new Class50_Sub1_Sub1(arg0, 3553, 6408, arg1, arg2);
		} else if (arg0.aBoolean219) {
			return new Class50_Sub1_Sub1(arg0, 34037, 6408, arg1, arg2);
		} else {
			return new Class50_Sub1_Sub1(arg0, 6408, arg1, arg2, Static538.method7366(arg1), Static538.method7366(arg2));
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method4889(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (long) arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}
}
