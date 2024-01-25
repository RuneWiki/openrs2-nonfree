import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class363 {

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
	public int anInt9783;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	public int anInt9786;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	public int anInt9787;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!uc;")
	public Class363 aClass363_2;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!gw;")
	public Class86 aClass86_10;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
	public final int anInt9789;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	public final int anInt9784;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V")
	public Class363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9789 = arg1;
		this.anInt9784 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lclient!uc;")
	public Class363 method8644(@OriginalArg(1) int arg0) {
		return new Class363(this.anInt9784, arg0);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Lclient!ve;")
	public Class379 method8646() {
		return Static556.method7762(this.anInt9784);
	}
}
