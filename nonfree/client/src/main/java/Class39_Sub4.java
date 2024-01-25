import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class39_Sub4 extends Class39 {

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class39_Sub4(@OriginalArg(0) Class133_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8865() {
		return true;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8862(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!nba;I)V")
	@Override
	public void method8864(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		super.aClass133_Sub3_42.method7375(arg1);
		super.aClass133_Sub3_42.method7401(arg0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		super.aClass133_Sub3_42.method7349(true);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
	@Override
	public void method8866() {
		super.aClass133_Sub3_42.method7349(false);
	}
}
