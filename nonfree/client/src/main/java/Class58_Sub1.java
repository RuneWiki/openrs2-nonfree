import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
	private int anInt1891;

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
	private int anInt1898;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "[I")
	private final int[] anIntArray192 = new int[this.anInt4451];

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class58_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt4451; local15++) {
			this.anIntArray192[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method4000() {
		this.anInt1891 = Math.abs(this.anInt1891);
		if (this.anInt1891 >= 4096) {
			this.anInt1891 = 4095;
		}
		this.method1662(this.anInt1898++, (byte) (this.anInt1891 >> 4));
		this.anInt1891 = 0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method3995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1891 += arg0 * this.anIntArray192[arg1] >> 12;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V")
	protected void method1662(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray28[this.anInt1898++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V")
	@Override
	protected final void method4002() {
		this.anInt1898 = 0;
		this.anInt1891 = 0;
	}
}
