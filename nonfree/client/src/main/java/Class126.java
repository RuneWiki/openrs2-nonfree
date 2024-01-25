import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class126 {

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "Lclient!bg;")
	private final Class24 aClass24_8 = new Class24();

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
	private final int anInt3478;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
	private int anInt3479;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "Lclient!mt;")
	private final Class164 aClass164_23;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(I)V")
	public Class126(@OriginalArg(0) int arg0) {
		this.anInt3478 = arg0;
		this.anInt3479 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass164_23 = new Class164(local14);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)I")
	public int method2816() {
		@Pc(12) int local12 = 0;
		for (@Pc(18) Class7_Sub4_Sub7 local18 = (Class7_Sub4_Sub7) this.aClass24_8.method303(); local18 != null; local18 = (Class7_Sub4_Sub7) this.aClass24_8.method301()) {
			if (!local18.method4299()) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)I")
	public int method2818() {
		return this.anInt3478;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLclient!hd;)V")
	private void method2819(@OriginalArg(1) Class7_Sub4_Sub7 arg0) {
		if (arg0 != null) {
			arg0.method5802();
			arg0.method5661();
			this.anInt3479 += arg0.anInt5366;
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(Z)Ljava/lang/Object;")
	public Object method2820() {
		@Pc(16) Class7_Sub4_Sub7 local16 = (Class7_Sub4_Sub7) this.aClass164_23.method3514();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method4298();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class7_Sub4_Sub7 local28 = local16;
			local16 = (Class7_Sub4_Sub7) this.aClass164_23.method3519();
			local28.method5802();
			local28.method5661();
			this.anInt3479 += local16.anInt5366;
		}
		return null;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	public void method2821() {
		for (@Pc(15) Class7_Sub4_Sub7 local15 = (Class7_Sub4_Sub7) this.aClass24_8.method303(); local15 != null; local15 = (Class7_Sub4_Sub7) this.aClass24_8.method301()) {
			if (local15.method4299()) {
				local15.method5802();
				local15.method5661();
				this.anInt3479 += local15.anInt5366;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method2822(@OriginalArg(0) long arg0) {
		@Pc(10) Class7_Sub4_Sub7 local10 = (Class7_Sub4_Sub7) this.aClass164_23.method3512(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(20) Object local20 = local10.method4298();
		if (local20 == null) {
			local10.method5802();
			local10.method5661();
			this.anInt3479 += local10.anInt5366;
			return null;
		}
		if (local10.method4299()) {
			@Pc(53) Class7_Sub4_Sub7_Sub2 local53 = new Class7_Sub4_Sub7_Sub2(local20, local10.anInt5366);
			this.aClass164_23.method3508(local10.aLong230, local53);
			this.aClass24_8.method298(local53);
			local53.aLong225 = 0L;
			local10.method5802();
			local10.method5661();
		} else {
			this.aClass24_8.method298(local10);
			local10.aLong225 = 0L;
		}
		return local20;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(Z)Ljava/lang/Object;")
	public Object method2823() {
		@Pc(20) Class7_Sub4_Sub7 local20 = (Class7_Sub4_Sub7) this.aClass164_23.method3519();
		while (local20 != null) {
			@Pc(26) Object local26 = local20.method4298();
			if (local26 != null) {
				return local26;
			}
			@Pc(30) Class7_Sub4_Sub7 local30 = local20;
			local20 = (Class7_Sub4_Sub7) this.aClass164_23.method3519();
			local30.method5802();
			local30.method5661();
			this.anInt3479 += local20.anInt5366;
		}
		return null;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method2824(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method2825(arg0, arg1);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(JILjava/lang/Object;Z)V")
	private void method2825(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt3478 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2830(arg0);
		this.anInt3479--;
		while (this.anInt3479 < 0) {
			@Pc(36) Class7_Sub4_Sub7 local36 = (Class7_Sub4_Sub7) this.aClass24_8.method308();
			this.method2819(local36);
		}
		@Pc(49) Class7_Sub4_Sub7_Sub2 local49 = new Class7_Sub4_Sub7_Sub2(arg1, 1);
		this.aClass164_23.method3508(arg0, local49);
		this.aClass24_8.method298(local49);
		local49.aLong225 = 0L;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I")
	public int method2826() {
		return this.anInt3479;
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(Z)V")
	public void method2827() {
		this.aClass24_8.method299();
		this.aClass164_23.method3509();
		this.anInt3479 = this.anInt3478;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)V")
	public void method2828(@OriginalArg(0) int arg0) {
		if (Static434.aClass143_1 == null) {
			return;
		}
		for (@Pc(13) Class7_Sub4_Sub7 local13 = (Class7_Sub4_Sub7) this.aClass24_8.method303(); local13 != null; local13 = (Class7_Sub4_Sub7) this.aClass24_8.method301()) {
			if (local13.method4299()) {
				if (local13.method4298() == null) {
					local13.method5802();
					local13.method5661();
					this.anInt3479++;
				}
			} else if (++local13.aLong225 > (long) arg0) {
				@Pc(35) Class7_Sub4_Sub7 local35 = Static434.aClass143_1.method5183(local13);
				this.aClass164_23.method3508(local13.aLong230, local35);
				Static340.method4425(local35, local13);
				local13.method5802();
				local13.method5661();
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BJ)V")
	private void method2830(@OriginalArg(1) long arg0) {
		@Pc(18) Class7_Sub4_Sub7 local18 = (Class7_Sub4_Sub7) this.aClass164_23.method3512(arg0);
		this.method2819(local18);
	}
}
