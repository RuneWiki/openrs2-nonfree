import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class31_Sub7 extends Class31 {

	@OriginalMember(owner = "client!sia", name = "t", descriptor = "F")
	private float aFloat229 = 0.0F;

	@OriginalMember(owner = "client!sia", name = "p", descriptor = "Lclient!ui;")
	private final Class353 aClass353_5;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!pj;Lclient!ui;)V")
	public Class31_Sub7(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) Class353 arg1) {
		super(arg0);
		this.aClass353_5 = arg1;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8595(@OriginalArg(1) boolean arg0) {
		super.aClass137_Sub1_22.method8081(1);
		super.aClass137_Sub1_22.method7969(Static15.aClass87_1, Static461.aClass87_5);
		super.aClass137_Sub1_22.method8047(false, true, Static201.aClass169_3, 0);
		super.aClass137_Sub1_22.method7971(0, Static567.aClass169_7);
		super.aClass137_Sub1_22.method7999(0);
		super.aClass137_Sub1_22.method8081(0);
		super.aClass137_Sub1_22.method8048(-16777216);
		super.aClass137_Sub1_22.method7971(0, Static490.aClass169_6);
		this.method8596();
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V")
	@Override
	public void method8591() {
		super.aClass137_Sub1_22.method8081(1);
		super.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static575.aClass87_7);
		super.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
		super.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
		super.aClass137_Sub1_22.method7999(1);
		super.aClass137_Sub1_22.method8007((Interface15) null);
		super.aClass137_Sub1_22.method8081(0);
		super.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(Z)V")
	@Override
	public void method8596() {
		if (super.aClass137_Sub1_22.method8020() != 0) {
			return;
		}
		@Pc(22) Class26_Sub1 local22 = super.aClass137_Sub1_22.method8088();
		super.aClass137_Sub1_22.method8081(1);
		@Pc(32) Class26_Sub1 local32 = super.aClass137_Sub1_22.method8050();
		local32.method6447(local22);
		local32.method803(0.125F, 0.125F, 1.0F);
		local32.method797(0.0F, this.aFloat229, 0.0F);
		super.aClass137_Sub1_22.method8041(Static639.aClass70_5);
		super.aClass137_Sub1_22.method8081(0);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BILclient!kja;)V")
	@Override
	public void method8588(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass137_Sub1_22.method8007(arg1);
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8593() {
		return this.aClass353_5.method8486();
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8592(@OriginalArg(0) boolean arg0) {
		super.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static461.aClass87_5);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass137_Sub1_22.method8081(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass137_Sub1_22.method8007((Interface15) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass353_5.aBoolean715) {
				this.aFloat229 = (float) (super.aClass137_Sub1_22.anInt9719 % 4000) / 4000.0F;
				super.aClass137_Sub1_22.method8007(this.aClass353_5.anInterface9_1);
			} else {
				@Pc(87) int local87 = super.aClass137_Sub1_22.anInt9719 % 4000 * 16 / 4000;
				super.aClass137_Sub1_22.method8007(this.aClass353_5.anInterface21Array1[local87]);
			}
		} else if (this.aClass353_5.aBoolean715) {
			super.aClass137_Sub1_22.method8007(this.aClass353_5.anInterface9_1);
		} else {
			super.aClass137_Sub1_22.method8007(this.aClass353_5.anInterface21Array1[0]);
		}
		super.aClass137_Sub1_22.method8081(0);
	}
}
