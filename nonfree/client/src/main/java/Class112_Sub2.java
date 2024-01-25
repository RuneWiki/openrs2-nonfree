import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public class Class112_Sub2 extends Class112 {

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
	private int anInt10146;

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "[B")
	private byte[] aByteArray104;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
	private int anInt10152;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "[I")
	private final int[] anIntArray744 = new int[this.anInt10140];

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class112_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt10140 > local15; local15++) {
			this.anIntArray744[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIB)V")
	protected void method8633(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray104[this.anInt10152++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	@Override
	protected final void method8632() {
		this.anInt10146 = 0;
		this.anInt10152 = 0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method8630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10146 += arg0 * this.anIntArray744[arg1] >> 12;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8625() {
		this.anInt10146 = Math.abs(this.anInt10146);
		if (this.anInt10146 >= 4096) {
			this.anInt10146 = 4095;
		}
		this.method8633(this.anInt10152++, (byte) (this.anInt10146 >> 4));
		this.anInt10146 = 0;
	}
}
