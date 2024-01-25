import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
	private int anInt1764;

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!qt", name = "D", descriptor = "I")
	private int anInt1771;

	@OriginalMember(owner = "client!qt", name = "z", descriptor = "[I")
	private final int[] anIntArray81 = new int[this.anInt6160];

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class69_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt6160; local15++) {
			this.anIntArray81[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4733() {
		this.anInt1764 = Math.abs(this.anInt1764);
		if (this.anInt1764 >= 4096) {
			this.anInt1764 = 4095;
		}
		this.method1434(this.anInt1771++, (byte) (this.anInt1764 >> 4));
		this.anInt1764 = 0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1764 += this.anIntArray81[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)V")
	@Override
	protected final void method4739() {
		this.anInt1771 = 0;
		this.anInt1764 = 0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BIB)V")
	protected void method1434(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray9[this.anInt1771++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
