import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!qga", name = "s", descriptor = "Lclient!pga;")
	private Class32 aClass32_32;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!vd;Lclient!vd;Lclient!fq;)V")
	public Class4_Sub3(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class22_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return super.method7901() ? super.aClass353_86.method8401(((Class22_Sub2) super.aClass22_5).anInt3442) : false;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V")
	@Override
	public void method7902() {
		super.method7902();
		this.aClass32_32 = Static293.method5063(((Class22_Sub2) super.aClass22_5).anInt3442, super.aClass353_86);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method7042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method7043() * super.aClass22_5.anInt5441 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static162.aClass100_7.K(local16);
		Static162.aClass100_7.KA(arg0, arg1 + 2, arg0 - -local13, arg1 + super.aClass22_5.anInt5435);
		this.aClass32_32.method5092(arg0, arg1 + 2, super.aClass22_5.anInt5441, super.aClass22_5.anInt5435);
		Static162.aClass100_7.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZBI)V")
	@Override
	protected void method7045(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static162.aClass100_7.method8845(arg0 - 2, arg1, super.aClass22_5.anInt5441 + 4, super.aClass22_5.anInt5435 - -2, ((Class22_Sub2) super.aClass22_5).anInt3441, 0);
		Static162.aClass100_7.method8845(arg0 - 1, arg1 + 1, super.aClass22_5.anInt5441 + 2, super.aClass22_5.anInt5435, 0, 0);
	}
}
