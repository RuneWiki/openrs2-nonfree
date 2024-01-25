import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class10_Sub4(@OriginalArg(0) Class135_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method5736(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5733() {
		return true;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5735(@OriginalArg(1) boolean arg0) {
		super.aClass135_Sub2_41.method5417(true);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!sq;II)V")
	@Override
	public void method5730(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		super.aClass135_Sub2_41.method5458(arg0);
		super.aClass135_Sub2_41.method5441(arg1);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	@Override
	public void method5729() {
		super.aClass135_Sub2_41.method5417(false);
	}
}
