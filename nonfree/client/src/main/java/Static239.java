import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
	public static int anInt4651;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Lclient!vk;")
	public static Class1_Sub41 aClass1_Sub41_1;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
	public static int anInt4649 = 0;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
	public static int anInt4658 = -1;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean390 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;ZII)I")
	public static int method4253(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(34) boolean local34 = false;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg0.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(47) char local47 = arg0.charAt(local41);
			if (local41 == 0) {
				if (local47 == '-') {
					local24 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(70) int local70;
			if (local47 >= '0' && local47 <= '9') {
				local70 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local70 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local70 = local47 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local70) {
				throw new NumberFormatException();
			}
			if (local24) {
				local70 = -local70;
			}
			@Pc(117) int local117 = arg1 * local36 + local70;
			if (local36 != local117 / arg1) {
				throw new NumberFormatException();
			}
			local36 = local117;
			local34 = true;
		}
		if (!local34) {
			throw new NumberFormatException();
		}
		return local36;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!qj;Z)Lclient!di;")
	public static Class38 method4255(@OriginalArg(0) int arg0, @OriginalArg(1) Class165 arg1) {
		@Pc(13) byte[] local13 = arg1.method4492(arg0);
		return local13 == null ? null : new Class38(local13);
	}
}
