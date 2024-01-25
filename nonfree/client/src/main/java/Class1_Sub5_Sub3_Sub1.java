import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class1_Sub5_Sub3_Sub1 extends Class1_Sub5_Sub3 {

	@OriginalMember(owner = "client!de", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!fr;Ljava/lang/Object;I)V")
	public Class1_Sub5_Sub3_Sub1(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject1 = arg1;
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method1629() {
		return false;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method1628() {
		return this.anObject1;
	}
}
