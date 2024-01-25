import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class11 {

	@OriginalMember(owner = "client!al", name = "o", descriptor = "Lclient!er;")
	private final Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "I")
	private final int anInt203;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "Lclient!bn;")
	private final Class25 aClass25_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
	public Class11(@OriginalArg(0) int arg0) {
		this.anInt196 = arg0;
		this.anInt203 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass25_1 = new Class25(local14);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method209(@OriginalArg(1) long arg0) {
		@Pc(10) Class14_Sub2_Sub9 local10 = (Class14_Sub2_Sub9) this.aClass25_1.method691(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method4168();
		if (local18 == null) {
			local10.method5986();
			local10.method5760();
			this.anInt196++;
			return null;
		}
		if (local10.method4169()) {
			@Pc(57) Class14_Sub2_Sub9_Sub2 local57 = new Class14_Sub2_Sub9_Sub2(local18);
			this.aClass25_1.method687(local10.aLong217, local57);
			this.aClass56_1.method1922(local57);
			local57.aLong208 = 0L;
			local10.method5986();
			local10.method5760();
		} else {
			this.aClass56_1.method1922(local10);
			local10.aLong208 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method210() {
		@Pc(11) Class14_Sub2_Sub9 local11 = (Class14_Sub2_Sub9) this.aClass25_1.method694();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method4168();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class14_Sub2_Sub9 local23 = local11;
			local11 = (Class14_Sub2_Sub9) this.aClass25_1.method694();
			local23.method5986();
			local23.method5760();
			this.anInt196++;
		}
		return null;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZJ)V")
	private void method211(@OriginalArg(1) long arg0) {
		@Pc(10) Class14_Sub2_Sub9 local10 = (Class14_Sub2_Sub9) this.aClass25_1.method691(arg0);
		if (local10 != null) {
			local10.method5986();
			local10.method5760();
			this.anInt196++;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method212() {
		@Pc(9) Class14_Sub2_Sub9 local9 = (Class14_Sub2_Sub9) this.aClass25_1.method697();
		while (local9 != null) {
			@Pc(18) Object local18 = local9.method4168();
			if (local18 != null) {
				return local18;
			}
			@Pc(24) Class14_Sub2_Sub9 local24 = local9;
			local9 = (Class14_Sub2_Sub9) this.aClass25_1.method694();
			local24.method5986();
			local24.method5760();
			this.anInt196++;
		}
		return null;
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V")
	public void method213() {
		this.aClass56_1.method1916();
		this.aClass25_1.method685();
		this.anInt196 = this.anInt203;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
	public void method214() {
		for (@Pc(11) Class14_Sub2_Sub9 local11 = (Class14_Sub2_Sub9) this.aClass56_1.method1923(); local11 != null; local11 = (Class14_Sub2_Sub9) this.aClass56_1.method1920()) {
			if (local11.method4169()) {
				local11.method5986();
				local11.method5760();
				this.anInt196++;
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V")
	public void method215(@OriginalArg(0) int arg0) {
		if (Static1.aClass103_2 == null) {
			return;
		}
		for (@Pc(13) Class14_Sub2_Sub9 local13 = (Class14_Sub2_Sub9) this.aClass56_1.method1923(); local13 != null; local13 = (Class14_Sub2_Sub9) this.aClass56_1.method1920()) {
			if (local13.method4169()) {
				if (local13.method4168() == null) {
					local13.method5986();
					local13.method5760();
					this.anInt196++;
				}
			} else if ((long) arg0 < ++local13.aLong208) {
				@Pc(57) Class14_Sub2_Sub9 local57 = Static1.aClass103_2.method2946(local13);
				this.aClass25_1.method687(local13.aLong217, local57);
				Static272.method4613(local57, local13);
				local13.method5986();
				local13.method5760();
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)I")
	public int method216() {
		return this.anInt196;
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(B)I")
	public int method217() {
		return this.anInt203;
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(I)I")
	public int method218() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class14_Sub2_Sub9 local13 = (Class14_Sub2_Sub9) this.aClass56_1.method1923(); local13 != null; local13 = (Class14_Sub2_Sub9) this.aClass56_1.method1920()) {
			if (!local13.method4169()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method219(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method211(arg0);
		if (this.anInt196 == 0) {
			@Pc(24) Class14_Sub2_Sub9 local24 = (Class14_Sub2_Sub9) this.aClass56_1.method1917();
			local24.method5986();
			local24.method5760();
		} else {
			this.anInt196--;
		}
		@Pc(42) Class14_Sub2_Sub9_Sub2 local42 = new Class14_Sub2_Sub9_Sub2(arg1);
		this.aClass25_1.method687(arg0, local42);
		this.aClass56_1.method1922(local42);
		local42.aLong208 = 0L;
	}
}
