import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!en", name = "n", descriptor = "I")
	public int anInt1768 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!en", name = "q", descriptor = "I")
	public int anInt1770 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!en", name = "p", descriptor = "I")
	public int anInt1769 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!en", name = "r", descriptor = "I")
	public int anInt1771 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!en", name = "v", descriptor = "I")
	public int anInt1774 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!en", name = "z", descriptor = "I")
	public int anInt1777 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!en", name = "t", descriptor = "I")
	public int anInt1773 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!en", name = "y", descriptor = "I")
	public int anInt1776 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!en", name = "w", descriptor = "Lclient!ls;")
	public final Class1_Sub28 aClass1_Sub28_1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!ls;)V")
	public Class1_Sub9(@OriginalArg(0) Class1_Sub28 arg0) {
		this.aClass1_Sub28_1 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIB)Z")
	public boolean method1500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1768 <= arg0 && arg0 <= this.anInt1776 && this.anInt1777 <= arg1 && arg1 <= this.anInt1773) {
			return true;
		} else {
			return arg0 >= this.anInt1770 && this.anInt1769 >= arg0 && this.anInt1774 <= arg1 && arg1 <= this.anInt1771;
		}
	}
}
