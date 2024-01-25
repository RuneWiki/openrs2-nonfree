import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!mb;Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub3_Sub1(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject2 = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method2044() {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2045() {
		return this.anObject2;
	}
}
