import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class68 {

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "Lclient!tn;")
	private final Class229 aClass229_2 = new Class229();

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	private int anInt2034;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	private final int anInt2029;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Lclient!ib;")
	private final Class102 aClass102_10;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V")
	public Class68(@OriginalArg(0) int arg0) {
		this.anInt2034 = arg0;
		this.anInt2029 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass102_10 = new Class102(local14);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	public void method1777() {
		this.aClass229_2.method5087();
		this.aClass102_10.method2699();
		this.anInt2034 = this.anInt2029;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method1779(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method1790(arg1, arg0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I")
	public int method1781() {
		return this.anInt2034;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method1782() {
		@Pc(11) Class4_Sub1_Sub8 local11 = (Class4_Sub1_Sub8) this.aClass102_10.method2704();
		while (local11 != null) {
			@Pc(23) Object local23 = local11.method3885();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class4_Sub1_Sub8 local29 = local11;
			local11 = (Class4_Sub1_Sub8) this.aClass102_10.method2704();
			local29.method5684();
			local29.method4662();
			this.anInt2034 += local11.anInt5084;
		}
		return null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(JI)V")
	private void method1783(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub1_Sub8 local10 = (Class4_Sub1_Sub8) this.aClass102_10.method2700(arg0);
		this.method1792(local10);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)I")
	public int method1785() {
		return this.anInt2029;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)I")
	public int method1786() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class4_Sub1_Sub8 local13 = (Class4_Sub1_Sub8) this.aClass229_2.method5089(); local13 != null; local13 = (Class4_Sub1_Sub8) this.aClass229_2.method5092()) {
			if (!local13.method3883()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public Object method1787(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub1_Sub8 local10 = (Class4_Sub1_Sub8) this.aClass102_10.method2700(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method3885();
		if (local18 == null) {
			local10.method5684();
			local10.method4662();
			this.anInt2034 += local10.anInt5084;
			return null;
		}
		if (local10.method3883()) {
			@Pc(51) Class4_Sub1_Sub8_Sub1 local51 = new Class4_Sub1_Sub8_Sub1(local18, local10.anInt5084);
			this.aClass102_10.method2703(local10.aLong224, local51);
			this.aClass229_2.method5088(local51);
			local51.aLong198 = 0L;
			local10.method5684();
			local10.method4662();
		} else {
			this.aClass229_2.method5088(local10);
			local10.aLong198 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	public void method1788(@OriginalArg(0) int arg0) {
		if (Static293.aClass174_1 == null) {
			return;
		}
		for (@Pc(13) Class4_Sub1_Sub8 local13 = (Class4_Sub1_Sub8) this.aClass229_2.method5089(); local13 != null; local13 = (Class4_Sub1_Sub8) this.aClass229_2.method5092()) {
			if (local13.method3883()) {
				if (local13.method3885() == null) {
					local13.method5684();
					local13.method4662();
					this.anInt2034++;
				}
			} else if (++local13.aLong198 > (long) arg0) {
				@Pc(39) Class4_Sub1_Sub8 local39 = Static293.aClass174_1.method4040(local13);
				this.aClass102_10.method2703(local13.aLong224, local39);
				Static222.method3353(local13, local39);
				local13.method5684();
				local13.method4662();
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public Object method1789() {
		@Pc(16) Class4_Sub1_Sub8 local16 = (Class4_Sub1_Sub8) this.aClass102_10.method2705();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method3885();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class4_Sub1_Sub8 local26 = local16;
			local16 = (Class4_Sub1_Sub8) this.aClass102_10.method2704();
			local26.method5684();
			local26.method4662();
			this.anInt2034 += local16.anInt5084;
		}
		return null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/Object;IJI)V")
	private void method1790(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2029 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1783(arg1);
		this.anInt2034--;
		while (this.anInt2034 < 0) {
			@Pc(32) Class4_Sub1_Sub8 local32 = (Class4_Sub1_Sub8) this.aClass229_2.method5091();
			this.method1792(local32);
		}
		@Pc(45) Class4_Sub1_Sub8_Sub1 local45 = new Class4_Sub1_Sub8_Sub1(arg0, 1);
		this.aClass102_10.method2703(arg1, local45);
		this.aClass229_2.method5088(local45);
		local45.aLong198 = 0L;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public void method1791() {
		for (@Pc(7) Class4_Sub1_Sub8 local7 = (Class4_Sub1_Sub8) this.aClass229_2.method5089(); local7 != null; local7 = (Class4_Sub1_Sub8) this.aClass229_2.method5092()) {
			if (local7.method3883()) {
				local7.method5684();
				local7.method4662();
				this.anInt2034 += local7.anInt5084;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!fq;I)V")
	private void method1792(@OriginalArg(0) Class4_Sub1_Sub8 arg0) {
		if (arg0 != null) {
			arg0.method5684();
			arg0.method4662();
			this.anInt2034 += arg0.anInt5084;
		}
	}
}
