import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public final class Class43_Sub7 extends Class43 {

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class43_Sub7(@OriginalArg(0) Class67_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(ILclient!sga;I)V")
	@Override
	public void method8865(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1) {
		super.aClass67_Sub2_41.method3234(arg1);
		super.aClass67_Sub2_41.method3255(arg0);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(III)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8858(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8859() {
		return true;
	}

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "(I)V")
	@Override
	public void method8866() {
		super.aClass67_Sub2_41.method3282(false);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		super.aClass67_Sub2_41.method3282(true);
	}
}
