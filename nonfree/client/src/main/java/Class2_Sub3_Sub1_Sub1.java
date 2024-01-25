import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public final class Class2_Sub3_Sub1_Sub1 extends Class2_Sub3_Sub1 {

	@OriginalMember(owner = "client!at", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!gj;Ljava/lang/Object;I)V")
	public Class2_Sub3_Sub1_Sub1(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject6 = arg1;
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method6758() {
		return false;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6757() {
		return this.anObject6;
	}
}
