import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class45_Sub1() {
		super(true);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	protected void method6575(@OriginalArg(1) int arg0, @OriginalArg(2) Class149 arg1) {
		Static46.method1230(arg0, arg1);
	}
}
