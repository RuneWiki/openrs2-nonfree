import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class264 {

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "[J")
	public static final long[] aLongArray8;

	static {
		new Class231("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
		aLongArray8 = new long[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(22) long local22 = (long) local18;
			for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
				if ((local22 & 0x1L) == 1L) {
					local22 = local22 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local22 >>>= 0x1;
				}
			}
			aLongArray8[local18] = local22;
		}
	}
}
