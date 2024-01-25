import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class2_Sub7_Sub1_Sub2 extends Class2_Sub7_Sub1 {

	@OriginalMember(owner = "client!hl", name = "N", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub7_Sub1_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method2353() {
		return false;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2352() {
		return this.anObject3;
	}
}
