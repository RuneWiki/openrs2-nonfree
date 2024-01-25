import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!lq", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject9;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!nba;Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject9 = arg1;
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4833() {
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4832() {
		return this.anObject9;
	}
}
