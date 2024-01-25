import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!si", name = "z", descriptor = "I")
	private int anInt4697;

	@OriginalMember(owner = "client!si", name = "H", descriptor = "I")
	private int anInt4704;

	@OriginalMember(owner = "client!si", name = "I", descriptor = "I")
	private int anInt4705;

	@OriginalMember(owner = "client!si", name = "J", descriptor = "I")
	private int anInt4706;

	@OriginalMember(owner = "client!si", name = "L", descriptor = "[B")
	private byte[] aByteArray139;

	@OriginalMember(owner = "client!si", name = "K", descriptor = "I")
	private final int anInt4707;

	@OriginalMember(owner = "client!si", name = "D", descriptor = "I")
	private final int anInt4701;

	@OriginalMember(owner = "client!si", name = "x", descriptor = "I")
	private final int anInt4695;

	@OriginalMember(owner = "client!si", name = "B", descriptor = "I")
	private int anInt4699;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class34_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4707 = (int) (arg7 * 4096.0F);
		this.anInt4701 = (int) (arg6 * 4096.0F);
		this.anInt4699 = this.anInt4695 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
	@Override
	protected final void method3793() {
		this.anInt4699 = this.anInt4695;
		this.anInt4706 >>= 0x4;
		if (this.anInt4706 < 0) {
			this.anInt4706 = 0;
		} else if (this.anInt4706 > 255) {
			this.anInt4706 = 255;
		}
		this.method3805((byte) this.anInt4706, this.anInt4705++);
		this.anInt4706 = 0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt4704 = this.anInt4701 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt4697 = 4096;
			this.anInt4704 = this.anInt4704 * this.anInt4704 >> 12;
			this.anInt4706 = this.anInt4704;
			return;
		}
		this.anInt4697 = this.anInt4704 * this.anInt4707 >> 12;
		this.anInt4704 = this.anInt4701 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt4697 < 0) {
			this.anInt4697 = 0;
		} else if (this.anInt4697 > 4096) {
			this.anInt4697 = 4096;
		}
		this.anInt4704 = this.anInt4704 * this.anInt4704 >> 12;
		this.anInt4704 = this.anInt4697 * this.anInt4704 >> 12;
		this.anInt4706 += this.anInt4699 * this.anInt4704 >> 12;
		this.anInt4699 = this.anInt4699 * this.anInt4695 >> 12;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)V")
	protected void method3805(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray139[arg1] = arg0;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	@Override
	protected final void method3798() {
		this.anInt4705 = 0;
		this.anInt4706 = 0;
	}
}
