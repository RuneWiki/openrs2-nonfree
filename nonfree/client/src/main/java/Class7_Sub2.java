import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lclient!wu;)V")
	public Class7_Sub2(@OriginalArg(0) Class100_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BII)V")
	@Override
	public void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7194() {
		return true;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7187(@OriginalArg(0) boolean arg0) {
		super.aClass100_Sub1_22.method6039(Static436.aClass256_4, Static266.aClass256_3);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!bca;II)V")
	@Override
	public void method7186(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub1_22.method6033(arg0);
		super.aClass100_Sub1_22.method6092(arg1);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7195(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface19 local8 = super.aClass100_Sub1_22.method6042();
		if (local8 == null || !arg0) {
			super.aClass100_Sub1_22.method6146(0, Static200.aClass187_1);
			return;
		}
		super.aClass100_Sub1_22.method6114(1);
		super.aClass100_Sub1_22.method6033(local8);
		super.aClass100_Sub1_22.method6087(Static78.aClass61_1);
		super.aClass100_Sub1_22.method6114(1);
		super.aClass100_Sub1_22.method6039(Static436.aClass256_4, Static190.aClass256_2);
		super.aClass100_Sub1_22.method6079(Static506.aClass187_3, true, 2, false);
		super.aClass100_Sub1_22.method6146(0, Static200.aClass187_1);
		@Pc(57) Class154_Sub2 local57 = super.aClass100_Sub1_22.method6038();
		local57.method4528(super.aClass100_Sub1_22.method6060());
		super.aClass100_Sub1_22.method6030(Static197.aClass377_12);
		super.aClass100_Sub1_22.method6114(0);
		this.aBoolean9 = true;
	}

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "(I)V")
	@Override
	public void method7197() {
		if (this.aBoolean9) {
			super.aClass100_Sub1_22.method6114(1);
			super.aClass100_Sub1_22.method6087(Static269.aClass61_6);
			super.aClass100_Sub1_22.method6039(Static266.aClass256_3, Static266.aClass256_3);
			super.aClass100_Sub1_22.method6068(2, Static456.aClass187_2);
			super.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
			super.aClass100_Sub1_22.method6149();
			super.aClass100_Sub1_22.method6033((Interface1) null);
			super.aClass100_Sub1_22.method6114(0);
			this.aBoolean9 = false;
		} else {
			super.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
		}
		super.aClass100_Sub1_22.method6039(Static266.aClass256_3, Static266.aClass256_3);
	}
}
