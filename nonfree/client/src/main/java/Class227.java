import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class227 {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "Lclient!oa;")
	private final Class170 aClass170_9 = new Class170();

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	private final int anInt5650;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
	private int anInt5642;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "Lclient!fa;")
	private final Class77 aClass77_35;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V")
	public Class227(@OriginalArg(0) int arg0) {
		this.anInt5650 = arg0;
		this.anInt5642 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass77_35 = new Class77(local14);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)I")
	public int method4856() {
		return this.anInt5650;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)I")
	public int method4857() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub6_Sub3 local13 = (Class1_Sub6_Sub3) this.aClass170_9.method3685(); local13 != null; local13 = (Class1_Sub6_Sub3) this.aClass170_9.method3688()) {
			if (!local13.method2160()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public void method4858() {
		for (@Pc(19) Class1_Sub6_Sub3 local19 = (Class1_Sub6_Sub3) this.aClass170_9.method3685(); local19 != null; local19 = (Class1_Sub6_Sub3) this.aClass170_9.method3688()) {
			if (local19.method2160()) {
				local19.method5577();
				local19.method5580();
				this.anInt5642 += local19.anInt2655;
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V")
	public void method4859(@OriginalArg(1) int arg0) {
		if (Static258.aClass62_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub6_Sub3 local13 = (Class1_Sub6_Sub3) this.aClass170_9.method3685(); local13 != null; local13 = (Class1_Sub6_Sub3) this.aClass170_9.method3688()) {
			if (local13.method2160()) {
				if (local13.method2161() == null) {
					local13.method5577();
					local13.method5580();
					this.anInt5642++;
				}
			} else if ((long) arg0 < ++local13.aLong208) {
				@Pc(39) Class1_Sub6_Sub3 local39 = Static258.aClass62_1.method4872(local13);
				this.aClass77_35.method1370(local13.aLong207, local39);
				Static158.method2158(local13, local39);
				local13.method5577();
				local13.method5580();
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
	public int method4860() {
		return this.anInt5642;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method4862() {
		@Pc(11) Class1_Sub6_Sub3 local11 = (Class1_Sub6_Sub3) this.aClass77_35.method1359();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method2161();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class1_Sub6_Sub3 local21 = local11;
			local11 = (Class1_Sub6_Sub3) this.aClass77_35.method1360();
			local21.method5577();
			local21.method5580();
			this.anInt5642 += local11.anInt2655;
		}
		return null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method4863(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub6_Sub3 local10 = (Class1_Sub6_Sub3) this.aClass77_35.method1368(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method2161();
		if (local18 == null) {
			local10.method5577();
			local10.method5580();
			this.anInt5642 += local10.anInt2655;
			return null;
		}
		if (local10.method2160()) {
			@Pc(51) Class1_Sub6_Sub3_Sub2 local51 = new Class1_Sub6_Sub3_Sub2(local18, local10.anInt2655);
			this.aClass77_35.method1370(local10.aLong207, local51);
			this.aClass170_9.method3690(local51);
			local51.aLong208 = 0L;
			local10.method5577();
			local10.method5580();
		} else {
			this.aClass170_9.method3690(local10);
			local10.aLong208 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/Object;JI)V")
	private void method4864(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		if (this.anInt5650 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4866(arg1);
		this.anInt5642--;
		while (this.anInt5642 < 0) {
			@Pc(36) Class1_Sub6_Sub3 local36 = (Class1_Sub6_Sub3) this.aClass170_9.method3684();
			this.method4867(local36);
		}
		@Pc(49) Class1_Sub6_Sub3_Sub2 local49 = new Class1_Sub6_Sub3_Sub2(arg0, 1);
		this.aClass77_35.method1370(arg1, local49);
		this.aClass170_9.method3690(local49);
		local49.aLong208 = 0L;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public void method4865(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method4864(arg0, arg1);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(JI)V")
	private void method4866(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub6_Sub3 local10 = (Class1_Sub6_Sub3) this.aClass77_35.method1368(arg0);
		this.method4867(local10);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!in;I)V")
	private void method4867(@OriginalArg(0) Class1_Sub6_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method5577();
			arg0.method5580();
			this.anInt5642 += arg0.anInt2655;
		}
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method4869() {
		@Pc(15) Class1_Sub6_Sub3 local15 = (Class1_Sub6_Sub3) this.aClass77_35.method1360();
		while (local15 != null) {
			@Pc(21) Object local21 = local15.method2161();
			if (local21 != null) {
				return local21;
			}
			@Pc(27) Class1_Sub6_Sub3 local27 = local15;
			local15 = (Class1_Sub6_Sub3) this.aClass77_35.method1360();
			local27.method5577();
			local27.method5580();
			this.anInt5642 += local15.anInt2655;
		}
		return null;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
	public void method4871() {
		this.aClass170_9.method3686();
		this.aClass77_35.method1362();
		this.anInt5642 = this.anInt5650;
	}
}
