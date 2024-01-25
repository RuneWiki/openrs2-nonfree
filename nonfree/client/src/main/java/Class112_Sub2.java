import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class112_Sub2 extends Class112 {

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class112_Sub2(@OriginalArg(0) Class42_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!mw;I)V")
	@Override
	public void method7304(@OriginalArg(1) Class79 arg0, @OriginalArg(2) int arg1) {
		super.aClass42_Sub3_39.method3219(arg0);
		super.aClass42_Sub3_39.method3257(arg1);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	@Override
	public void method7308() {
		super.aClass42_Sub3_39.method3272(false);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
	@Override
	public void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7309(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7305() {
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7306(@OriginalArg(1) boolean arg0) {
		super.aClass42_Sub3_39.method3272(true);
	}
}
