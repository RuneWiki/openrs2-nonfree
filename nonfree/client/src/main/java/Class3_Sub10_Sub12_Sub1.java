import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class3_Sub10_Sub12_Sub1 extends Class3_Sub10_Sub12 {

	@OriginalMember(owner = "client!mt", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject11;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub10_Sub12_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject11 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5671() {
		return this.anObject11;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5674() {
		return false;
	}
}
