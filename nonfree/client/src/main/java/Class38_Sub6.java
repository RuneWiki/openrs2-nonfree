import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public final class Class38_Sub6 extends Class38 {

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!ifa;)V")
	public Class38_Sub6(@OriginalArg(0) Class44_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILclient!oa;B)V")
	@Override
	public void method7440(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
		super.aClass44_Sub2_21.method4265(arg1);
		super.aClass44_Sub2_21.method4335(arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7431(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V")
	@Override
	public void method7434() {
		super.aClass44_Sub2_21.method4348(false);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7427() {
		return true;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7439(@OriginalArg(1) boolean arg0) {
		super.aClass44_Sub2_21.method4348(true);
	}
}
