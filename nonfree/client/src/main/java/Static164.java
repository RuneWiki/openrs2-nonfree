import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!i", name = "u", descriptor = "I")
	public static int anInt4842;

	@OriginalMember(owner = "client!i", name = "w", descriptor = "I")
	public static int anInt4843;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_145 = new Class102(76, 8);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "I")
	public static int anInt4840 = 0;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
	public static void method3946(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub5_Sub11 local13 = Static316.method4316(6, arg0);
		local13.method3098();
		local13.anInt3911 = arg1;
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V")
	public static void method3947() {
		Static327.anInt5553 = 0;
		Static165.anInt2824 = 0;
		Static269.anInt4417 = 0;
		Static107.anInt2026 = 0;
	}
}
