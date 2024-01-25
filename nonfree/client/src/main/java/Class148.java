import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class148 {

	@OriginalMember(owner = "client!le", name = "l", descriptor = "[J")
	public static final long[] aLongArray5;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString42;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public final int anInt4191;

	static {
		new Class142("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
		aLongArray5 = new long[256];
		for (@Pc(30) int local30 = 0; local30 < 256; local30++) {
			@Pc(34) long local34 = (long) local30;
			for (@Pc(36) int local36 = 0; local36 < 8; local36++) {
				if ((local34 & 0x1L) == 1L) {
					local34 = local34 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local34 >>>= 0x1;
				}
			}
			aLongArray5[local30] = local34;
		}
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class148(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString42 = arg0;
		this.anInt4191 = arg1;
	}

	@OriginalMember(owner = "client!le", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
