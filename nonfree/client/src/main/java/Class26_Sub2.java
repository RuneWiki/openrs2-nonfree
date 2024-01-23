import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
	private int anInt5562;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "[B")
	private byte[] aByteArray189;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
	private int anInt5566;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "[I")
	private int[] anIntArray608 = new int[this.anInt5549];

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class26_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt5549; local15++) {
			this.anIntArray608[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4611() {
		this.anInt5566 = 0;
		this.anInt5562 = 0;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4616() {
		this.anInt5566 = Math.abs(this.anInt5566);
		if (this.anInt5566 >= 4096) {
			this.anInt5566 = 4095;
		}
		this.method4619(this.anInt5562++, (byte) (this.anInt5566 >> 4));
		this.anInt5566 = 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5566 += this.anIntArray608[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IB)V")
	protected void method4619(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray189[this.anInt5562++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
