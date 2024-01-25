import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!fda", name = "q", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!fda", name = "s", descriptor = "I")
	private int anInt5188;

	@OriginalMember(owner = "client!fda", name = "A", descriptor = "I")
	private int anInt5194;

	@OriginalMember(owner = "client!fda", name = "w", descriptor = "[I")
	private final int[] anIntArray428 = new int[this.anInt6557];

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt6557; local15++) {
			this.anIntArray428[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5900() {
		this.anInt5188 = Math.abs(this.anInt5188);
		if (this.anInt5188 >= 4096) {
			this.anInt5188 = 4095;
		}
		this.method4816((byte) (this.anInt5188 >> 4), this.anInt5194++);
		this.anInt5188 = 0;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method5899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5188 += arg0 * this.anIntArray428[arg1] >> 12;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BBI)V")
	protected void method4816(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray72[this.anInt5194++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)V")
	@Override
	protected final void method5902() {
		this.anInt5194 = 0;
		this.anInt5188 = 0;
	}
}
