import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "Lclient!hk;")
	private Class155 aClass155_4;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!gda;Lclient!gda;Lclient!rj;)V")
	public Class46_Sub1(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class132_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return super.method8564() ? super.aClass126_251.method3077(((Class132_Sub2) super.aClass132_5).anInt8280) : false;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method7491(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7488() * super.aClass132_5.anInt10377 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static273.aClass100_6.K(local16);
		Static273.aClass100_6.KA(arg1, arg0 + 2, arg1 + local13, arg0 + super.aClass132_5.anInt10374);
		this.aClass155_4.method7204(arg1, arg0 + 2, super.aClass132_5.anInt10377, super.aClass132_5.anInt10374);
		Static273.aClass100_6.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)V")
	@Override
	public void method8563() {
		super.method8563();
		this.aClass155_4 = Static489.method6886(super.aClass126_251, ((Class132_Sub2) super.aClass132_5).anInt8280);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method7489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static273.aClass100_6.method8607(arg0 - 2, arg1, super.aClass132_5.anInt10377 + 4, super.aClass132_5.anInt10374 + 2, ((Class132_Sub2) super.aClass132_5).anInt8281, 0);
		Static273.aClass100_6.method8607(arg0 - 1, arg1 + 1, super.aClass132_5.anInt10377 + 2, super.aClass132_5.anInt10374, 0, 0);
	}
}
