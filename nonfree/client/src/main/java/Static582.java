import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
	public static int anInt9557;

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
	public static int anInt9561;

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
	public static int anInt9559 = 0;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method8037(@OriginalArg(1) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			local5 *= 37L;
			@Pc(19) char local19 = arg0.charAt(local10);
			if (local19 >= 'A' && local19 <= 'Z') {
				local5 += local19 + 1 - 65;
			} else if (local19 >= 'a' && local19 <= 'z') {
				local5 += local19 + 1 - 97;
			} else if (local19 >= '0' && local19 <= '9') {
				local5 += local19 + 27 - '0';
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIII)I")
	public static int method8038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static331.aClass112Array3 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg1 >> 9;
		@Pc(20) int local20 = arg2 >> 9;
		if (local16 < 0 || local20 < 0 || local16 > Static3.anInt46 - 1 || local20 > Static270.anInt5194 - 1) {
			return 0;
		}
		@Pc(48) int local48 = arg0;
		if (arg0 < 3 && (Static244.aByteArrayArrayArray9[1][local16][local20] & 0x2) != 0) {
			local48 = arg0 + 1;
		}
		return Static331.aClass112Array3[local48].method7826(arg1, arg2);
	}
}
