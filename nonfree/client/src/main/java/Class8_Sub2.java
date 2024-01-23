import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
	private int anInt5191;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
	private int anInt5203;

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "[I")
	private int[] anIntArray543 = new int[this.anInt5185];

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class8_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt5185; local15++) {
			this.anIntArray543[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V")
	protected void method4255(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray72[this.anInt5191++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4251() {
		this.anInt5203 = Math.abs(this.anInt5203);
		if (this.anInt5203 >= 4096) {
			this.anInt5203 = 4095;
		}
		this.method4255(this.anInt5191++, (byte) (this.anInt5203 >> 4));
		this.anInt5203 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method4254() {
		this.anInt5203 = 0;
		this.anInt5191 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5203 += arg1 * this.anIntArray543[arg0] >> 12;
	}
}
