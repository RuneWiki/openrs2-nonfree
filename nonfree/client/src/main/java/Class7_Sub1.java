import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "F")
	private float aFloat5 = 0.0F;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Lclient!pba;")
	private final Class249 aClass249_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!wu;Lclient!pba;)V")
	public Class7_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class249 arg1) {
		super(arg0);
		this.aClass249_1 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!bca;II)V")
	@Override
	public void method7186(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub1_22.method6033(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(Z)V")
	@Override
	public void method7196() {
		if (super.aClass100_Sub1_22.method6158() != 0) {
			return;
		}
		@Pc(18) Class154_Sub2 local18 = super.aClass100_Sub1_22.method6089();
		super.aClass100_Sub1_22.method6114(1);
		@Pc(28) Class154_Sub2 local28 = super.aClass100_Sub1_22.method6038();
		local28.method6563(local18);
		local28.method4525(0.125F, 1.0F, 0.125F);
		local28.method4522(0.0F, 0.0F, this.aFloat5);
		super.aClass100_Sub1_22.method6030(Static197.aClass377_12);
		super.aClass100_Sub1_22.method6114(0);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7194() {
		return this.aClass249_1.method6665();
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	@Override
	public void method7197() {
		super.aClass100_Sub1_22.method6114(1);
		super.aClass100_Sub1_22.method6039(Static266.aClass256_3, Static266.aClass256_3);
		super.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
		super.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
		super.aClass100_Sub1_22.method6070(1);
		super.aClass100_Sub1_22.method6033((Interface1) null);
		super.aClass100_Sub1_22.method6114(0);
		super.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7187(@OriginalArg(0) boolean arg0) {
		super.aClass100_Sub1_22.method6039(Static436.aClass256_4, Static266.aClass256_3);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V")
	@Override
	public void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub1_22.method6114(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass100_Sub1_22.method6033((Interface1) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass249_1.aBoolean522) {
				this.aFloat5 = (float) (super.aClass100_Sub1_22.anInt7125 % 4000) / 4000.0F;
				super.aClass100_Sub1_22.method6033(this.aClass249_1.anInterface15_1);
			} else {
				@Pc(87) int local87 = super.aClass100_Sub1_22.anInt7125 % 4000 * 16 / 4000;
				super.aClass100_Sub1_22.method6033(this.aClass249_1.anInterface3Array2[local87]);
			}
		} else if (this.aClass249_1.aBoolean522) {
			super.aClass100_Sub1_22.method6033(this.aClass249_1.anInterface15_1);
		} else {
			super.aClass100_Sub1_22.method6033(this.aClass249_1.anInterface3Array2[0]);
		}
		super.aClass100_Sub1_22.method6114(0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7195(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_22.method6114(1);
		super.aClass100_Sub1_22.method6039(Static436.aClass256_4, Static114.aClass256_1);
		super.aClass100_Sub1_22.method6079(Static622.aClass187_4, true, 0, false);
		super.aClass100_Sub1_22.method6146(0, Static506.aClass187_3);
		super.aClass100_Sub1_22.method6070(0);
		super.aClass100_Sub1_22.method6114(0);
		super.aClass100_Sub1_22.method6154(-16777216);
		super.aClass100_Sub1_22.method6146(0, Static456.aClass187_2);
		this.method7196();
	}
}
