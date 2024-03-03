import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	private int anInt6713;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "[B")
	private byte[] aByteArray95;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	private int anInt6715;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
	private final int[] anIntArray466 = new int[this.anInt6708];

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIF)V", line = 148)
	protected Class57_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt6708; local15++) {
			this.anIntArray466[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 9)
	@Override
	protected final void method6018() {
		this.anInt6713 = Math.abs(this.anInt6713);
		if (this.anInt6713 >= 4096) {
			this.anInt6713 = 4095;
		}
		this.method6021(this.anInt6715++, (byte) (this.anInt6713 >> 4));
		this.anInt6713 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V", line = 104)
	@Override
	protected final void method6012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6713 += this.anIntArray466[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V", line = 117)
	protected void method6021(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray95[this.anInt6715++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 125)
	@Override
	protected final void method6016() {
		this.anInt6713 = 0;
		this.anInt6715 = 0;
	}
}
