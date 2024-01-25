import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!om", name = "t", descriptor = "I")
	public int anInt4642 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public int anInt4640 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!om", name = "x", descriptor = "I")
	public int anInt4645 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "I")
	public int anInt4644 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "I")
	public int anInt4648 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "I")
	public int anInt4651 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "I")
	public int anInt4639 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!om", name = "E", descriptor = "I")
	public int anInt4650 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!om", name = "B", descriptor = "Lclient!eg;")
	public final Class1_Sub17 aClass1_Sub17_1;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!eg;)V")
	public Class1_Sub32(@OriginalArg(0) Class1_Sub17 arg0) {
		this.aClass1_Sub17_1 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z")
	public boolean method4280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4648 <= arg0 && this.anInt4651 >= arg0 && this.anInt4640 <= arg1 && arg1 <= this.anInt4644) {
			return true;
		} else {
			return arg0 >= this.anInt4639 && this.anInt4645 >= arg0 && arg1 >= this.anInt4642 && arg1 <= this.anInt4650;
		}
	}
}
