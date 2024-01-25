import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class27 {

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "Lclient!lq;")
	private final Class129 aClass129_1 = new Class129();

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	private final int anInt511;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
	private int anInt501;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "Lclient!cm;")
	private final Class41 aClass41_4;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
	public Class27(@OriginalArg(0) int arg0) {
		this.anInt511 = arg0;
		this.anInt501 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass41_4 = new Class41(local16);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!ur;BLjava/lang/Object;)V")
	public void method423(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) Object arg1) {
		this.method434(arg1, arg0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)I")
	public int method424() {
		return this.anInt511;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	public void method428() {
		this.aClass129_1.method3580();
		this.aClass41_4.method907();
		this.anInt501 = this.anInt511;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
	public void method429() {
		if (Static257.aClass39_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub9_Sub3 local9 = (Class2_Sub9_Sub3) this.aClass129_1.method3577(); local9 != null; local9 = (Class2_Sub9_Sub3) this.aClass129_1.method3578()) {
			if (local9.method2499()) {
				if (local9.method2500() == null) {
					local9.method5723();
					local9.method5600();
					this.anInt501 += local9.anInt2739;
				}
			} else if (++local9.aLong211 > (long) 5) {
				@Pc(31) Class2_Sub9_Sub3 local31 = Static257.aClass39_1.method2354(local9);
				this.aClass41_4.method901(local31, local9.aLong219);
				Static45.method856(local9, local31);
				local9.method5723();
				local9.method5600();
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!ur;I)Ljava/lang/Object;")
	public Object method430(@OriginalArg(0) Interface9 arg0) {
		@Pc(14) long local14 = arg0.method5746();
		for (@Pc(21) Class2_Sub9_Sub3 local21 = (Class2_Sub9_Sub3) this.aClass41_4.method902(local14); local21 != null; local21 = (Class2_Sub9_Sub3) this.aClass41_4.method898()) {
			if (local21.anInterface9_3.method5745(arg0)) {
				@Pc(33) Object local33 = local21.method2500();
				if (local33 != null) {
					if (local21.method2499()) {
						@Pc(74) Class2_Sub9_Sub3_Sub2 local74 = new Class2_Sub9_Sub3_Sub2(arg0, local33, local21.anInt2739);
						this.aClass41_4.method901(local74, local21.aLong219);
						this.aClass129_1.method3575(local74);
						local74.aLong211 = 0L;
						local21.method5723();
						local21.method5600();
					} else {
						this.aClass129_1.method3575(local21);
						local21.aLong211 = 0L;
					}
					return local33;
				}
				local21.method5723();
				local21.method5600();
				this.anInt501 += local21.anInt2739;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
	public void method433() {
		for (@Pc(7) Class2_Sub9_Sub3 local7 = (Class2_Sub9_Sub3) this.aClass129_1.method3577(); local7 != null; local7 = (Class2_Sub9_Sub3) this.aClass129_1.method3578()) {
			if (local7.method2499()) {
				local7.method5723();
				local7.method5600();
				this.anInt501 += local7.anInt2739;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/Object;ILclient!ur;I)V")
	private void method434(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface9 arg1) {
		if (this.anInt511 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method435(arg1);
		this.anInt501--;
		while (this.anInt501 < 0) {
			@Pc(32) Class2_Sub9_Sub3 local32 = (Class2_Sub9_Sub3) this.aClass129_1.method3582();
			this.method436(local32);
		}
		@Pc(46) Class2_Sub9_Sub3_Sub2 local46 = new Class2_Sub9_Sub3_Sub2(arg1, arg0, 1);
		this.aClass41_4.method901(local46, arg1.method5746());
		this.aClass129_1.method3575(local46);
		local46.aLong211 = 0L;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Lclient!ur;I)V")
	private void method435(@OriginalArg(0) Interface9 arg0) {
		@Pc(17) long local17 = arg0.method5746();
		for (@Pc(24) Class2_Sub9_Sub3 local24 = (Class2_Sub9_Sub3) this.aClass41_4.method902(local17); local24 != null; local24 = (Class2_Sub9_Sub3) this.aClass41_4.method898()) {
			if (local24.anInterface9_3.method5745(arg0)) {
				this.method436(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!jq;I)V")
	private void method436(@OriginalArg(0) Class2_Sub9_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method5723();
			arg0.method5600();
			this.anInt501 += arg0.anInt2739;
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)I")
	public int method437() {
		return this.anInt501;
	}
}
