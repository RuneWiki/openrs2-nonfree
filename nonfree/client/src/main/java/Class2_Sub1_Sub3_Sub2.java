import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class2_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!si", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject20;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub1_Sub3_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject20 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5179() {
		return false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5178() {
		return this.anObject20;
	}
}
