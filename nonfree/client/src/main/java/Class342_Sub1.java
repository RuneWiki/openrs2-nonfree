import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public final class Class342_Sub1 extends Class342 {

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "()V")
	private Class342_Sub1() {
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BLclient!gv;)Lclient!gv;")
	@Override
	public Class2_Sub6_Sub5 method9464(@OriginalArg(1) Class2_Sub6_Sub5 arg0) {
		return new Class2_Sub6_Sub5_Sub2(arg0.anInterface23_3, arg0.method8120(), arg0.anInt9203);
	}
}
