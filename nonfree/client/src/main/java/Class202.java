import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class202 {

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Lclient!em;")
	private final Class71 aClass71_5 = new Class71();

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	private int anInt5891;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	private final int anInt5888;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "Lclient!ru;")
	private final Class220 aClass220_31;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
	public Class202(@OriginalArg(0) int arg0) {
		this.anInt5891 = arg0;
		this.anInt5888 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass220_31 = new Class220(local16);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!dd;B)Ljava/lang/Object;")
	public Object method4682(@OriginalArg(0) Interface3 arg0) {
		@Pc(16) long local16 = arg0.method2032();
		for (@Pc(23) Class2_Sub1_Sub11 local23 = (Class2_Sub1_Sub11) this.aClass220_31.method5099(local16); local23 != null; local23 = (Class2_Sub1_Sub11) this.aClass220_31.method5101()) {
			if (local23.anInterface3_3.method2033(arg0)) {
				@Pc(35) Object local35 = local23.method4480();
				if (local35 != null) {
					if (local23.method4481()) {
						@Pc(74) Class2_Sub1_Sub11_Sub2 local74 = new Class2_Sub1_Sub11_Sub2(arg0, local35, local23.anInt5640);
						this.aClass220_31.method5104(local74, local23.aLong401);
						this.aClass71_5.method1430(local74);
						local74.aLong378 = 0L;
						local23.method6260();
						local23.method5838();
					} else {
						this.aClass71_5.method1430(local23);
						local23.aLong378 = 0L;
					}
					return local35;
				}
				local23.method6260();
				local23.method5838();
				this.anInt5891 += local23.anInt5640;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!dd;Ljava/lang/Object;I)V")
	public void method4683(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1) {
		this.method4694(arg1, arg0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)I")
	public int method4684() {
		return this.anInt5888;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public void method4686() {
		this.aClass71_5.method1429();
		this.aClass220_31.method5105();
		this.anInt5891 = this.anInt5888;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)I")
	public int method4687() {
		return this.anInt5891;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	public void method4688() {
		for (@Pc(15) Class2_Sub1_Sub11 local15 = (Class2_Sub1_Sub11) this.aClass71_5.method1431(); local15 != null; local15 = (Class2_Sub1_Sub11) this.aClass71_5.method1428()) {
			if (local15.method4481()) {
				local15.method6260();
				local15.method5838();
				this.anInt5891 += local15.anInt5640;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
	public void method4689() {
		if (Static173.aClass159_1 == null) {
			return;
		}
		for (@Pc(17) Class2_Sub1_Sub11 local17 = (Class2_Sub1_Sub11) this.aClass71_5.method1431(); local17 != null; local17 = (Class2_Sub1_Sub11) this.aClass71_5.method1428()) {
			if (local17.method4481()) {
				if (local17.method4480() == null) {
					local17.method6260();
					local17.method5838();
					this.anInt5891 += local17.anInt5640;
				}
			} else if (++local17.aLong378 > (long) 5) {
				@Pc(66) Class2_Sub1_Sub11 local66 = Static173.aClass159_1.method3126(local17);
				this.aClass220_31.method5104(local66, local17.aLong401);
				Static420.method5764(local17, local66);
				local17.method6260();
				local17.method5838();
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!dd;I)V")
	private void method4690(@OriginalArg(0) Interface3 arg0) {
		@Pc(9) long local9 = arg0.method2032();
		for (@Pc(22) Class2_Sub1_Sub11 local22 = (Class2_Sub1_Sub11) this.aClass220_31.method5099(local9); local22 != null; local22 = (Class2_Sub1_Sub11) this.aClass220_31.method5101()) {
			if (local22.anInterface3_3.method2033(arg0)) {
				this.method4691(local22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!mh;I)V")
	private void method4691(@OriginalArg(0) Class2_Sub1_Sub11 arg0) {
		if (arg0 != null) {
			arg0.method6260();
			arg0.method5838();
			this.anInt5891 += arg0.anInt5640;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/Object;Lclient!dd;II)V")
	private void method4694(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface3 arg1) {
		if (this.anInt5888 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4690(arg1);
		this.anInt5891--;
		while (this.anInt5891 < 0) {
			@Pc(34) Class2_Sub1_Sub11 local34 = (Class2_Sub1_Sub11) this.aClass71_5.method1434();
			this.method4691(local34);
		}
		@Pc(50) Class2_Sub1_Sub11_Sub2 local50 = new Class2_Sub1_Sub11_Sub2(arg1, arg0, 1);
		this.aClass220_31.method5104(local50, arg1.method2032());
		this.aClass71_5.method1430(local50);
		local50.aLong378 = 0L;
	}
}
