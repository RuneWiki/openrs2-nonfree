import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class18_Sub9 extends Class18 {

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class18_Sub9(@OriginalArg(0) Class95_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7544() {
		return true;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7552(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
	@Override
	public void method7551() {
		super.aClass95_Sub1_39.method2081(false);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7550(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub1_39.method2081(true);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZLclient!hl;)V")
	@Override
	public void method7546(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		super.aClass95_Sub1_39.method2077(arg1);
		super.aClass95_Sub1_39.method2106(arg0);
	}
}
