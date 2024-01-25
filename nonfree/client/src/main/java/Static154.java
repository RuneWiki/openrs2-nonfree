import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
	public static int anInt2992 = 0;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
	public static final int[] anIntArray301 = new int[5];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZBI)I")
	public static int method2755(@OriginalArg(2) int arg0) {
		@Pc(12) Class5_Sub14 local12 = Static319.method5550(false, arg0);
		if (local12 == null) {
			return Static10.method178(arg0).anInt1018;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local12.anIntArray129.length; local31++) {
			if (local12.anIntArray129[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static10.method178(arg0).anInt1018 - local12.anIntArray129.length;
	}
}
