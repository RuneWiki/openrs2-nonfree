import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class27_Sub4 extends Class27 {

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "[J")
	public static final long[] aLongArray9 = new long[256];

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
	private final int anInt6268;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
	private final int anInt6267;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
	private final int anInt6266;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
	private final int anInt6269;

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
			aLongArray9[local12] = local16;
		}
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IIIIIII)V")
	public Class27_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6268 = arg1;
		this.anInt6267 = arg0;
		this.anInt6266 = arg2;
		this.anInt6269 = arg3;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)V")
	@Override
	public void method5366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt6267 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt6266 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt6268 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt6269 >> 12;
		Static85.method1231(local32, local18, local25, super.anInt6262, local39);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
	@Override
	public void method5360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6267 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6266 >> 12;
		@Pc(29) int local29 = this.anInt6268 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt6269 >> 12;
		Static283.method4710(local29, super.anInt6257, local17, local10, super.anInt6265, super.anInt6262, local36);
	}
}
