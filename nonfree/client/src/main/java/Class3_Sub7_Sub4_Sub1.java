import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class3_Sub7_Sub4_Sub1 extends Class3_Sub7_Sub4 {

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!so;Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub4_Sub1(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject3 = arg1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5851() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5853() {
		return false;
	}
}
