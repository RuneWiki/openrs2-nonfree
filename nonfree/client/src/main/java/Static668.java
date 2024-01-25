import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static668 {

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
	public static int anInt10668;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	public static int anInt10670;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "Lclient!wt;")
	public static final Class393 aClass393_6 = new Class393();

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Z")
	public static boolean aBoolean812 = false;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "Lclient!rda;")
	public static final Class299 aClass299_4 = new Class299("WIP", 2);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(FZFFIIFFILclient!gv;I)[B")
	public static byte[] method9228(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) Class126 arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static625.method8765(0, arg1, local15, arg5, arg0, arg2, arg3, arg4);
		return local15;
	}
}
