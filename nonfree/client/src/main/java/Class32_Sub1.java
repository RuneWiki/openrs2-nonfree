import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
	private int anInt1840;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
	private int anInt1842;

	@OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
	private int anInt1850;

	@OriginalMember(owner = "client!pn", name = "K", descriptor = "I")
	private int anInt1851;

	@OriginalMember(owner = "client!pn", name = "H", descriptor = "I")
	private int anInt1848;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
	private int anInt1844;

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "I")
	private int anInt1849;

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
	private int anInt1839;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class32_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1848 = (int) (arg7 * 4096.0F);
		this.anInt1844 = (int) (arg6 * 4096.0F);
		this.anInt1839 = this.anInt1849 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
	@Override
	protected final void method1669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt1851 = 4096;
			this.anInt1850 = this.anInt1844 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt1850 = this.anInt1850 * this.anInt1850 >> 12;
			this.anInt1840 = this.anInt1850;
			return;
		}
		this.anInt1851 = this.anInt1848 * this.anInt1850 >> 12;
		this.anInt1850 = this.anInt1844 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt1851 < 0) {
			this.anInt1851 = 0;
		} else if (this.anInt1851 > 4096) {
			this.anInt1851 = 4096;
		}
		this.anInt1850 = this.anInt1850 * this.anInt1850 >> 12;
		this.anInt1850 = this.anInt1850 * this.anInt1851 >> 12;
		this.anInt1840 += this.anInt1839 * this.anInt1850 >> 12;
		this.anInt1839 = this.anInt1849 * this.anInt1839 >> 12;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IB)V")
	protected void method1567(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray11[arg0] = arg1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
	@Override
	protected final void method1666() {
		this.anInt1839 = this.anInt1849;
		this.anInt1840 >>= 0x4;
		if (this.anInt1840 < 0) {
			this.anInt1840 = 0;
		} else if (this.anInt1840 > 255) {
			this.anInt1840 = 255;
		}
		this.method1567(this.anInt1842++, (byte) this.anInt1840);
		this.anInt1840 = 0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	@Override
	protected final void method1660() {
		this.anInt1842 = 0;
		this.anInt1840 = 0;
	}
}
