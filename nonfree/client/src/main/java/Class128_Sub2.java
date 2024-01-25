import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public class Class128_Sub2 extends Class128 {

	@OriginalMember(owner = "client!sea", name = "q", descriptor = "Lclient!pu;")
	private Class50 aClass50_18;

	@OriginalMember(owner = "client!sea", name = "r", descriptor = "Lclient!pu;")
	private Class50 aClass50_19;

	@OriginalMember(owner = "client!sea", name = "s", descriptor = "Lclient!pu;")
	private Class50 aClass50_20;

	@OriginalMember(owner = "client!sea", name = "v", descriptor = "Lclient!pu;")
	private Class50 aClass50_21;

	@OriginalMember(owner = "client!sea", name = "A", descriptor = "Lclient!pu;")
	protected Class50 aClass50_22;

	@OriginalMember(owner = "client!sea", name = "B", descriptor = "Lclient!pu;")
	private Class50 aClass50_23;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!wm;Lclient!wm;Lclient!iv;)V")
	public Class128_Sub2(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class10_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method7887() {
		if (!super.method7887()) {
			return false;
		}
		@Pc(13) Class10_Sub2 local13 = (Class10_Sub2) super.aClass10_5;
		if (!super.aClass390_62.method8905(local13.anInt5656)) {
			return false;
		} else if (!super.aClass390_62.method8905(local13.anInt5649)) {
			return false;
		} else if (!super.aClass390_62.method8905(local13.anInt5652)) {
			return false;
		} else if (!super.aClass390_62.method8905(local13.anInt5650)) {
			return false;
		} else if (super.aClass390_62.method8905(local13.anInt5651)) {
			return super.aClass390_62.method8905(local13.anInt5653);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method4081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int[] local14 = new int[4];
		Static208.aClass65_7.K(local14);
		Static208.aClass65_7.KA(arg0, arg1, super.aClass10_5.anInt10594 + arg0, super.aClass10_5.anInt10595 + arg1);
		@Pc(35) int local35 = this.aClass50_20.method6003();
		@Pc(39) int local39 = this.aClass50_20.method6010();
		@Pc(43) int local43 = this.aClass50_23.method6003();
		@Pc(47) int local47 = this.aClass50_23.method6010();
		this.aClass50_20.method5996(arg0, arg1 + (super.aClass10_5.anInt10595 - local39) / 2);
		this.aClass50_23.method5996(arg0 + super.aClass10_5.anInt10594 - local43, (super.aClass10_5.anInt10595 - local47) / 2 + arg1);
		Static208.aClass65_7.KA(arg0, arg1, super.aClass10_5.anInt10594 + arg0, arg1 - -this.aClass50_19.method6010());
		this.aClass50_19.method5989(arg0 + local35, arg1, super.aClass10_5.anInt10594 - local35 - local43, super.aClass10_5.anInt10595);
		@Pc(117) int local117 = this.aClass50_21.method6010();
		Static208.aClass65_7.KA(arg0, arg1 + super.aClass10_5.anInt10595 - local117, arg0 + super.aClass10_5.anInt10594, super.aClass10_5.anInt10595 + arg1);
		this.aClass50_21.method5989(arg0 + local35, -local117 + arg1 + super.aClass10_5.anInt10595, super.aClass10_5.anInt10594 - local43 - local35, super.aClass10_5.anInt10595);
		Static208.aClass65_7.KA(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
	@Override
	public final void method7888() {
		super.method7888();
		@Pc(10) Class10_Sub2 local10 = (Class10_Sub2) super.aClass10_5;
		this.aClass50_22 = Static144.method2605(super.aClass390_62, local10.anInt5656);
		this.aClass50_18 = Static144.method2605(super.aClass390_62, local10.anInt5649);
		this.aClass50_20 = Static144.method2605(super.aClass390_62, local10.anInt5652);
		this.aClass50_23 = Static144.method2605(super.aClass390_62, local10.anInt5650);
		this.aClass50_19 = Static144.method2605(super.aClass390_62, local10.anInt5651);
		this.aClass50_21 = Static144.method2605(super.aClass390_62, local10.anInt5653);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIIB)V")
	protected void method3392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass50_22.method5989(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZZI)V")
	@Override
	protected final void method4084(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(10) int local10 = arg0 + this.aClass50_20.method6003();
		@Pc(21) int local21 = arg0 + super.aClass10_5.anInt10594 - this.aClass50_23.method6003();
		@Pc(28) int local28 = arg1 + this.aClass50_19.method6010();
		@Pc(39) int local39 = arg1 + super.aClass10_5.anInt10595 - this.aClass50_21.method6010();
		@Pc(44) int local44 = local21 - local10;
		@Pc(49) int local49 = local39 - local28;
		@Pc(57) int local57 = this.method4085() * local44 / 10000;
		@Pc(60) int[] local60 = new int[4];
		Static208.aClass65_7.K(local60);
		Static208.aClass65_7.KA(local10, local28, local10 + local57, local39);
		this.method3392(local28, local10, local44, local49);
		Static208.aClass65_7.KA(local10 + local57, local28, local21, local39);
		this.aClass50_18.method5989(local10, local28, local44, local49);
		Static208.aClass65_7.KA(local60[0], local60[1], local60[2], local60[3]);
	}
}
