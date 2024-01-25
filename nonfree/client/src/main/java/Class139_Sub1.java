import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public class Class139_Sub1 extends Class139 {

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
	private int anInt5157;

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
	private int anInt5159;

	@OriginalMember(owner = "client!vq", name = "D", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "[I")
	private final int[] anIntArray280 = new int[this.anInt8398];

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class139_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt8398 > local15; local15++) {
			this.anIntArray280[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method6513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5157 += arg0 * this.anIntArray280[arg1] >> 12;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBI)V")
	protected void method4015(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray43[this.anInt5159++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6514() {
		this.anInt5157 = Math.abs(this.anInt5157);
		if (this.anInt5157 >= 4096) {
			this.anInt5157 = 4095;
		}
		this.method4015((byte) (this.anInt5157 >> 4), this.anInt5159++);
		this.anInt5157 = 0;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
	@Override
	protected final void method6520() {
		this.anInt5157 = 0;
		this.anInt5159 = 0;
	}
}
