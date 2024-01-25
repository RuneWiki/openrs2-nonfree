import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public final class Class5_Sub1_Sub6_Sub1 extends Class5_Sub1_Sub6 {

	@OriginalMember(owner = "client!haa", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject7;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!nba;Ljava/lang/Object;I)V")
	public Class5_Sub1_Sub6_Sub1(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject7 = arg1;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7256() {
		return false;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method7257() {
		return this.anObject7;
	}
}
