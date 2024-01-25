import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static187 {

	@OriginalMember(owner = "client!kk", name = "R", descriptor = "Lclient!fc;")
	public static Class71 aClass71_45;

	@OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
	public static int anInt3330;

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString28 = null;

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_90 = new Class77(65, 17);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I")
	public static int method3022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static298.anIntArrayArray46 == null ? 0 : Static298.anIntArrayArray46[arg0][arg1] & 0xFFFFFF;
	}
}
