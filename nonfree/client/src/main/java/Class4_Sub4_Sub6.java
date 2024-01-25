import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class4_Sub4_Sub6 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "[J")
	public static final long[] aLongArray3 = new long[256];

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "Lclient!ah;")
	public final Class8_Sub1_Sub1 aClass8_Sub1_Sub1_1;

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
			aLongArray3[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ah;)V")
	public Class4_Sub4_Sub6(@OriginalArg(0) Class8_Sub1_Sub1 arg0) {
		this.aClass8_Sub1_Sub1_1 = arg0;
	}
}
