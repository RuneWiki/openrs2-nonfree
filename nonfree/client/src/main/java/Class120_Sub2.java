import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public class Class120_Sub2 extends Class120 {

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
	private int anInt5378;

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
	private int anInt5380;

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "[I")
	private int[] anIntArray479 = new int[this.anInt5365];

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class120_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt5365; local15++) {
			this.anIntArray479[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5380 += this.anIntArray479[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	protected void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray73[this.anInt5378++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4263() {
		this.anInt5378 = 0;
		this.anInt5380 = 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4256() {
		this.anInt5380 = Math.abs(this.anInt5380);
		if (this.anInt5380 >= 4096) {
			this.anInt5380 = 4095;
		}
		this.method4267(this.anInt5378++, (byte) (this.anInt5380 >> 4));
		this.anInt5380 = 0;
	}
}
