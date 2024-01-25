import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class338 {

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Lclient!pda;")
	private final Class283 aClass283_13;

	@OriginalMember(owner = "client!si", name = "m", descriptor = "I")
	private int anInt9549;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	private final int anInt9553;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "Lclient!gn;")
	private final Class136 aClass136_42;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
	public Class338(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(II)V")
	public Class338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass283_13 = new Class283();
		this.anInt9553 = arg0;
		this.anInt9549 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass136_42 = new Class136(local14);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)I")
	public int method8042() {
		return this.anInt9549;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method8043() {
		@Pc(19) Class3_Sub4_Sub4 local19 = (Class3_Sub4_Sub4) this.aClass136_42.method3506();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method2341();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class3_Sub4_Sub4 local29 = local19;
			local19 = (Class3_Sub4_Sub4) this.aClass136_42.method3506();
			local29.method9446();
			local29.method8848();
			this.anInt9549 += local29.anInt2637;
		}
		return null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method8044(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method8050(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method8045() {
		@Pc(11) Class3_Sub4_Sub4 local11 = (Class3_Sub4_Sub4) this.aClass136_42.method3509();
		while (local11 != null) {
			@Pc(19) Object local19 = local11.method2341();
			if (local19 != null) {
				return local19;
			}
			@Pc(23) Class3_Sub4_Sub4 local23 = local11;
			local11 = (Class3_Sub4_Sub4) this.aClass136_42.method3506();
			local23.method9446();
			local23.method8848();
			this.anInt9549 += local23.anInt2637;
		}
		return null;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
	public int method8046() {
		return this.anInt9553;
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V")
	public void method8047() {
		for (@Pc(16) Class3_Sub4_Sub4 local16 = (Class3_Sub4_Sub4) this.aClass283_13.method7031(); local16 != null; local16 = (Class3_Sub4_Sub4) this.aClass283_13.method7035()) {
			if (local16.method2337()) {
				local16.method9446();
				local16.method8848();
				this.anInt9549 += local16.anInt2637;
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)I")
	public int method8048() {
		@Pc(15) int local15 = 0;
		for (@Pc(21) Class3_Sub4_Sub4 local21 = (Class3_Sub4_Sub4) this.aClass283_13.method7031(); local21 != null; local21 = (Class3_Sub4_Sub4) this.aClass283_13.method7035()) {
			if (!local21.method2337()) {
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method8049(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub4_Sub4 local10 = (Class3_Sub4_Sub4) this.aClass136_42.method3503(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(25) Object local25 = local10.method2341();
		if (local25 == null) {
			local10.method9446();
			local10.method8848();
			this.anInt9549 += local10.anInt2637;
			return null;
		}
		if (local10.method2337()) {
			@Pc(54) Class3_Sub4_Sub4_Sub1 local54 = new Class3_Sub4_Sub4_Sub1(local25, local10.anInt2637);
			this.aClass136_42.method3508(local10.aLong382, local54);
			this.aClass283_13.method7036(local54);
			local54.aLong363 = 0L;
			local10.method9446();
			local10.method8848();
		} else {
			this.aClass283_13.method7036(local10);
			local10.aLong363 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(JILjava/lang/Object;I)V")
	public void method8050(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		if (arg1 > this.anInt9553) {
			throw new IllegalStateException("s>cs");
		}
		this.method8053(arg0);
		this.anInt9549 -= arg1;
		while (this.anInt9549 < 0) {
			@Pc(39) Class3_Sub4_Sub4 local39 = (Class3_Sub4_Sub4) this.aClass283_13.method7034();
			this.method8055(local39);
		}
		@Pc(55) Class3_Sub4_Sub4_Sub1 local55 = new Class3_Sub4_Sub4_Sub1(arg2, arg1);
		this.aClass136_42.method3508(arg0, local55);
		this.aClass283_13.method7036(local55);
		local55.aLong363 = (long) 0;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
	public void method8051() {
		this.aClass283_13.method7037();
		this.aClass136_42.method3505();
		this.anInt9549 = this.anInt9553;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public void method8052(@OriginalArg(1) int arg0) {
		if (Static443.aClass154_1 == null) {
			return;
		}
		for (@Pc(9) Class3_Sub4_Sub4 local9 = (Class3_Sub4_Sub4) this.aClass283_13.method7031(); local9 != null; local9 = (Class3_Sub4_Sub4) this.aClass283_13.method7035()) {
			if (local9.method2337()) {
				if (local9.method2341() == null) {
					local9.method9446();
					local9.method8848();
					this.anInt9549 += local9.anInt2637;
				}
			} else if (++local9.aLong363 > (long) arg0) {
				@Pc(41) Class3_Sub4_Sub4 local41 = Static443.aClass154_1.method5762(local9);
				this.aClass136_42.method3508(local9.aLong382, local41);
				Static511.method7264(local9, local41);
				local9.method9446();
				local9.method8848();
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IJ)V")
	private void method8053(@OriginalArg(1) long arg0) {
		@Pc(15) Class3_Sub4_Sub4 local15 = (Class3_Sub4_Sub4) this.aClass136_42.method3503(arg0);
		this.method8055(local15);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!ku;)V")
	private void method8055(@OriginalArg(1) Class3_Sub4_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method9446();
			arg0.method8848();
			this.anInt9549 += arg0.anInt2637;
		}
	}
}
