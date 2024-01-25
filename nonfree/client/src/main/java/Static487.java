import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
	public static int anInt8435;

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_209 = new Class160(94, 4);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)Z")
	public static boolean method7353(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method7354(@OriginalArg(1) String[] arg0) {
		@Pc(6) String[] local6 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local6[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local6[local15] = local6[local15] + arg0[local15];
			}
		}
		return local6;
	}
}
