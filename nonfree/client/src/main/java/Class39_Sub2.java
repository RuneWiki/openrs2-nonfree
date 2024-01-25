import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	private int anInt7968;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
	private int anInt7969;

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
	private int anInt7972;

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
	private int anInt7982;

	@OriginalMember(owner = "client!sq", name = "H", descriptor = "[B")
	private byte[] aByteArray96;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
	private final int anInt7975;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
	private final int anInt7973;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
	private final int anInt7967;

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
	private int anInt7976;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class39_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt7975 = (int) (arg6 * 4096.0F);
		this.anInt7973 = (int) (arg7 * 4096.0F);
		this.anInt7976 = this.anInt7967 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)V")
	@Override
	protected final void method6748() {
		this.anInt7976 = this.anInt7967;
		this.anInt7968 >>= 0x4;
		if (this.anInt7968 < 0) {
			this.anInt7968 = 0;
		} else if (this.anInt7968 > 255) {
			this.anInt7968 = 255;
		}
		this.method6750(this.anInt7982++, (byte) this.anInt7968);
		this.anInt7968 = 0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBB)V")
	protected void method6750(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray96[arg0] = arg1;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
	@Override
	protected final void method6743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt7972 = this.anInt7975 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt7969 = 4096;
			this.anInt7972 = this.anInt7972 * this.anInt7972 >> 12;
			this.anInt7968 = this.anInt7972;
			return;
		}
		this.anInt7969 = this.anInt7973 * this.anInt7972 >> 12;
		if (this.anInt7969 < 0) {
			this.anInt7969 = 0;
		} else if (this.anInt7969 > 4096) {
			this.anInt7969 = 4096;
		}
		this.anInt7972 = this.anInt7975 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt7972 = this.anInt7972 * this.anInt7972 >> 12;
		this.anInt7972 = this.anInt7972 * this.anInt7969 >> 12;
		this.anInt7968 += this.anInt7972 * this.anInt7976 >> 12;
		this.anInt7976 = this.anInt7967 * this.anInt7976 >> 12;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method6742() {
		this.anInt7968 = 0;
		this.anInt7982 = 0;
	}
}
