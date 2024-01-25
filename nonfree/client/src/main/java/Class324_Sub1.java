import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class324_Sub1 extends Class324 {

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
	private int anInt9410 = 0;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!wia;Lclient!cf;)V")
	public Class324_Sub1(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class53_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8741() {
		@Pc(18) int local18 = super.aClass53_2.aClass168_3.method3716(super.aClass20_34.method7394(), Static258.anInt4461) + super.aClass53_2.anInt1556;
		@Pc(32) int local32 = super.aClass53_2.aClass339_2.method8222(super.aClass20_34.method7408(), Static297.anInt5240) + super.aClass53_2.anInt1560;
		super.aClass20_34.method7416((float) (super.aClass20_34.method7394() / 2 + local18), (float) (super.aClass20_34.method7408() / 2 + local32), 4096, this.anInt9410);
		this.anInt9410 += ((Class53_Sub1) super.aClass53_2).anInt1566;
	}
}
