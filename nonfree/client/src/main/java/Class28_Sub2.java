import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	private int anInt6028;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
	private int anInt6031;

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "[I")
	private final int[] anIntArray556 = new int[this.anInt6019];

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class28_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; super.anInt6019 > local13; local13++) {
			this.anIntArray556[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB)V")
	protected void method5044(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray77[this.anInt6031++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
	@Override
	protected final void method5041() {
		this.anInt6028 = Math.abs(this.anInt6028);
		if (this.anInt6028 >= 4096) {
			this.anInt6028 = 4095;
		}
		this.method5044(this.anInt6031++, (byte) (this.anInt6028 >> 4));
		this.anInt6028 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5038() {
		this.anInt6031 = 0;
		this.anInt6028 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZII)V")
	@Override
	protected final void method5043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6028 += this.anIntArray556[arg1] * arg0 >> 12;
	}
}
