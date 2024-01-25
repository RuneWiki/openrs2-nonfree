import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class5_Sub2_Sub1_Sub2 extends Class5_Sub2_Sub1 {

	@OriginalMember(owner = "client!ss", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject20;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!pha;Ljava/lang/Object;I)V")
	public Class5_Sub2_Sub1_Sub2(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject20 = arg1;
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7594() {
		return false;
	}

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7595() {
		return this.anObject20;
	}
}
