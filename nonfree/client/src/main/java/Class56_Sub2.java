import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class56_Sub2(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	@Override
	public void method7137() {
		super.aClass5_Sub1_39.method436(false);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7142() {
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7138(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILclient!pm;)V")
	@Override
	public void method7139(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		super.aClass5_Sub1_39.method423(arg1);
		super.aClass5_Sub1_39.method416(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7141(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub1_39.method436(true);
	}
}
