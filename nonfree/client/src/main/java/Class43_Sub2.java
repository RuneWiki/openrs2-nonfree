import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "[J")
	public static final long[] aLongArray4 = new long[256];

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
	private final int anInt2781;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
	private final int anInt2786;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	private final int anInt2783;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
	private final int anInt2788;

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
			aLongArray4[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2781 = arg3;
		this.anInt2786 = arg1;
		this.anInt2783 = arg2;
		this.anInt2788 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	@Override
	public void method4935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt2788 >> 12;
		@Pc(25) int local25 = this.anInt2783 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt2786 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt2781 >> 12;
		Static209.method2956(local32, super.anInt5750, super.anInt5743, local25, local18, local39);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BII)V")
	@Override
	public void method4938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2788 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt2783 * arg1 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt2786 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt2781 >> 12;
		Static56.method901(super.anInt5747, local10, local29, local17, local36);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
	@Override
	public void method4940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt2788 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt2783 >> 12;
		@Pc(28) int local28 = this.anInt2786 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt2781 >> 12;
		Static306.method4554(super.anInt5743, local14, super.anInt5747, super.anInt5750, local35, local28, local21);
	}
}
