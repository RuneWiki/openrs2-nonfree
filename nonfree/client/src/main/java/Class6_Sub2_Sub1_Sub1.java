import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class6_Sub2_Sub1_Sub1 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub1_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject1 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method300() {
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method302() {
		return this.anObject1;
	}
}
