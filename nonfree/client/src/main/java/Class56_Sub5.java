import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class56_Sub5 extends Class56 {

	@OriginalMember(owner = "client!jn", name = "z", descriptor = "F")
	private float aFloat140 = 0.0F;

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "Lclient!bd;")
	private final Class31 aClass31_5;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!en;Lclient!bd;)V")
	public Class56_Sub5(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class31 arg1) {
		super(arg0);
		this.aClass31_5 = arg1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7172() {
		return this.aClass31_5.method545();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7174(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_23.method4860(1);
		super.aClass100_Sub1_23.method4797(Static202.aClass236_1, Static291.aClass236_2);
		super.aClass100_Sub1_23.method4875(false, Static325.aClass119_44, 0, true);
		super.aClass100_Sub1_23.method4816(0, Static48.aClass119_5);
		super.aClass100_Sub1_23.method4859(0);
		super.aClass100_Sub1_23.method4860(0);
		super.aClass100_Sub1_23.method4877(-16777216);
		super.aClass100_Sub1_23.method4816(0, Static224.aClass119_18);
		this.method7181();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILclient!hfa;)V")
	@Override
	public void method7178(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass100_Sub1_23.method4876(arg1);
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V")
	@Override
	public void method7183() {
		super.aClass100_Sub1_23.method4860(1);
		super.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static458.aClass236_4);
		super.aClass100_Sub1_23.method4883(0, Static325.aClass119_44);
		super.aClass100_Sub1_23.method4816(0, Static325.aClass119_44);
		super.aClass100_Sub1_23.method4859(1);
		super.aClass100_Sub1_23.method4876(null);
		super.aClass100_Sub1_23.method4860(0);
		super.aClass100_Sub1_23.method4816(0, Static325.aClass119_44);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass100_Sub1_23.method4860(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass100_Sub1_23.method4876(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass31_5.aBoolean40) {
				this.aFloat140 = (float) (super.aClass100_Sub1_23.anInt5768 % 4000) / 4000.0F;
				super.aClass100_Sub1_23.method4876(this.aClass31_5.anInterface6_1);
			} else {
				@Pc(66) int local66 = super.aClass100_Sub1_23.anInt5768 % 4000 * 16 / 4000;
				super.aClass100_Sub1_23.method4876(this.aClass31_5.anInterface14Array2[local66]);
			}
		} else if (this.aClass31_5.aBoolean40) {
			super.aClass100_Sub1_23.method4876(this.aClass31_5.anInterface6_1);
		} else {
			super.aClass100_Sub1_23.method4876(this.aClass31_5.anInterface14Array2[0]);
		}
		super.aClass100_Sub1_23.method4860(0);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7171(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static291.aClass236_2);
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)V")
	@Override
	public void method7181() {
		if (super.aClass100_Sub1_23.method4830() != 0) {
			return;
		}
		@Pc(16) Class68_Sub2 local16 = super.aClass100_Sub1_23.method4792();
		super.aClass100_Sub1_23.method4860(1);
		@Pc(26) Class68_Sub2 local26 = super.aClass100_Sub1_23.method4818();
		local26.M(local16);
		local26.method5118(0.125F, 0.125F, 1.0F);
		local26.method5100(0.0F, this.aFloat140, 0.0F);
		super.aClass100_Sub1_23.method4758(Static356.aClass190_5);
		super.aClass100_Sub1_23.method4860(0);
	}
}
