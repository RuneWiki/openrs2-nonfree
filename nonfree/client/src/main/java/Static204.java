import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_149 = new Class62("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	public static int anInt4205 = 0;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Z")
	public static boolean aBoolean308 = true;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Lclient!rm;")
	public static Class1_Sub3 method3744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub3_3;
	}
}
