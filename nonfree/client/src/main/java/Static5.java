import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!gda;")
	public static Class126 aClass126_303;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "[Lclient!nh;")
	public static Class250[] aClass250Array181;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_278 = new Class381(64, 7);

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "(I)I")
	public static int method9220() {
		return Static181.anInt3401 == 1 ? Static251.anInt4580 : 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Z")
	public static boolean method9221(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;[BZ)I")
	public static int method9224(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(10) int local10 = arg1.length();
		for (@Pc(23) int local23 = 0; local23 < local10; local23 += 4) {
			@Pc(33) int local33 = Static307.method4790(arg1.charAt(local23));
			@Pc(52) int local52 = local10 > local23 + 1 ? Static307.method4790(arg1.charAt(local23 + 1)) : -1;
			@Pc(72) int local72 = local23 + 2 < local10 ? Static307.method4790(arg1.charAt(local23 + 2)) : -1;
			@Pc(88) int local88 = local23 + 3 < local10 ? Static307.method4790(arg1.charAt(local23 + 3)) : -1;
			arg2[arg0++] = (byte) (local52 >>> 4 | local33 << 2);
			if (local72 == -1) {
				break;
			}
			arg2[arg0++] = (byte) (local72 >>> 2 | (local52 & 0xF) << 4);
			if (local88 == -1) {
				break;
			}
			arg2[arg0++] = (byte) ((local72 & 0x3) << 6 | local88);
		}
		return arg0;
	}
}
