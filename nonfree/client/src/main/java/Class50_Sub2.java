import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public class Class50_Sub2 extends Class50 {

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
	private int anInt6206;

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
	private int anInt6210;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "[I")
	private final int[] anIntArray367 = new int[this.anInt6202];

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class50_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt6202; local15++) {
			this.anIntArray367[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIB)V")
	protected void method5246(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray69[this.anInt6206++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	@Override
	protected final void method5241() {
		this.anInt6210 = Math.abs(this.anInt6210);
		if (this.anInt6210 >= 4096) {
			this.anInt6210 = 4095;
		}
		this.method5246(this.anInt6206++, (byte) (this.anInt6210 >> 4));
		this.anInt6210 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5240() {
		this.anInt6210 = 0;
		this.anInt6206 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6210 += arg1 * this.anIntArray367[arg0] >> 12;
	}
}
