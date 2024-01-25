import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class6_Sub2_Sub6_Sub1 extends Class6_Sub2_Sub6 {

	@OriginalMember(owner = "client!eea", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub6_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject2 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4829() {
		return false;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4831() {
		return this.anObject2;
	}
}
