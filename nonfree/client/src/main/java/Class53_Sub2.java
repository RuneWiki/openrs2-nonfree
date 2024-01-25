import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!vaa", name = "p", descriptor = "[B")
	private byte[] aByteArray115;

	@OriginalMember(owner = "client!vaa", name = "v", descriptor = "I")
	private int anInt8214;

	@OriginalMember(owner = "client!vaa", name = "y", descriptor = "I")
	private int anInt8217;

	@OriginalMember(owner = "client!vaa", name = "A", descriptor = "[I")
	private final int[] anIntArray637 = new int[this.anInt9050];

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class53_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt9050; local15++) {
			this.anIntArray637[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BIZ)V")
	protected void method6628(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray115[this.anInt8217++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8214 += arg0 * this.anIntArray637[arg1] >> 12;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
	@Override
	protected final void method7333() {
		this.anInt8214 = Math.abs(this.anInt8214);
		if (this.anInt8214 >= 4096) {
			this.anInt8214 = 4095;
		}
		this.method6628((byte) (this.anInt8214 >> 4), this.anInt8217++);
		this.anInt8214 = 0;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7335() {
		this.anInt8217 = 0;
		this.anInt8214 = 0;
	}
}
