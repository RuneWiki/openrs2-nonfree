import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
	private int anInt2655;

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
	private int anInt2661;

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "[I")
	private final int[] anIntArray216 = new int[this.anInt4147];

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class42_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt4147; local15++) {
			this.anIntArray216[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3546(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2655 += this.anIntArray216[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
	protected void method2433(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray25[this.anInt2661++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	@Override
	protected final void method3544() {
		this.anInt2655 = Math.abs(this.anInt2655);
		if (this.anInt2655 >= 4096) {
			this.anInt2655 = 4095;
		}
		this.method2433(this.anInt2661++, (byte) (this.anInt2655 >> 4));
		this.anInt2655 = 0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3536() {
		this.anInt2655 = 0;
		this.anInt2661 = 0;
	}
}
