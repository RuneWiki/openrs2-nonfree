import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class203 {

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "[J")
	public static final long[] aLongArray15 = new long[256];

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
	public final int anInt5023;

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
			aLongArray15[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(I)V")
	public Class203(@OriginalArg(0) int arg0) {
		this.anInt5023 = arg0;
	}

	@OriginalMember(owner = "client!lca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
