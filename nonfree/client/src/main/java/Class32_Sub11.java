import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class32_Sub11 extends Class32 {

	@OriginalMember(owner = "client!um", name = "s", descriptor = "Z")
	private boolean aBoolean700 = false;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!lba;)V")
	public Class32_Sub11(@OriginalArg(0) Class132_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8316(@OriginalArg(1) boolean arg0) {
		@Pc(13) Interface9 local13 = super.aClass132_Sub1_21.method7630();
		if (local13 == null || !arg0) {
			super.aClass132_Sub1_21.method7598(0, Static568.aClass378_2);
			return;
		}
		super.aClass132_Sub1_21.method7616(1);
		super.aClass132_Sub1_21.method7635(local13);
		super.aClass132_Sub1_21.method7577(Static571.aClass305_4);
		super.aClass132_Sub1_21.method7616(1);
		super.aClass132_Sub1_21.method7637(Static296.aClass322_4, Static320.aClass322_5);
		super.aClass132_Sub1_21.method7612(false, 2, Static648.aClass378_4, true);
		super.aClass132_Sub1_21.method7598(0, Static568.aClass378_2);
		@Pc(69) Class207_Sub3 local69 = super.aClass132_Sub1_21.method7613();
		local69.method8221(super.aClass132_Sub1_21.method7533());
		super.aClass132_Sub1_21.method7618(Static336.aClass257_5);
		super.aClass132_Sub1_21.method7616(0);
		this.aBoolean700 = true;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8324() {
		return true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8315(@OriginalArg(1) boolean arg0) {
		super.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static320.aClass322_5);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IILclient!ml;)V")
	@Override
	public void method8318(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1) {
		super.aClass132_Sub1_21.method7635(arg1);
		super.aClass132_Sub1_21.method7652(arg0);
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
	@Override
	public void method8328() {
		if (this.aBoolean700) {
			super.aClass132_Sub1_21.method7616(1);
			super.aClass132_Sub1_21.method7577(Static357.aClass305_1);
			super.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static131.aClass322_3);
			super.aClass132_Sub1_21.method7552(Static583.aClass378_3, 2);
			super.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
			super.aClass132_Sub1_21.method7520();
			super.aClass132_Sub1_21.method7635((Interface17) null);
			super.aClass132_Sub1_21.method7616(0);
			this.aBoolean700 = false;
		} else {
			super.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
		}
		super.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static131.aClass322_3);
	}
}
