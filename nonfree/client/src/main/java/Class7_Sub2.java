import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
	private int anInt6465;

	@OriginalMember(owner = "client!oaa", name = "x", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
	private int anInt6470;

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "[I")
	private final int[] anIntArray362 = new int[this.anInt6454];

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; super.anInt6454 > local13; local13++) {
			this.anIntArray362[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V")
	@Override
	protected final void method5801() {
		this.anInt6470 = Math.abs(this.anInt6470);
		if (this.anInt6470 >= 4096) {
			this.anInt6470 = 4095;
		}
		this.method5806((byte) (this.anInt6470 >> 4), this.anInt6465++);
		this.anInt6470 = 0;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6470 += this.anIntArray362[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBI)V")
	protected void method5806(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray68[this.anInt6465++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5800() {
		this.anInt6465 = 0;
		this.anInt6470 = 0;
	}
}
