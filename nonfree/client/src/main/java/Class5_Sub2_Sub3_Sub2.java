import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public final class Class5_Sub2_Sub3_Sub2 extends Class5_Sub2_Sub3 {

	@OriginalMember(owner = "client!kca", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject10;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!vp;Ljava/lang/Object;I)V")
	public Class5_Sub2_Sub3_Sub2(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject10 = arg1;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4277() {
		return this.anObject10;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4279() {
		return false;
	}
}
