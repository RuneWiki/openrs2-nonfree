import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class43_Sub7 extends Class43 {

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class43_Sub7(@OriginalArg(0) Class122_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
	@Override
	public void method4386(@OriginalArg(0) boolean arg0) {
		this.aClass122_Sub2_37.method4838(true);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()V")
	@Override
	public void method4382() {
		this.aClass122_Sub2_37.method4838(false);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!gd;)V")
	@Override
	public void method4385(@OriginalArg(0) Class66 arg0) {
		this.aClass122_Sub2_37.method4864(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()Z")
	@Override
	public boolean method4383() {
		return true;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	@Override
	public void method4381(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	@Override
	public void method4384(@OriginalArg(0) boolean arg0) {
	}
}
