import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class102 {

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "Lclient!so;")
	private final Class225 aClass225_3 = new Class225();

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	private int anInt2604;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
	private final int anInt2605;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "Lclient!qh;")
	private final Class199 aClass199_83;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(I)V")
	public Class102(@OriginalArg(0) int arg0) {
		this.anInt2604 = arg0;
		this.anInt2605 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass199_83 = new Class199(local14);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!pt;)V")
	private void method2256(@OriginalArg(1) Class1_Sub5_Sub8 arg0) {
		if (arg0 != null) {
			arg0.method5915();
			arg0.method5305();
			this.anInt2604 += arg0.anInt3594;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method2258(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub5_Sub8 local10 = (Class1_Sub5_Sub8) this.aClass199_83.method4387(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(24) Object local24 = local10.method2923();
		if (local24 == null) {
			local10.method5915();
			local10.method5305();
			this.anInt2604 += local10.anInt3594;
			return null;
		}
		if (local10.method2924()) {
			@Pc(54) Class1_Sub5_Sub8_Sub1 local54 = new Class1_Sub5_Sub8_Sub1(local24, local10.anInt3594);
			this.aClass199_83.method4383(local10.aLong230, local54);
			this.aClass225_3.method4943(local54);
			local54.aLong211 = 0L;
			local10.method5915();
			local10.method5305();
		} else {
			this.aClass225_3.method4943(local10);
			local10.aLong211 = 0L;
		}
		return local24;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(IJ)V")
	private void method2259(@OriginalArg(1) long arg0) {
		@Pc(16) Class1_Sub5_Sub8 local16 = (Class1_Sub5_Sub8) this.aClass199_83.method4387(arg0);
		this.method2256(local16);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public void method2260() {
		for (@Pc(12) Class1_Sub5_Sub8 local12 = (Class1_Sub5_Sub8) this.aClass225_3.method4942(); local12 != null; local12 = (Class1_Sub5_Sub8) this.aClass225_3.method4937()) {
			if (local12.method2924()) {
				local12.method5915();
				local12.method5305();
				this.anInt2604 += local12.anInt3594;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(JILjava/lang/Object;I)V")
	private void method2261(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt2605 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2259(arg0);
		this.anInt2604--;
		while (this.anInt2604 < 0) {
			@Pc(32) Class1_Sub5_Sub8 local32 = (Class1_Sub5_Sub8) this.aClass225_3.method4939();
			this.method2256(local32);
		}
		@Pc(48) Class1_Sub5_Sub8_Sub1 local48 = new Class1_Sub5_Sub8_Sub1(arg1, 1);
		this.aClass199_83.method4383(arg0, local48);
		this.aClass225_3.method4943(local48);
		local48.aLong211 = 0L;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V")
	public void method2262(@OriginalArg(0) int arg0) {
		if (Static351.aClass60_1 == null) {
			return;
		}
		for (@Pc(17) Class1_Sub5_Sub8 local17 = (Class1_Sub5_Sub8) this.aClass225_3.method4942(); local17 != null; local17 = (Class1_Sub5_Sub8) this.aClass225_3.method4937()) {
			if (local17.method2924()) {
				if (local17.method2923() == null) {
					local17.method5915();
					local17.method5305();
					this.anInt2604++;
				}
			} else if ((long) arg0 < ++local17.aLong211) {
				@Pc(43) Class1_Sub5_Sub8 local43 = Static351.aClass60_1.method1322(local17);
				this.aClass199_83.method4383(local17.aLong230, local43);
				Static134.method2065(local17, local43);
				local17.method5915();
				local17.method5305();
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)I")
	public int method2264() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub5_Sub8 local13 = (Class1_Sub5_Sub8) this.aClass225_3.method4942(); local13 != null; local13 = (Class1_Sub5_Sub8) this.aClass225_3.method4937()) {
			if (!local13.method2924()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)I")
	public int method2265() {
		return this.anInt2604;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)I")
	public int method2266() {
		return this.anInt2605;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method2269() {
		@Pc(17) Class1_Sub5_Sub8 local17 = (Class1_Sub5_Sub8) this.aClass199_83.method4392();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method2923();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class1_Sub5_Sub8 local29 = local17;
			local17 = (Class1_Sub5_Sub8) this.aClass199_83.method4393();
			local29.method5915();
			local29.method5305();
			this.anInt2604 += local17.anInt3594;
		}
		return null;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
	public void method2271() {
		this.aClass225_3.method4938();
		this.aClass199_83.method4385();
		this.anInt2604 = this.anInt2605;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method2272(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method2261(arg0, arg1);
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method2273() {
		@Pc(19) Class1_Sub5_Sub8 local19 = (Class1_Sub5_Sub8) this.aClass199_83.method4393();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method2923();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class1_Sub5_Sub8 local31 = local19;
			local19 = (Class1_Sub5_Sub8) this.aClass199_83.method4393();
			local31.method5915();
			local31.method5305();
			this.anInt2604 += local19.anInt3594;
		}
		return null;
	}
}
