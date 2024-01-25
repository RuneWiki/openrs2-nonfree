import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "Lclient!dj;")
	public static final Class66 aClass66_42 = new Class66(512);

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBI)V")
	public static void method7846(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub5_Sub11 local14 = Static652.method8695((long) arg0 | (long) arg1 << 32, 18);
		local14.method3956();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)V")
	public static void method7847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class4_Sub5_Sub11 local13 = Static652.method8695((long) arg0, 16);
		local13.method3955();
		local13.anInt4427 = arg1;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZII)Z")
	public static boolean method7849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
