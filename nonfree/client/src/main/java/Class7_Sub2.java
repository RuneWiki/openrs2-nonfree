import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
	private int anInt3382;

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
	private int anInt3384;

	@OriginalMember(owner = "client!qo", name = "F", descriptor = "[I")
	private final int[] anIntArray303 = new int[this.anInt3376];

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt3376; local15++) {
			this.anIntArray303[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	@Override
	protected final void method2921() {
		this.anInt3384 = Math.abs(this.anInt3384);
		if (this.anInt3384 >= 4096) {
			this.anInt3384 = 4095;
		}
		this.method2928(this.anInt3382++, (byte) (this.anInt3384 >> 4));
		this.anInt3384 = 0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method2920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3384 += this.anIntArray303[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)V")
	protected void method2928(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray46[this.anInt3382++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
	@Override
	protected final void method2926() {
		this.anInt3382 = 0;
		this.anInt3384 = 0;
	}
}
