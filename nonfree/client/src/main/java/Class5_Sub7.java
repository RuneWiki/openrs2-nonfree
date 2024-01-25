import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "Lclient!pv;")
	public final Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_1;

	static {
		new Class198(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!pv;)V")
	public Class5_Sub7(@OriginalArg(0) Class2_Sub1_Sub3_Sub1 arg0) {
		this.aClass2_Sub1_Sub3_Sub1_1 = arg0;
	}
}
