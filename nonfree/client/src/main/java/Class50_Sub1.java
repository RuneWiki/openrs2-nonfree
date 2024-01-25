import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
	private int anInt5322;

	@OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
	private int anInt5324;

	@OriginalMember(owner = "client!tj", name = "y", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
	private int anInt5327;

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
	private int anInt5328;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
	private final int anInt5330;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
	private final int anInt5321;

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
	private final int anInt5320;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
	private int anInt5329;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class50_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5330 = (int) (arg6 * 4096.0F);
		this.anInt5321 = (int) (arg7 * 4096.0F);
		this.anInt5329 = this.anInt5320 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt5327 = this.anInt5330 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt5324 = 4096;
			this.anInt5327 = this.anInt5327 * this.anInt5327 >> 12;
			this.anInt5328 = this.anInt5327;
			return;
		}
		this.anInt5324 = this.anInt5327 * this.anInt5321 >> 12;
		this.anInt5327 = this.anInt5330 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt5324 < 0) {
			this.anInt5324 = 0;
		} else if (this.anInt5324 > 4096) {
			this.anInt5324 = 4096;
		}
		this.anInt5327 = this.anInt5327 * this.anInt5327 >> 12;
		this.anInt5327 = this.anInt5327 * this.anInt5324 >> 12;
		this.anInt5328 += this.anInt5327 * this.anInt5329 >> 12;
		this.anInt5329 = this.anInt5320 * this.anInt5329 >> 12;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5240() {
		this.anInt5328 = 0;
		this.anInt5322 = 0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)V")
	protected void method4496(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray53[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	@Override
	protected final void method5241() {
		this.anInt5328 >>= 0x4;
		this.anInt5329 = this.anInt5320;
		if (this.anInt5328 < 0) {
			this.anInt5328 = 0;
		} else if (this.anInt5328 > 255) {
			this.anInt5328 = 255;
		}
		this.method4496(this.anInt5322++, (byte) this.anInt5328);
		this.anInt5328 = 0;
	}
}
