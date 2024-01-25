import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "[I")
	private final int[] anIntArray26 = new int[this.anInt9554];

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt9554; local15++) {
			this.anIntArray26[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(BII)V")
	protected void method269(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray5[this.anInt329++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method7804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt326 += arg1 * this.anIntArray26[arg0] >> 12;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
	@Override
	protected final void method7801() {
		this.anInt326 = Math.abs(this.anInt326);
		if (this.anInt326 >= 4096) {
			this.anInt326 = 4095;
		}
		this.method269((byte) (this.anInt326 >> 4), this.anInt329++);
		this.anInt326 = 0;
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(B)V")
	@Override
	protected final void method7807() {
		this.anInt329 = 0;
		this.anInt326 = 0;
	}
}
