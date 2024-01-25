import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "[Lclient!paa;")
	public static Class261[] aClass261Array1;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_96 = new Class154(50, -1);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
	public static void method5694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) Class12_Sub5 local19 = new Class12_Sub5();
		local19.anInt6701 = Static532.anInt8757 + arg3;
		local19.anInt6699 = arg1;
		local19.anInt6705 = arg5;
		local19.anInt6700 = arg2;
		local19.anInt6698 = arg6;
		local19.anInt6703 = arg0;
		local19.aString99 = arg4;
		Static71.aClass220_8.method4659(local19);
	}
}
