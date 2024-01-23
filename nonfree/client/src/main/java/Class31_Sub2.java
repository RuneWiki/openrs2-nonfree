import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
	private int anInt3734;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
	private int anInt3741;

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!wh", name = "I", descriptor = "[I")
	private int[] anIntArray278 = new int[this.anInt5468];

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class31_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt5468; local15++) {
			this.anIntArray278[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
	protected void method2906(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray31[this.anInt3734++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	@Override
	protected final void method4125() {
		this.anInt3741 = 0;
		this.anInt3734 = 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3741 += this.anIntArray278[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
	@Override
	protected final void method4126() {
		this.anInt3741 = Math.abs(this.anInt3741);
		if (this.anInt3741 >= 4096) {
			this.anInt3741 = 4095;
		}
		this.method2906(this.anInt3734++, (byte) (this.anInt3741 >> 4));
		this.anInt3741 = 0;
	}
}
