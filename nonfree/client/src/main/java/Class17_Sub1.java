import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!aia", name = "x", descriptor = "I")
	private int anInt10127;

	@OriginalMember(owner = "client!aia", name = "y", descriptor = "I")
	private int anInt10128;

	@OriginalMember(owner = "client!aia", name = "A", descriptor = "I")
	private int anInt10130;

	@OriginalMember(owner = "client!aia", name = "C", descriptor = "[B")
	private byte[] aByteArray122;

	@OriginalMember(owner = "client!aia", name = "D", descriptor = "I")
	private int anInt10131;

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "I")
	private final int anInt10124;

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "I")
	private final int anInt10120;

	@OriginalMember(owner = "client!aia", name = "w", descriptor = "I")
	private final int anInt10126;

	@OriginalMember(owner = "client!aia", name = "q", descriptor = "I")
	private int anInt10121;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt10124 = (int) (arg6 * 4096.0F);
		this.anInt10120 = (int) (arg7 * 4096.0F);
		this.anInt10121 = this.anInt10126 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BIB)V")
	protected void method8423(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray122[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
	@Override
	protected final void method8414() {
		this.anInt10131 = 0;
		this.anInt10130 = 0;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
	@Override
	protected final void method8419() {
		this.anInt10130 >>= 0x4;
		this.anInt10121 = this.anInt10126;
		if (this.anInt10130 < 0) {
			this.anInt10130 = 0;
		} else if (this.anInt10130 > 255) {
			this.anInt10130 = 255;
		}
		this.method8423(this.anInt10131++, (byte) this.anInt10130);
		this.anInt10130 = 0;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method8416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt10127 = this.anInt10124 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt10128 = 4096;
			this.anInt10127 = this.anInt10127 * this.anInt10127 >> 12;
			this.anInt10130 = this.anInt10127;
			return;
		}
		this.anInt10128 = this.anInt10127 * this.anInt10120 >> 12;
		if (this.anInt10128 < 0) {
			this.anInt10128 = 0;
		} else if (this.anInt10128 > 4096) {
			this.anInt10128 = 4096;
		}
		this.anInt10127 = this.anInt10124 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt10127 = this.anInt10127 * this.anInt10127 >> 12;
		this.anInt10127 = this.anInt10128 * this.anInt10127 >> 12;
		this.anInt10130 += this.anInt10127 * this.anInt10121 >> 12;
		this.anInt10121 = this.anInt10121 * this.anInt10126 >> 12;
	}
}
