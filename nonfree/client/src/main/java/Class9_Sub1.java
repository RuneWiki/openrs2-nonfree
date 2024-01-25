import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "[I")
	private final int[] anIntArray23 = new int[this.anInt660];

	static {
		new Class93(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt660 > local15; local15++) {
			this.anIntArray23[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	@Override
	protected final void method840() {
		this.anInt286 = Math.abs(this.anInt286);
		if (this.anInt286 >= 4096) {
			this.anInt286 = 4095;
		}
		this.method412(this.anInt280++, (byte) (this.anInt286 >> 4));
		this.anInt286 = 0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt286 += this.anIntArray23[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
	protected void method412(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray6[this.anInt280++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	@Override
	protected final void method838() {
		this.anInt280 = 0;
		this.anInt286 = 0;
	}
}
