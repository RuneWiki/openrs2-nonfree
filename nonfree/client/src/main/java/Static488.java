import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_247 = new Class202("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II[B)[B")
	public static byte[] method7229(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static553.method3373(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
