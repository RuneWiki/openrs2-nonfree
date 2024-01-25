import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public class Class221_Sub1 extends Class221 {

	@OriginalMember(owner = "client!mca", name = "v", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!mca", name = "x", descriptor = "I")
	private int anInt8346;

	@OriginalMember(owner = "client!mca", name = "A", descriptor = "I")
	private int anInt8349;

	@OriginalMember(owner = "client!mca", name = "s", descriptor = "[I")
	private final int[] anIntArray653 = new int[this.anInt8685];

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class221_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt8685 > local15; local15++) {
			this.anIntArray653[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)V")
	@Override
	protected final void method7472() {
		this.anInt8346 = Math.abs(this.anInt8346);
		if (this.anInt8346 >= 4096) {
			this.anInt8346 = 4095;
		}
		this.method7174(this.anInt8349++, (byte) (this.anInt8346 >> 4));
		this.anInt8346 = 0;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7467() {
		this.anInt8349 = 0;
		this.anInt8346 = 0;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8346 += this.anIntArray653[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZB)V")
	protected void method7174(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray76[this.anInt8349++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
