import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public abstract class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "[J")
	public static final long[] aLongArray10 = new long[256];

	static {
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(17) long local17 = (long) local13;
			for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
				if ((local17 & 0x1L) == 1L) {
					local17 = local17 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local17 >>>= 0x1;
				}
			}
			aLongArray10[local13] = local17;
		}
	}

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V")
	protected Class109_Sub1() {
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)Lclient!gi;")
	public abstract Class20_Sub3 method4787();
}
