import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	public int anInt6771 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
	public int anInt6776 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
	public int anInt6773 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
	public int anInt6774 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
	public int anInt6778 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
	public int anInt6775 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
	public int anInt6779 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
	public int anInt6768 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "Lclient!hi;")
	public final Class2_Sub20 aClass2_Sub20_1;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!hi;)V")
	public Class2_Sub38(@OriginalArg(0) Class2_Sub20 arg0) {
		this.aClass2_Sub20_1 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)Z")
	public boolean method5620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6775 <= arg0 && arg0 <= this.anInt6768 && arg1 >= this.anInt6771 && this.anInt6774 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt6779 && this.anInt6773 >= arg0 && arg1 >= this.anInt6776 && this.anInt6778 >= arg1;
		}
	}
}
