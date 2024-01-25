import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
	private int anInt5170;

	@OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
	private int anInt5175;

	@OriginalMember(owner = "client!dr", name = "C", descriptor = "I")
	private int anInt5177;

	@OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
	private int anInt5178;

	@OriginalMember(owner = "client!dr", name = "J", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!dr", name = "I", descriptor = "I")
	private final int anInt5183;

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
	private final int anInt5173;

	@OriginalMember(owner = "client!dr", name = "E", descriptor = "I")
	private final int anInt5179;

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
	private int anInt5171;

	static {
		new Class85("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class23_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5183 = (int) (arg7 * 4096.0F);
		this.anInt5173 = (int) (arg6 * 4096.0F);
		this.anInt5171 = this.anInt5179 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method4629() {
		this.anInt5177 >>= 0x4;
		this.anInt5171 = this.anInt5179;
		if (this.anInt5177 < 0) {
			this.anInt5177 = 0;
		} else if (this.anInt5177 > 255) {
			this.anInt5177 = 255;
		}
		this.method4634(this.anInt5170++, (byte) this.anInt5177);
		this.anInt5177 = 0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4621() {
		this.anInt5170 = 0;
		this.anInt5177 = 0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)V")
	protected void method4634(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray72[arg0] = arg1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZ)V")
	@Override
	protected final void method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5178 = this.anInt5173 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt5175 = 4096;
			this.anInt5178 = this.anInt5178 * this.anInt5178 >> 12;
			this.anInt5177 = this.anInt5178;
			return;
		}
		this.anInt5175 = this.anInt5178 * this.anInt5183 >> 12;
		this.anInt5178 = this.anInt5173 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt5175 < 0) {
			this.anInt5175 = 0;
		} else if (this.anInt5175 > 4096) {
			this.anInt5175 = 4096;
		}
		this.anInt5178 = this.anInt5178 * this.anInt5178 >> 12;
		this.anInt5178 = this.anInt5175 * this.anInt5178 >> 12;
		this.anInt5177 += this.anInt5171 * this.anInt5178 >> 12;
		this.anInt5171 = this.anInt5179 * this.anInt5171 >> 12;
	}
}
