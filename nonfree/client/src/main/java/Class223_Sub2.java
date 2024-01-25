import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class Class223_Sub2 extends Class223 {

	@OriginalMember(owner = "client!om", name = "s", descriptor = "I")
	private int anInt7975;

	@OriginalMember(owner = "client!om", name = "u", descriptor = "I")
	private int anInt7977;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "[B")
	private byte[] aByteArray79;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "I")
	private int anInt7979;

	@OriginalMember(owner = "client!om", name = "H", descriptor = "I")
	private int anInt7987;

	@OriginalMember(owner = "client!om", name = "B", descriptor = "I")
	private final int anInt7982;

	@OriginalMember(owner = "client!om", name = "z", descriptor = "I")
	private final int anInt7980;

	@OriginalMember(owner = "client!om", name = "D", descriptor = "I")
	private final int anInt7984;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "I")
	private int anInt7986;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class223_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt7982 = (int) (arg7 * 4096.0F);
		this.anInt7980 = (int) (arg6 * 4096.0F);
		this.anInt7986 = this.anInt7984 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
	@Override
	protected final void method6926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt7987 = this.anInt7980 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt7977 = 4096;
			this.anInt7987 = this.anInt7987 * this.anInt7987 >> 12;
			this.anInt7979 = this.anInt7987;
			return;
		}
		this.anInt7977 = this.anInt7987 * this.anInt7982 >> 12;
		if (this.anInt7977 < 0) {
			this.anInt7977 = 0;
		} else if (this.anInt7977 > 4096) {
			this.anInt7977 = 4096;
		}
		this.anInt7987 = this.anInt7980 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt7987 = this.anInt7987 * this.anInt7987 >> 12;
		this.anInt7987 = this.anInt7977 * this.anInt7987 >> 12;
		this.anInt7979 += this.anInt7987 * this.anInt7986 >> 12;
		this.anInt7986 = this.anInt7984 * this.anInt7986 >> 12;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	@Override
	protected final void method6922() {
		this.anInt7979 >>= 0x4;
		this.anInt7986 = this.anInt7984;
		if (this.anInt7979 < 0) {
			this.anInt7979 = 0;
		} else if (this.anInt7979 > 255) {
			this.anInt7979 = 255;
		}
		this.method6904((byte) this.anInt7979, this.anInt7975++);
		this.anInt7979 = 0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BBI)V")
	protected void method6904(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray79[arg1] = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method6920() {
		this.anInt7979 = 0;
		this.anInt7975 = 0;
	}
}
