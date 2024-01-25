import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class11_Sub5 extends Class11 {

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "Z")
	private boolean aBoolean397 = false;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!ln;)V")
	public Class11_Sub5(@OriginalArg(0) Class16_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7357(@OriginalArg(0) boolean arg0) {
		@Pc(18) Interface25 local18 = super.aClass16_Sub1_21.method3920();
		if (local18 == null || !arg0) {
			super.aClass16_Sub1_21.method3950(0, Static303.aClass265_5);
			return;
		}
		super.aClass16_Sub1_21.method3899(1);
		super.aClass16_Sub1_21.method3889(local18);
		super.aClass16_Sub1_21.method3893(Static550.aClass100_35);
		super.aClass16_Sub1_21.method3899(1);
		super.aClass16_Sub1_21.method3924(Static428.aClass34_5, Static584.aClass34_6);
		super.aClass16_Sub1_21.method4000(false, true, 2, Static613.aClass265_9);
		super.aClass16_Sub1_21.method3950(0, Static303.aClass265_5);
		@Pc(74) Class54_Sub3 local74 = super.aClass16_Sub1_21.method3906();
		local74.method5150(super.aClass16_Sub1_21.method3918());
		super.aClass16_Sub1_21.method3908(Static222.aClass207_5);
		super.aClass16_Sub1_21.method3899(0);
		this.aBoolean397 = true;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7355(@OriginalArg(0) boolean arg0) {
		super.aClass16_Sub1_21.method3924(Static428.aClass34_5, Static402.aClass34_4);
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7360() {
		return true;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
	@Override
	public void method7356() {
		if (this.aBoolean397) {
			super.aClass16_Sub1_21.method3899(1);
			super.aClass16_Sub1_21.method3893(Static297.aClass100_21);
			super.aClass16_Sub1_21.method3924(Static402.aClass34_4, Static402.aClass34_4);
			super.aClass16_Sub1_21.method3946(2, Static190.aClass265_8);
			super.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
			super.aClass16_Sub1_21.method3930();
			super.aClass16_Sub1_21.method3889(null);
			super.aClass16_Sub1_21.method3899(0);
			this.aBoolean397 = false;
		} else {
			super.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
		}
		super.aClass16_Sub1_21.method3924(Static402.aClass34_4, Static402.aClass34_4);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!ke;BI)V")
	@Override
	public void method7354(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		super.aClass16_Sub1_21.method3889(arg0);
		super.aClass16_Sub1_21.method3937(arg1);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
