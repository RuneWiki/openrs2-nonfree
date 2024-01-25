import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class8_Sub7 extends Class8 {

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
	public int anInt1636 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
	public int anInt1634 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
	public int anInt1638 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
	public int anInt1642 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
	public int anInt1635 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
	public int anInt1641 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
	public int anInt1637 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
	public int anInt1640 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "Lclient!m;")
	public final Class8_Sub35 aClass8_Sub35_1;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!m;)V")
	public Class8_Sub7(@OriginalArg(0) Class8_Sub35 arg0) {
		this.aClass8_Sub35_1 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)Z")
	public boolean method1415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1640 <= arg1 && this.anInt1636 >= arg1 && arg0 >= this.anInt1638 && arg0 <= this.anInt1637) {
			return true;
		} else {
			return arg1 >= this.anInt1642 && arg1 <= this.anInt1641 && arg0 >= this.anInt1635 && arg0 <= this.anInt1634;
		}
	}
}
