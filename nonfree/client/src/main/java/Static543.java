import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "Lclient!gda;")
	public static Class126 aClass126_247;

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_179 = new Class156(69, 0);

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_79 = new Class168(3000000, 200);

	@OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
	public static int anInt8641 = -1;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIII)V")
	public static void method7446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(37) String local37 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local37);
		Static661.method9076(true, false, local37);
	}
}
