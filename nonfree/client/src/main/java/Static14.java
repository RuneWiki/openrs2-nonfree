import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ak", name = "w", descriptor = "Z")
	public static volatile boolean aBoolean36 = true;

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
	public static int anInt438 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Z")
	public static boolean method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIFZIIZ)[I")
	public static int[] method424(@OriginalArg(3) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class3_Sub1_Sub2 local15 = new Class3_Sub1_Sub2();
		local15.anInt262 = (int) (arg0 * 4096.0F);
		local15.anInt264 = 35;
		local15.anInt268 = 4;
		local15.anInt258 = 8;
		local15.anInt267 = 8;
		local15.aBoolean23 = true;
		local15.method8365();
		Static334.method5783(1, 2048);
		local15.method271(local11, 0);
		return local11;
	}
}
