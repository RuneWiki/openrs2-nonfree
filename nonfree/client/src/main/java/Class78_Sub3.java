import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public class Class78_Sub3 extends Class78 {

	@OriginalMember(owner = "client!pea", name = "p", descriptor = "Lclient!vr;")
	private Class33 aClass33_20;

	@OriginalMember(owner = "client!pea", name = "r", descriptor = "Lclient!vr;")
	private Class33 aClass33_21;

	@OriginalMember(owner = "client!pea", name = "s", descriptor = "Lclient!vr;")
	private Class33 aClass33_22;

	@OriginalMember(owner = "client!pea", name = "u", descriptor = "Lclient!vr;")
	protected Class33 aClass33_23;

	@OriginalMember(owner = "client!pea", name = "x", descriptor = "Lclient!vr;")
	private Class33 aClass33_24;

	@OriginalMember(owner = "client!pea", name = "y", descriptor = "Lclient!vr;")
	private Class33 aClass33_25;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!aj;Lclient!aj;Lclient!gn;)V")
	public Class78_Sub3(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class106_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
	@Override
	public final void method7758() {
		super.method7758();
		@Pc(10) Class106_Sub1 local10 = (Class106_Sub1) super.aClass106_5;
		this.aClass33_23 = Static343.method5151(super.aClass15_93, local10.anInt3387);
		this.aClass33_21 = Static343.method5151(super.aClass15_93, local10.anInt3385);
		this.aClass33_24 = Static343.method5151(super.aClass15_93, local10.anInt3390);
		this.aClass33_20 = Static343.method5151(super.aClass15_93, local10.anInt3388);
		this.aClass33_25 = Static343.method5151(super.aClass15_93, local10.anInt3391);
		this.aClass33_22 = Static343.method5151(super.aClass15_93, local10.anInt3389);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZII)V")
	@Override
	protected final void method5191(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = this.aClass33_24.method7645() + arg1;
		@Pc(20) int local20 = arg1 + super.aClass106_5.anInt5840 - this.aClass33_20.method7645();
		@Pc(26) int local26 = this.aClass33_25.method7658() + arg0;
		@Pc(36) int local36 = super.aClass106_5.anInt5834 + arg0 - this.aClass33_22.method7658();
		@Pc(40) int local40 = local20 - local9;
		@Pc(44) int local44 = local36 - local26;
		@Pc(52) int local52 = this.method5193() * local40 / 10000;
		@Pc(55) int[] local55 = new int[4];
		Static674.aClass13_22.K(local55);
		Static674.aClass13_22.KA(local9, local26, local9 + local52, local36);
		this.method5196(local40, local26, local9, local44);
		Static674.aClass13_22.KA(local52 + local9, local26, local20, local36);
		this.aClass33_21.method7663(local9, local26, local40, local44);
		Static674.aClass13_22.KA(local55[0], local55[1], local55[2], local55[3]);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZIII)V")
	protected void method5196(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass33_23.method7663(arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZBII)V")
	@Override
	protected final void method5195(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(16) int[] local16 = new int[4];
		Static674.aClass13_22.K(local16);
		Static674.aClass13_22.KA(arg0, arg1, arg0 + super.aClass106_5.anInt5840, super.aClass106_5.anInt5834 + arg1);
		@Pc(37) int local37 = this.aClass33_24.method7645();
		@Pc(41) int local41 = this.aClass33_24.method7658();
		@Pc(45) int local45 = this.aClass33_20.method7645();
		@Pc(49) int local49 = this.aClass33_20.method7658();
		this.aClass33_24.method7654(arg0, (super.aClass106_5.anInt5834 - local41) / 2 + arg1);
		this.aClass33_20.method7654(super.aClass106_5.anInt5840 + arg0 - local45, (-local49 + super.aClass106_5.anInt5834) / 2 + arg1);
		Static674.aClass13_22.KA(arg0, arg1, arg0 + super.aClass106_5.anInt5840, this.aClass33_25.method7658() + arg1);
		this.aClass33_25.method7663(arg0 + local37, arg1, super.aClass106_5.anInt5840 - local45 - local37, super.aClass106_5.anInt5834);
		@Pc(123) int local123 = this.aClass33_22.method7658();
		Static674.aClass13_22.KA(arg0, super.aClass106_5.anInt5834 + arg1 - local123, super.aClass106_5.anInt5840 + arg0, arg1 + super.aClass106_5.anInt5834);
		this.aClass33_22.method7663(arg0 + local37, arg1 - -super.aClass106_5.anInt5834 - local123, super.aClass106_5.anInt5840 - local37 - local45, super.aClass106_5.anInt5834);
		Static674.aClass13_22.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method7759() {
		if (!super.method7759()) {
			return false;
		}
		@Pc(13) Class106_Sub1 local13 = (Class106_Sub1) super.aClass106_5;
		if (!super.aClass15_93.method526(local13.anInt3387)) {
			return false;
		} else if (!super.aClass15_93.method526(local13.anInt3385)) {
			return false;
		} else if (!super.aClass15_93.method526(local13.anInt3390)) {
			return false;
		} else if (!super.aClass15_93.method526(local13.anInt3388)) {
			return false;
		} else if (super.aClass15_93.method526(local13.anInt3391)) {
			return super.aClass15_93.method526(local13.anInt3389);
		} else {
			return false;
		}
	}
}
