import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!ft", name = "A", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!ft", name = "C", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!ft", name = "E", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!ft", name = "F", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
	private final int anInt836;

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "I")
	private final int anInt843;

	@OriginalMember(owner = "client!ft", name = "y", descriptor = "I")
	private final int anInt842;

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class28_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt836 = (int) (arg6 * 4096.0F);
		this.anInt843 = (int) (arg7 * 4096.0F);
		this.anInt837 = this.anInt842 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BIB)V")
	protected void method748(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray23[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZII)V")
	@Override
	protected final void method5043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt846 = this.anInt836 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt847 = 4096;
			this.anInt846 = this.anInt846 * this.anInt846 >> 12;
			this.anInt844 = this.anInt846;
			return;
		}
		this.anInt847 = this.anInt846 * this.anInt843 >> 12;
		if (this.anInt847 < 0) {
			this.anInt847 = 0;
		} else if (this.anInt847 > 4096) {
			this.anInt847 = 4096;
		}
		this.anInt846 = this.anInt836 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt846 = this.anInt846 * this.anInt846 >> 12;
		this.anInt846 = this.anInt847 * this.anInt846 >> 12;
		this.anInt844 += this.anInt837 * this.anInt846 >> 12;
		this.anInt837 = this.anInt842 * this.anInt837 >> 12;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5038() {
		this.anInt844 = 0;
		this.anInt848 = 0;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
	@Override
	protected final void method5041() {
		this.anInt837 = this.anInt842;
		this.anInt844 >>= 0x4;
		if (this.anInt844 < 0) {
			this.anInt844 = 0;
		} else if (this.anInt844 > 255) {
			this.anInt844 = 255;
		}
		this.method748((byte) this.anInt844, this.anInt848++);
		this.anInt844 = 0;
	}
}
