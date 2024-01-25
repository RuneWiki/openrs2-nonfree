import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class6_Sub13 extends Class6 {

	@OriginalMember(owner = "client!df", name = "q", descriptor = "I")
	public int anInt1865 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "I")
	public int anInt1864 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "I")
	public int anInt1867 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	public int anInt1862 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!df", name = "v", descriptor = "I")
	public int anInt1869 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "I")
	public int anInt1868 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "I")
	public int anInt1861 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "I")
	public int anInt1873 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!hv;")
	public final Class6_Sub24 aClass6_Sub24_1;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!hv;)V")
	public Class6_Sub13(@OriginalArg(0) Class6_Sub24 arg0) {
		this.aClass6_Sub24_1 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z")
	public boolean method1651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1867 <= arg0 && this.anInt1873 >= arg0 && this.anInt1869 <= arg1 && this.anInt1861 >= arg1) {
			return true;
		} else {
			return this.anInt1865 <= arg0 && arg0 <= this.anInt1862 && this.anInt1868 <= arg1 && this.anInt1864 >= arg1;
		}
	}
}
