import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class165 {

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "Lclient!dha;")
	private final Class74 aClass74_5;

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
	private final int anInt4746;

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
	private int anInt4750;

	@OriginalMember(owner = "client!jda", name = "n", descriptor = "Lclient!ee;")
	private final Class83 aClass83_12;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(I)V")
	public Class165(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(II)V")
	public Class165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass74_5 = new Class74();
		this.anInt4746 = arg0;
		this.anInt4750 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass83_12 = new Class83(local14);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method4389(@OriginalArg(1) long arg0) {
		@Pc(12) Class3_Sub11_Sub7 local12 = (Class3_Sub11_Sub7) this.aClass83_12.method2368(arg0);
		if (local12 == null) {
			return null;
		}
		@Pc(20) Object local20 = local12.method4483();
		if (local20 == null) {
			local12.method9380();
			local12.method9345();
			this.anInt4750 += local12.anInt4843;
			return null;
		}
		if (local12.method4486()) {
			@Pc(48) Class3_Sub11_Sub7_Sub1 local48 = new Class3_Sub11_Sub7_Sub1(local20, local12.anInt4843);
			this.aClass83_12.method2377(local12.aLong311, local48);
			this.aClass74_5.method1840(local48);
			local48.aLong310 = 0L;
			local12.method9380();
			local12.method9345();
		} else {
			this.aClass74_5.method1840(local12);
			local12.aLong310 = 0L;
		}
		return local20;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method4391() {
		@Pc(15) Class3_Sub11_Sub7 local15 = (Class3_Sub11_Sub7) this.aClass83_12.method2370();
		while (local15 != null) {
			@Pc(21) Object local21 = local15.method4483();
			if (local21 != null) {
				return local21;
			}
			@Pc(25) Class3_Sub11_Sub7 local25 = local15;
			local15 = (Class3_Sub11_Sub7) this.aClass83_12.method2370();
			local25.method9380();
			local25.method9345();
			this.anInt4750 += local25.anInt4843;
		}
		return null;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZLjava/lang/Object;J)V")
	public void method4392(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method4396(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!rb;Z)V")
	private void method4393(@OriginalArg(0) Class3_Sub11_Sub7 arg0) {
		if (arg0 != null) {
			arg0.method9380();
			arg0.method9345();
			this.anInt4750 += arg0.anInt4843;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IB)V")
	public void method4394(@OriginalArg(0) int arg0) {
		if (Static470.aClass132_1 == null) {
			return;
		}
		for (@Pc(7) Class3_Sub11_Sub7 local7 = (Class3_Sub11_Sub7) this.aClass74_5.method1842(); local7 != null; local7 = (Class3_Sub11_Sub7) this.aClass74_5.method1844()) {
			if (local7.method4486()) {
				if (local7.method4483() == null) {
					local7.method9380();
					local7.method9345();
					this.anInt4750 += local7.anInt4843;
				}
			} else if (++local7.aLong310 > (long) arg0) {
				@Pc(32) Class3_Sub11_Sub7 local32 = Static470.aClass132_1.method3786(local7);
				this.aClass83_12.method2377(local7.aLong311, local32);
				Static384.method5495(local7, local32);
				local7.method9380();
				local7.method9345();
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)I")
	public int method4395() {
		return this.anInt4750;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILjava/lang/Object;JI)V")
	public void method4396(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (this.anInt4746 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method4398(arg1);
		this.anInt4750 -= arg2;
		while (this.anInt4750 < 0) {
			@Pc(35) Class3_Sub11_Sub7 local35 = (Class3_Sub11_Sub7) this.aClass74_5.method1843();
			this.method4393(local35);
		}
		@Pc(48) Class3_Sub11_Sub7_Sub1 local48 = new Class3_Sub11_Sub7_Sub1(arg0, arg2);
		this.aClass83_12.method2377(arg1, local48);
		this.aClass74_5.method1840(local48);
		local48.aLong310 = (long) 0;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(IJ)V")
	private void method4398(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub11_Sub7 local10 = (Class3_Sub11_Sub7) this.aClass83_12.method2368(arg0);
		this.method4393(local10);
	}

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)I")
	public int method4399() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) Class3_Sub11_Sub7 local11 = (Class3_Sub11_Sub7) this.aClass74_5.method1842(); local11 != null; local11 = (Class3_Sub11_Sub7) this.aClass74_5.method1844()) {
			if (!local11.method4486()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "(I)V")
	public void method4400() {
		for (@Pc(19) Class3_Sub11_Sub7 local19 = (Class3_Sub11_Sub7) this.aClass74_5.method1842(); local19 != null; local19 = (Class3_Sub11_Sub7) this.aClass74_5.method1844()) {
			if (local19.method4486()) {
				local19.method9380();
				local19.method9345();
				this.anInt4750 += local19.anInt4843;
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "(I)I")
	public int method4401() {
		return this.anInt4746;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method4402() {
		@Pc(16) Class3_Sub11_Sub7 local16 = (Class3_Sub11_Sub7) this.aClass83_12.method2375();
		while (local16 != null) {
			@Pc(21) Object local21 = local16.method4483();
			if (local21 != null) {
				return local21;
			}
			@Pc(25) Class3_Sub11_Sub7 local25 = local16;
			local16 = (Class3_Sub11_Sub7) this.aClass83_12.method2370();
			local25.method9380();
			local25.method9345();
			this.anInt4750 += local25.anInt4843;
		}
		return null;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V")
	public void method4403() {
		this.aClass74_5.method1845();
		this.aClass83_12.method2374();
		this.anInt4750 = this.anInt4746;
	}
}
