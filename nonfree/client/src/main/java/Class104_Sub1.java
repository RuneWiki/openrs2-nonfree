import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	public Class104_Sub1() {
		super(false);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!kn;B)V")
	@Override
	protected void method9033(@OriginalArg(0) int arg0, @OriginalArg(1) Class212 arg1) {
		Static399.method6105(arg0, arg1);
	}
}
