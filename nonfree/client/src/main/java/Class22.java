import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class22 {

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
	private int anInt469;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
	private final int anInt477;

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "Lclient!pf;")
	private final Class279 aClass279_1;

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "Lclient!si;")
	private final Class335 aClass335_4;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(I)V")
	public Class22(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(II)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass279_1 = new Class279();
		this.anInt469 = arg0;
		this.anInt477 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass335_4 = new Class335(local14);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
	public void method461() {
		this.aClass279_1.method7297();
		this.aClass335_4.method8353();
		this.anInt469 = this.anInt477;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public Object method462(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub1_Sub15 local15 = (Class2_Sub1_Sub15) this.aClass335_4.method8357(arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(23) Object local23 = local15.method7148();
		if (local23 == null) {
			local15.method9825();
			local15.method9377();
			this.anInt469 += local15.anInt7993;
			return null;
		}
		if (local15.method7150()) {
			@Pc(51) Class2_Sub1_Sub15_Sub2 local51 = new Class2_Sub1_Sub15_Sub2(local23, local15.anInt7993);
			this.aClass335_4.method8356(local51, local15.aLong313);
			this.aClass279_1.method7292(local51);
			local51.aLong296 = 0L;
			local15.method9825();
			local15.method9377();
		} else {
			this.aClass279_1.method7292(local15);
			local15.aLong296 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)I")
	public int method464() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class2_Sub1_Sub15 local15 = (Class2_Sub1_Sub15) this.aClass279_1.method7293(); local15 != null; local15 = (Class2_Sub1_Sub15) this.aClass279_1.method7298()) {
			if (!local15.method7150()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLclient!vfa;)V")
	private void method465(@OriginalArg(1) Class2_Sub1_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method9825();
			arg0.method9377();
			this.anInt469 += arg0.anInt7993;
		}
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method467() {
		@Pc(19) Class2_Sub1_Sub15 local19 = (Class2_Sub1_Sub15) this.aClass335_4.method8358();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method7148();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class2_Sub1_Sub15 local29 = local19;
			local19 = (Class2_Sub1_Sub15) this.aClass335_4.method8355();
			local29.method9825();
			local29.method9377();
			this.anInt469 += local29.anInt7993;
		}
		return null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	public void method468(@OriginalArg(0) int arg0) {
		if (Static187.aClass185_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub1_Sub15 local9 = (Class2_Sub1_Sub15) this.aClass279_1.method7293(); local9 != null; local9 = (Class2_Sub1_Sub15) this.aClass279_1.method7298()) {
			if (local9.method7150()) {
				if (local9.method7148() == null) {
					local9.method9825();
					local9.method9377();
					this.anInt469 += local9.anInt7993;
				}
			} else if (++local9.aLong296 > (long) arg0) {
				@Pc(54) Class2_Sub1_Sub15 local54 = Static187.aClass185_1.method6713(local9);
				this.aClass335_4.method8356(local54, local9.aLong313);
				Static343.method5735(local9, local54);
				local9.method9825();
				local9.method9377();
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)I")
	public int method469() {
		return this.anInt477;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method470(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method471(arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILjava/lang/Object;IJ)V")
	public void method471(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (this.anInt477 < arg1) {
			throw new IllegalStateException("s>cs");
		}
		this.method476(arg2);
		this.anInt469 -= arg1;
		while (this.anInt469 < 0) {
			@Pc(33) Class2_Sub1_Sub15 local33 = (Class2_Sub1_Sub15) this.aClass279_1.method7291();
			this.method465(local33);
		}
		@Pc(54) Class2_Sub1_Sub15_Sub2 local54 = new Class2_Sub1_Sub15_Sub2(arg0, arg1);
		this.aClass335_4.method8356(local54, arg2);
		this.aClass279_1.method7292(local54);
		local54.aLong296 = 0L;
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)I")
	public int method472() {
		return this.anInt469;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V")
	public void method473() {
		for (@Pc(5) Class2_Sub1_Sub15 local5 = (Class2_Sub1_Sub15) this.aClass279_1.method7293(); local5 != null; local5 = (Class2_Sub1_Sub15) this.aClass279_1.method7298()) {
			if (local5.method7150()) {
				local5.method9825();
				local5.method9377();
				this.anInt469 += local5.anInt7993;
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method475() {
		@Pc(16) Class2_Sub1_Sub15 local16 = (Class2_Sub1_Sub15) this.aClass335_4.method8355();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method7148();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class2_Sub1_Sub15 local28 = local16;
			local16 = (Class2_Sub1_Sub15) this.aClass335_4.method8355();
			local28.method9825();
			local28.method9377();
			this.anInt469 += local28.anInt7993;
		}
		return null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(JZ)V")
	private void method476(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub1_Sub15 local10 = (Class2_Sub1_Sub15) this.aClass335_4.method8357(arg0);
		this.method465(local10);
	}
}
