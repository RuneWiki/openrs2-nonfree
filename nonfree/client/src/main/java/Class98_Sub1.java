import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class Class98_Sub1 extends Class98 {

	@OriginalMember(owner = "client!qca", name = "o", descriptor = "I")
	private int anInt3205;

	@OriginalMember(owner = "client!qca", name = "s", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!qca", name = "w", descriptor = "I")
	private int anInt3212;

	@OriginalMember(owner = "client!qca", name = "y", descriptor = "I")
	private int anInt3214;

	@OriginalMember(owner = "client!qca", name = "z", descriptor = "I")
	private int anInt3215;

	@OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
	private final int anInt3216;

	@OriginalMember(owner = "client!qca", name = "x", descriptor = "I")
	private final int anInt3213;

	@OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
	private final int anInt3219;

	@OriginalMember(owner = "client!qca", name = "u", descriptor = "I")
	private int anInt3210;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class98_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3216 = (int) (arg7 * 4096.0F);
		this.anInt3213 = (int) (arg6 * 4096.0F);
		this.anInt3210 = this.anInt3219 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7052() {
		this.anInt3212 = 0;
		this.anInt3205 = 0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3214 = this.anInt3213 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt3215 = 4096;
			this.anInt3214 = this.anInt3214 * this.anInt3214 >> 12;
			this.anInt3212 = this.anInt3214;
			return;
		}
		this.anInt3215 = this.anInt3214 * this.anInt3216 >> 12;
		this.anInt3214 = this.anInt3213 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt3215 < 0) {
			this.anInt3215 = 0;
		} else if (this.anInt3215 > 4096) {
			this.anInt3215 = 4096;
		}
		this.anInt3214 = this.anInt3214 * this.anInt3214 >> 12;
		this.anInt3214 = this.anInt3214 * this.anInt3215 >> 12;
		this.anInt3212 += this.anInt3214 * this.anInt3210 >> 12;
		this.anInt3210 = this.anInt3219 * this.anInt3210 >> 12;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIB)V")
	protected void method2909(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray38[arg0] = arg1;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
	@Override
	protected final void method7048() {
		this.anInt3212 >>= 0x4;
		this.anInt3210 = this.anInt3219;
		if (this.anInt3212 < 0) {
			this.anInt3212 = 0;
		} else if (this.anInt3212 > 255) {
			this.anInt3212 = 255;
		}
		this.method2909(this.anInt3205++, (byte) this.anInt3212);
		this.anInt3212 = 0;
	}
}
