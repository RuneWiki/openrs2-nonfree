import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!u", name = "K", descriptor = "I")
	public static int anInt6903;

	@OriginalMember(owner = "client!u", name = "L", descriptor = "I")
	public static int anInt6904;

	@OriginalMember(owner = "client!u", name = "Q", descriptor = "Lclient!mt;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!u", name = "W", descriptor = "I")
	public static int anInt6910;

	@OriginalMember(owner = "client!u", name = "S", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray53 = new String[200];

	@OriginalMember(owner = "client!u", name = "V", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_114 = new Class237(4, 12);

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(III)V")
	public static void method5404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class211 local7 = Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 != null && local7.aClass26_Sub4_2 != null) {
			local7.aClass26_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(III)Z")
	public static boolean method5408(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
