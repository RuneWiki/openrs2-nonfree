import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!ve", name = "L", descriptor = "[[Lclient!ig;")
	public static Class13_Sub1[][] aClass13_Sub1ArrayArray3;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_335 = new Class288(54, 3);

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[5];

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_126 = new Class179(20, 8);

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
	public static int anInt9683 = 0;

	@OriginalMember(owner = "client!ve", name = "N", descriptor = "Z")
	public static final boolean aBoolean707 = false;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;BC)I")
	public static int method8090(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0.charAt(local17) == arg1) {
				local12++;
			}
		}
		return local12;
	}
}
