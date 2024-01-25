import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class121_Sub8 extends Class121 {

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "Z")
	private boolean aBoolean683 = false;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!nb;)V")
	public Class121_Sub8(@OriginalArg(0) Class67_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9239(@OriginalArg(1) boolean arg0) {
		super.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static573.aClass37_3);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)V")
	@Override
	public void method9236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9241() {
		return true;
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)V")
	@Override
	public void method9232() {
		if (this.aBoolean683) {
			super.aClass67_Sub1_23.method5687(1);
			super.aClass67_Sub1_23.method5633(Static600.aClass377_3);
			super.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static496.aClass37_2);
			super.aClass67_Sub1_23.method5590(2, Static472.aClass58_3);
			super.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
			super.aClass67_Sub1_23.method5614();
			super.aClass67_Sub1_23.method5612((Interface12) null);
			super.aClass67_Sub1_23.method5687(0);
			this.aBoolean683 = false;
		} else {
			super.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
		}
		super.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static496.aClass37_2);
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9231(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface7 local8 = super.aClass67_Sub1_23.method5589();
		if (local8 == null || !arg0) {
			super.aClass67_Sub1_23.method5674(0, Static653.aClass58_4);
			return;
		}
		super.aClass67_Sub1_23.method5687(1);
		super.aClass67_Sub1_23.method5612(local8);
		super.aClass67_Sub1_23.method5633(Static254.aClass377_1);
		super.aClass67_Sub1_23.method5687(1);
		super.aClass67_Sub1_23.method5686(Static477.aClass37_1, Static573.aClass37_3);
		super.aClass67_Sub1_23.method5641(true, false, Static273.aClass58_2, 2);
		super.aClass67_Sub1_23.method5674(0, Static653.aClass58_4);
		@Pc(65) Class181_Sub1 local65 = super.aClass67_Sub1_23.method5601();
		local65.method4936(super.aClass67_Sub1_23.method5629());
		super.aClass67_Sub1_23.method5666(Static234.aClass96_3);
		super.aClass67_Sub1_23.method5687(0);
		this.aBoolean683 = true;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!ip;II)V")
	@Override
	public void method9244(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		super.aClass67_Sub1_23.method5612(arg0);
		super.aClass67_Sub1_23.method5655(arg1);
	}
}
