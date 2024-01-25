import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!ms", name = "D", descriptor = "Lclient!hk;")
	private Class155 aClass155_24;

	@OriginalMember(owner = "client!ms", name = "A", descriptor = "Lclient!hk;")
	private Class155 aClass155_25;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "Lclient!hk;")
	private Class155 aClass155_26;

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "Lclient!hk;")
	protected Class155 aClass155_27;

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "Lclient!hk;")
	private Class155 aClass155_28;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "Lclient!hk;")
	private Class155 aClass155_29;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!gda;Lclient!gda;Lclient!gia;)V")
	public Class46_Sub2(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class132_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V")
	@Override
	public final void method8563() {
		super.method8563();
		@Pc(10) Class132_Sub1 local10 = (Class132_Sub1) super.aClass132_5;
		this.aClass155_27 = Static489.method6886(super.aClass126_251, local10.anInt6050);
		this.aClass155_26 = Static489.method6886(super.aClass126_251, local10.anInt6044);
		this.aClass155_24 = Static489.method6886(super.aClass126_251, local10.anInt6048);
		this.aClass155_25 = Static489.method6886(super.aClass126_251, local10.anInt6047);
		this.aClass155_29 = Static489.method6886(super.aClass126_251, local10.anInt6045);
		this.aClass155_28 = Static489.method6886(super.aClass126_251, local10.anInt6049);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method7489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int[] local9 = new int[4];
		Static273.aClass100_6.K(local9);
		Static273.aClass100_6.KA(arg0, arg1, arg0 + super.aClass132_5.anInt10377, super.aClass132_5.anInt10374 + arg1);
		@Pc(31) int local31 = this.aClass155_24.method7206();
		@Pc(35) int local35 = this.aClass155_24.method7209();
		@Pc(39) int local39 = this.aClass155_25.method7206();
		@Pc(43) int local43 = this.aClass155_25.method7209();
		this.aClass155_24.method7202(arg0, (super.aClass132_5.anInt10374 - local35) / 2 + arg1);
		this.aClass155_25.method7202(super.aClass132_5.anInt10377 + arg0 - local39, (super.aClass132_5.anInt10374 - local43) / 2 + arg1);
		Static273.aClass100_6.KA(arg0, arg1, super.aClass132_5.anInt10377 + arg0, this.aClass155_29.method7209() + arg1);
		this.aClass155_29.method7204(arg0 + local31, arg1, super.aClass132_5.anInt10377 - local31 - local39, super.aClass132_5.anInt10374);
		@Pc(114) int local114 = this.aClass155_28.method7209();
		Static273.aClass100_6.KA(arg0, super.aClass132_5.anInt10374 + arg1 - local114, super.aClass132_5.anInt10377 + arg0, arg1 + super.aClass132_5.anInt10374);
		this.aClass155_28.method7204(local31 + arg0, -local114 + arg1 + super.aClass132_5.anInt10374, super.aClass132_5.anInt10377 - local39 - local31, super.aClass132_5.anInt10374);
		Static273.aClass100_6.KA(local9[0], local9[1], local9[2], local9[3]);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZII)V")
	@Override
	protected final void method7491(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = this.aClass155_24.method7206() + arg1;
		@Pc(19) int local19 = super.aClass132_5.anInt10377 + arg1 - this.aClass155_25.method7206();
		@Pc(25) int local25 = this.aClass155_29.method7209() + arg0;
		@Pc(35) int local35 = super.aClass132_5.anInt10374 + arg0 - this.aClass155_28.method7209();
		@Pc(39) int local39 = local19 - local9;
		@Pc(43) int local43 = local35 - local25;
		@Pc(51) int local51 = local39 * this.method7488() / 10000;
		@Pc(54) int[] local54 = new int[4];
		Static273.aClass100_6.K(local54);
		Static273.aClass100_6.KA(local9, local25, local51 + local9, local35);
		this.method6773(local39, local43, local25, local9);
		Static273.aClass100_6.KA(local9 + local51, local25, local19, local35);
		this.aClass155_26.method7204(local9, local25, local39, local43);
		Static273.aClass100_6.KA(local54[0], local54[1], local54[2], local54[3]);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIB)V")
	protected void method6773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass155_27.method7204(arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8564() {
		if (!super.method8564()) {
			return false;
		}
		@Pc(14) Class132_Sub1 local14 = (Class132_Sub1) super.aClass132_5;
		if (!super.aClass126_251.method3077(local14.anInt6050)) {
			return false;
		} else if (!super.aClass126_251.method3077(local14.anInt6044)) {
			return false;
		} else if (!super.aClass126_251.method3077(local14.anInt6048)) {
			return false;
		} else if (!super.aClass126_251.method3077(local14.anInt6047)) {
			return false;
		} else if (super.aClass126_251.method3077(local14.anInt6045)) {
			return super.aClass126_251.method3077(local14.anInt6049);
		} else {
			return false;
		}
	}
}
