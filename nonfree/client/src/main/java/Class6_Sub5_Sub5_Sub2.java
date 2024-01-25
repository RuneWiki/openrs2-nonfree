import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public final class Class6_Sub5_Sub5_Sub2 extends Class6_Sub5_Sub5 {

	@OriginalMember(owner = "client!ht", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject8;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!wea;Ljava/lang/Object;I)V")
	public Class6_Sub5_Sub5_Sub2(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject8 = arg1;
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3392() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3391() {
		return false;
	}
}
