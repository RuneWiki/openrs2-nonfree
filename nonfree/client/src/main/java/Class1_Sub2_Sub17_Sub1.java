import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class1_Sub2_Sub17_Sub1 extends Class1_Sub2_Sub17 {

	@OriginalMember(owner = "client!tn", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object anObject10;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub17_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject10 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method5741() {
		return false;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5738() {
		return this.anObject10;
	}
}
