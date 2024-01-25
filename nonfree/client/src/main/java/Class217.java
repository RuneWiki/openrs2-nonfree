import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class217 {

	@OriginalMember(owner = "client!s", name = "k", descriptor = "[J")
	public static final long[] aLongArray7 = new long[256];

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	public final int anInt6152;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private final int anInt6147;

	static {
		for (@Pc(59) int local59 = 0; local59 < 256; local59++) {
			@Pc(63) long local63 = (long) local59;
			for (@Pc(65) int local65 = 0; local65 < 8; local65++) {
				if ((local63 & 0x1L) == 1L) {
					local63 = local63 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local63 >>>= 0x1;
				}
			}
			aLongArray7[local59] = local63;
		}
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V")
	public Class217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6152 = arg1;
		this.anInt6147 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)I")
	public int method4861() {
		return this.anInt6147;
	}

	@OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
