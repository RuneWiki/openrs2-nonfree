import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class21_Sub6 extends Class21 {

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class21_Sub6(@OriginalArg(0) Class16_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IBLclient!qk;)V")
	@Override
	public void method8700(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		super.aClass16_Sub2_43.method3620(arg1);
		super.aClass16_Sub2_43.method3680(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8697(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8692() {
		return true;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8698(@OriginalArg(0) boolean arg0) {
		super.aClass16_Sub2_43.method3611(true);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
	@Override
	public void method8695() {
		super.aClass16_Sub2_43.method3611(false);
	}
}
