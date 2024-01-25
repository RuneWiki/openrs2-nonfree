import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class3_Sub3_Sub2_Sub1 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!pj", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject9;

	static {
		new Class174(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!sv;Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub2_Sub1(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject9 = arg1;
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4695() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4696() {
		return false;
	}
}
