import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class273 {

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "[J")
	public static final long[] aLongArray8;

	static {
		new Class40("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
		aLongArray8 = new long[256];
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(23) long local23 = (long) local19;
			for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
				if ((local23 & 0x1L) == 1L) {
					local23 = local23 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local23 >>>= 0x1;
				}
			}
			aLongArray8[local19] = local23;
		}
	}

	@OriginalMember(owner = "client!sq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
