import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tja")
public final class Class352 {

	@OriginalMember(owner = "client!tja", name = "e", descriptor = "Lclient!ut;")
	private final Class367 aClass367_12;

	@OriginalMember(owner = "client!tja", name = "i", descriptor = "I")
	private int anInt8972;

	@OriginalMember(owner = "client!tja", name = "q", descriptor = "I")
	private final int anInt8979;

	@OriginalMember(owner = "client!tja", name = "r", descriptor = "Lclient!dj;")
	private final Class66 aClass66_40;

	@OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(I)V")
	public Class352(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(II)V")
	public Class352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass367_12 = new Class367();
		this.anInt8979 = arg0;
		this.anInt8972 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass66_40 = new Class66(local14);
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method7651() {
		@Pc(18) Class4_Sub5_Sub5 local18 = (Class4_Sub5_Sub5) this.aClass66_40.method1984();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method8998();
			if (local24 != null) {
				return local24;
			}
			@Pc(30) Class4_Sub5_Sub5 local30 = local18;
			local18 = (Class4_Sub5_Sub5) this.aClass66_40.method1984();
			local30.method9000();
			local30.method8990();
			this.anInt8972 += local30.anInt10631;
		}
		return null;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(Ljava/lang/Object;IIJ)V")
	public void method7652(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		if (this.anInt8979 < arg1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7662(arg2);
		this.anInt8972 -= arg1;
		while (this.anInt8972 < 0) {
			@Pc(40) Class4_Sub5_Sub5 local40 = (Class4_Sub5_Sub5) this.aClass367_12.method8311();
			this.method7664(local40);
		}
		@Pc(53) Class4_Sub5_Sub5_Sub1 local53 = new Class4_Sub5_Sub5_Sub1(arg0, arg1);
		this.aClass66_40.method1985(local53, arg2);
		this.aClass367_12.method8310(local53);
		local53.aLong306 = 0L;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method7653(@OriginalArg(0) long arg0) {
		@Pc(20) Class4_Sub5_Sub5 local20 = (Class4_Sub5_Sub5) this.aClass66_40.method1994(arg0);
		if (local20 == null) {
			return null;
		}
		@Pc(28) Object local28 = local20.method8998();
		if (local28 == null) {
			local20.method9000();
			local20.method8990();
			this.anInt8972 += local20.anInt10631;
			return null;
		}
		if (local20.method8996()) {
			@Pc(68) Class4_Sub5_Sub5_Sub1 local68 = new Class4_Sub5_Sub5_Sub1(local28, local20.anInt10631);
			this.aClass66_40.method1985(local68, local20.aLong307);
			this.aClass367_12.method8310(local68);
			local68.aLong306 = 0L;
			local20.method9000();
			local20.method8990();
		} else {
			this.aClass367_12.method8310(local20);
			local20.aLong306 = 0L;
		}
		return local28;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(B)I")
	public int method7654() {
		return this.anInt8972;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method7655(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method7652(arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!tja", name = "b", descriptor = "(B)V")
	public void method7656() {
		for (@Pc(11) Class4_Sub5_Sub5 local11 = (Class4_Sub5_Sub5) this.aClass367_12.method8308(); local11 != null; local11 = (Class4_Sub5_Sub5) this.aClass367_12.method8309()) {
			if (local11.method8996()) {
				local11.method9000();
				local11.method8990();
				this.anInt8972 += local11.anInt10631;
			}
		}
	}

	@OriginalMember(owner = "client!tja", name = "c", descriptor = "(I)I")
	public int method7658() {
		return this.anInt8979;
	}

	@OriginalMember(owner = "client!tja", name = "d", descriptor = "(I)V")
	public void method7659() {
		this.aClass367_12.method8305();
		this.aClass66_40.method1988();
		this.anInt8972 = this.anInt8979;
	}

	@OriginalMember(owner = "client!tja", name = "c", descriptor = "(B)I")
	public int method7660() {
		@Pc(12) int local12 = 0;
		for (@Pc(18) Class4_Sub5_Sub5 local18 = (Class4_Sub5_Sub5) this.aClass367_12.method8308(); local18 != null; local18 = (Class4_Sub5_Sub5) this.aClass367_12.method8309()) {
			if (!local18.method8996()) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!tja", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method7661() {
		@Pc(16) Class4_Sub5_Sub5 local16 = (Class4_Sub5_Sub5) this.aClass66_40.method1992();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method8998();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class4_Sub5_Sub5 local26 = local16;
			local16 = (Class4_Sub5_Sub5) this.aClass66_40.method1984();
			local26.method9000();
			local26.method8990();
			this.anInt8972 += local26.anInt10631;
		}
		return null;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(JB)V")
	private void method7662(@OriginalArg(0) long arg0) {
		@Pc(17) Class4_Sub5_Sub5 local17 = (Class4_Sub5_Sub5) this.aClass66_40.method1994(arg0);
		this.method7664(local17);
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(II)V")
	public void method7663(@OriginalArg(0) int arg0) {
		if (Static653.aClass270_1 == null) {
			return;
		}
		for (@Pc(9) Class4_Sub5_Sub5 local9 = (Class4_Sub5_Sub5) this.aClass367_12.method8308(); local9 != null; local9 = (Class4_Sub5_Sub5) this.aClass367_12.method8309()) {
			if (local9.method8996()) {
				if (local9.method8998() == null) {
					local9.method9000();
					local9.method8990();
					this.anInt8972 += local9.anInt10631;
				}
			} else if ((long) arg0 < ++local9.aLong306) {
				@Pc(50) Class4_Sub5_Sub5 local50 = Static653.aClass270_1.method6562(local9);
				this.aClass66_40.method1985(local50, local9.aLong307);
				Static515.method6981(local9, local50);
				local9.method9000();
				local9.method8990();
			}
		}
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(Lclient!le;I)V")
	private void method7664(@OriginalArg(0) Class4_Sub5_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method9000();
			arg0.method8990();
			this.anInt8972 += arg0.anInt10631;
		}
	}
}
