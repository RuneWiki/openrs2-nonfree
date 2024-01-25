import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uka")
public final class Class100_Sub2 extends Class100 {

	@OriginalMember(owner = "client!uka", name = "<init>", descriptor = "()V")
	public Class100_Sub2() {
		super(true);
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(Lclient!bg;II)V")
	@Override
	protected void method8972(@OriginalArg(0) Class26 arg0, @OriginalArg(2) int arg1) {
		Static583.method8032(arg1, arg0);
	}
}
