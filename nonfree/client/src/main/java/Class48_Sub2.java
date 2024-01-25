import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public class Class48_Sub2 extends Class48 {

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	private int anInt5654;

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
	private int anInt5658;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "[I")
	private final int[] anIntArray394 = new int[this.anInt5645];

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class48_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt5645 > local15; local15++) {
			this.anIntArray394[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	@Override
	protected final void method4402() {
		this.anInt5658 = Math.abs(this.anInt5658);
		if (this.anInt5658 >= 4096) {
			this.anInt5658 = 4095;
		}
		this.method4408((byte) (this.anInt5658 >> 4), this.anInt5654++);
		this.anInt5658 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BBI)V")
	protected void method4408(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray73[this.anInt5654++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZ)V")
	@Override
	protected final void method4405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5658 += arg1 * this.anIntArray394[arg0] >> 12;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	@Override
	protected final void method4407() {
		this.anInt5658 = 0;
		this.anInt5654 = 0;
	}
}
