import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
	private int anInt6300;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	private int anInt6302;

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "[I")
	private final int[] anIntArray365 = new int[this.anInt8676];

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt8676 > local15; local15++) {
			this.anIntArray365[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6302 += this.anIntArray365[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	@Override
	protected final void method7601() {
		this.anInt6302 = Math.abs(this.anInt6302);
		if (this.anInt6302 >= 4096) {
			this.anInt6302 = 4095;
		}
		this.method5660(this.anInt6300++, (byte) (this.anInt6302 >> 4));
		this.anInt6302 = 0;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7597() {
		this.anInt6302 = 0;
		this.anInt6300 = 0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBB)V")
	protected void method5660(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray55[this.anInt6300++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
