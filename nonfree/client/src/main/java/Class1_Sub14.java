import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "[J")
	public static long[] aLongArray6 = new long[256];

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
	public int anInt2063;

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
	public int anInt2059;

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(16) long local16 = (long) local12;
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if ((local16 & 0x1L) == 1L) {
					local16 = local16 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local16 >>>= 0x1;
				}
			}
			aLongArray6[local12] = local16;
		}
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(II)V")
	public Class1_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2063 = arg1;
		this.anInt2059 = arg0;
	}
}
