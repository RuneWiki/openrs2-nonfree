import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public final class Class20_Sub11 extends Class20 {

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lclient!wg;)V")
	public Class20_Sub11(@OriginalArg(0) Class33_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)V")
	@Override
	public void method7960() {
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7961(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7970() {
		return false;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(ZILclient!gaa;)V")
	@Override
	public void method7965(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1) {
		super.aClass33_Sub2_21.method8159(arg1);
		super.aClass33_Sub2_21.method8167(arg0);
	}
}
