import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static563 {

	@OriginalMember(owner = "client!uba", name = "f", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_134 = new Class71(30, -1);

	@OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
	public static int anInt9710 = 0;

	@OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
	public static int anInt9711 = 0;

	@OriginalMember(owner = "client!uba", name = "t", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_106 = new Class257(23, -1);

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)I")
	public static int method7839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static431.aShortArrayArray10 == null ? 0 : Static431.aShortArrayArray10[arg0][arg1] & 0xFFFF;
	}
}
