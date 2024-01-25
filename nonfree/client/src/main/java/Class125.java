import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class125 {

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Lclient!st;")
	private final Class280 aClass280_6 = new Class280();

	@OriginalMember(owner = "client!h", name = "l", descriptor = "I")
	private int anInt3927;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "I")
	private final int anInt3921;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "Lclient!dea;")
	private final Class68 aClass68_26;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I)V")
	public Class125(@OriginalArg(0) int arg0) {
		this.anInt3927 = arg0;
		this.anInt3921 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass68_26 = new Class68(local14);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(JI)V")
	private void method3432(@OriginalArg(0) long arg0) {
		@Pc(17) Class12_Sub4_Sub11 local17 = (Class12_Sub4_Sub11) this.aClass68_26.method1917(arg0);
		this.method3434(local17);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
	public int method3433() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class12_Sub4_Sub11 local15 = (Class12_Sub4_Sub11) this.aClass280_6.method6892(); local15 != null; local15 = (Class12_Sub4_Sub11) this.aClass280_6.method6895()) {
			if (!local15.method7117()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!ks;)V")
	private void method3434(@OriginalArg(1) Class12_Sub4_Sub11 arg0) {
		if (arg0 != null) {
			arg0.method7967();
			arg0.method7959();
			this.anInt3927 += arg0.anInt8655;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)I")
	public int method3435() {
		return this.anInt3921;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)I")
	public int method3436() {
		return this.anInt3927;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method3437(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method3439(arg1, arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BJILjava/lang/Object;)V")
	private void method3439(@OriginalArg(1) long arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt3921 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3432(arg0);
		this.anInt3927--;
		while (this.anInt3927 < 0) {
			@Pc(32) Class12_Sub4_Sub11 local32 = (Class12_Sub4_Sub11) this.aClass280_6.method6888();
			this.method3434(local32);
		}
		@Pc(51) Class12_Sub4_Sub11_Sub2 local51 = new Class12_Sub4_Sub11_Sub2(arg1, 1);
		this.aClass68_26.method1916(local51, arg0);
		this.aClass280_6.method6894(local51);
		local51.aLong247 = 0L;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public void method3440() {
		this.aClass280_6.method6896();
		this.aClass68_26.method1922();
		this.anInt3927 = this.anInt3921;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method3441() {
		@Pc(11) Class12_Sub4_Sub11 local11 = (Class12_Sub4_Sub11) this.aClass68_26.method1920();
		while (local11 != null) {
			@Pc(22) Object local22 = local11.method7120();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class12_Sub4_Sub11 local26 = local11;
			local11 = (Class12_Sub4_Sub11) this.aClass68_26.method1920();
			local26.method7967();
			local26.method7959();
			this.anInt3927 += local11.anInt8655;
		}
		return null;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	public void method3442() {
		for (@Pc(7) Class12_Sub4_Sub11 local7 = (Class12_Sub4_Sub11) this.aClass280_6.method6892(); local7 != null; local7 = (Class12_Sub4_Sub11) this.aClass280_6.method6895()) {
			if (local7.method7117()) {
				local7.method7967();
				local7.method7959();
				this.anInt3927 += local7.anInt8655;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method3443() {
		@Pc(18) Class12_Sub4_Sub11 local18 = (Class12_Sub4_Sub11) this.aClass68_26.method1923();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method7120();
			if (local24 != null) {
				return local24;
			}
			@Pc(28) Class12_Sub4_Sub11 local28 = local18;
			local18 = (Class12_Sub4_Sub11) this.aClass68_26.method1920();
			local28.method7967();
			local28.method7959();
			this.anInt3927 += local18.anInt8655;
		}
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public Object method3446(@OriginalArg(0) long arg0) {
		@Pc(10) Class12_Sub4_Sub11 local10 = (Class12_Sub4_Sub11) this.aClass68_26.method1917(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method7120();
		if (local18 == null) {
			local10.method7967();
			local10.method7959();
			this.anInt3927 += local10.anInt8655;
			return null;
		}
		if (local10.method7117()) {
			@Pc(64) Class12_Sub4_Sub11_Sub2 local64 = new Class12_Sub4_Sub11_Sub2(local18, local10.anInt8655);
			this.aClass68_26.method1916(local64, local10.aLong248);
			this.aClass280_6.method6894(local64);
			local64.aLong247 = 0L;
			local10.method7967();
			local10.method7959();
		} else {
			this.aClass280_6.method6894(local10);
			local10.aLong247 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
	public void method3447(@OriginalArg(0) int arg0) {
		if (Static223.aClass143_3 == null) {
			return;
		}
		for (@Pc(17) Class12_Sub4_Sub11 local17 = (Class12_Sub4_Sub11) this.aClass280_6.method6892(); local17 != null; local17 = (Class12_Sub4_Sub11) this.aClass280_6.method6895()) {
			if (local17.method7117()) {
				if (local17.method7120() == null) {
					local17.method7967();
					local17.method7959();
					this.anInt3927++;
				}
			} else if (++local17.aLong247 > (long) arg0) {
				@Pc(39) Class12_Sub4_Sub11 local39 = Static223.aClass143_3.method3827(local17);
				this.aClass68_26.method1916(local39, local17.aLong248);
				Static512.method7599(local39, local17);
				local17.method7967();
				local17.method7959();
			}
		}
	}
}
