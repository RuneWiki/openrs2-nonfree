import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public final class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!wu;)V")
	public Class7_Sub3(@OriginalArg(0) Class100_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(BII)V")
	@Override
	public void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!bca;II)V")
	@Override
	public void method7186(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub1_22.method6033(arg0);
		super.aClass100_Sub1_22.method6092(arg1);
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)V")
	@Override
	public void method7197() {
		super.aClass100_Sub1_22.method6047(false);
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7194() {
		return true;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7195(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_22.method6047(true);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7187(@OriginalArg(0) boolean arg0) {
	}
}
