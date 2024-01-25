import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class31_Sub9 extends Class31 {

	@OriginalMember(owner = "client!tu", name = "t", descriptor = "Z")
	private boolean aBoolean710 = false;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class31_Sub9(@OriginalArg(0) Class137_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8592(@OriginalArg(0) boolean arg0) {
		super.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static461.aClass87_5);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8595(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface16 local8 = super.aClass137_Sub1_22.method8046();
		if (local8 == null || !arg0) {
			super.aClass137_Sub1_22.method7971(0, Static370.aClass169_8);
			return;
		}
		super.aClass137_Sub1_22.method8081(1);
		super.aClass137_Sub1_22.method8007(local8);
		super.aClass137_Sub1_22.method7970(Static536.aClass7_7);
		super.aClass137_Sub1_22.method8081(1);
		super.aClass137_Sub1_22.method7969(Static129.aClass87_4, Static461.aClass87_5);
		super.aClass137_Sub1_22.method8047(false, true, Static567.aClass169_7, 2);
		super.aClass137_Sub1_22.method7971(0, Static370.aClass169_8);
		@Pc(65) Class26_Sub1 local65 = super.aClass137_Sub1_22.method8050();
		local65.method787(super.aClass137_Sub1_22.method8002());
		super.aClass137_Sub1_22.method8041(Static639.aClass70_5);
		super.aClass137_Sub1_22.method8081(0);
		this.aBoolean710 = true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BILclient!kja;)V")
	@Override
	public void method8588(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass137_Sub1_22.method8007(arg1);
		super.aClass137_Sub1_22.method8078(arg0);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8593() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	@Override
	public void method8591() {
		if (this.aBoolean710) {
			super.aClass137_Sub1_22.method8081(1);
			super.aClass137_Sub1_22.method7970(Static470.aClass7_8);
			super.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static575.aClass87_7);
			super.aClass137_Sub1_22.method8069(2, Static490.aClass169_6);
			super.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
			super.aClass137_Sub1_22.method8071();
			super.aClass137_Sub1_22.method8007((Interface15) null);
			super.aClass137_Sub1_22.method8081(0);
			this.aBoolean710 = false;
		} else {
			super.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
		}
		super.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static575.aClass87_7);
	}
}
