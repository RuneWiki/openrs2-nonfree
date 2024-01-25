import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "Lclient!mg;")
	public static Class160 aClass160_63;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
	public static int anInt5575;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "Lclient!wj;")
	public static Class265 aClass265_122;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
	public static int anInt5576;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "[Lclient!wl;")
	public static final Class267[] aClass267Array1 = new Class267[16];

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_127 = new Class209("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIII)I")
	public static int method4491(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 255 - arg0;
		@Pc(25) int local25 = (arg0 * (arg2 & 0xFF00FF) & 0xFF00FF00 | (arg2 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
		return local25 + (((arg1 & 0xFF00) * local7 & 0xFF0000 | local7 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}
}
