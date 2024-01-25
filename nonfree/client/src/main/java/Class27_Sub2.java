import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public class Class27_Sub2 extends Class27 {

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
	private int anInt5201;

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
	private int anInt5203;

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "[I")
	private final int[] anIntArray577 = new int[this.anInt5196];

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class27_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt5196 > local15; local15++) {
			this.anIntArray577[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method4643() {
		this.anInt5203 = 0;
		this.anInt5201 = 0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)V")
	protected void method4652(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray67[this.anInt5201++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5203 += this.anIntArray577[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
	@Override
	protected final void method4649() {
		this.anInt5203 = Math.abs(this.anInt5203);
		if (this.anInt5203 >= 4096) {
			this.anInt5203 = 4095;
		}
		this.method4652(this.anInt5201++, (byte) (this.anInt5203 >> 4));
		this.anInt5203 = 0;
	}
}
