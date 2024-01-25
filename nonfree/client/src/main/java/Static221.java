import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString43 = "";

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "S")
	public static short aShort62 = 32767;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public static void method3772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(11, arg0);
		local8.method8958();
		local8.anInt10537 = arg1;
		local8.anInt10530 = arg2;
	}
}
