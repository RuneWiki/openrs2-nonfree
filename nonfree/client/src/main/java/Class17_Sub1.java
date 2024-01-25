import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "F")
	private float aFloat47 = 0.0F;

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "Lclient!jq;")
	private final Class155 aClass155_3;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!cb;Lclient!jq;)V")
	public Class17_Sub1(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class155 arg1) {
		super(arg0);
		this.aClass155_3 = arg1;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V")
	@Override
	public void method6800() {
		super.aClass9_Sub1_19.method7726(1);
		super.aClass9_Sub1_19.method7723(Static74.aClass295_2, Static74.aClass295_2);
		super.aClass9_Sub1_19.method7678(Static197.aClass122_2, 0);
		super.aClass9_Sub1_19.method7735(0, Static197.aClass122_2);
		super.aClass9_Sub1_19.method7647(1);
		super.aClass9_Sub1_19.method7712(null);
		super.aClass9_Sub1_19.method7726(0);
		super.aClass9_Sub1_19.method7735(0, Static197.aClass122_2);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6805(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub1_19.method7723(Static453.aClass295_5, Static74.aClass295_2);
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)V")
	@Override
	public void method6807() {
		if (super.aClass9_Sub1_19.method7691() != 0) {
			return;
		}
		@Pc(23) Class22_Sub3 local23 = super.aClass9_Sub1_19.method7680();
		super.aClass9_Sub1_19.method7726(1);
		@Pc(33) Class22_Sub3 local33 = super.aClass9_Sub1_19.method7733();
		local33.EA(local23);
		local33.method5958(0.125F, 0.125F, 1.0F);
		local33.method5951(0.0F, this.aFloat47, 0.0F);
		super.aClass9_Sub1_19.method7703(Static19.aClass171_1);
		super.aClass9_Sub1_19.method7726(0);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!pb;II)V")
	@Override
	public void method6796(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1) {
		super.aClass9_Sub1_19.method7712(arg0);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V")
	@Override
	public void method6794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass9_Sub1_19.method7726(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass9_Sub1_19.method7712(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass155_3.aBoolean280) {
				this.aFloat47 = (float) (super.aClass9_Sub1_19.anInt9193 % 4000) / 4000.0F;
				super.aClass9_Sub1_19.method7712(this.aClass155_3.anInterface18_1);
			} else {
				@Pc(43) int local43 = super.aClass9_Sub1_19.anInt9193 % 4000 * 16 / 4000;
				super.aClass9_Sub1_19.method7712(this.aClass155_3.anInterface5Array2[local43]);
			}
		} else if (this.aClass155_3.aBoolean280) {
			super.aClass9_Sub1_19.method7712(this.aClass155_3.anInterface18_1);
		} else {
			super.aClass9_Sub1_19.method7712(this.aClass155_3.anInterface5Array2[0]);
		}
		super.aClass9_Sub1_19.method7726(0);
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6799() {
		return this.aClass155_3.method4029();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6802(@OriginalArg(1) boolean arg0) {
		super.aClass9_Sub1_19.method7726(1);
		super.aClass9_Sub1_19.method7723(Static453.aClass295_5, Static361.aClass295_4);
		super.aClass9_Sub1_19.method7692(true, 0, false, Static197.aClass122_2);
		super.aClass9_Sub1_19.method7735(0, Static426.aClass122_4);
		super.aClass9_Sub1_19.method7647(0);
		super.aClass9_Sub1_19.method7726(0);
		super.aClass9_Sub1_19.method7768(-16777216);
		super.aClass9_Sub1_19.method7735(0, Static349.aClass122_3);
		this.method6807();
	}
}
