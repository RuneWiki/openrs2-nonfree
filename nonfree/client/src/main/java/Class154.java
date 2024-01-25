import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class154 {

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!rh;")
	private final Class178 aClass178_8 = new Class178();

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
	private final int anInt5102;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	private int anInt5106;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!uc;")
	private final Class198 aClass198_29;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
	public Class154(@OriginalArg(0) int arg0) {
		this.anInt5102 = arg0;
		this.anInt5106 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass198_29 = new Class198(local14);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method4211() {
		@Pc(19) Class4_Sub1_Sub7 local19 = (Class4_Sub1_Sub7) this.aClass198_29.method5268();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method5510();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class4_Sub1_Sub7 local29 = local19;
			local19 = (Class4_Sub1_Sub7) this.aClass198_29.method5263();
			local29.method5667();
			local29.method5555();
			this.anInt5106++;
		}
		return null;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	public void method4212() {
		for (@Pc(11) Class4_Sub1_Sub7 local11 = (Class4_Sub1_Sub7) this.aClass178_8.method4773(); local11 != null; local11 = (Class4_Sub1_Sub7) this.aClass178_8.method4771()) {
			if (local11.method5508()) {
				local11.method5667();
				local11.method5555();
				this.anInt5106++;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
	public int method4213() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class4_Sub1_Sub7 local18 = (Class4_Sub1_Sub7) this.aClass178_8.method4773(); local18 != null; local18 = (Class4_Sub1_Sub7) this.aClass178_8.method4771()) {
			if (!local18.method5508()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method4215() {
		@Pc(13) Class4_Sub1_Sub7 local13 = (Class4_Sub1_Sub7) this.aClass198_29.method5263();
		while (local13 != null) {
			@Pc(21) Object local21 = local13.method5510();
			if (local21 != null) {
				return local21;
			}
			@Pc(25) Class4_Sub1_Sub7 local25 = local13;
			local13 = (Class4_Sub1_Sub7) this.aClass198_29.method5263();
			local25.method5667();
			local25.method5555();
			this.anInt5106++;
		}
		return null;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(JI)V")
	private void method4216(@OriginalArg(0) long arg0) {
		@Pc(14) Class4_Sub1_Sub7 local14 = (Class4_Sub1_Sub7) this.aClass198_29.method5261(arg0);
		if (local14 != null) {
			local14.method5667();
			local14.method5555();
			this.anInt5106++;
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)I")
	public int method4217() {
		return this.anInt5106;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	public void method4219() {
		this.aClass178_8.method4765();
		this.aClass198_29.method5260();
		this.anInt5106 = this.anInt5102;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
	public void method4220(@OriginalArg(1) int arg0) {
		if (Static291.aClass101_1 == null) {
			return;
		}
		for (@Pc(9) Class4_Sub1_Sub7 local9 = (Class4_Sub1_Sub7) this.aClass178_8.method4773(); local9 != null; local9 = (Class4_Sub1_Sub7) this.aClass178_8.method4771()) {
			if (local9.method5508()) {
				if (local9.method5510() == null) {
					local9.method5667();
					local9.method5555();
					this.anInt5106++;
				}
			} else if ((long) arg0 < ++local9.aLong254) {
				@Pc(49) Class4_Sub1_Sub7 local49 = Static291.aClass101_1.method2747(local9);
				this.aClass198_29.method5267(local9.aLong259, local49);
				Static158.method3052(local49, local9);
				local9.method5667();
				local9.method5555();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BJLjava/lang/Object;)V")
	public void method4221(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method4216(arg0);
		if (this.anInt5106 == 0) {
			@Pc(16) Class4_Sub1_Sub7 local16 = (Class4_Sub1_Sub7) this.aClass178_8.method4772();
			local16.method5667();
			local16.method5555();
		} else {
			this.anInt5106--;
		}
		@Pc(35) Class4_Sub1_Sub7_Sub1 local35 = new Class4_Sub1_Sub7_Sub1(arg1);
		this.aClass198_29.method5267(arg0, local35);
		this.aClass178_8.method4767(local35);
		local35.aLong254 = 0L;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method4222(@OriginalArg(1) long arg0) {
		@Pc(10) Class4_Sub1_Sub7 local10 = (Class4_Sub1_Sub7) this.aClass198_29.method5261(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method5510();
		if (local18 == null) {
			local10.method5667();
			local10.method5555();
			this.anInt5106++;
			return null;
		}
		if (local10.method5508()) {
			@Pc(51) Class4_Sub1_Sub7_Sub1 local51 = new Class4_Sub1_Sub7_Sub1(local18);
			this.aClass198_29.method5267(local10.aLong259, local51);
			this.aClass178_8.method4767(local51);
			local51.aLong254 = 0L;
			local10.method5667();
			local10.method5555();
		} else {
			this.aClass178_8.method4767(local10);
			local10.aLong254 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)I")
	public int method4223() {
		return this.anInt5102;
	}
}
