import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class1_Sub2_Sub5_Sub2 extends Class1_Sub2_Sub5 {

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject10;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!cp;Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub5_Sub2(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject10 = arg1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5818() {
		return this.anObject10;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5815() {
		return false;
	}
}
