import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array1;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
	public static int anInt163;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "Lclient!ju;")
	public static final Class201 aClass201_1 = new Class201(10, 3);

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_2 = new Class376(46, 12);

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_3 = new Class376(12, 8);

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "[I")
	public static final int[] anIntArray7 = new int[5];

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	public static int anInt164 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!gj;Lclient!d;IILjava/awt/Canvas;)Lclient!ha;")
	public static Class16 method132(@OriginalArg(1) Class143 arg0, @OriginalArg(2) Interface5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Canvas arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg4 != null) {
			@Pc(12) Dimension local12 = arg4.getSize();
			local7 = local12.height;
			local5 = local12.width;
		}
		return Static211.method8136(local5, arg1, arg0, arg2, local7, arg4, arg3);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BIIII)V")
	public static void method133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) Class3_Sub6_Sub7 local19 = Static198.method3146((long) arg1 << 32 | (long) arg2, 19);
		local19.method1712();
		local19.anInt1790 = arg0;
		local19.anInt1782 = arg3;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public static void method134() throws Exception_Sub1 {
		if (Static418.anInt7055 == 1) {
			Static535.aClass16_10.method8175(Static486.anInt8256, Static88.anInt1938);
		} else {
			Static535.aClass16_10.method8175(0, 0);
		}
	}
}
