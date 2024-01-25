import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class23_Sub10 extends Class23 {

	@OriginalMember(owner = "client!sea", name = "o", descriptor = "Z")
	private boolean aBoolean674 = false;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class23_Sub10(@OriginalArg(0) Class75_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(I)V")
	@Override
	public void method8167() {
		if (this.aBoolean674) {
			super.aClass75_Sub1_22.method6805(1);
			super.aClass75_Sub1_22.method6769(Static10.aClass219_1);
			super.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static257.aClass344_2);
			super.aClass75_Sub1_22.method6795(2, Static389.aClass261_8);
			super.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
			super.aClass75_Sub1_22.method6744();
			super.aClass75_Sub1_22.method6814((Interface1) null);
			super.aClass75_Sub1_22.method6805(0);
			this.aBoolean674 = false;
		} else {
			super.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
		}
		super.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static257.aClass344_2);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IBLclient!ah;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
		super.aClass75_Sub1_22.method6814(arg1);
		super.aClass75_Sub1_22.method6830(arg0);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8166(@OriginalArg(1) boolean arg0) {
		super.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static571.aClass344_5);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8164() {
		return true;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8161(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface19 local8 = super.aClass75_Sub1_22.method6826();
		if (local8 == null || !arg0) {
			super.aClass75_Sub1_22.method6816(0, Static51.aClass261_2);
			return;
		}
		super.aClass75_Sub1_22.method6805(1);
		super.aClass75_Sub1_22.method6814(local8);
		super.aClass75_Sub1_22.method6769(Static630.aClass219_3);
		super.aClass75_Sub1_22.method6805(1);
		super.aClass75_Sub1_22.method6743(Static399.aClass344_3, Static571.aClass344_5);
		super.aClass75_Sub1_22.method6831(true, false, Static110.aClass261_3, 2);
		super.aClass75_Sub1_22.method6816(0, Static51.aClass261_2);
		@Pc(69) Class109_Sub3 local69 = super.aClass75_Sub1_22.method6775();
		local69.method4343(super.aClass75_Sub1_22.method6773());
		super.aClass75_Sub1_22.method6787(Static243.aClass211_3);
		super.aClass75_Sub1_22.method6805(0);
		this.aBoolean674 = true;
	}
}
