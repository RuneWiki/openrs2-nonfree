import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public final class Class3_Sub5_Sub1_Sub1 extends Class3_Sub5_Sub1 {

	@OriginalMember(owner = "client!aja", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lclient!st;Ljava/lang/Object;I)V")
	public Class3_Sub5_Sub1_Sub1(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject1 = arg1;
	}

	@OriginalMember(owner = "client!aja", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method9015() {
		return this.anObject1;
	}

	@OriginalMember(owner = "client!aja", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9018() {
		return false;
	}
}
