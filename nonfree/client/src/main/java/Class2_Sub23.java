import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
	public int anInt4455 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
	public int anInt4459 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
	public int anInt4457 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
	public int anInt4456 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
	public int anInt4461 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "I")
	public int anInt4462 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
	public int anInt4464 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
	public int anInt4463 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "Lclient!gfa;")
	public final Class2_Sub14 aClass2_Sub14_1;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!gfa;)V")
	public Class2_Sub23(@OriginalArg(0) Class2_Sub14 arg0) {
		this.aClass2_Sub14_1 = arg0;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIB)Z")
	public boolean method3863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt4455 && this.anInt4463 >= arg1 && arg0 >= this.anInt4462 && arg0 <= this.anInt4457) {
			return true;
		} else {
			return this.anInt4464 <= arg1 && arg1 <= this.anInt4461 && this.anInt4456 <= arg0 && this.anInt4459 >= arg0;
		}
	}
}
