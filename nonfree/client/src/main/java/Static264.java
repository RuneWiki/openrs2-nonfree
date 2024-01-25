import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
	public static int anInt8587;

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_119 = new Class276(52, -2);

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "Lclient!rba;")
	public static final Class278 aClass278_13 = new Class278("", 11);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZI)Z")
	public static boolean method7032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static335.method5787(arg1, arg0) || Static141.method2863(arg0, arg1);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(BLclient!fd;)Lclient!rk;")
	public static Class283 method7035(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(7) int local7 = arg0.method6497();
		return new Class283(local7);
	}
}
