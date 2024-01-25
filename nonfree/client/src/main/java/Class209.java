import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class209 {

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "[J")
	public static final long[] aLongArray7 = new long[256];

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
	public int anInt5088;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "[I")
	public final int[] anIntArray1006;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
	public final int[] anIntArray1007;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray7[local4] = local8;
		}
		new Class32("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(I)V")
	public Class209(@OriginalArg(0) int arg0) {
		this.anInt5088 = arg0;
		this.anIntArray1006 = new int[this.anInt5088];
		this.anIntArray1007 = new int[this.anInt5088];
	}
}
