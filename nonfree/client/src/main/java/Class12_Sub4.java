import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class12_Sub4 extends Class12 {

	static {
		new Class267("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class12_Sub4(@OriginalArg(0) Class66_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6091() {
		return true;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V")
	@Override
	public void method6094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6092(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLclient!tu;)V")
	@Override
	public void method6090(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		super.aClass66_Sub2_41.method5109(arg1);
		super.aClass66_Sub2_41.method5140(arg0);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6097(@OriginalArg(0) boolean arg0) {
		super.aClass66_Sub2_41.method5090(true);
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
	@Override
	public void method6096() {
		super.aClass66_Sub2_41.method5090(false);
	}
}
