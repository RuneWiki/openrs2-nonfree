import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "[J")
	public static final long[] aLongArray8 = new long[256];

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
	private final int anInt6287;

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
	private final int anInt6293;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
	private final int anInt6295;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
	private final int anInt6290;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
	private final int anInt6288;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
	private final int anInt6289;

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
	private final int anInt6291;

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
	private final int anInt6294;

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
			aLongArray8[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class57_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6287 = arg3;
		this.anInt6293 = arg6;
		this.anInt6295 = arg1;
		this.anInt6290 = arg7;
		this.anInt6288 = arg0;
		this.anInt6289 = arg4;
		this.anInt6291 = arg5;
		this.anInt6294 = arg2;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(III)V")
	@Override
	public void method5863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V")
	@Override
	public void method5862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6288 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6295 >> 12;
		@Pc(29) int local29 = this.anInt6294 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt6287 * arg0 >> 12;
		@Pc(43) int local43 = this.anInt6289 * arg1 >> 12;
		@Pc(50) int local50 = this.anInt6291 * arg0 >> 12;
		@Pc(57) int local57 = arg1 * this.anInt6293 >> 12;
		@Pc(64) int local64 = this.anInt6290 * arg0 >> 12;
		Static408.method5508(local29, super.anInt7558, local10, local50, local57, local43, local64, local17, local36);
	}
}
