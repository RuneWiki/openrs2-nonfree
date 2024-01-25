import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
	private int anInt4346;

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "[B")
	private byte[] aByteArray74;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
	private int anInt4352;

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "[I")
	private final int[] anIntArray555 = new int[this.anInt4338];

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt4338 > local15; local15++) {
			this.anIntArray555[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4352 += this.anIntArray555[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4019() {
		this.anInt4352 = 0;
		this.anInt4346 = 0;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	@Override
	protected final void method4021() {
		this.anInt4352 = Math.abs(this.anInt4352);
		if (this.anInt4352 >= 4096) {
			this.anInt4352 = 4095;
		}
		this.method4026(this.anInt4346++, (byte) (this.anInt4352 >> 4));
		this.anInt4352 = 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
	protected void method4026(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray74[this.anInt4346++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
