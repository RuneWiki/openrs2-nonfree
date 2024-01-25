import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
	public static int anInt9896;

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "[I")
	public static final int[] anIntArray650 = new int[4];

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IC)Z")
	public static boolean method8584(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(44) char[] local44 = Static211.aCharArray7;
			for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
				@Pc(52) char local52 = local44[local46];
				if (arg0 == local52) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBIILclient!ha;III)V")
	public static void method8585(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class75 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		arg2.method6631(arg4, arg3, arg1, -10660793, arg0);
		arg2.method6631(arg4 - 2, arg3 + 1, 16, -16777216, arg0 + 1);
		arg2.method6718(arg1 - 19, arg0 + 18, -16777216, arg4 - 2, arg3 - -1);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/io/File;I)[B")
	public static byte[] method8587(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(13) byte[] local13 = new byte[arg0];
			Static546.method7740(arg0, local13, arg1);
			return local13;
		} catch (@Pc(21) IOException local21) {
			return null;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)[Lclient!mq;")
	public static Class238[] method8588() {
		return new Class238[] { Static607.aClass238_12, Static275.aClass238_7, Static375.aClass238_8 };
	}
}
