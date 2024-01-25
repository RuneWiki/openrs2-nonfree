import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!jk", name = "N", descriptor = "Lclient!mk;")
	public static final Class130 aClass130_70 = new Class130();

	@OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
	public static int anInt3284 = 0;

	@OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
	public static int anInt3285 = 0;

	@OriginalMember(owner = "client!jk", name = "T", descriptor = "J")
	public static volatile long aLong114 = 0L;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)I")
	public static int method2869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 255 - arg2;
		@Pc(31) int local31 = ((arg0 & 0xFF00) * arg2 & 0xFF0000 | arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return local31 + (((arg1 & 0xFF00FF) * local13 & 0xFF00FF00 | local13 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}
}
