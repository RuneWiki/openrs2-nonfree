import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ifa;)V")
	public Class38_Sub2(@OriginalArg(0) Class44_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7431(@OriginalArg(0) boolean arg0) {
		super.aClass44_Sub2_21.method4243(Static379.aClass117_7, Static573.aClass117_9);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!oa;B)V")
	@Override
	public void method7440(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
		super.aClass44_Sub2_21.method4265(arg1);
		super.aClass44_Sub2_21.method4335(arg0);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7427() {
		return true;
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
	@Override
	public void method7434() {
		if (this.aBoolean33) {
			super.aClass44_Sub2_21.method4267(1);
			super.aClass44_Sub2_21.method4346(Static3.aClass54_1);
			super.aClass44_Sub2_21.method4243(Static573.aClass117_9, Static573.aClass117_9);
			super.aClass44_Sub2_21.method4241(2, Static447.aClass328_3);
			super.aClass44_Sub2_21.method4312(0, Static519.aClass328_4);
			super.aClass44_Sub2_21.method4247();
			super.aClass44_Sub2_21.method4265(null);
			super.aClass44_Sub2_21.method4267(0);
			this.aBoolean33 = false;
		} else {
			super.aClass44_Sub2_21.method4312(0, Static519.aClass328_4);
		}
		super.aClass44_Sub2_21.method4243(Static573.aClass117_9, Static573.aClass117_9);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7439(@OriginalArg(1) boolean arg0) {
		@Pc(12) Interface13 local12 = super.aClass44_Sub2_21.method4352();
		if (local12 == null || !arg0) {
			super.aClass44_Sub2_21.method4312(0, Static233.aClass328_1);
			return;
		}
		super.aClass44_Sub2_21.method4267(1);
		super.aClass44_Sub2_21.method4265(local12);
		super.aClass44_Sub2_21.method4346(Static87.aClass54_2);
		super.aClass44_Sub2_21.method4267(1);
		super.aClass44_Sub2_21.method4243(Static379.aClass117_7, Static435.aClass117_8);
		super.aClass44_Sub2_21.method4258(true, 2, Static283.aClass328_5, false);
		super.aClass44_Sub2_21.method4312(0, Static233.aClass328_1);
		@Pc(61) Class8_Sub3 local61 = super.aClass44_Sub2_21.method4353();
		local61.method1579(super.aClass44_Sub2_21.method4313());
		super.aClass44_Sub2_21.method4268(Static484.aClass340_7);
		super.aClass44_Sub2_21.method4267(0);
		this.aBoolean33 = true;
	}
}
