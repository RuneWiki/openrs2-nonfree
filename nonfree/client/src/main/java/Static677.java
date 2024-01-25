import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "Lclient!ha;")
	public static Class137 aClass137_47;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_190 = new Class44(101, 4);

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "S")
	public static short aShort125 = 256;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V")
	public static void method9300() {
		Static109.aBoolean187 = true;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)I")
	public static int method9301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return local16 + ((arg0 >>> 31) + arg0) % arg1;
	}
}
