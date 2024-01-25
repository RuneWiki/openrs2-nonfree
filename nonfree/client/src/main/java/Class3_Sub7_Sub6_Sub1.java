import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class3_Sub7_Sub6_Sub1 extends Class3_Sub7_Sub6 {

	@OriginalMember(owner = "client!dn", name = "ab", descriptor = "Ljava/lang/Object;")
	private final Object anObject8;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub6_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject8 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7415() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7412() {
		return false;
	}
}
