import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
	public static int anInt3716;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "[I")
	public static final int[] anIntArray350 = new int[13];

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
	public static int anInt3715 = 0;

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString137 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "J")
	public static long aLong99 = 0L;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)I")
	public static int method3142(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(21) Class1_Sub1 local21 = (Class1_Sub1) Static158.aClass207_24.method5555((long) arg0);
		if (local21 == null) {
			return Static285.method5005(arg0).anInt5444;
		}
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < local21.anIntArray3.length; local32++) {
			if (local21.anIntArray3[local32] == -1) {
				local30++;
			}
		}
		return local30 + Static285.method5005(arg0).anInt5444 - local21.anIntArray3.length;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(CZ)Z")
	public static boolean method3143(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(30) char[] local30 = Static185.aCharArray3;
			for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
				@Pc(38) char local38 = local30[local32];
				if (local38 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
