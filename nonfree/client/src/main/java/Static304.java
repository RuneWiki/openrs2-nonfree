import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_93 = new Class322(125, -1);

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZII)I")
	public static int method4853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 >>> 24;
		@Pc(19) int local19 = 255 - local14;
		@Pc(37) int local37 = ((arg1 & 0xFF00FF) * local14 & 0xFF00FF00 | local14 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return (((arg0 & 0xFF00) * local19 & 0xFF0000 | local19 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local37;
	}
}
