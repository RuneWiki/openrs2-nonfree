import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
	private int anInt3245;

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
	private int anInt3247;

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "[I")
	private int[] anIntArray275 = new int[this.anInt5634];

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class37_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt5634; local15++) {
			this.anIntArray275[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3245 += this.anIntArray275[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4714() {
		this.anInt3245 = Math.abs(this.anInt3245);
		if (this.anInt3245 >= 4096) {
			this.anInt3245 = 4095;
		}
		this.method2808(this.anInt3247++, (byte) (this.anInt3245 >> 4));
		this.anInt3245 = 0;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
	@Override
	protected final void method4720() {
		this.anInt3245 = 0;
		this.anInt3247 = 0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)V")
	protected void method2808(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray39[this.anInt3247++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
