import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!n", name = "x", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!n", name = "J", descriptor = "I")
	private int anInt2087;

	@OriginalMember(owner = "client!n", name = "K", descriptor = "I")
	private int anInt2088;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "[I")
	private int[] anIntArray184 = new int[this.anInt2355];

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class75_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt2355; local15++) {
			this.anIntArray184[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	@Override
	protected final void method1886() {
		this.anInt2087 = Math.abs(this.anInt2087);
		if (this.anInt2087 >= 4096) {
			this.anInt2087 = 4095;
		}
		this.method1746(this.anInt2088++, (byte) (this.anInt2087 >> 4));
		this.anInt2087 = 0;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
	@Override
	protected final void method1892() {
		this.anInt2088 = 0;
		this.anInt2087 = 0;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(IB)V")
	protected void method1746(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray20[this.anInt2088++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method1888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2087 += this.anIntArray184[arg1] * arg0 >> 12;
	}
}
