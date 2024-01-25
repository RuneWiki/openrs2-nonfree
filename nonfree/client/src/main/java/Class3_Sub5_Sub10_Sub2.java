import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class3_Sub5_Sub10_Sub2 extends Class3_Sub5_Sub10 {

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "Ljava/lang/Object;")
	private final Object anObject11;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub5_Sub10_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject11 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method4382() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4379() {
		return this.anObject11;
	}
}
