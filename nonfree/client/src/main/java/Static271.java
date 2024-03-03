import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "Lclient!r;")
	public static Class197 aClass197_75;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILclient!r;)Lclient!ne;", line = 52)
	public static Class2_Sub25 method5063(@OriginalArg(0) int arg0, @OriginalArg(2) Class197 arg1) {
		@Pc(15) byte[] local15 = arg1.method5083(arg0);
		return local15 == null ? null : new Class2_Sub25(local15);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!bt;II)V", line = 110)
	public static void method5066(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (Static294.aClass205_6 == null) {
			return;
		}
		try {
			Static294.aClass205_6.method5215(0L);
			Static294.aClass205_6.method5216(arg1, arg0.aByteArray73, 24);
		} catch (@Pc(23) Exception local23) {
		}
	}
}
