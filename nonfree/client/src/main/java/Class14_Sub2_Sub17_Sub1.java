import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class14_Sub2_Sub17_Sub1 extends Class14_Sub2_Sub17 {

	@OriginalMember(owner = "client!rh", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!vh;Ljava/lang/Object;)V")
	public Class14_Sub2_Sub17_Sub1(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject4 = arg1;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5767() {
		return this.anObject4;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5762() {
		return false;
	}
}
