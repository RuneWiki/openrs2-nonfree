import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString85;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	public static void method5473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg0, 13);
		local8.method32();
		local8.anInt35 = arg1;
	}
}
