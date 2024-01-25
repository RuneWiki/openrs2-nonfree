import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ila")
public final class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!ila", name = "<init>", descriptor = "()V")
	public Class53_Sub2() {
		super(true);
	}

	@OriginalMember(owner = "client!ila", name = "a", descriptor = "(ILclient!qea;I)V")
	@Override
	protected void method4076(@OriginalArg(0) int arg0, @OriginalArg(1) Class307 arg1) {
		Static439.method6369(arg1, arg0);
	}
}
