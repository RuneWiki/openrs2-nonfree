import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
	private int anInt2243;

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
	private int anInt2245;

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
	private int anInt2247;

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
	private int anInt2253;

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
	private final int anInt2242;

	@OriginalMember(owner = "client!mq", name = "E", descriptor = "I")
	private final int anInt2255;

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
	private final int anInt2250;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
	private int anInt2249;

	static {
		new Class158("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class70_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2242 = (int) (arg7 * 4096.0F);
		this.anInt2255 = (int) (arg6 * 4096.0F);
		this.anInt2249 = this.anInt2250 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5662() {
		this.anInt2249 = this.anInt2250;
		this.anInt2243 >>= 0x4;
		if (this.anInt2243 < 0) {
			this.anInt2243 = 0;
		} else if (this.anInt2243 > 255) {
			this.anInt2243 = 255;
		}
		this.method1623(this.anInt2247++, (byte) this.anInt2243);
		this.anInt2243 = 0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIB)V")
	protected void method1623(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray27[arg0] = arg1;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5666() {
		this.anInt2247 = 0;
		this.anInt2243 = 0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2253 = this.anInt2255 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt2245 = 4096;
			this.anInt2253 = this.anInt2253 * this.anInt2253 >> 12;
			this.anInt2243 = this.anInt2253;
			return;
		}
		this.anInt2245 = this.anInt2253 * this.anInt2242 >> 12;
		this.anInt2253 = this.anInt2255 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt2245 < 0) {
			this.anInt2245 = 0;
		} else if (this.anInt2245 > 4096) {
			this.anInt2245 = 4096;
		}
		this.anInt2253 = this.anInt2253 * this.anInt2253 >> 12;
		this.anInt2253 = this.anInt2245 * this.anInt2253 >> 12;
		this.anInt2243 += this.anInt2253 * this.anInt2249 >> 12;
		this.anInt2249 = this.anInt2249 * this.anInt2250 >> 12;
	}
}
