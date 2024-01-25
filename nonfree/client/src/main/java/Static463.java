import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "Z")
	public static boolean aBoolean554 = false;

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BIIII)V")
	public static void method6283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg3, 8);
		local8.method662();
		local8.anInt821 = arg2;
		local8.anInt817 = arg1;
		local8.anInt823 = arg0;
	}
}
