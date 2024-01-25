import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!cba;")
	private final Class38 aClass38_1;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "Lclient!sl;")
	private final Class310 aClass310_1;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
	private final int anInt259;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
	public Class10(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(II)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass38_1 = new Class38();
		this.anInt259 = arg0;
		this.anInt254 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass310_1 = new Class310(local14);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method250(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub3_Sub1 local10 = (Class3_Sub3_Sub1) this.aClass310_1.method6601(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method3880();
		if (local18 == null) {
			local10.method7812();
			local10.method7720();
			this.anInt254 += local10.anInt4381;
			return null;
		}
		if (local10.method3877()) {
			@Pc(64) Class3_Sub3_Sub1_Sub1 local64 = new Class3_Sub3_Sub1_Sub1(local18, local10.anInt4381);
			this.aClass310_1.method6603(local64, local10.aLong273);
			this.aClass38_1.method1069(local64);
			local64.aLong265 = 0L;
			local10.method7812();
			local10.method7720();
		} else {
			this.aClass38_1.method1069(local10);
			local10.aLong265 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)I")
	public int method251() {
		return this.anInt259;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)I")
	public int method252() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class3_Sub3_Sub1 local19 = (Class3_Sub3_Sub1) this.aClass38_1.method1070(); local19 != null; local19 = (Class3_Sub3_Sub1) this.aClass38_1.method1072()) {
			if (!local19.method3877()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)I")
	public int method253() {
		return this.anInt254;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method254(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method259(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!uk;)V")
	private void method255(@OriginalArg(1) Class3_Sub3_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method7812();
			arg0.method7720();
			this.anInt254 += arg0.anInt4381;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method256() {
		@Pc(11) Class3_Sub3_Sub1 local11 = (Class3_Sub3_Sub1) this.aClass310_1.method6602();
		while (local11 != null) {
			@Pc(25) Object local25 = local11.method3880();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class3_Sub3_Sub1 local31 = local11;
			local11 = (Class3_Sub3_Sub1) this.aClass310_1.method6599();
			local31.method7812();
			local31.method7720();
			this.anInt254 += local31.anInt4381;
		}
		return null;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method257() {
		@Pc(11) Class3_Sub3_Sub1 local11 = (Class3_Sub3_Sub1) this.aClass310_1.method6599();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method3880();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class3_Sub3_Sub1 local23 = local11;
			local11 = (Class3_Sub3_Sub1) this.aClass310_1.method6599();
			local23.method7812();
			local23.method7720();
			this.anInt254 += local23.anInt4381;
		}
		return null;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V")
	public void method258(@OriginalArg(0) int arg0) {
		if (Static554.aClass27_1 == null) {
			return;
		}
		for (@Pc(13) Class3_Sub3_Sub1 local13 = (Class3_Sub3_Sub1) this.aClass38_1.method1070(); local13 != null; local13 = (Class3_Sub3_Sub1) this.aClass38_1.method1072()) {
			if (local13.method3877()) {
				if (local13.method3880() == null) {
					local13.method7812();
					local13.method7720();
					this.anInt254++;
				}
			} else if (++local13.aLong265 > (long) arg0) {
				@Pc(39) Class3_Sub3_Sub1 local39 = Static554.aClass27_1.method4808(local13);
				this.aClass310_1.method6603(local39, local13.aLong273);
				Static217.method3781(local39, local13);
				local13.method7812();
				local13.method7720();
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BJLjava/lang/Object;I)V")
	public void method259(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2) {
		if (this.anInt259 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method261(arg0);
		this.anInt254 -= arg2;
		while (this.anInt254 < 0) {
			@Pc(38) Class3_Sub3_Sub1 local38 = (Class3_Sub3_Sub1) this.aClass38_1.method1073();
			this.method255(local38);
		}
		@Pc(54) Class3_Sub3_Sub1_Sub1 local54 = new Class3_Sub3_Sub1_Sub1(arg1, arg2);
		this.aClass310_1.method6603(local54, arg0);
		this.aClass38_1.method1069(local54);
		local54.aLong265 = 0L;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BJ)V")
	private void method261(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub3_Sub1 local10 = (Class3_Sub3_Sub1) this.aClass310_1.method6601(arg0);
		this.method255(local10);
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)V")
	public void method262() {
		for (@Pc(13) Class3_Sub3_Sub1 local13 = (Class3_Sub3_Sub1) this.aClass38_1.method1070(); local13 != null; local13 = (Class3_Sub3_Sub1) this.aClass38_1.method1072()) {
			if (local13.method3877()) {
				local13.method7812();
				local13.method7720();
				this.anInt254 += local13.anInt4381;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
	public void method263() {
		this.aClass38_1.method1067();
		this.aClass310_1.method6605();
		this.anInt254 = this.anInt259;
	}
}
