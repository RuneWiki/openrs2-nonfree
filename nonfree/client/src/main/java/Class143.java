import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class143 {

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "[J")
	public static final long[] aLongArray4 = new long[256];

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!oa;")
	public Class143 aClass143_2;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	public int anInt4560;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!ib;")
	public Class23 aClass23_2;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
	public int anInt4562;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
	public int anInt4566;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public final int anInt4557;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
	public final int anInt4565;

	static {
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(18) long local18 = (long) local14;
			for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
				if ((local18 & 0x1L) == 1L) {
					local18 = local18 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local18 >>>= 0x1;
				}
			}
			aLongArray4[local14] = local18;
		}
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(II)V")
	public Class143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4557 = arg0;
		this.anInt4565 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!oa;I)V")
	public Class143(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1) {
		this.aClass143_2 = arg0;
		this.aClass23_2 = this.aClass143_2.aClass23_2;
		this.anInt4565 = this.aClass143_2.anInt4565 + arg1;
		this.anInt4557 = this.aClass143_2.anInt4557;
	}
}
