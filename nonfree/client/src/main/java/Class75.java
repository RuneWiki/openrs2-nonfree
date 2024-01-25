import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class75 {

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	public int anInt1828;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
	public int anInt1829;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public int anInt1832;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public int anInt1822 = 128;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public int anInt1824 = 128;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
	public int anInt1830;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V")
	public Class75(@OriginalArg(0) int arg0) {
		this.anInt1830 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIII)V")
	private Class75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1828 = arg5;
		this.anInt1824 = arg1;
		this.anInt1829 = arg4;
		this.anInt1832 = arg3;
		this.anInt1830 = arg0;
		this.anInt1822 = arg2;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)Lclient!fa;")
	public Class75 method1686() {
		return new Class75(this.anInt1830, this.anInt1824, this.anInt1822, this.anInt1832, this.anInt1829, this.anInt1828);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!fa;I)V")
	public void method1690(@OriginalArg(0) Class75 arg0) {
		this.anInt1828 = arg0.anInt1828;
		this.anInt1822 = arg0.anInt1822;
		this.anInt1830 = arg0.anInt1830;
		this.anInt1832 = arg0.anInt1832;
		this.anInt1824 = arg0.anInt1824;
		this.anInt1829 = arg0.anInt1829;
	}
}
