import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class179 {

	@OriginalMember(owner = "client!kga", name = "n", descriptor = "Lclient!th;")
	private final Class325 aClass325_3 = new Class325();

	@OriginalMember(owner = "client!kga", name = "o", descriptor = "I")
	private final int anInt4847;

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
	private int anInt4838;

	@OriginalMember(owner = "client!kga", name = "s", descriptor = "Lclient!wa;")
	private final Class354 aClass354_23;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(I)V")
	public Class179(@OriginalArg(0) int arg0) {
		this.anInt4847 = arg0;
		this.anInt4838 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass354_23 = new Class354(local16);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)V")
	public void method4170() {
		if (Static580.aClass276_1 == null) {
			return;
		}
		for (@Pc(19) Class3_Sub7_Sub4 local19 = (Class3_Sub7_Sub4) this.aClass325_3.method6859(); local19 != null; local19 = (Class3_Sub7_Sub4) this.aClass325_3.method6863()) {
			if (local19.method5853()) {
				if (local19.method5851() == null) {
					local19.method7825();
					local19.method7614();
					this.anInt4838 += local19.anInt6998;
				}
			} else if (++local19.aLong263 > (long) 5) {
				@Pc(60) Class3_Sub7_Sub4 local60 = Static580.aClass276_1.method6108(local19);
				this.aClass354_23.method7691(local60, local19.aLong273);
				Static185.method3151(local19, local60);
				local19.method7825();
				local19.method7614();
			}
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLclient!so;Ljava/lang/Object;)V")
	public void method4171(@OriginalArg(1) Interface18 arg0, @OriginalArg(2) Object arg1) {
		this.method4181(arg0, arg1);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)I")
	public int method4172() {
		return this.anInt4847;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!en;B)V")
	private void method4174(@OriginalArg(0) Class3_Sub7_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method7825();
			arg0.method7614();
			this.anInt4838 += arg0.anInt6998;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!so;B)V")
	private void method4175(@OriginalArg(0) Interface18 arg0) {
		@Pc(7) long local7 = arg0.method7300();
		for (@Pc(14) Class3_Sub7_Sub4 local14 = (Class3_Sub7_Sub4) this.aClass354_23.method7689(local7); local14 != null; local14 = (Class3_Sub7_Sub4) this.aClass354_23.method7693()) {
			if (local14.anInterface18_3.method7299(arg0)) {
				this.method4174(local14);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
	public void method4176() {
		this.aClass325_3.method6864();
		this.aClass354_23.method7687();
		this.anInt4838 = this.anInt4847;
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)V")
	public void method4177() {
		for (@Pc(17) Class3_Sub7_Sub4 local17 = (Class3_Sub7_Sub4) this.aClass325_3.method6859(); local17 != null; local17 = (Class3_Sub7_Sub4) this.aClass325_3.method6863()) {
			if (local17.method5853()) {
				local17.method7825();
				local17.method7614();
				this.anInt4838 += local17.anInt6998;
			}
		}
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(B)I")
	public int method4178() {
		return this.anInt4838;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILclient!so;)Ljava/lang/Object;")
	public Object method4179(@OriginalArg(1) Interface18 arg0) {
		@Pc(17) long local17 = arg0.method7300();
		for (@Pc(24) Class3_Sub7_Sub4 local24 = (Class3_Sub7_Sub4) this.aClass354_23.method7689(local17); local24 != null; local24 = (Class3_Sub7_Sub4) this.aClass354_23.method7693()) {
			if (local24.anInterface18_3.method7299(arg0)) {
				@Pc(38) Object local38 = local24.method5851();
				if (local38 != null) {
					if (local24.method5853()) {
						@Pc(69) Class3_Sub7_Sub4_Sub1 local69 = new Class3_Sub7_Sub4_Sub1(arg0, local38, local24.anInt6998);
						this.aClass354_23.method7691(local69, local24.aLong273);
						this.aClass325_3.method6862(local69);
						local69.aLong263 = 0L;
						local24.method7825();
						local24.method7614();
					} else {
						this.aClass325_3.method6862(local24);
						local24.aLong263 = 0L;
					}
					return local38;
				}
				local24.method7825();
				local24.method7614();
				this.anInt4838 += local24.anInt6998;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!so;ILjava/lang/Object;Z)V")
	private void method4181(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt4847 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4175(arg0);
		this.anInt4838--;
		while (this.anInt4838 < 0) {
			@Pc(32) Class3_Sub7_Sub4 local32 = (Class3_Sub7_Sub4) this.aClass325_3.method6860();
			this.method4174(local32);
		}
		@Pc(49) Class3_Sub7_Sub4_Sub1 local49 = new Class3_Sub7_Sub4_Sub1(arg0, arg1, 1);
		this.aClass354_23.method7691(local49, arg0.method7300());
		this.aClass325_3.method6862(local49);
		local49.aLong263 = 0L;
	}
}
