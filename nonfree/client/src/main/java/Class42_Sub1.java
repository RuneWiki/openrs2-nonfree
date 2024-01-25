import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
	private int anInt1148;

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
	private int anInt1150;

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
	private int anInt1152;

	@OriginalMember(owner = "client!mr", name = "z", descriptor = "I")
	private int anInt1155;

	@OriginalMember(owner = "client!mr", name = "F", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
	private final int anInt1151;

	@OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
	private final int anInt1159;

	@OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
	private final int anInt1158;

	@OriginalMember(owner = "client!mr", name = "B", descriptor = "I")
	private int anInt1157;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class42_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1151 = (int) (arg7 * 4096.0F);
		this.anInt1159 = (int) (arg6 * 4096.0F);
		this.anInt1157 = this.anInt1158 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method2852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt1150 = this.anInt1159 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt1155 = 4096;
			this.anInt1150 = this.anInt1150 * this.anInt1150 >> 12;
			this.anInt1152 = this.anInt1150;
			return;
		}
		this.anInt1155 = this.anInt1150 * this.anInt1151 >> 12;
		if (this.anInt1155 < 0) {
			this.anInt1155 = 0;
		} else if (this.anInt1155 > 4096) {
			this.anInt1155 = 4096;
		}
		this.anInt1150 = this.anInt1159 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt1150 = this.anInt1150 * this.anInt1150 >> 12;
		this.anInt1150 = this.anInt1155 * this.anInt1150 >> 12;
		this.anInt1152 += this.anInt1150 * this.anInt1157 >> 12;
		this.anInt1157 = this.anInt1158 * this.anInt1157 >> 12;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	@Override
	protected final void method2851() {
		this.anInt1148 = 0;
		this.anInt1152 = 0;
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(IIB)V")
	protected void method1031(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	@Override
	protected final void method2853() {
		this.anInt1152 >>= 0x4;
		this.anInt1157 = this.anInt1158;
		if (this.anInt1152 < 0) {
			this.anInt1152 = 0;
		} else if (this.anInt1152 > 255) {
			this.anInt1152 = 255;
		}
		this.method1031(this.anInt1148++, (byte) this.anInt1152);
		this.anInt1152 = 0;
	}
}
