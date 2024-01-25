import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!jaa", name = "t", descriptor = "I")
	private int anInt4115;

	@OriginalMember(owner = "client!jaa", name = "v", descriptor = "I")
	private int anInt4117;

	@OriginalMember(owner = "client!jaa", name = "w", descriptor = "[B")
	private byte[] aByteArray99;

	@OriginalMember(owner = "client!jaa", name = "s", descriptor = "[I")
	private final int[] anIntArray174 = new int[this.anInt5632];

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class44_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt5632 > local15; local15++) {
			this.anIntArray174[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(III)V")
	@Override
	protected final void method4571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4115 += arg0 * this.anIntArray174[arg1] >> 12;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIB)V")
	protected void method3337(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray99[this.anInt4117++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method4574() {
		this.anInt4115 = 0;
		this.anInt4117 = 0;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4568() {
		this.anInt4115 = Math.abs(this.anInt4115);
		if (this.anInt4115 >= 4096) {
			this.anInt4115 = 4095;
		}
		this.method3337(this.anInt4117++, (byte) (this.anInt4115 >> 4));
		this.anInt4115 = 0;
	}
}
