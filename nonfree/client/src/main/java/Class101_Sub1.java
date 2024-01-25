import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	private int anInt7938;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	private int anInt7941;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "[I")
	private final int[] anIntArray566 = new int[this.anInt9145];

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class101_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt9145; local15++) {
			this.anIntArray566[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7938 += arg0 * this.anIntArray566[arg1] >> 12;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
	@Override
	protected final void method7247() {
		this.anInt7938 = Math.abs(this.anInt7938);
		if (this.anInt7938 >= 4096) {
			this.anInt7938 = 4095;
		}
		this.method6330(this.anInt7941++, (byte) (this.anInt7938 >> 4));
		this.anInt7938 = 0;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	@Override
	protected final void method7244() {
		this.anInt7941 = 0;
		this.anInt7938 = 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZB)V")
	protected void method6330(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray100[this.anInt7941++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
