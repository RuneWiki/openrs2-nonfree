import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!gba;")
	public static Class125 aClass125_9;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_7 = new Class266(8, 2);

	@OriginalMember(owner = "client!l", name = "r", descriptor = "I")
	public static int anInt5670 = 2;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
	public static void method4740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub5_Sub10 local12 = Static594.method8175(arg1, 13);
		local12.method4393();
		local12.anInt5255 = arg0;
	}
}
