import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class84_Sub4 extends Class84 {

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class84_Sub4(@OriginalArg(0) Class128_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!jk;IB)V")
	@Override
	public void method5152(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		super.aClass128_Sub2_39.method3691(arg0);
		super.aClass128_Sub2_39.method3677(arg1);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		super.aClass128_Sub2_39.method3611(true);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
	@Override
	public void method5153() {
		super.aClass128_Sub2_39.method3611(false);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5155() {
		return true;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5150(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
	@Override
	public void method5154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
