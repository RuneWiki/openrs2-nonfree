import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public final class Class33_Sub4 extends Class33 {

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class33_Sub4(@OriginalArg(0) Class137_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(ZI)V")
	@Override
	public void method8854(@OriginalArg(0) boolean arg0) {
		super.aClass137_Sub3_42.method7103(true);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8846() {
		return true;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BII)V")
	@Override
	public void method8849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8847(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)V")
	@Override
	public void method8848() {
		super.aClass137_Sub3_42.method7103(false);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IZLclient!dca;)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		super.aClass137_Sub3_42.method7090(arg1);
		super.aClass137_Sub3_42.method7077(arg0);
	}
}
