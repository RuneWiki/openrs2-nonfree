import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
	public static int anInt9949;

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
	public static int anInt9950;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(15) Class2_Sub6_Sub6 local15 = Static139.method3119(arg0, 3);
		local15.method3088();
		local15.aString27 = arg1;
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)V")
	public static void method8282() {
		Static534.method8037();
	}
}
