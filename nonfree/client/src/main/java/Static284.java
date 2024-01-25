import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_148 = new Class235(30, -2);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/lang/String;[BZI)I")
	public static int method3953(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17 += 4) {
			@Pc(25) int local25 = Static269.method3831(arg0.charAt(local17));
			@Pc(40) int local40 = local17 + 1 >= local15 ? -1 : Static269.method3831(arg0.charAt(local17 + 1));
			@Pc(59) int local59 = local15 > local17 + 2 ? Static269.method3831(arg0.charAt(local17 + 2)) : -1;
			@Pc(74) int local74 = local17 + 3 < local15 ? Static269.method3831(arg0.charAt(local17 + 3)) : -1;
			arg1[arg2++] = (byte) (local25 << 2 | local40 >>> 4);
			if (local59 == -1) {
				break;
			}
			arg1[arg2++] = (byte) (local59 >>> 2 | (local40 & 0xF) << 4);
			if (local74 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local59 & 0x3) << 6 | local74);
		}
		return arg2;
	}
}
