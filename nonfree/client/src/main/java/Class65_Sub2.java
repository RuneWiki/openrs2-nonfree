import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
	private int anInt4948;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
	private int anInt4953;

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "[I")
	private final int[] anIntArray442 = new int[this.anInt4940];

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class65_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt4940 > local15; local15++) {
			this.anIntArray442[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method3913(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4948 += this.anIntArray442[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBB)V")
	protected void method3921(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray73[this.anInt4953++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	@Override
	protected final void method3918() {
		this.anInt4948 = 0;
		this.anInt4953 = 0;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	@Override
	protected final void method3916() {
		this.anInt4948 = Math.abs(this.anInt4948);
		if (this.anInt4948 >= 4096) {
			this.anInt4948 = 4095;
		}
		this.method3921(this.anInt4953++, (byte) (this.anInt4948 >> 4));
		this.anInt4948 = 0;
	}
}
