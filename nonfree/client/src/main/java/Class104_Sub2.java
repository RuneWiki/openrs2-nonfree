import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Class104_Sub2 extends Class104 {

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "Lclient!rfa;")
	private final Class60_Sub1 aClass60_Sub1_25;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!rfa;Z)V")
	public Class104_Sub2(@OriginalArg(0) Class60_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass60_Sub1_25 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!kn;B)V")
	@Override
	protected final void method9033(@OriginalArg(0) int arg0, @OriginalArg(1) Class212 arg1) {
		Static71.method941(arg1, arg0, this.aClass60_Sub1_25);
	}
}
