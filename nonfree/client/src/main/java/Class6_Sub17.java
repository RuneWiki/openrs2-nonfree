import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class6_Sub17 extends Class6 {

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
	public int anInt1860 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public int anInt1866 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public int anInt1867 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	public int anInt1865 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	public int anInt1868 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	public int anInt1870 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	public int anInt1871 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public int anInt1864 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!maa;")
	public final Class6_Sub34 aClass6_Sub34_1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!maa;)V")
	public Class6_Sub17(@OriginalArg(0) Class6_Sub34 arg0) {
		this.aClass6_Sub34_1 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII)Z")
	public boolean method1647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1860 <= arg1 && arg1 <= this.anInt1866 && this.anInt1867 <= arg0 && arg0 <= this.anInt1868) {
			return true;
		} else {
			return this.anInt1871 <= arg1 && arg1 <= this.anInt1870 && this.anInt1865 <= arg0 && this.anInt1864 >= arg0;
		}
	}
}
