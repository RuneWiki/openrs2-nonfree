import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class26_Sub4 extends Class26 {

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class26_Sub4(@OriginalArg(0) Class145_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!iba;BI)V")
	@Override
	public void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
		super.aClass145_Sub1_21.method9754(arg0);
		super.aClass145_Sub1_21.method9797(arg1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8001() {
		return true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	@Override
	public void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7998(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8006(@OriginalArg(1) boolean arg0) {
		super.aClass145_Sub1_21.method9796(true);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)V")
	@Override
	public void method8009() {
		super.aClass145_Sub1_21.method9796(false);
	}
}
