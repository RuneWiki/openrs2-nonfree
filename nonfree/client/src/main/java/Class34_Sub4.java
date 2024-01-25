import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class34_Sub4 extends Class34 {

	@OriginalMember(owner = "client!hea", name = "q", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!um;)V")
	public Class34_Sub4(@OriginalArg(0) Class162_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7361(@OriginalArg(1) boolean arg0) {
		super.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static317.aClass247_2);
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)V")
	@Override
	public void method7357() {
		if (this.aBoolean201) {
			super.aClass162_Sub1_23.method3926(1);
			super.aClass162_Sub1_23.method3845(Static592.aClass297_4);
			super.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static460.aClass247_4);
			super.aClass162_Sub1_23.method3885(Static504.aClass263_4, 2);
			super.aClass162_Sub1_23.method3877(0, Static191.aClass263_2);
			super.aClass162_Sub1_23.method3855();
			super.aClass162_Sub1_23.method3865(null);
			super.aClass162_Sub1_23.method3926(0);
			this.aBoolean201 = false;
		} else {
			super.aClass162_Sub1_23.method3877(0, Static191.aClass263_2);
		}
		super.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static460.aClass247_4);
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7362() {
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!qda;I)V")
	@Override
	public void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
		super.aClass162_Sub1_23.method3865(arg0);
		super.aClass162_Sub1_23.method3906(arg1);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7355(@OriginalArg(1) boolean arg0) {
		@Pc(13) Interface3 local13 = super.aClass162_Sub1_23.method3842();
		if (local13 == null || !arg0) {
			super.aClass162_Sub1_23.method3877(0, Static491.aClass263_3);
			return;
		}
		super.aClass162_Sub1_23.method3926(1);
		super.aClass162_Sub1_23.method3865(local13);
		super.aClass162_Sub1_23.method3845(Static452.aClass297_2);
		super.aClass162_Sub1_23.method3926(1);
		super.aClass162_Sub1_23.method3867(Static584.aClass247_5, Static317.aClass247_2);
		super.aClass162_Sub1_23.method3828(true, false, Static64.aClass263_1, 2);
		super.aClass162_Sub1_23.method3877(0, Static491.aClass263_3);
		@Pc(62) Class25_Sub2 local62 = super.aClass162_Sub1_23.method3899();
		local62.method2710(super.aClass162_Sub1_23.method3909());
		super.aClass162_Sub1_23.method3919(Static79.aClass348_8);
		super.aClass162_Sub1_23.method3926(0);
		this.aBoolean201 = true;
	}
}
