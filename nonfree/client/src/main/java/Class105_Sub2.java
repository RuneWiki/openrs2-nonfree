import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public class Class105_Sub2 extends Class105 {

	@OriginalMember(owner = "client!so", name = "t", descriptor = "I")
	private int anInt9488;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "I")
	private int anInt9489;

	@OriginalMember(owner = "client!so", name = "B", descriptor = "[B")
	private byte[] aByteArray108;

	@OriginalMember(owner = "client!so", name = "w", descriptor = "[I")
	private final int[] anIntArray690 = new int[this.anInt9482];

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class105_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt9482 > local15; local15++) {
			this.anIntArray690[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
	@Override
	protected final void method8371() {
		this.anInt9489 = 0;
		this.anInt9488 = 0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9489 += this.anIntArray690[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIB)V")
	protected void method8375(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray108[this.anInt9488++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V")
	@Override
	protected final void method8372() {
		this.anInt9489 = Math.abs(this.anInt9489);
		if (this.anInt9489 >= 4096) {
			this.anInt9489 = 4095;
		}
		this.method8375(this.anInt9488++, (byte) (this.anInt9489 >> 4));
		this.anInt9489 = 0;
	}
}
