import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class181_Sub1 extends Class181 {

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
	public Class181_Sub1() {
		super(true);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!nw;ZI)V")
	@Override
	protected void method8963(@OriginalArg(0) Class259 arg0, @OriginalArg(2) int arg1) {
		Static350.method5349(arg1, arg0);
	}
}
