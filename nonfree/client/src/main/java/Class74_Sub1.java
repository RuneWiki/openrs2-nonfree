import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
	private int anInt10859;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
	private int anInt10862;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "[B")
	private byte[] aByteArray135;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "[I")
	private final int[] anIntArray702 = new int[this.anInt10847];

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class74_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt10847; local15++) {
			this.anIntArray702[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V")
	@Override
	protected final void method9047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10859 += this.anIntArray702[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method9044() {
		this.anInt10859 = 0;
		this.anInt10862 = 0;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
	@Override
	protected final void method9042() {
		this.anInt10859 = Math.abs(this.anInt10859);
		if (this.anInt10859 >= 4096) {
			this.anInt10859 = 4095;
		}
		this.method9051(this.anInt10862++, (byte) (this.anInt10859 >> 4));
		this.anInt10859 = 0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIB)V")
	protected void method9051(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray135[this.anInt10862++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
