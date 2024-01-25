import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class60 {

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
	private int anInt1874;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
	private int anInt1885;

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
	private int anInt1883;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
	private int anInt1880;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
	private int anInt1877;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
	private int anInt1875;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
	private int anInt1878;

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
	private int anInt1882;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
	private int anInt1873;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
	private int anInt1876;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt1874 = arg0;
		this.anInt1885 = arg2;
		this.anInt1883 = arg3 * arg3;
		this.anInt1880 = arg1;
		this.anInt1877 = arg5 + this.anInt1874;
		this.anInt1875 = arg6 + this.anInt1880;
		this.anInt1878 = this.anInt1880 + arg7;
		this.anInt1882 = arg4 + this.anInt1874;
		this.anInt1873 = arg8 + this.anInt1885;
		this.anInt1876 = this.anInt1885 + arg9;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBII)Z")
	public boolean method1642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt1882 > arg0 || this.anInt1877 < arg0) {
			return false;
		} else if (this.anInt1875 > arg2 || this.anInt1878 < arg2) {
			return false;
		} else if (this.anInt1873 <= arg1 && this.anInt1876 >= arg1) {
			@Pc(59) int local59 = arg0 - this.anInt1874;
			@Pc(64) int local64 = arg1 - this.anInt1885;
			return local59 * local59 + local64 * local64 < this.anInt1883;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt1883 = arg5 * arg5;
		this.anInt1885 = arg4;
		this.anInt1874 = arg3;
		this.anInt1880 = arg7;
		this.anInt1882 = arg8 + this.anInt1874;
		this.anInt1877 = arg0 + this.anInt1874;
		this.anInt1876 = arg2 + this.anInt1885;
		this.anInt1875 = arg6 + this.anInt1880;
		this.anInt1878 = arg1 + this.anInt1880;
		this.anInt1873 = this.anInt1885 + arg9;
	}
}
