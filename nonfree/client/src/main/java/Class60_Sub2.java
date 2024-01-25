import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public class Class60_Sub2 extends Class60 {

	@OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
	private int anInt4800;

	@OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
	private int anInt4802;

	@OriginalMember(owner = "client!nn", name = "z", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!nn", name = "u", descriptor = "[I")
	private final int[] anIntArray324 = new int[this.anInt4935];

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class60_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt4935 > local15; local15++) {
			this.anIntArray324[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIB)V")
	protected void method4040(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray58[this.anInt4802++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4152() {
		this.anInt4800 = Math.abs(this.anInt4800);
		if (this.anInt4800 >= 4096) {
			this.anInt4800 = 4095;
		}
		this.method4040(this.anInt4802++, (byte) (this.anInt4800 >> 4));
		this.anInt4800 = 0;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)V")
	@Override
	protected final void method4160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4800 += arg1 * this.anIntArray324[arg0] >> 12;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4158() {
		this.anInt4802 = 0;
		this.anInt4800 = 0;
	}
}
