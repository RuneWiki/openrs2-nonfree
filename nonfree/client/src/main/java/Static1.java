import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!gj;")
	public static Class143 aClass143_140;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_142 = new Class376(0, 4);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method8421() {
		for (@Pc(7) int local7 = 0; local7 < Static338.aByteArrayArrayArray13.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static338.aByteArrayArrayArray13[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static338.aByteArrayArrayArray13[0][0].length; local15++) {
					Static338.aByteArrayArrayArray13[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;)V")
	public static void method8423(@OriginalArg(0) File arg0, @OriginalArg(2) String arg1) {
		Static647.aHashtable6.put(arg1, arg0);
	}
}
