import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "[B")
	public static final byte[] aByteArray30;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
	private final int anInt2903;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
	private final int anInt2900;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
	private final int anInt2904;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
	private final int anInt2907;

	static {
		@Pc(7) int local7 = 0;
		aByteArray30 = new byte[32896];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray30[local7++] = (byte) (255.0D / Math.sqrt((double) ((float) (local15 * local15 + local12 * local12 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIIII)V")
	public Class9_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2903 = arg0;
		this.anInt2900 = arg2;
		this.anInt2904 = arg1;
		this.anInt2907 = arg3;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
	@Override
	public void method4773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2903 * arg1 >> 12;
		@Pc(20) int local20 = this.anInt2900 * arg1 >> 12;
		@Pc(27) int local27 = this.anInt2904 * arg0 >> 12;
		@Pc(34) int local34 = this.anInt2907 * arg0 >> 12;
		Static186.method2968(super.anInt6015, local27, local34, local20, local10);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	@Override
	public void method4772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2903 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2900 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt2904 >> 12;
		@Pc(35) int local35 = this.anInt2907 * arg1 >> 12;
		Static210.method3168(super.anInt6015, local17, super.anInt6017, local28, local10, local35, super.anInt6022);
	}
}
