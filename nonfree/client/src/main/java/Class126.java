import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class126 {

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "Lclient!uj;")
	private final Class244 aClass244_6 = new Class244();

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
	private int anInt3919;

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
	private final int anInt3922;

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "Lclient!an;")
	private final Class11 aClass11_25;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(I)V")
	public Class126(@OriginalArg(0) int arg0) {
		this.anInt3919 = arg0;
		this.anInt3922 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass11_25 = new Class11(local14);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BJ)V")
	private void method3128(@OriginalArg(1) long arg0) {
		@Pc(15) Class3_Sub4_Sub5 local15 = (Class3_Sub4_Sub5) this.aClass11_25.method324(arg0);
		this.method3136(local15);
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
	public void method3131() {
		for (@Pc(9) Class3_Sub4_Sub5 local9 = (Class3_Sub4_Sub5) this.aClass244_6.method5240(); local9 != null; local9 = (Class3_Sub4_Sub5) this.aClass244_6.method5232()) {
			if (local9.method3899()) {
				local9.method5977();
				local9.method5949();
				this.anInt3919 += local9.anInt5084;
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(JBLjava/lang/Object;)V")
	public void method3132(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method3133(arg0, arg1);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BIJLjava/lang/Object;)V")
	private void method3133(@OriginalArg(2) long arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt3922 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3128(arg0);
		this.anInt3919--;
		while (this.anInt3919 < 0) {
			@Pc(29) Class3_Sub4_Sub5 local29 = (Class3_Sub4_Sub5) this.aClass244_6.method5235();
			this.method3136(local29);
		}
		@Pc(45) Class3_Sub4_Sub5_Sub2 local45 = new Class3_Sub4_Sub5_Sub2(arg1, 1);
		this.aClass11_25.method319(local45, arg0);
		this.aClass244_6.method5234(local45);
		local45.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)I")
	public int method3134() {
		return this.anInt3922;
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V")
	public void method3135() {
		this.aClass244_6.method5238();
		this.aClass11_25.method312();
		this.anInt3919 = this.anInt3922;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BLclient!cr;)V")
	private void method3136(@OriginalArg(1) Class3_Sub4_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method5977();
			arg0.method5949();
			this.anInt3919 += arg0.anInt5084;
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)I")
	public int method3137() {
		return this.anInt3919;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method3138() {
		@Pc(11) Class3_Sub4_Sub5 local11 = (Class3_Sub4_Sub5) this.aClass11_25.method313();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method3898();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class3_Sub4_Sub5 local23 = local11;
			local11 = (Class3_Sub4_Sub5) this.aClass11_25.method316();
			local23.method5977();
			local23.method5949();
			this.anInt3919 += local11.anInt5084;
		}
		return null;
	}

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method3139() {
		@Pc(20) Class3_Sub4_Sub5 local20 = (Class3_Sub4_Sub5) this.aClass11_25.method316();
		while (local20 != null) {
			@Pc(26) Object local26 = local20.method3898();
			if (local26 != null) {
				return local26;
			}
			@Pc(30) Class3_Sub4_Sub5 local30 = local20;
			local20 = (Class3_Sub4_Sub5) this.aClass11_25.method316();
			local30.method5977();
			local30.method5949();
			this.anInt3919 += local20.anInt5084;
		}
		return null;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI)V")
	public void method3140(@OriginalArg(1) int arg0) {
		if (Static241.aClass51_1 == null) {
			return;
		}
		for (@Pc(15) Class3_Sub4_Sub5 local15 = (Class3_Sub4_Sub5) this.aClass244_6.method5240(); local15 != null; local15 = (Class3_Sub4_Sub5) this.aClass244_6.method5232()) {
			if (local15.method3899()) {
				if (local15.method3898() == null) {
					local15.method5977();
					local15.method5949();
					this.anInt3919++;
				}
			} else if ((long) arg0 < ++local15.aLong233) {
				@Pc(53) Class3_Sub4_Sub5 local53 = Static241.aClass51_1.method1381(local15);
				this.aClass11_25.method319(local53, local15.aLong234);
				Static183.method3166(local15, local53);
				local15.method5977();
				local15.method5949();
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method3141(@OriginalArg(1) long arg0) {
		@Pc(14) Class3_Sub4_Sub5 local14 = (Class3_Sub4_Sub5) this.aClass11_25.method324(arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Object local22 = local14.method3898();
		if (local22 == null) {
			local14.method5977();
			local14.method5949();
			this.anInt3919 += local14.anInt5084;
			return null;
		}
		if (local14.method3899()) {
			@Pc(63) Class3_Sub4_Sub5_Sub2 local63 = new Class3_Sub4_Sub5_Sub2(local22, local14.anInt5084);
			this.aClass11_25.method319(local63, local14.aLong234);
			this.aClass244_6.method5234(local63);
			local63.aLong233 = 0L;
			local14.method5977();
			local14.method5949();
		} else {
			this.aClass244_6.method5234(local14);
			local14.aLong233 = 0L;
		}
		return local22;
	}

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)I")
	public int method3142() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) Class3_Sub4_Sub5 local11 = (Class3_Sub4_Sub5) this.aClass244_6.method5240(); local11 != null; local11 = (Class3_Sub4_Sub5) this.aClass244_6.method5232()) {
			if (!local11.method3899()) {
				local5++;
			}
		}
		return local5;
	}
}
