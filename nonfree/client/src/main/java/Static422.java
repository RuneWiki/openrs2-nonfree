import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
	public static int anInt7371;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_189 = new Class81(66, 10);

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	public static int anInt7370 = 0;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_51 = new Class265();

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
	public static int anInt7372 = 0;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	public static int anInt7374 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!pc;I)Lclient!at;")
	public static Class2_Sub4 method5718(@OriginalArg(0) int arg0, @OriginalArg(1) Class188 arg1) {
		@Pc(8) byte[] local8 = arg1.method4282(arg0);
		return local8 == null ? null : new Class2_Sub4(local8);
	}
}
