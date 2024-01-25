import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	public static int anInt4128;

	@OriginalMember(owner = "client!rp", name = "w", descriptor = "[Lclient!rfa;")
	public static Class60_Sub1[] aClass60_Sub1Array3;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
	public static int anInt4137;

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_24 = new Class359(260);

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	public static int anInt4136 = 0;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
	public static int anInt4139 = 0;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[FB)[F")
	public static float[] method3793(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(13) float[] local13 = new float[arg0];
		Static695.method5645(arg1, 0, local13, 0, arg0);
		return local13;
	}
}
