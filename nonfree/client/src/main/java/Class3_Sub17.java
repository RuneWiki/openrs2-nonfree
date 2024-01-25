import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
	public int anInt1925 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
	public int anInt1929 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	public int anInt1924 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	public int anInt1926 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public int anInt1927 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
	public int anInt1930 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
	public int anInt1933 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
	public int anInt1931 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Lclient!fb;")
	public final Class3_Sub16 aClass3_Sub16_1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!fb;)V")
	public Class3_Sub17(@OriginalArg(0) Class3_Sub16 arg0) {
		this.aClass3_Sub16_1 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Z")
	public boolean method1798(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1925 <= arg0 && this.anInt1926 >= arg0 && arg1 >= this.anInt1927 && this.anInt1924 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt1929 && arg0 <= this.anInt1933 && arg1 >= this.anInt1930 && this.anInt1931 >= arg1;
		}
	}
}
