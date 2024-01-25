import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public final class Class13_Sub9 extends Class13 {

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class13_Sub9(@OriginalArg(0) Class57_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V")
	@Override
	public void method8261() {
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IILclient!rca;)V")
	@Override
	public void method8274(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
		super.aClass57_Sub3_21.method7813(arg1);
		super.aClass57_Sub3_21.method7764(arg0);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8262(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8273(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8270() {
		return false;
	}
}
