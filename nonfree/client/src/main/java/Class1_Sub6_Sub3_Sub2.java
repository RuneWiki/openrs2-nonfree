import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class1_Sub6_Sub3_Sub2 extends Class1_Sub6_Sub3 {

	@OriginalMember(owner = "client!ho", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub6_Sub3_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2161() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method2160() {
		return false;
	}
}
