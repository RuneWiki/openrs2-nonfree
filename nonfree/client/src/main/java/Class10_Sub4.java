import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!s", name = "E", descriptor = "[B")
	public static final byte[] aByteArray87 = new byte[32896];

	@OriginalMember(owner = "client!s", name = "w", descriptor = "I")
	private final int anInt5399;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "I")
	private final int anInt5394;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "I")
	private final int anInt5393;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "I")
	private final int anInt5396;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "I")
	private final int anInt5405;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "I")
	private final int anInt5392;

	@OriginalMember(owner = "client!s", name = "B", descriptor = "I")
	private final int anInt5404;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "I")
	private final int anInt5398;

	static {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			for (@Pc(16) int local16 = 0; local16 <= local13; local16++) {
				aByteArray87[local11++] = (byte) (255.0D / Math.sqrt((double) ((float) (local13 * local13 + local16 * local16 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class10_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5399 = arg3;
		this.anInt5394 = arg5;
		this.anInt5393 = arg6;
		this.anInt5396 = arg4;
		this.anInt5405 = arg7;
		this.anInt5392 = arg0;
		this.anInt5404 = arg2;
		this.anInt5398 = arg1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)V")
	@Override
	public void method4800(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	@Override
	public void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(III)V")
	@Override
	public void method4801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5392 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5398 >> 12;
		@Pc(24) int local24 = this.anInt5404 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt5399 * arg0 >> 12;
		@Pc(41) int local41 = this.anInt5396 * arg1 >> 12;
		@Pc(48) int local48 = this.anInt5394 * arg0 >> 12;
		@Pc(55) int local55 = arg1 * this.anInt5393 >> 12;
		@Pc(62) int local62 = arg0 * this.anInt5405 >> 12;
		Static344.method5511(super.anInt5381, local31, local24, local48, local62, local10, local55, local41, local17);
	}
}
