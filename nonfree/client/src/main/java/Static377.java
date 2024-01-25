import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
	public static int anInt7064 = -1;

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_118 = new Class67(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
	public static int anInt7067 = 0;

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_123 = new Class133(97, 8);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!kea;III)Lclient!cq;")
	public static Class53 method5901(@OriginalArg(0) Class161 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method4243(0, arg1);
		return local14 == null ? null : new Class53(local14);
	}
}
