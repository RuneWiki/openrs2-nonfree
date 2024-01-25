import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class207 {

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "I")
	private final int anInt5327;

	@OriginalMember(owner = "client!lga", name = "g", descriptor = "I")
	private int anInt5328;

	@OriginalMember(owner = "client!lga", name = "p", descriptor = "Lclient!je;")
	private final Class170 aClass170_7;

	@OriginalMember(owner = "client!lga", name = "s", descriptor = "Lclient!faa;")
	private final Class91 aClass91_23;

	static {
		new Class84("", 73);
	}

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(I)V")
	public Class207(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(II)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass170_7 = new Class170();
		this.anInt5327 = arg0;
		this.anInt5328 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && arg1 > local14; local14 += local14) {
		}
		this.aClass91_23 = new Class91(local14);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method4384() {
		@Pc(17) Class1_Sub8_Sub14 local17 = (Class1_Sub8_Sub14) this.aClass91_23.method2276();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method7008();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class1_Sub8_Sub14 local29 = local17;
			local17 = (Class1_Sub8_Sub14) this.aClass91_23.method2276();
			local29.method7908();
			local29.method7712();
			this.anInt5328 += local29.anInt8693;
		}
		return null;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!rv;B)V")
	private void method4385(@OriginalArg(0) Class1_Sub8_Sub14 arg0) {
		if (arg0 != null) {
			arg0.method7908();
			arg0.method7712();
			this.anInt5328 += arg0.anInt8693;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(BJ)V")
	private void method4386(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub8_Sub14 local10 = (Class1_Sub8_Sub14) this.aClass91_23.method2271(arg0);
		this.method4385(local10);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(JILjava/lang/Object;I)V")
	public void method4387(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		if (arg1 > this.anInt5327) {
			throw new IllegalStateException("s>cs");
		}
		this.method4386(arg0);
		this.anInt5328 -= arg1;
		while (this.anInt5328 < 0) {
			@Pc(34) Class1_Sub8_Sub14 local34 = (Class1_Sub8_Sub14) this.aClass170_7.method3543();
			this.method4385(local34);
		}
		@Pc(50) Class1_Sub8_Sub14_Sub1 local50 = new Class1_Sub8_Sub14_Sub1(arg2, arg1);
		this.aClass91_23.method2269(arg0, local50);
		this.aClass170_7.method3550(local50);
		local50.aLong263 = 0;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)I")
	public int method4388() {
		return this.anInt5328;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)I")
	public int method4389() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub8_Sub14 local13 = (Class1_Sub8_Sub14) this.aClass170_7.method3553(); local13 != null; local13 = (Class1_Sub8_Sub14) this.aClass170_7.method3544()) {
			if (!local13.method7012()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method4390(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub8_Sub14 local10 = (Class1_Sub8_Sub14) this.aClass91_23.method2271(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(25) Object local25 = local10.method7008();
		if (local25 == null) {
			local10.method7908();
			local10.method7712();
			this.anInt5328 += local10.anInt8693;
			return null;
		}
		if (local10.method7012()) {
			@Pc(55) Class1_Sub8_Sub14_Sub1 local55 = new Class1_Sub8_Sub14_Sub1(local25, local10.anInt8693);
			this.aClass91_23.method2269(local10.aLong268, local55);
			this.aClass170_7.method3550(local55);
			local55.aLong263 = 0L;
			local10.method7908();
			local10.method7712();
		} else {
			this.aClass170_7.method3550(local10);
			local10.aLong263 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method4391(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method4387(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V")
	public void method4392() {
		this.aClass170_7.method3546();
		this.aClass91_23.method2275();
		this.anInt5328 = this.anInt5327;
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(B)I")
	public int method4393() {
		return this.anInt5327;
	}

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public Object method4396() {
		@Pc(13) Class1_Sub8_Sub14 local13 = (Class1_Sub8_Sub14) this.aClass91_23.method2278();
		while (local13 != null) {
			@Pc(19) Object local19 = local13.method7008();
			if (local19 != null) {
				return local19;
			}
			@Pc(25) Class1_Sub8_Sub14 local25 = local13;
			local13 = (Class1_Sub8_Sub14) this.aClass91_23.method2276();
			local25.method7908();
			local25.method7712();
			this.anInt5328 += local25.anInt8693;
		}
		return null;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IZ)V")
	public void method4397(@OriginalArg(0) int arg0) {
		if (Static17.aClass105_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub8_Sub14 local13 = (Class1_Sub8_Sub14) this.aClass170_7.method3553(); local13 != null; local13 = (Class1_Sub8_Sub14) this.aClass170_7.method3544()) {
			if (local13.method7012()) {
				if (local13.method7008() == null) {
					local13.method7908();
					local13.method7712();
					this.anInt5328++;
				}
			} else if ((long) arg0 < ++local13.aLong263) {
				@Pc(39) Class1_Sub8_Sub14 local39 = Static17.aClass105_1.method2477(local13);
				this.aClass91_23.method2269(local13.aLong268, local39);
				Static336.method5002(local13, local39);
				local13.method7908();
				local13.method7712();
			}
		}
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(I)V")
	public void method4398() {
		for (@Pc(15) Class1_Sub8_Sub14 local15 = (Class1_Sub8_Sub14) this.aClass170_7.method3553(); local15 != null; local15 = (Class1_Sub8_Sub14) this.aClass170_7.method3544()) {
			if (local15.method7012()) {
				local15.method7908();
				local15.method7712();
				this.anInt5328 += local15.anInt8693;
			}
		}
	}
}
