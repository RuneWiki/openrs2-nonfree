import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class107 {

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "Lclient!lq;")
	private final Class129 aClass129_8 = new Class129();

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	private final int anInt3461;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
	private int anInt3462;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Lclient!cm;")
	private final Class41 aClass41_16;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
	public Class107(@OriginalArg(0) int arg0) {
		this.anInt3461 = arg0;
		this.anInt3462 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass41_16 = new Class41(local14);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method3007() {
		@Pc(16) Class2_Sub9_Sub18 local16 = (Class2_Sub9_Sub18) this.aClass41_16.method896();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method5575();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class2_Sub9_Sub18 local28 = local16;
			local16 = (Class2_Sub9_Sub18) this.aClass41_16.method904();
			local28.method5723();
			local28.method5600();
			this.anInt3462 += local16.anInt6661;
		}
		return null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)I")
	public int method3008() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class2_Sub9_Sub18 local13 = (Class2_Sub9_Sub18) this.aClass129_8.method3577(); local13 != null; local13 = (Class2_Sub9_Sub18) this.aClass129_8.method3578()) {
			if (!local13.method5574()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLjava/lang/Object;IJ)V")
	private void method3009(@OriginalArg(1) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt3461 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3013(arg1);
		this.anInt3462--;
		while (this.anInt3462 < 0) {
			@Pc(40) Class2_Sub9_Sub18 local40 = (Class2_Sub9_Sub18) this.aClass129_8.method3582();
			this.method3022(local40);
		}
		@Pc(53) Class2_Sub9_Sub18_Sub2 local53 = new Class2_Sub9_Sub18_Sub2(arg0, 1);
		this.aClass41_16.method901(local53, arg1);
		this.aClass129_8.method3575(local53);
		local53.aLong211 = 0L;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
	public int method3010() {
		return this.anInt3461;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
	public void method3011(@OriginalArg(1) int arg0) {
		if (Static36.aClass36_1 == null) {
			return;
		}
		for (@Pc(16) Class2_Sub9_Sub18 local16 = (Class2_Sub9_Sub18) this.aClass129_8.method3577(); local16 != null; local16 = (Class2_Sub9_Sub18) this.aClass129_8.method3578()) {
			if (local16.method5574()) {
				if (local16.method5575() == null) {
					local16.method5723();
					local16.method5600();
					this.anInt3462++;
				}
			} else if (++local16.aLong211 > (long) arg0) {
				@Pc(42) Class2_Sub9_Sub18 local42 = Static36.aClass36_1.method4706(local16);
				this.aClass41_16.method901(local42, local16.aLong219);
				Static45.method856(local16, local42);
				local16.method5723();
				local16.method5600();
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	public void method3012() {
		for (@Pc(7) Class2_Sub9_Sub18 local7 = (Class2_Sub9_Sub18) this.aClass129_8.method3577(); local7 != null; local7 = (Class2_Sub9_Sub18) this.aClass129_8.method3578()) {
			if (local7.method5574()) {
				local7.method5723();
				local7.method5600();
				this.anInt3462 += local7.anInt6661;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BJ)V")
	private void method3013(@OriginalArg(1) long arg0) {
		@Pc(12) Class2_Sub9_Sub18 local12 = (Class2_Sub9_Sub18) this.aClass41_16.method902(arg0);
		this.method3022(local12);
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
	public void method3015() {
		this.aClass129_8.method3580();
		this.aClass41_16.method907();
		this.anInt3462 = this.anInt3461;
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)I")
	public int method3016() {
		return this.anInt3462;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method3018(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method3009(arg1, arg0);
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method3019() {
		@Pc(18) Class2_Sub9_Sub18 local18 = (Class2_Sub9_Sub18) this.aClass41_16.method904();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method5575();
			if (local24 != null) {
				return local24;
			}
			@Pc(28) Class2_Sub9_Sub18 local28 = local18;
			local18 = (Class2_Sub9_Sub18) this.aClass41_16.method904();
			local28.method5723();
			local28.method5600();
			this.anInt3462 += local18.anInt6661;
		}
		return null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method3021(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub9_Sub18 local10 = (Class2_Sub9_Sub18) this.aClass41_16.method902(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method5575();
		if (local18 == null) {
			local10.method5723();
			local10.method5600();
			this.anInt3462 += local10.anInt6661;
			return null;
		}
		if (local10.method5574()) {
			@Pc(61) Class2_Sub9_Sub18_Sub2 local61 = new Class2_Sub9_Sub18_Sub2(local18, local10.anInt6661);
			this.aClass41_16.method901(local61, local10.aLong219);
			this.aClass129_8.method3575(local61);
			local61.aLong211 = 0L;
			local10.method5723();
			local10.method5600();
		} else {
			this.aClass129_8.method3575(local10);
			local10.aLong211 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!qk;I)V")
	private void method3022(@OriginalArg(0) Class2_Sub9_Sub18 arg0) {
		if (arg0 != null) {
			arg0.method5723();
			arg0.method5600();
			this.anInt3462 += arg0.anInt6661;
		}
	}
}
