import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public static int anInt5458;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Z")
	public static boolean aBoolean494 = false;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Z")
	public static boolean aBoolean496 = false;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIZILclient!oi;)V")
	public static void method4378(@OriginalArg(0) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class185 arg2) {
		Static371.aClass185_97 = arg2;
		Static451.anInt7187 = arg1;
		Static353.anInt5706 = 2;
		Static107.aBoolean183 = false;
		Static318.anInt5262 = 0;
		Static270.anInt1979 = 1;
		Static64.anInt996 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
	public static void method4385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub3_Sub1 local13 = Static427.method5426(arg0, 4);
		local13.method384();
		local13.anInt384 = arg3;
		local13.anInt381 = arg2;
		local13.anInt387 = arg1;
	}
}
