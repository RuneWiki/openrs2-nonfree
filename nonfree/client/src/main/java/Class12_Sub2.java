import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!um", name = "z", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!um", name = "A", descriptor = "I")
	private int anInt5647;

	@OriginalMember(owner = "client!um", name = "B", descriptor = "I")
	private int anInt5648;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "[I")
	private final int[] anIntArray476 = new int[this.anInt7487];

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt7487 > local15; local15++) {
			this.anIntArray476[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6172() {
		this.anInt5647 = 0;
		this.anInt5648 = 0;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(BII)V")
	protected void method4746(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray53[this.anInt5648++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
	@Override
	protected final void method6176() {
		this.anInt5647 = Math.abs(this.anInt5647);
		if (this.anInt5647 >= 4096) {
			this.anInt5647 = 4095;
		}
		this.method4746((byte) (this.anInt5647 >> 4), this.anInt5648++);
		this.anInt5647 = 0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method6178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5647 += this.anIntArray476[arg0] * arg1 >> 12;
	}
}
