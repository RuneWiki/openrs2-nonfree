import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public final class Class7_Sub8 extends Class7 {

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class7_Sub8(@OriginalArg(0) Class12_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7784() {
		return true;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7780(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)V")
	@Override
	public void method7783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
	@Override
	public void method7785() {
		super.aClass12_Sub1_42.method436(false);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILclient!vfa;B)V")
	@Override
	public void method7782(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1) {
		super.aClass12_Sub1_42.method378(arg1);
		super.aClass12_Sub1_42.method401(arg0);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7777(@OriginalArg(1) boolean arg0) {
		super.aClass12_Sub1_42.method436(true);
	}
}
