import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class98 {

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "Lclient!s;")
	public static final Class210 aClass210_6 = new Class210(13, 7);

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "[I")
	public static final int[] anIntArray167 = new int[32];

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "Lclient!wc;")
	private final Class246 aClass246_2 = new Class246();

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
	private int anInt2605;

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
	private final int anInt2616;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "Lclient!ad;")
	private final Class4 aClass4_56;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(I)V", line = 546)
	public Class98(@OriginalArg(0) int arg0) {
		this.anInt2605 = arg0;
		this.anInt2616 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass4_56 = new Class4(local14);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 8)
	public Object method2614(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub2_Sub6 local10 = (Class2_Sub2_Sub6) this.aClass4_56.method90(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(25) Object local25 = local10.method5952();
		if (local25 == null) {
			local10.method6469();
			local10.method6144();
			this.anInt2605 += local10.anInt6623;
			return null;
		}
		if (local10.method5955()) {
			@Pc(53) Class2_Sub2_Sub6_Sub2 local53 = new Class2_Sub2_Sub6_Sub2(local25, local10.anInt6623);
			this.aClass4_56.method87(local53, local10.aLong232);
			this.aClass246_2.method6342(local53);
			local53.aLong215 = 0L;
			local10.method6469();
			local10.method6144();
		} else {
			this.aClass246_2.method6342(local10);
			local10.aLong215 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)I", line = 51)
	public int method2615() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class2_Sub2_Sub6 local18 = (Class2_Sub2_Sub6) this.aClass246_2.method6338(); local18 != null; local18 = (Class2_Sub2_Sub6) this.aClass246_2.method6337()) {
			if (!local18.method5955()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V", line = 82)
	public void method2616() {
		this.aClass246_2.method6343();
		this.aClass4_56.method81();
		this.anInt2605 = this.anInt2616;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V", line = 95)
	public void method2617(@OriginalArg(0) int arg0) {
		if (Class2_Sub32.aClass93_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub2_Sub6 local9 = (Class2_Sub2_Sub6) this.aClass246_2.method6338(); local9 != null; local9 = (Class2_Sub2_Sub6) this.aClass246_2.method6337()) {
			if (local9.method5955()) {
				if (local9.method5952() == null) {
					local9.method6469();
					local9.method6144();
					this.anInt2605++;
				}
			} else if (++local9.aLong215 > (long) arg0) {
				@Pc(35) Class2_Sub2_Sub6 local35 = Class2_Sub32.aClass93_1.method3696(local9);
				this.aClass4_56.method87(local35, local9.aLong232);
				Static136.method2698(local9, local35);
				local9.method6469();
				local9.method6144();
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)I", line = 145)
	public int method2618() {
		return this.anInt2605;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILjava/lang/Object;J)V", line = 156)
	private void method2619(@OriginalArg(2) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt2616 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2628(arg1);
		this.anInt2605--;
		while (this.anInt2605 < 0) {
			@Pc(36) Class2_Sub2_Sub6 local36 = (Class2_Sub2_Sub6) this.aClass246_2.method6340();
			this.method2627(local36);
		}
		@Pc(49) Class2_Sub2_Sub6_Sub2 local49 = new Class2_Sub2_Sub6_Sub2(arg0, 1);
		this.aClass4_56.method87(local49, arg1);
		this.aClass246_2.method6342(local49);
		local49.aLong215 = 0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 182)
	public Object method2620() {
		@Pc(17) Class2_Sub2_Sub6 local17 = (Class2_Sub2_Sub6) this.aClass4_56.method79();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method5952();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class2_Sub2_Sub6 local27 = local17;
			local17 = (Class2_Sub2_Sub6) this.aClass4_56.method79();
			local27.method6469();
			local27.method6144();
			this.anInt2605 += local17.anInt6623;
		}
		return null;
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 214)
	public Object method2621() {
		@Pc(11) Class2_Sub2_Sub6 local11 = (Class2_Sub2_Sub6) this.aClass4_56.method80();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method5952();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class2_Sub2_Sub6 local23 = local11;
			local11 = (Class2_Sub2_Sub6) this.aClass4_56.method79();
			local23.method6469();
			local23.method6144();
			this.anInt2605 += local11.anInt6623;
		}
		return null;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)I", line = 246)
	public int method2622() {
		return this.anInt2616;
	}

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)V", line = 261)
	public void method2623() {
		for (@Pc(14) Class2_Sub2_Sub6 local14 = (Class2_Sub2_Sub6) this.aClass246_2.method6338(); local14 != null; local14 = (Class2_Sub2_Sub6) this.aClass246_2.method6337()) {
			if (local14.method5955()) {
				local14.method6469();
				local14.method6144();
				this.anInt2605 += local14.anInt6623;
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 466)
	public void method2626(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method2619(arg1, arg0);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZLclient!eu;)V", line = 482)
	private void method2627(@OriginalArg(1) Class2_Sub2_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method6469();
			arg0.method6144();
			this.anInt2605 += arg0.anInt6623;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(JI)V", line = 501)
	private void method2628(@OriginalArg(0) long arg0) {
		@Pc(14) Class2_Sub2_Sub6 local14 = (Class2_Sub2_Sub6) this.aClass4_56.method90(arg0);
		this.method2627(local14);
	}
}
