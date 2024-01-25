import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cca", name = "r", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_18 = new Class216(23, -1);

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(B)V")
	public static void method1353() {
		Static488.aClass352_54.method7659();
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "([SII)[S")
	public static short[] method1354(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static685.method6468(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
