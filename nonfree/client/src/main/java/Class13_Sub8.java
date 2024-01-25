import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public final class Class13_Sub8 extends Class13 {

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class13_Sub8(@OriginalArg(0) Class101_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V")
	@Override
	public void method8498() {
		super.aClass101_Sub1_22.method5905(false);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8490(@OriginalArg(0) boolean arg0) {
		super.aClass101_Sub1_22.method5905(true);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)V")
	@Override
	public void method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8489() {
		return true;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8495(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!en;ZI)V")
	@Override
	public void method8494(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
		super.aClass101_Sub1_22.method5909(arg0);
		super.aClass101_Sub1_22.method5840(arg1);
	}
}
