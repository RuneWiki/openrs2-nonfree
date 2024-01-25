import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
	public static int anInt5898;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_94 = new Class274(84, 6);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4907(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class2_Sub5_Sub10 local8 = Static594.method8175(arg0, 2);
		local8.method4393();
		local8.aString52 = arg1;
	}
}
