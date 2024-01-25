import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public final class Class26_Sub11 extends Class26 {

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class26_Sub11(@OriginalArg(0) Class145_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8001() {
		return false;
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(Z)V")
	@Override
	public void method8009() {
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7998(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!iba;BI)V")
	@Override
	public void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
		super.aClass145_Sub1_21.method9754(arg0);
		super.aClass145_Sub1_21.method9797(arg1);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)V")
	@Override
	public void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8006(@OriginalArg(1) boolean arg0) {
	}
}
