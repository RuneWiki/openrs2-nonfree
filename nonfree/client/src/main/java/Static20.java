import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	public static int anInt436;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "J")
	public static long aLong21 = 0L;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	public static int anInt438 = -50;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)V")
	public static void method388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class147 local3 = new Class147();
		local3.anInt3691 = arg1 >> Static384.anInt6381;
		local3.anInt3702 = arg2 >> Static384.anInt6381;
		local3.anInt3704 = arg3 >> Static384.anInt6381;
		local3.anInt3699 = arg4 >> Static384.anInt6381;
		local3.anInt3695 = arg0;
		local3.anInt3698 = arg1;
		local3.anInt3690 = arg2;
		local3.anInt3700 = arg3;
		local3.anInt3697 = arg4;
		local3.anInt3706 = arg5;
		local3.anInt3703 = arg6;
		Static64.aClass147Array1[Static146.anInt6161++] = local3;
	}
}
