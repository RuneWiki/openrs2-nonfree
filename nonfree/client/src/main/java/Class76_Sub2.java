import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class Class76_Sub2 extends Class76 {

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
	private int anInt3093;

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
	private int anInt3101;

	@OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
	private int anInt3107;

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
	private int anInt3110;

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
	private final int anInt3103;

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
	private final int anInt3098;

	@OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
	private final int anInt3102;

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
	private int anInt3094;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class76_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3103 = (int) (arg6 * 4096.0F);
		this.anInt3098 = (int) (arg7 * 4096.0F);
		this.anInt3094 = this.anInt3102 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3110 = this.anInt3103 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt3101 = 4096;
			this.anInt3110 = this.anInt3110 * this.anInt3110 >> 12;
			this.anInt3093 = this.anInt3110;
			return;
		}
		this.anInt3101 = this.anInt3098 * this.anInt3110 >> 12;
		this.anInt3110 = this.anInt3103 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt3101 < 0) {
			this.anInt3101 = 0;
		} else if (this.anInt3101 > 4096) {
			this.anInt3101 = 4096;
		}
		this.anInt3110 = this.anInt3110 * this.anInt3110 >> 12;
		this.anInt3110 = this.anInt3110 * this.anInt3101 >> 12;
		this.anInt3093 += this.anInt3110 * this.anInt3094 >> 12;
		this.anInt3094 = this.anInt3102 * this.anInt3094 >> 12;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	@Override
	protected final void method5041() {
		this.anInt3093 = 0;
		this.anInt3107 = 0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)V")
	protected void method2438(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray33[arg1] = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
	@Override
	protected final void method5042() {
		this.anInt3093 >>= 0x4;
		this.anInt3094 = this.anInt3102;
		if (this.anInt3093 < 0) {
			this.anInt3093 = 0;
		} else if (this.anInt3093 > 255) {
			this.anInt3093 = 255;
		}
		this.method2438((byte) this.anInt3093, this.anInt3107++);
		this.anInt3093 = 0;
	}
}
