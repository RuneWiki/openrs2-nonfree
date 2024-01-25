import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class83_Sub4 extends Class83 {

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class83_Sub4(@OriginalArg(0) Class4_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V")
	@Override
	public void method7925() {
		super.aClass4_Sub3_41.method5260(false);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7924(@OriginalArg(1) boolean arg0) {
		super.aClass4_Sub3_41.method5260(true);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IBLclient!uu;)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0, @OriginalArg(2) Class164 arg1) {
		super.aClass4_Sub3_41.method5250(arg1);
		super.aClass4_Sub3_41.method5230(arg0);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7927(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7930() {
		return true;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
