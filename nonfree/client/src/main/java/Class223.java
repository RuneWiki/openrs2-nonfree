import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class223 {

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
	private int anInt5843;

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
	private final int anInt5845;

	@OriginalMember(owner = "client!mga", name = "t", descriptor = "Lclient!jw;")
	private final Class183 aClass183_22;

	@OriginalMember(owner = "client!mga", name = "u", descriptor = "Lclient!rda;")
	private final Class286 aClass286_11;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(I)V")
	public Class223(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(II)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass286_11 = new Class286();
		this.anInt5843 = arg0;
		this.anInt5845 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && arg1 > local14; local14 += local14) {
		}
		this.aClass183_22 = new Class183(local14);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)I")
	public int method4929() {
		@Pc(7) int local7 = 0;
		for (@Pc(22) Class4_Sub7_Sub6 local22 = (Class4_Sub7_Sub6) this.aClass286_11.method6403(); local22 != null; local22 = (Class4_Sub7_Sub6) this.aClass286_11.method6414()) {
			if (!local22.method7124()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IJLjava/lang/Object;B)V")
	public void method4930(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Object arg2) {
		if (this.anInt5845 < arg0) {
			throw new IllegalStateException("s>cs");
		}
		this.method4940(arg1);
		this.anInt5843 -= arg0;
		while (this.anInt5843 < 0) {
			@Pc(44) Class4_Sub7_Sub6 local44 = (Class4_Sub7_Sub6) this.aClass286_11.method6405();
			this.method4939(local44);
		}
		@Pc(57) Class4_Sub7_Sub6_Sub1 local57 = new Class4_Sub7_Sub6_Sub1(arg2, arg0);
		this.aClass183_22.method4282(arg1, local57);
		this.aClass286_11.method6409(local57);
		local57.aLong303 = 0L;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method4931() {
		@Pc(18) Class4_Sub7_Sub6 local18 = (Class4_Sub7_Sub6) this.aClass183_22.method4286();
		while (local18 != null) {
			@Pc(26) Object local26 = local18.method7127();
			if (local26 != null) {
				return local26;
			}
			@Pc(30) Class4_Sub7_Sub6 local30 = local18;
			local18 = (Class4_Sub7_Sub6) this.aClass183_22.method4283();
			local30.method8013();
			local30.method7963();
			this.anInt5843 += local30.anInt8670;
		}
		return null;
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V")
	public void method4932() {
		this.aClass286_11.method6411();
		this.aClass183_22.method4287();
		this.anInt5843 = this.anInt5845;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(BI)V")
	public void method4933(@OriginalArg(1) int arg0) {
		if (Static183.aClass174_1 == null) {
			return;
		}
		for (@Pc(21) Class4_Sub7_Sub6 local21 = (Class4_Sub7_Sub6) this.aClass286_11.method6403(); local21 != null; local21 = (Class4_Sub7_Sub6) this.aClass286_11.method6414()) {
			if (local21.method7124()) {
				if (local21.method7127() == null) {
					local21.method8013();
					local21.method7963();
					this.anInt5843++;
				}
			} else if (++local21.aLong303 > (long) arg0) {
				@Pc(67) Class4_Sub7_Sub6 local67 = Static183.aClass174_1.method7142(local21);
				this.aClass183_22.method4282(local21.aLong307, local67);
				Static59.method864(local21, local67);
				local21.method8013();
				local21.method7963();
			}
		}
	}

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "(I)I")
	public int method4936() {
		return this.anInt5845;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)I")
	public int method4937() {
		return this.anInt5843;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method4938(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method4930(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!hba;I)V")
	private void method4939(@OriginalArg(0) Class4_Sub7_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method8013();
			arg0.method7963();
			this.anInt5843 += arg0.anInt8670;
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IJ)V")
	private void method4940(@OriginalArg(1) long arg0) {
		@Pc(10) Class4_Sub7_Sub6 local10 = (Class4_Sub7_Sub6) this.aClass183_22.method4289(arg0);
		this.method4939(local10);
	}

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "(I)V")
	public void method4941() {
		for (@Pc(14) Class4_Sub7_Sub6 local14 = (Class4_Sub7_Sub6) this.aClass286_11.method6403(); local14 != null; local14 = (Class4_Sub7_Sub6) this.aClass286_11.method6414()) {
			if (local14.method7124()) {
				local14.method8013();
				local14.method7963();
				this.anInt5843 += local14.anInt8670;
			}
		}
	}

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public Object method4942() {
		@Pc(11) Class4_Sub7_Sub6 local11 = (Class4_Sub7_Sub6) this.aClass183_22.method4283();
		while (local11 != null) {
			@Pc(20) Object local20 = local11.method7127();
			if (local20 != null) {
				return local20;
			}
			@Pc(24) Class4_Sub7_Sub6 local24 = local11;
			local11 = (Class4_Sub7_Sub6) this.aClass183_22.method4283();
			local24.method8013();
			local24.method7963();
			this.anInt5843 += local24.anInt8670;
		}
		return null;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
	public Object method4943(@OriginalArg(0) long arg0) {
		@Pc(16) Class4_Sub7_Sub6 local16 = (Class4_Sub7_Sub6) this.aClass183_22.method4289(arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(24) Object local24 = local16.method7127();
		if (local24 == null) {
			local16.method8013();
			local16.method7963();
			this.anInt5843 += local16.anInt8670;
			return null;
		}
		if (local16.method7124()) {
			@Pc(62) Class4_Sub7_Sub6_Sub1 local62 = new Class4_Sub7_Sub6_Sub1(local24, local16.anInt8670);
			this.aClass183_22.method4282(local16.aLong307, local62);
			this.aClass286_11.method6409(local62);
			local62.aLong303 = 0L;
			local16.method8013();
			local16.method7963();
		} else {
			this.aClass286_11.method6409(local16);
			local16.aLong303 = 0L;
		}
		return local24;
	}
}
