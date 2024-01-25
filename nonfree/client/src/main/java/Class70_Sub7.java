import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class70_Sub7 extends Class70 {

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!nd;)V")
	public Class70_Sub7(@OriginalArg(0) Class62_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7301() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILclient!qv;)V")
	@Override
	public void method7313(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1) {
		super.aClass62_Sub1_20.method4676(arg1);
		super.aClass62_Sub1_20.method4714(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
	@Override
	public void method7306() {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7311(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7303(@OriginalArg(0) boolean arg0) {
	}
}
