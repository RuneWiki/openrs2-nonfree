import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class391 {

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
	private int anInt10776;

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "Lclient!gq;")
	private final Class149 aClass149_13;

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "Lclient!qha;")
	private Class291 aClass291_45;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
	private final int anInt10788;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
	public Class391(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(II)V")
	public Class391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass149_13 = new Class149();
		this.anInt10788 = arg0;
		this.anInt10776 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass291_45 = new Class291(local14);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method9273(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		this.method9282(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)V")
	public void method9274(@OriginalArg(0) int arg0) {
		if (Static130.aClass250_1 == null) {
			return;
		}
		for (@Pc(17) Class5_Sub5_Sub8 local17 = (Class5_Sub5_Sub8) this.aClass149_13.method2890(); local17 != null; local17 = (Class5_Sub5_Sub8) this.aClass149_13.method2894()) {
			if (local17.method4378()) {
				if (local17.method4379() == null) {
					local17.method9327(1);
					local17.method9186();
					this.anInt10776 += local17.anInt5137;
				}
			} else if ((long) arg0 < ++local17.aLong312) {
				@Pc(47) Class5_Sub5_Sub8 local47 = Static130.aClass250_1.method5815(local17);
				this.aClass291_45.method6984(local17.aLong314, local47);
				Static206.method2964(local17, local47);
				local17.method9327(1);
				local17.method9186();
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method9275(@OriginalArg(1) long arg0) {
		@Pc(10) Class5_Sub5_Sub8 local10 = (Class5_Sub5_Sub8) this.aClass291_45.method6993(arg0, 1);
		if (local10 == null) {
			return null;
		}
		@Pc(27) Object local27 = local10.method4379();
		if (local27 == null) {
			local10.method9327(1);
			local10.method9186();
			this.anInt10776 += local10.anInt5137;
			return null;
		}
		if (local10.method4378()) {
			@Pc(58) Class5_Sub5_Sub8_Sub1 local58 = new Class5_Sub5_Sub8_Sub1(local27, local10.anInt5137);
			this.aClass291_45.method6984(local10.aLong314, local58);
			this.aClass149_13.method2889(local58);
			local58.aLong312 = 0L;
			local10.method9327(1);
			local10.method9186();
		} else {
			this.aClass149_13.method2889(local10);
			local10.aLong312 = 0L;
		}
		return local27;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public void method9276(@OriginalArg(0) int arg0) {
		this.aClass149_13.method2891();
		if (arg0 == 0) {
			this.aClass291_45.method6986(-110);
			this.anInt10776 = this.anInt10788;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method9277() {
		@Pc(21) Class5_Sub5_Sub8 local21 = (Class5_Sub5_Sub8) this.aClass291_45.method6987();
		while (local21 != null) {
			@Pc(27) Object local27 = local21.method4379();
			if (local27 != null) {
				return local27;
			}
			@Pc(34) Class5_Sub5_Sub8 local34 = local21;
			local21 = (Class5_Sub5_Sub8) this.aClass291_45.method6989();
			local34.method9327(1);
			local34.method9186();
			this.anInt10776 += local34.anInt5137;
		}
		return null;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(B)I")
	public int method9279() {
		return this.anInt10788;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(Z)I")
	public int method9281() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class5_Sub5_Sub8 local13 = (Class5_Sub5_Sub8) this.aClass149_13.method2890(); local13 != null; local13 = (Class5_Sub5_Sub8) this.aClass149_13.method2894()) {
			if (!local13.method4378()) {
				local7++;
			}
		}
		if (false) {
			this.aClass291_45 = null;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/Object;JIB)V")
	public void method9282(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt10788) {
			throw new IllegalStateException("s>cs");
		}
		this.method9283(arg1);
		this.anInt10776 -= arg2;
		while (this.anInt10776 < 0) {
			@Pc(35) Class5_Sub5_Sub8 local35 = (Class5_Sub5_Sub8) this.aClass149_13.method2886();
			this.method9285(local35);
		}
		@Pc(55) Class5_Sub5_Sub8_Sub1 local55 = new Class5_Sub5_Sub8_Sub1(arg0, arg2);
		this.aClass291_45.method6984(arg1, local55);
		this.aClass149_13.method2889(local55);
		local55.aLong312 = 0L;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(JZ)V")
	private void method9283(@OriginalArg(0) long arg0) {
		@Pc(17) Class5_Sub5_Sub8 local17 = (Class5_Sub5_Sub8) this.aClass291_45.method6993(arg0, 1);
		this.method9285(local17);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)I")
	public int method9284() {
		return this.anInt10776;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!js;I)V")
	private void method9285(@OriginalArg(0) Class5_Sub5_Sub8 arg0) {
		if (arg0 != null) {
			arg0.method9327(1);
			arg0.method9186();
			this.anInt10776 += arg0.anInt5137;
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
	public void method9286() {
		for (@Pc(18) Class5_Sub5_Sub8 local18 = (Class5_Sub5_Sub8) this.aClass149_13.method2890(); local18 != null; local18 = (Class5_Sub5_Sub8) this.aClass149_13.method2894()) {
			if (local18.method4378()) {
				local18.method9327(1);
				local18.method9186();
				this.anInt10776 += local18.anInt5137;
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method9287() {
		@Pc(17) Class5_Sub5_Sub8 local17 = (Class5_Sub5_Sub8) this.aClass291_45.method6989();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method4379();
			if (local23 != null) {
				return local23;
			}
			@Pc(30) Class5_Sub5_Sub8 local30 = local17;
			local17 = (Class5_Sub5_Sub8) this.aClass291_45.method6989();
			local30.method9327(1);
			local30.method9186();
			this.anInt10776 += local30.anInt5137;
		}
		return null;
	}
}
