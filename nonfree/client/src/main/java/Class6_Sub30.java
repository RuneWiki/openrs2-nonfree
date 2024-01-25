import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public final class Class6_Sub30 extends Class6 {

	@OriginalMember(owner = "client!jia", name = "k", descriptor = "I")
	public int anInt5785 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jia", name = "o", descriptor = "I")
	public int anInt5787 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jia", name = "p", descriptor = "I")
	public int anInt5788 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jia", name = "v", descriptor = "I")
	public int anInt5794 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jia", name = "t", descriptor = "I")
	public int anInt5792 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jia", name = "w", descriptor = "I")
	public int anInt5795 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jia", name = "r", descriptor = "I")
	public int anInt5790 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jia", name = "u", descriptor = "I")
	public int anInt5793 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jia", name = "m", descriptor = "Lclient!uca;")
	public final Class6_Sub48 aClass6_Sub48_1;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class6_Sub30(@OriginalArg(0) Class6_Sub48 arg0) {
		this.aClass6_Sub48_1 = arg0;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(III)Z")
	public boolean method4844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5785 <= arg1 && this.anInt5795 >= arg1 && this.anInt5787 <= arg0 && arg0 <= this.anInt5788) {
			return true;
		} else {
			return this.anInt5792 <= arg1 && this.anInt5790 >= arg1 && this.anInt5794 <= arg0 && this.anInt5793 >= arg0;
		}
	}
}
