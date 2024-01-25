import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public class Class61_Sub2 extends Class61 {

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
	private int anInt9421;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
	private int anInt9426;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "[B")
	private byte[] aByteArray117;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "[I")
	private final int[] anIntArray821 = new int[this.anInt9413];

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class61_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; super.anInt9413 > local13; local13++) {
			this.anIntArray821[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	@Override
	protected final void method7938() {
		this.anInt9421 = 0;
		this.anInt9426 = 0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9426 += this.anIntArray821[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V")
	protected void method7946(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray117[this.anInt9421++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7937() {
		this.anInt9426 = Math.abs(this.anInt9426);
		if (this.anInt9426 >= 4096) {
			this.anInt9426 = 4095;
		}
		this.method7946((byte) (this.anInt9426 >> 4), this.anInt9421++);
		this.anInt9426 = 0;
	}
}
