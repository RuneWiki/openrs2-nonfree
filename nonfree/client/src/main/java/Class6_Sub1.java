import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ada", name = "r", descriptor = "I")
	private int anInt5984;

	@OriginalMember(owner = "client!ada", name = "t", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!ada", name = "x", descriptor = "I")
	private int anInt5989;

	@OriginalMember(owner = "client!ada", name = "y", descriptor = "[I")
	private final int[] anIntArray355 = new int[this.anInt8207];

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt8207 > local15; local15++) {
			this.anIntArray355[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6632() {
		this.anInt5989 = 0;
		this.anInt5984 = 0;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BII)V")
	protected void method4847(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray54[this.anInt5984++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZII)V")
	@Override
	protected final void method6636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5989 += this.anIntArray355[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)V")
	@Override
	protected final void method6637() {
		this.anInt5989 = Math.abs(this.anInt5989);
		if (this.anInt5989 >= 4096) {
			this.anInt5989 = 4095;
		}
		this.method4847((byte) (this.anInt5989 >> 4), this.anInt5984++);
		this.anInt5989 = 0;
	}
}
