import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!qq;)V")
	public Class3_Sub5(@OriginalArg(0) Class12_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V")
	@Override
	public void method7534() {
		super.aClass12_Sub2_23.method6186(false);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7533(@OriginalArg(1) boolean arg0) {
		super.aClass12_Sub2_23.method6186(true);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!ot;BI)V")
	@Override
	public void method7528(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
		super.aClass12_Sub2_23.method6159(arg0);
		super.aClass12_Sub2_23.method6249(arg1);
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7531() {
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7535(@OriginalArg(0) boolean arg0) {
	}
}
