import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "J")
	public static long aLong251;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean661 = false;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Lclient!ce;")
	public static final Class3_Sub11_Sub1 aClass3_Sub11_Sub1_2 = new Class3_Sub11_Sub1(7500);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZII)V")
	public static void method7103(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub45 local8 = Static162.method826(arg1, arg0);
		if (local8 != null) {
			local8.method7825();
		}
	}
}
