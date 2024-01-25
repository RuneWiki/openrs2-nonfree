import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public static int anInt3507 = 0;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "Lclient!ar;")
	public static final Class15 aClass15_5 = new Class15(64);

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	public static int anInt3513 = -1;

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
	public static volatile int anInt3516 = -1;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V")
	public static void method3025(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class100 local14 = Static197.aClass100ArrayArray1[arg0][arg1];
		Static223.method3820(local14 == null ? Static139.aClass100_2 : local14, 5000);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IC)Z")
	public static boolean method3026(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(35) char[] local35 = Static306.aCharArray6;
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				@Pc(43) char local43 = local35[local37];
				if (arg0 == local43) {
					return true;
				}
			}
		}
		return false;
	}
}
