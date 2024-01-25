import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public final class Class1_Sub3_Sub6_Sub2 extends Class1_Sub3_Sub6 {

	@OriginalMember(owner = "client!qca", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject18;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub3_Sub6_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject18 = arg0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5933() {
		return this.anObject18;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5932() {
		return false;
	}
}
