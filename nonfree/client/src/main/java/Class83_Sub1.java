import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public class Class83_Sub1 extends Class83 {

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
	private int anInt3033;

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
	private int anInt3035;

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "[I")
	private final int[] anIntArray364 = new int[this.anInt5255];

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class83_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt5255; local15++) {
			this.anIntArray364[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3033 += this.anIntArray364[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
	@Override
	protected final void method4783() {
		this.anInt3033 = 0;
		this.anInt3035 = 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
	protected void method3201(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray53[this.anInt3035++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method4784() {
		this.anInt3033 = Math.abs(this.anInt3033);
		if (this.anInt3033 >= 4096) {
			this.anInt3033 = 4095;
		}
		this.method3201(this.anInt3035++, (byte) (this.anInt3033 >> 4));
		this.anInt3033 = 0;
	}
}
