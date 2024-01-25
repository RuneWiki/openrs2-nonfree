import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public class Class80_Sub2 extends Class80 {

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
	private int anInt9825;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "[B")
	private byte[] aByteArray99;

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
	private int anInt9832;

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "[I")
	private final int[] anIntArray687 = new int[this.anInt9821];

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class80_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; local13 < super.anInt9821; local13++) {
			this.anIntArray687[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
	@Override
	protected final void method8197() {
		this.anInt9825 = Math.abs(this.anInt9825);
		if (this.anInt9825 >= 4096) {
			this.anInt9825 = 4095;
		}
		this.method8204(this.anInt9832++, (byte) (this.anInt9825 >> 4));
		this.anInt9825 = 0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9825 += arg1 * this.anIntArray687[arg0] >> 12;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIB)V")
	protected void method8204(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray99[this.anInt9832++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8199() {
		this.anInt9832 = 0;
		this.anInt9825 = 0;
	}
}
