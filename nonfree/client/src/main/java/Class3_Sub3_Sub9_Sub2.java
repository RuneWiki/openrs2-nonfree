import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public final class Class3_Sub3_Sub9_Sub2 extends Class3_Sub3_Sub9 {

	@OriginalMember(owner = "client!kv", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub9_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject5 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3512() {
		return false;
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3515() {
		return this.anObject5;
	}
}
