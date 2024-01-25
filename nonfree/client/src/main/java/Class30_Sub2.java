import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	private int anInt9793;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	private int anInt9795;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "[B")
	private byte[] aByteArray105;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "[I")
	private final int[] anIntArray524 = new int[this.anInt9787];

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt9787; local15++) {
			this.anIntArray524[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7987() {
		this.anInt9793 = 0;
		this.anInt9795 = 0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIB)V")
	protected void method7997(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray105[this.anInt9793++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9795 += this.anIntArray524[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7988() {
		this.anInt9795 = Math.abs(this.anInt9795);
		if (this.anInt9795 >= 4096) {
			this.anInt9795 = 4095;
		}
		this.method7997(this.anInt9793++, (byte) (this.anInt9795 >> 4));
		this.anInt9795 = 0;
	}
}
