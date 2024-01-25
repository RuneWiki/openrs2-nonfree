import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
	public static int anInt6932;

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "Lclient!qa;")
	public static Class128 aClass128_36;

	@OriginalMember(owner = "client!mt", name = "A", descriptor = "I")
	public static int anInt6934;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_256 = new Class137(69, 15);

	@OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
	public static int anInt6933 = 0;

	@OriginalMember(owner = "client!mt", name = "z", descriptor = "[[B")
	public static final byte[][] aByteArrayArray48 = new byte[50][];

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)V")
	public static void method5310() {
		@Pc(6) Class167 local6 = Static250.aClass167_9;
		synchronized (Static250.aClass167_9) {
			Static250.aClass167_9.method3384(5);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method5311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg2[arg1 + local17] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(46) char local46 = Static440.aCharArray6[local27 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local27 = local46;
				}
				local8[local10++] = (char) local27;
			}
		}
		return new String(local8, 0, local10);
	}
}
