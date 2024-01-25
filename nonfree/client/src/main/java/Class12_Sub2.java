import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
	private int anInt10522;

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
	private int anInt10528;

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "[I")
	private final int[] anIntArray590 = new int[this.anInt10673];

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt10673 > local15; local15++) {
			this.anIntArray590[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
	@Override
	protected final void method8923() {
		this.anInt10522 = Math.abs(this.anInt10522);
		if (this.anInt10522 >= 4096) {
			this.anInt10522 = 4095;
		}
		this.method8802(this.anInt10528++, (byte) (this.anInt10522 >> 4));
		this.anInt10522 = 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	@Override
	protected final void method8922() {
		this.anInt10528 = 0;
		this.anInt10522 = 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method8928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10522 += arg1 * this.anIntArray590[arg0] >> 12;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBB)V")
	protected void method8802(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray100[this.anInt10528++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
