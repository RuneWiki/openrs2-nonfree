import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class13_Sub7 extends Class13 {

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class13_Sub7(@OriginalArg(0) Class16_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	@Override
	public void method8260() {
		super.aClass16_Sub3_42.method6002(false);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!tha;II)V")
	@Override
	public void method8264(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		super.aClass16_Sub3_42.method6020(arg0);
		super.aClass16_Sub3_42.method5972(arg1);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8268(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub3_42.method6002(true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8266(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8265() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
