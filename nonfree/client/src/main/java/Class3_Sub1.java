import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "I")
	private int anInt65;

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "[I")
	private final int[] anIntArray3 = new int[this.anInt5922];

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt5922 > local15; local15++) {
			this.anIntArray3[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V")
	protected void method47(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray2[this.anInt65++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method5021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt68 += this.anIntArray3[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
	@Override
	protected final void method5024() {
		this.anInt65 = 0;
		this.anInt68 = 0;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5018() {
		this.anInt68 = Math.abs(this.anInt68);
		if (this.anInt68 >= 4096) {
			this.anInt68 = 4095;
		}
		this.method47(this.anInt65++, (byte) (this.anInt68 >> 4));
		this.anInt68 = 0;
	}
}
