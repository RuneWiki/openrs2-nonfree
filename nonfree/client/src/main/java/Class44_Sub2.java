import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
	private int anInt9454;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
	private int anInt9456;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "[B")
	private byte[] aByteArray99;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "[I")
	private final int[] anIntArray683 = new int[this.anInt9445];

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class44_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; super.anInt9445 > local13; local13++) {
			this.anIntArray683[local13] = (short) (int) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8021() {
		this.anInt9456 = Math.abs(this.anInt9456);
		if (this.anInt9456 >= 4096) {
			this.anInt9456 = 4095;
		}
		this.method8030(this.anInt9454++, (byte) (this.anInt9456 >> 4));
		this.anInt9456 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBB)V")
	protected void method8030(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray99[this.anInt9454++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9456 += this.anIntArray683[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	@Override
	protected final void method8028() {
		this.anInt9456 = 0;
		this.anInt9454 = 0;
	}
}
