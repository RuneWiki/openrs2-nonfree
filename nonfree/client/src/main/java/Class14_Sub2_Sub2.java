import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public abstract class Class14_Sub2_Sub2 extends Class14_Sub2 {

	@OriginalMember(owner = "client!as", name = "A", descriptor = "[J")
	public static final long[] aLongArray9 = new long[256];

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(12) long local12 = (long) local8;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 0x1;
				}
			}
			aLongArray9[local8] = local12;
		}
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	protected Class14_Sub2_Sub2() {
	}
}
