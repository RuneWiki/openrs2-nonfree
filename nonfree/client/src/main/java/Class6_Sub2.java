import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	private int anInt7970;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
	private int anInt7971;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
	private int anInt7974;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
	private int anInt7977;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
	private final int anInt7973;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	private final int anInt7972;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
	private final int anInt7967;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
	private int anInt7975;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt7973 = (int) (arg7 * 4096.0F);
		this.anInt7972 = (int) (arg6 * 4096.0F);
		this.anInt7975 = this.anInt7967 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method6625() {
		this.anInt7974 = 0;
		this.anInt7971 = 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V")
	protected void method6633(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray82[arg0] = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6628() {
		this.anInt7975 = this.anInt7967;
		this.anInt7971 >>= 0x4;
		if (this.anInt7971 < 0) {
			this.anInt7971 = 0;
		} else if (this.anInt7971 > 255) {
			this.anInt7971 = 255;
		}
		this.method6633(this.anInt7974++, (byte) this.anInt7971);
		this.anInt7971 = 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	@Override
	protected final void method6626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7970 = this.anInt7972 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt7977 = 4096;
			this.anInt7970 = this.anInt7970 * this.anInt7970 >> 12;
			this.anInt7971 = this.anInt7970;
			return;
		}
		this.anInt7977 = this.anInt7973 * this.anInt7970 >> 12;
		this.anInt7970 = this.anInt7972 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt7977 < 0) {
			this.anInt7977 = 0;
		} else if (this.anInt7977 > 4096) {
			this.anInt7977 = 4096;
		}
		this.anInt7970 = this.anInt7970 * this.anInt7970 >> 12;
		this.anInt7970 = this.anInt7970 * this.anInt7977 >> 12;
		this.anInt7971 += this.anInt7975 * this.anInt7970 >> 12;
		this.anInt7975 = this.anInt7967 * this.anInt7975 >> 12;
	}
}
