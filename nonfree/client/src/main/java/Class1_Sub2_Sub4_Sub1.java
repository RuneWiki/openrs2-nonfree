import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class1_Sub2_Sub4_Sub1 extends Class1_Sub2_Sub4 {

	@OriginalMember(owner = "client!bt", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!ada;Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub4_Sub1(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject3 = arg1;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7397() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7396() {
		return false;
	}
}
