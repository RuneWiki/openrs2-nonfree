import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "[Lclient!eda;")
	public static Class86_Sub1[] aClass86_Sub1Array1;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	public static int anInt6288 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BZLjava/lang/String;)I")
	public static int method5248(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(19) int local19 = 0; local19 < local10; local19 += 4) {
			@Pc(27) int local27 = Static549.method7172(arg2.charAt(local19));
			@Pc(42) int local42 = local19 + 1 < local10 ? Static549.method7172(arg2.charAt(local19 + 1)) : -1;
			@Pc(61) int local61 = local19 + 2 >= local10 ? -1 : Static549.method7172(arg2.charAt(local19 + 2));
			@Pc(80) int local80 = local10 > local19 + 3 ? Static549.method7172(arg2.charAt(local19 + 3)) : -1;
			arg1[arg0++] = (byte) (local42 >>> 4 | local27 << 2);
			if (local61 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local42 & 0xF) << 4 | local61 >>> 2);
			if (local80 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local61 & 0x3) << 6 | local80);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
	public static int method5249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static434.anIntArrayArray48 == null ? 0 : Static434.anIntArrayArray48[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)I")
	public static int method5251(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
