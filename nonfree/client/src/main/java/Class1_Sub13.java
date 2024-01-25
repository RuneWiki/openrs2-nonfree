import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
	public int anInt1807 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
	public int anInt1805 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
	public int anInt1813 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
	public int anInt1812 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
	public int anInt1806 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
	public int anInt1814 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
	public int anInt1811 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	public int anInt1808 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "Lclient!kn;")
	public final Class1_Sub26 aClass1_Sub26_1;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!kn;)V")
	public Class1_Sub13(@OriginalArg(0) Class1_Sub26 arg0) {
		this.aClass1_Sub26_1 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)Z")
	public boolean method1578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1813 <= arg1 && this.anInt1808 >= arg1 && arg0 >= this.anInt1812 && arg0 <= this.anInt1805) {
			return true;
		} else {
			return this.anInt1814 <= arg1 && arg1 <= this.anInt1806 && arg0 >= this.anInt1811 && this.anInt1807 >= arg0;
		}
	}
}
