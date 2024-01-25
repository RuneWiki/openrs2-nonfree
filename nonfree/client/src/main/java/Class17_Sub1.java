import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!at", name = "o", descriptor = "I")
	private int anInt4638;

	@OriginalMember(owner = "client!at", name = "p", descriptor = "I")
	private int anInt4639;

	@OriginalMember(owner = "client!at", name = "v", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!at", name = "u", descriptor = "[I")
	private final int[] anIntArray279 = new int[this.anInt8169];

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt8169; local15++) {
			this.anIntArray279[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V")
	@Override
	protected final void method6654() {
		this.anInt4639 = Math.abs(this.anInt4639);
		if (this.anInt4639 >= 4096) {
			this.anInt4639 = 4095;
		}
		this.method4014(this.anInt4638++, (byte) (this.anInt4639 >> 4));
		this.anInt4639 = 0;
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V")
	@Override
	protected final void method6655() {
		this.anInt4639 = 0;
		this.anInt4638 = 0;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(IBI)V")
	protected void method4014(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray43[this.anInt4638++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method6652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4639 += this.anIntArray279[arg1] * arg0 >> 12;
	}
}
