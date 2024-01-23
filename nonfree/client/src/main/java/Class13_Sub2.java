import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!un", name = "w", descriptor = "I")
	private int anInt2939;

	@OriginalMember(owner = "client!un", name = "y", descriptor = "I")
	private int anInt2941;

	@OriginalMember(owner = "client!un", name = "A", descriptor = "I")
	private int anInt2943;

	@OriginalMember(owner = "client!un", name = "G", descriptor = "I")
	private int anInt2948;

	@OriginalMember(owner = "client!un", name = "M", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "I")
	private int anInt2942;

	@OriginalMember(owner = "client!un", name = "D", descriptor = "I")
	private int anInt2946;

	@OriginalMember(owner = "client!un", name = "I", descriptor = "I")
	private int anInt2950;

	@OriginalMember(owner = "client!un", name = "C", descriptor = "I")
	private int anInt2945;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class13_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2942 = (int) (arg6 * 4096.0F);
		this.anInt2946 = (int) (arg7 * 4096.0F);
		this.anInt2945 = this.anInt2950 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	@Override
	protected final void method2233() {
		this.anInt2945 = this.anInt2950;
		this.anInt2943 >>= 0x4;
		if (this.anInt2943 < 0) {
			this.anInt2943 = 0;
		} else if (this.anInt2943 > 255) {
			this.anInt2943 = 255;
		}
		this.method2240(this.anInt2948++, (byte) this.anInt2943);
		this.anInt2943 = 0;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	@Override
	protected final void method2230() {
		this.anInt2943 = 0;
		this.anInt2948 = 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method2234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2941 = 4096;
			this.anInt2939 = this.anInt2942 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt2939 = this.anInt2939 * this.anInt2939 >> 12;
			this.anInt2943 = this.anInt2939;
			return;
		}
		this.anInt2941 = this.anInt2939 * this.anInt2946 >> 12;
		if (this.anInt2941 < 0) {
			this.anInt2941 = 0;
		} else if (this.anInt2941 > 4096) {
			this.anInt2941 = 4096;
		}
		this.anInt2939 = this.anInt2942 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt2939 = this.anInt2939 * this.anInt2939 >> 12;
		this.anInt2939 = this.anInt2939 * this.anInt2941 >> 12;
		this.anInt2943 += this.anInt2939 * this.anInt2945 >> 12;
		this.anInt2945 = this.anInt2950 * this.anInt2945 >> 12;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(IB)V")
	protected void method2240(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray34[arg0] = arg1;
	}
}
