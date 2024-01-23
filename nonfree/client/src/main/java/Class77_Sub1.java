import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!na", name = "A", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "I")
	private int anInt6009;

	@OriginalMember(owner = "client!na", name = "F", descriptor = "I")
	private int anInt6011;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
	private int[] anIntArray595 = new int[this.anInt6001];

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class77_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt6001; local15++) {
			this.anIntArray595[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4709() {
		this.anInt6011 = 0;
		this.anInt6009 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4704() {
		this.anInt6011 = Math.abs(this.anInt6011);
		if (this.anInt6011 >= 4096) {
			this.anInt6011 = 4095;
		}
		this.method4715(this.anInt6009++, (byte) (this.anInt6011 >> 4));
		this.anInt6011 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6011 += arg0 * this.anIntArray595[arg1] >> 12;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V")
	protected void method4715(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray75[this.anInt6009++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
