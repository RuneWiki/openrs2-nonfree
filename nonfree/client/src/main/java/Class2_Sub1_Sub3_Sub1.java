import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public final class Class2_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!dja", name = "M", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Lclient!qj;Ljava/lang/Object;I)V")
	public Class2_Sub1_Sub3_Sub1(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject6 = arg1;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6236() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!dja", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6239() {
		return false;
	}
}
