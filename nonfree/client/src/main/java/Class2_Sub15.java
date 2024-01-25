import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "[I")
	public static final int[] anIntArray146;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "S")
	public short aShort28;

	static {
		new Class93("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
		anIntArray146 = new int[256];
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(13) int local13 = local10;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray146[local10] = local13;
		}
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	private Class2_Sub15() {
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(S)V")
	public Class2_Sub15(@OriginalArg(0) short arg0) {
		this.aShort28 = arg0;
	}
}
