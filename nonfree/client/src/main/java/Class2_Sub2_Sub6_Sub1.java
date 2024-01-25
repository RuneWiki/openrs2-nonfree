import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public final class Class2_Sub2_Sub6_Sub1 extends Class2_Sub2_Sub6 {

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject14;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub6_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject14 = arg0;
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5442() {
		return this.anObject14;
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method5445() {
		return false;
	}
}
