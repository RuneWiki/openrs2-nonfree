import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class2_Sub13_Sub12_Sub1 extends Class2_Sub13_Sub12 {

	@OriginalMember(owner = "client!lp", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject10;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub13_Sub12_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject10 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6642() {
		return false;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method6647() {
		return this.anObject10;
	}
}
