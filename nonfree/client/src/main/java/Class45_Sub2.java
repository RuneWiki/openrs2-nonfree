import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!wn", name = "Q", descriptor = "Lclient!ee;")
	private final Class9_Sub1 aClass9_Sub1_20;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!ee;Z)V")
	public Class45_Sub2(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass9_Sub1_20 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	protected final void method6575(@OriginalArg(1) int arg0, @OriginalArg(2) Class149 arg1) {
		Static519.method6979(this.aClass9_Sub1_20, arg0, arg1);
	}
}
