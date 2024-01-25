import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!al", name = "s", descriptor = "I")
	private int anInt7793;

	@OriginalMember(owner = "client!al", name = "x", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!al", name = "A", descriptor = "I")
	private int anInt7798;

	@OriginalMember(owner = "client!al", name = "y", descriptor = "[I")
	private final int[] anIntArray663 = new int[this.anInt8262];

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class18_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; local13 < super.anInt8262; local13++) {
			this.anIntArray663[local13] = (short) (int) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7242() {
		this.anInt7793 = Math.abs(this.anInt7793);
		if (this.anInt7793 >= 4096) {
			this.anInt7793 = 4095;
		}
		this.method6840(this.anInt7798++, (byte) (this.anInt7793 >> 4));
		this.anInt7793 = 0;
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V")
	@Override
	protected final void method7246() {
		this.anInt7798 = 0;
		this.anInt7793 = 0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBB)V")
	protected void method6840(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray82[this.anInt7798++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7793 += arg0 * this.anIntArray663[arg1] >> 12;
	}
}
