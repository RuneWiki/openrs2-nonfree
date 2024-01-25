import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class74_Sub7 extends Class74 {

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "F")
	private float aFloat131 = 0.0F;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Lclient!wv;")
	private final Class378 aClass378_5;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!gt;Lclient!wv;)V")
	public Class74_Sub7(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) Class378 arg1) {
		super(arg0);
		this.aClass378_5 = arg1;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
	@Override
	public void method8246() {
		if (super.aClass87_Sub1_22.method5070() != 0) {
			return;
		}
		@Pc(20) Class6_Sub2 local20 = super.aClass87_Sub1_22.method5063();
		super.aClass87_Sub1_22.method5116(1);
		@Pc(30) Class6_Sub2 local30 = super.aClass87_Sub1_22.method5141();
		local30.method6695(local20);
		local30.method2716(0.125F, 0.125F, 1.0F);
		local30.method2710(0.0F, 0.0F, this.aFloat131);
		super.aClass87_Sub1_22.method5023(Static552.aClass108_24);
		super.aClass87_Sub1_22.method5116(0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8245() {
		return this.aClass378_5.method8579();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8253(@OriginalArg(1) boolean arg0) {
		super.aClass87_Sub1_22.method5133(Static148.aClass300_3, Static40.aClass300_1);
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
	@Override
	public void method8249() {
		super.aClass87_Sub1_22.method5116(1);
		super.aClass87_Sub1_22.method5133(Static40.aClass300_1, Static40.aClass300_1);
		super.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
		super.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
		super.aClass87_Sub1_22.method5065(1);
		super.aClass87_Sub1_22.method5079(null);
		super.aClass87_Sub1_22.method5116(0);
		super.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass87_Sub1_22.method5116(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass87_Sub1_22.method5079(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass378_5.aBoolean758) {
				this.aFloat131 = (float) (super.aClass87_Sub1_22.anInt6123 % 4000) / 4000.0F;
				super.aClass87_Sub1_22.method5079(this.aClass378_5.anInterface11_1);
			} else {
				@Pc(90) int local90 = super.aClass87_Sub1_22.anInt6123 % 4000 * 16 / 4000;
				super.aClass87_Sub1_22.method5079(this.aClass378_5.anInterface26Array1[local90]);
			}
		} else if (this.aClass378_5.aBoolean758) {
			super.aClass87_Sub1_22.method5079(this.aClass378_5.anInterface11_1);
		} else {
			super.aClass87_Sub1_22.method5079(this.aClass378_5.anInterface26Array1[0]);
		}
		super.aClass87_Sub1_22.method5116(0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8250(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1) {
		super.aClass87_Sub1_22.method5079(arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8251(@OriginalArg(0) boolean arg0) {
		super.aClass87_Sub1_22.method5116(1);
		super.aClass87_Sub1_22.method5133(Static148.aClass300_3, Static591.aClass300_5);
		super.aClass87_Sub1_22.method5052(false, true, 0, Static516.aClass315_3);
		super.aClass87_Sub1_22.method5118(0, Static508.aClass315_2);
		super.aClass87_Sub1_22.method5065(0);
		super.aClass87_Sub1_22.method5116(0);
		super.aClass87_Sub1_22.method5075(-16777216);
		super.aClass87_Sub1_22.method5118(0, Static358.aClass315_1);
		this.method8246();
	}
}
