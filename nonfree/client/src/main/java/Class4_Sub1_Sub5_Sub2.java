import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class4_Sub1_Sub5_Sub2 extends Class4_Sub1_Sub5 {

	@OriginalMember(owner = "client!wv", name = "O", descriptor = "Ljava/lang/Object;")
	private final Object anObject10;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!dt;Ljava/lang/Object;I)V")
	public Class4_Sub1_Sub5_Sub2(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject10 = arg1;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5864() {
		return false;
	}

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5865() {
		return this.anObject10;
	}
}
