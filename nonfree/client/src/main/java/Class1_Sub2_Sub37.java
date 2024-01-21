import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub2_Sub37 extends Class1_Sub2 {

	@OriginalMember(owner = "client!uc", name = "Z", descriptor = "[J")
	public static long[] aLongArray8 = new long[256];

	@OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
	private int anInt4299;

	@OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
	private int anInt4300;

	@OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
	private int anInt4301;

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
			aLongArray8[local13] = local17;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(24) int[] local24 = local16[1];
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static22.anInt596; local34++) {
				local28[local34] = this.anInt4299;
				local24[local34] = this.anInt4300;
				local32[local34] = this.anInt4301;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.method3299(arg1.method1230());
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)V")
	private void method3299(@OriginalArg(1) int arg0) {
		this.anInt4301 = (arg0 & 0xFF) << 4;
		this.anInt4299 = arg0 >> 12 & 0xFF0;
		this.anInt4300 = arg0 >> 4 & 0xFF0;
	}
}
