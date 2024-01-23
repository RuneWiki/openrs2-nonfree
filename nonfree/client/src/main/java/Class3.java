import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public abstract class Class3 {

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "[J")
	public static long[] aLongArray8 = new long[256];

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(12) long local12 = (long) local4;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 0x1;
				}
			}
			aLongArray8[local4] = local12;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public abstract void method2841();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)I")
	public abstract int method2842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)J")
	public abstract long method2844();
}
