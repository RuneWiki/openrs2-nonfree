import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class154 {

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "Lclient!ot;")
	private final Class174 aClass174_12 = new Class174();

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
	private final int anInt4117;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
	private int anInt4114;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Lclient!sq;")
	private final Class214 aClass214_25;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(I)V")
	public Class154(@OriginalArg(0) int arg0) {
		this.anInt4117 = arg0;
		this.anInt4114 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass214_25 = new Class214(local14);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IJ)V")
	private void method3743(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub1_Sub5 local10 = (Class2_Sub1_Sub5) this.aClass214_25.method5059(arg0);
		this.method3749(local10);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)I")
	public int method3744() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class2_Sub1_Sub5 local18 = (Class2_Sub1_Sub5) this.aClass174_12.method4102(); local18 != null; local18 = (Class2_Sub1_Sub5) this.aClass174_12.method4098()) {
			if (!local18.method1594()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method3745(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method3754(arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
	public void method3746() {
		for (@Pc(11) Class2_Sub1_Sub5 local11 = (Class2_Sub1_Sub5) this.aClass174_12.method4102(); local11 != null; local11 = (Class2_Sub1_Sub5) this.aClass174_12.method4098()) {
			if (local11.method1594()) {
				local11.method5745();
				local11.method5748();
				this.anInt4114 += local11.anInt1770;
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)I")
	public int method3747() {
		return this.anInt4114;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public void method3748() {
		this.aClass174_12.method4101();
		this.aClass214_25.method5068();
		this.anInt4114 = this.anInt4117;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!uf;)V")
	private void method3749(@OriginalArg(1) Class2_Sub1_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method5745();
			arg0.method5748();
			this.anInt4114 += arg0.anInt1770;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public Object method3751(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub1_Sub5 local10 = (Class2_Sub1_Sub5) this.aClass214_25.method5059(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method1597();
		if (local18 == null) {
			local10.method5745();
			local10.method5748();
			this.anInt4114 += local10.anInt1770;
			return null;
		}
		if (local10.method1594()) {
			@Pc(64) Class2_Sub1_Sub5_Sub2 local64 = new Class2_Sub1_Sub5_Sub2(local18, local10.anInt1770);
			this.aClass214_25.method5065(local10.aLong208, local64);
			this.aClass174_12.method4099(local64);
			local64.aLong209 = 0L;
			local10.method5745();
			local10.method5748();
		} else {
			this.aClass174_12.method4099(local10);
			local10.aLong209 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)I")
	public int method3753() {
		return this.anInt4117;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IJLjava/lang/Object;B)V")
	private void method3754(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt4117 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3743(arg0);
		this.anInt4114--;
		while (this.anInt4114 < 0) {
			@Pc(44) Class2_Sub1_Sub5 local44 = (Class2_Sub1_Sub5) this.aClass174_12.method4104();
			this.method3749(local44);
		}
		@Pc(57) Class2_Sub1_Sub5_Sub2 local57 = new Class2_Sub1_Sub5_Sub2(arg1, 1);
		this.aClass214_25.method5065(arg0, local57);
		this.aClass174_12.method4099(local57);
		local57.aLong209 = 0L;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method3756() {
		@Pc(17) Class2_Sub1_Sub5 local17 = (Class2_Sub1_Sub5) this.aClass214_25.method5060();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method1597();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class2_Sub1_Sub5 local29 = local17;
			local17 = (Class2_Sub1_Sub5) this.aClass214_25.method5064();
			local29.method5745();
			local29.method5748();
			this.anInt4114 += local17.anInt1770;
		}
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ)V")
	public void method3758(@OriginalArg(0) int arg0) {
		if (Static359.aClass30_1 == null) {
			return;
		}
		for (@Pc(13) Class2_Sub1_Sub5 local13 = (Class2_Sub1_Sub5) this.aClass174_12.method4102(); local13 != null; local13 = (Class2_Sub1_Sub5) this.aClass174_12.method4098()) {
			if (local13.method1594()) {
				if (local13.method1597() == null) {
					local13.method5745();
					local13.method5748();
					this.anInt4114++;
				}
			} else if ((long) arg0 < ++local13.aLong209) {
				@Pc(57) Class2_Sub1_Sub5 local57 = Static359.aClass30_1.method5233(local13);
				this.aClass214_25.method5065(local13.aLong208, local57);
				Static38.method830(local57, local13);
				local13.method5745();
				local13.method5748();
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public Object method3759() {
		@Pc(11) Class2_Sub1_Sub5 local11 = (Class2_Sub1_Sub5) this.aClass214_25.method5064();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method1597();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class2_Sub1_Sub5 local23 = local11;
			local11 = (Class2_Sub1_Sub5) this.aClass214_25.method5064();
			local23.method5745();
			local23.method5748();
			this.anInt4114 += local11.anInt1770;
		}
		return null;
	}
}
