import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class29_Sub4 extends Class29 {

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class29_Sub4(@OriginalArg(0) Class50_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	@Override
	public void method5381() {
		super.aClass50_Sub1_37.method1252(false);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
	@Override
	public void method5378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILclient!ac;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		super.aClass50_Sub1_37.method1295(arg1);
		super.aClass50_Sub1_37.method1256(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5383(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5376(@OriginalArg(0) boolean arg0) {
		super.aClass50_Sub1_37.method1252(true);
	}
}
