import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "[Lclient!fga;")
	public static Class103[] aClass103Array1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!pu;I)Lclient!uq;")
	public static Class334 method5847(@OriginalArg(1) Class270 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method5691(arg1);
		return local16 == null ? null : new Class334(local16);
	}
}
