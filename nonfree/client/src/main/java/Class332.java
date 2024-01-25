import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class332 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Lclient!ifa;")
	private final Class144 aClass144_15;

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "Lclient!nj;")
	private final Class212 aClass212_37;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
	private int anInt9183;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
	private final int anInt9186;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I)V")
	public Class332(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(II)V")
	private Class332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass144_15 = new Class144();
		this.anInt9183 = arg0;
		this.anInt9186 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && local14 < arg1; local14 += local14) {
		}
		this.aClass212_37 = new Class212(local14);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	public void method7497(@OriginalArg(0) int arg0) {
		if (Static330.aClass154_2 == null) {
			return;
		}
		for (@Pc(17) Class6_Sub1_Sub4 local17 = (Class6_Sub1_Sub4) this.aClass144_15.method3116(); local17 != null; local17 = (Class6_Sub1_Sub4) this.aClass144_15.method3113()) {
			if (local17.method4029()) {
				if (local17.method4027() == null) {
					local17.method7849();
					local17.method7852();
					this.anInt9183++;
				}
			} else if (++local17.aLong250 > (long) arg0) {
				@Pc(59) Class6_Sub1_Sub4 local59 = Static330.aClass154_2.method3333(local17);
				this.aClass212_37.method5104(local17.aLong249, local59);
				Static491.method6777(local17, local59);
				local17.method7849();
				local17.method7852();
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(JZLjava/lang/Object;)V")
	public void method7498(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method7506(arg0, arg1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)I")
	public int method7499() {
		return this.anInt9186;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method7502(@OriginalArg(0) long arg0) {
		@Pc(17) Class6_Sub1_Sub4 local17 = (Class6_Sub1_Sub4) this.aClass212_37.method5106(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(25) Object local25 = local17.method4027();
		if (local25 == null) {
			local17.method7849();
			local17.method7852();
			this.anInt9183 += local17.anInt4674;
			return null;
		}
		if (local17.method4029()) {
			@Pc(63) Class6_Sub1_Sub4_Sub1 local63 = new Class6_Sub1_Sub4_Sub1(local25, local17.anInt4674);
			this.aClass212_37.method5104(local17.aLong249, local63);
			this.aClass144_15.method3114(local63);
			local63.aLong250 = 0L;
			local17.method7849();
			local17.method7852();
		} else {
			this.aClass144_15.method3114(local17);
			local17.aLong250 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!be;I)V")
	private void method7503(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method7849();
			arg0.method7852();
			this.anInt9183 += arg0.anInt4674;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method7504() {
		@Pc(16) Class6_Sub1_Sub4 local16 = (Class6_Sub1_Sub4) this.aClass212_37.method5103();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method4027();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class6_Sub1_Sub4 local28 = local16;
			local16 = (Class6_Sub1_Sub4) this.aClass212_37.method5103();
			local28.method7849();
			local28.method7852();
			this.anInt9183 += local28.anInt4674;
		}
		return null;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method7505() {
		@Pc(18) Class6_Sub1_Sub4 local18 = (Class6_Sub1_Sub4) this.aClass212_37.method5099();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method4027();
			if (local24 != null) {
				return local24;
			}
			@Pc(28) Class6_Sub1_Sub4 local28 = local18;
			local18 = (Class6_Sub1_Sub4) this.aClass212_37.method5103();
			local28.method7849();
			local28.method7852();
			this.anInt9183 += local28.anInt4674;
		}
		return null;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IJLjava/lang/Object;Z)V")
	public void method7506(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt9186 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7507(arg0);
		this.anInt9183--;
		while (this.anInt9183 < 0) {
			@Pc(39) Class6_Sub1_Sub4 local39 = (Class6_Sub1_Sub4) this.aClass144_15.method3115();
			this.method7503(local39);
		}
		@Pc(55) Class6_Sub1_Sub4_Sub1 local55 = new Class6_Sub1_Sub4_Sub1(arg1, 1);
		this.aClass212_37.method5104(arg0, local55);
		this.aClass144_15.method3114(local55);
		local55.aLong250 = 0L;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IJ)V")
	private void method7507(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub1_Sub4 local10 = (Class6_Sub1_Sub4) this.aClass212_37.method5106(arg0);
		this.method7503(local10);
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)I")
	public int method7508() {
		return this.anInt9183;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	public void method7510() {
		this.aClass144_15.method3112();
		this.aClass212_37.method5110();
		this.anInt9183 = this.anInt9186;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)I")
	public int method7511() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class6_Sub1_Sub4 local18 = (Class6_Sub1_Sub4) this.aClass144_15.method3116(); local18 != null; local18 = (Class6_Sub1_Sub4) this.aClass144_15.method3113()) {
			if (!local18.method4029()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V")
	public void method7512() {
		for (@Pc(11) Class6_Sub1_Sub4 local11 = (Class6_Sub1_Sub4) this.aClass144_15.method3116(); local11 != null; local11 = (Class6_Sub1_Sub4) this.aClass144_15.method3113()) {
			if (local11.method4029()) {
				local11.method7849();
				local11.method7852();
				this.anInt9183 += local11.anInt4674;
			}
		}
	}
}
