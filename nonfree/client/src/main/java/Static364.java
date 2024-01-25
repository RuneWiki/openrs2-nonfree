import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "J")
	public static long aLong190;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_72 = new Class185(27, 3);

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public static int anInt7027 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BII)I")
	public static int method5868(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return ((arg0 >>> 31) + arg0) % arg1 + local16;
	}
}
