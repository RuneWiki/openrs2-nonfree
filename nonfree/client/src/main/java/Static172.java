import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
	public static int anInt3670;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_133 = new Class198(4);

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "F")
	public static float aFloat67 = 0.0F;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!lf;)Ljava/lang/String;")
	public static String method3323(@OriginalArg(1) Class4_Sub11 arg0) {
		return Static353.method2332(arg0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)Lclient!qo;")
	public static Class8_Sub5 method3324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass8_Sub5_1 == null ? null : local7.aClass8_Sub5_1;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(III)I")
	public static int method3327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static167.anIntArray312[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
	public static void method3328() {
		Static107.aClass43_35.method1282();
	}
}
