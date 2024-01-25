import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public final class Class87_Sub4 extends Class87 {

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class87_Sub4(@OriginalArg(0) Class92_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	@Override
	public void method5652(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	@Override
	public void method5655(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	@Override
	public void method5651() {
		this.aClass92_Sub2_40.method4594(false);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!na;)V")
	@Override
	public void method5654(@OriginalArg(0) Class70 arg0) {
		this.aClass92_Sub2_40.method4548(arg0);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()Z")
	@Override
	public boolean method5656() {
		return true;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V")
	@Override
	public void method5653(@OriginalArg(0) boolean arg0) {
		this.aClass92_Sub2_40.method4594(true);
	}
}
