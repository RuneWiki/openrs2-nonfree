import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
	private int anInt2181;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
	private int anInt2182;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
	private int anInt2188;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
	private int anInt2192;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
	private int anInt2189;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	private int anInt2177;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
	private int anInt2186;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
	private int anInt2180;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class55_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2189 = (int) (arg6 * 4096.0F);
		this.anInt2177 = (int) (arg7 * 4096.0F);
		this.anInt2180 = this.anInt2186 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	@Override
	protected final void method2436() {
		this.anInt2181 >>= 0x4;
		this.anInt2180 = this.anInt2186;
		if (this.anInt2181 < 0) {
			this.anInt2181 = 0;
		} else if (this.anInt2181 > 255) {
			this.anInt2181 = 255;
		}
		this.method1812(this.anInt2192++, (byte) this.anInt2181);
		this.anInt2181 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	@Override
	protected final void method2434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2188 = 4096;
			this.anInt2182 = this.anInt2189 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt2182 = this.anInt2182 * this.anInt2182 >> 12;
			this.anInt2181 = this.anInt2182;
			return;
		}
		this.anInt2188 = this.anInt2182 * this.anInt2177 >> 12;
		this.anInt2182 = this.anInt2189 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt2182 = this.anInt2182 * this.anInt2182 >> 12;
		if (this.anInt2188 < 0) {
			this.anInt2188 = 0;
		} else if (this.anInt2188 > 4096) {
			this.anInt2188 = 4096;
		}
		this.anInt2182 = this.anInt2188 * this.anInt2182 >> 12;
		this.anInt2181 += this.anInt2180 * this.anInt2182 >> 12;
		this.anInt2180 = this.anInt2186 * this.anInt2180 >> 12;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V")
	protected void method1812(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray44[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	@Override
	protected final void method2437() {
		this.anInt2181 = 0;
		this.anInt2192 = 0;
	}
}
