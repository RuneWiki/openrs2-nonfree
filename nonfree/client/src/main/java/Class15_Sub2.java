import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	private int anInt9850;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "I")
	private int anInt9855;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!id", name = "D", descriptor = "[I")
	private final int[] anIntArray564 = new int[this.anInt9843];

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class15_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; super.anInt9843 > local13; local13++) {
			this.anIntArray564[local13] = (short) (int) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8196() {
		this.anInt9855 = Math.abs(this.anInt9855);
		if (this.anInt9855 >= 4096) {
			this.anInt9855 = 4095;
		}
		this.method8208((byte) (this.anInt9855 >> 4), this.anInt9850++);
		this.anInt9855 = 0;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
	@Override
	protected final void method8202() {
		this.anInt9850 = 0;
		this.anInt9855 = 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZBI)V")
	protected void method8208(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray100[this.anInt9850++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9855 += arg0 * this.anIntArray564[arg1] >> 12;
	}
}
