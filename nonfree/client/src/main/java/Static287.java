import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	public static int anInt5816;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "I")
	public static int anInt5819;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_173 = new Class119(32);

	@OriginalMember(owner = "client!si", name = "k", descriptor = "[I")
	public static final int[] anIntArray422 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	public static final int anInt5817 = -1;

	@OriginalMember(owner = "client!si", name = "m", descriptor = "I")
	public static int anInt5818 = 255;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "[Lclient!ci;")
	public static final Class32[] aClass32Array1 = new Class32[16];

	@OriginalMember(owner = "client!si", name = "p", descriptor = "I")
	public static int anInt5820 = -1;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray53 = new String[200];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BIII)I")
	public static int method5126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 255 - arg0;
		@Pc(31) int local31 = ((arg1 & 0xFF00) * arg0 & 0xFF0000 | (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
		return ((local13 * (arg2 & 0xFF00) & 0xFF0000 | local13 * (arg2 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local31;
	}
}
