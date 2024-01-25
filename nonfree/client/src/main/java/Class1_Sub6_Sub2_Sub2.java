import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class1_Sub6_Sub2_Sub2 extends Class1_Sub6_Sub2 {

	@OriginalMember(owner = "client!mt", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject7;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!vk;Ljava/lang/Object;I)V")
	public Class1_Sub6_Sub2_Sub2(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject7 = arg1;
	}

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3188() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method3184() {
		return false;
	}
}
