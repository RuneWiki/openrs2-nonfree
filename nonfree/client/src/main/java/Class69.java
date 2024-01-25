import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class69 {

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	private int anInt2273;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Lclient!qk;")
	private final Class290 aClass290_2;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Lclient!tba;")
	private final Class323 aClass323_10;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	private final int anInt2288;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(I)V")
	public Class69(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(II)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass290_2 = new Class290();
		this.anInt2288 = arg0;
		this.anInt2273 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass323_10 = new Class323(local14);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public void method1904() {
		for (@Pc(5) Class2_Sub7_Sub15 local5 = (Class2_Sub7_Sub15) this.aClass290_2.method6680(); local5 != null; local5 = (Class2_Sub7_Sub15) this.aClass290_2.method6673()) {
			if (local5.method7543()) {
				local5.method8920();
				local5.method8504();
				this.anInt2273 += local5.anInt8800;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V")
	public void method1905() {
		this.aClass290_2.method6675();
		this.aClass323_10.method7485();
		this.anInt2273 = this.anInt2288;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/Object;ZJ)V")
	public void method1906(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) long arg2) {
		if (arg0 > this.anInt2288) {
			throw new IllegalStateException("s>cs");
		}
		this.method1912(arg2);
		this.anInt2273 -= arg0;
		while (this.anInt2273 < 0) {
			@Pc(29) Class2_Sub7_Sub15 local29 = (Class2_Sub7_Sub15) this.aClass290_2.method6676();
			this.method1916(local29);
		}
		@Pc(50) Class2_Sub7_Sub15_Sub1 local50 = new Class2_Sub7_Sub15_Sub1(arg1, arg0);
		this.aClass323_10.method7477(local50, arg2);
		this.aClass290_2.method6678(local50);
		local50.aLong260 = 0L;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)I")
	public int method1907() {
		return this.anInt2273;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method1908() {
		@Pc(11) Class2_Sub7_Sub15 local11 = (Class2_Sub7_Sub15) this.aClass323_10.method7480();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method7544();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class2_Sub7_Sub15 local23 = local11;
			local11 = (Class2_Sub7_Sub15) this.aClass323_10.method7482();
			local23.method8920();
			local23.method8504();
			this.anInt2273 += local23.anInt8800;
		}
		return null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
	public void method1910(@OriginalArg(0) int arg0) {
		if (Static63.aClass313_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub7_Sub15 local9 = (Class2_Sub7_Sub15) this.aClass290_2.method6680(); local9 != null; local9 = (Class2_Sub7_Sub15) this.aClass290_2.method6673()) {
			if (local9.method7543()) {
				if (local9.method7544() == null) {
					local9.method8920();
					local9.method8504();
					this.anInt2273 += local9.anInt8800;
				}
			} else if (++local9.aLong260 > (long) arg0) {
				@Pc(35) Class2_Sub7_Sub15 local35 = Static63.aClass313_1.method7249(local9);
				this.aClass323_10.method7477(local35, local9.aLong278);
				Static562.method7871(local9, local35);
				local9.method8920();
				local9.method8504();
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(B)I")
	public int method1911() {
		return this.anInt2288;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)V")
	private void method1912(@OriginalArg(1) long arg0) {
		@Pc(14) Class2_Sub7_Sub15 local14 = (Class2_Sub7_Sub15) this.aClass323_10.method7484(arg0);
		this.method1916(local14);
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(B)I")
	public int method1913() {
		@Pc(10) int local10 = 0;
		for (@Pc(18) Class2_Sub7_Sub15 local18 = (Class2_Sub7_Sub15) this.aClass290_2.method6680(); local18 != null; local18 = (Class2_Sub7_Sub15) this.aClass290_2.method6673()) {
			if (!local18.method7543()) {
				local10++;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method1914() {
		@Pc(9) Class2_Sub7_Sub15 local9 = (Class2_Sub7_Sub15) this.aClass323_10.method7482();
		while (local9 != null) {
			@Pc(14) Object local14 = local9.method7544();
			if (local14 != null) {
				return local14;
			}
			@Pc(20) Class2_Sub7_Sub15 local20 = local9;
			local9 = (Class2_Sub7_Sub15) this.aClass323_10.method7482();
			local20.method8920();
			local20.method8504();
			this.anInt2273 += local20.anInt8800;
		}
		return null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!qc;)V")
	private void method1916(@OriginalArg(1) Class2_Sub7_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method8920();
			arg0.method8504();
			this.anInt2273 += arg0.anInt8800;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BJLjava/lang/Object;)V")
	public void method1917(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method1906(1, arg1, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method1919(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub7_Sub15 local10 = (Class2_Sub7_Sub15) this.aClass323_10.method7484(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(24) Object local24 = local10.method7544();
		if (local24 == null) {
			local10.method8920();
			local10.method8504();
			this.anInt2273 += local10.anInt8800;
			return null;
		}
		if (local10.method7543()) {
			@Pc(54) Class2_Sub7_Sub15_Sub1 local54 = new Class2_Sub7_Sub15_Sub1(local24, local10.anInt8800);
			this.aClass323_10.method7477(local54, local10.aLong278);
			this.aClass290_2.method6678(local54);
			local54.aLong260 = 0L;
			local10.method8920();
			local10.method8504();
		} else {
			this.aClass290_2.method6678(local10);
			local10.aLong260 = 0L;
		}
		return local24;
	}
}
