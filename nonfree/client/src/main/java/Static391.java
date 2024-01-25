import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "Lclient!tha;")
	public static Interface24 anInterface24_1;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public static int anInt6745 = 0;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "Z")
	public static boolean aBoolean504 = true;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	public static int anInt6746 = 0;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
	public static int anInt6753 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)V")
	public static void method5998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class6_Sub2_Sub4 local16 = Static602.method8315((long) arg0, 6);
		local16.method2040();
		local16.anInt2111 = arg1;
	}
}
