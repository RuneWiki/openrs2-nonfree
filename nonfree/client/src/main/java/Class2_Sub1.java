import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!rga", name = "x", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!rga", name = "y", descriptor = "I")
	private int anInt6097;

	@OriginalMember(owner = "client!rga", name = "A", descriptor = "I")
	private int anInt6099;

	@OriginalMember(owner = "client!rga", name = "M", descriptor = "I")
	private int anInt6108;

	@OriginalMember(owner = "client!rga", name = "O", descriptor = "I")
	private int anInt6109;

	@OriginalMember(owner = "client!rga", name = "v", descriptor = "I")
	private final int anInt6095;

	@OriginalMember(owner = "client!rga", name = "B", descriptor = "I")
	private final int anInt6100;

	@OriginalMember(owner = "client!rga", name = "P", descriptor = "I")
	private final int anInt6110;

	@OriginalMember(owner = "client!rga", name = "I", descriptor = "I")
	private int anInt6106;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6095 = (int) (arg6 * 4096.0F);
		this.anInt6100 = (int) (arg7 * 4096.0F);
		this.anInt6106 = this.anInt6110 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(III)V")
	@Override
	protected final void method6204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6097 = this.anInt6095 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt6108 = 4096;
			this.anInt6097 = this.anInt6097 * this.anInt6097 >> 12;
			this.anInt6099 = this.anInt6097;
			return;
		}
		this.anInt6108 = this.anInt6100 * this.anInt6097 >> 12;
		if (this.anInt6108 < 0) {
			this.anInt6108 = 0;
		} else if (this.anInt6108 > 4096) {
			this.anInt6108 = 4096;
		}
		this.anInt6097 = this.anInt6095 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt6097 = this.anInt6097 * this.anInt6097 >> 12;
		this.anInt6097 = this.anInt6097 * this.anInt6108 >> 12;
		this.anInt6099 += this.anInt6106 * this.anInt6097 >> 12;
		this.anInt6106 = this.anInt6106 * this.anInt6110 >> 12;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6200() {
		this.anInt6109 = 0;
		this.anInt6099 = 0;
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(B)V")
	@Override
	protected final void method6198() {
		this.anInt6099 >>= 0x4;
		this.anInt6106 = this.anInt6110;
		if (this.anInt6099 < 0) {
			this.anInt6099 = 0;
		} else if (this.anInt6099 > 255) {
			this.anInt6099 = 255;
		}
		this.method5153(this.anInt6109++, (byte) this.anInt6099);
		this.anInt6099 = 0;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IBB)V")
	protected void method5153(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray60[arg0] = arg1;
	}
}
