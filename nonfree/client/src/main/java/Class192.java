import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class192 {

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "Lclient!oaa;")
	private final Class258 aClass258_4 = new Class258();

	@OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
	private int anInt5213;

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
	private final int anInt5203;

	@OriginalMember(owner = "client!jga", name = "i", descriptor = "Lclient!cja;")
	private final Class62 aClass62_26;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(I)V")
	public Class192(@OriginalArg(0) int arg0) {
		this.anInt5213 = arg0;
		this.anInt5203 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass62_26 = new Class62(local16);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLclient!ria;)V")
	private void method4414(@OriginalArg(1) Class3_Sub6_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method8770();
			arg0.method8342();
			this.anInt5213 += arg0.anInt8104;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!wf;B)V")
	private void method4415(@OriginalArg(0) Interface25 arg0) {
		@Pc(9) long local9 = arg0.method2642();
		for (@Pc(16) Class3_Sub6_Sub4 local16 = (Class3_Sub6_Sub4) this.aClass62_26.method1682(local9); local16 != null; local16 = (Class3_Sub6_Sub4) this.aClass62_26.method1689()) {
			if (local16.anInterface25_3.method2643(arg0)) {
				this.method4414(local16);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(B)I")
	public int method4418() {
		return this.anInt5213;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILclient!wf;)Ljava/lang/Object;")
	public Object method4419(@OriginalArg(1) Interface25 arg0) {
		@Pc(9) long local9 = arg0.method2642();
		for (@Pc(23) Class3_Sub6_Sub4 local23 = (Class3_Sub6_Sub4) this.aClass62_26.method1682(local9); local23 != null; local23 = (Class3_Sub6_Sub4) this.aClass62_26.method1689()) {
			if (local23.anInterface25_3.method2643(arg0)) {
				@Pc(37) Object local37 = local23.method6818();
				if (local37 != null) {
					if (local23.method6816()) {
						@Pc(66) Class3_Sub6_Sub4_Sub2 local66 = new Class3_Sub6_Sub4_Sub2(arg0, local37, local23.anInt8104);
						this.aClass62_26.method1686(local23.aLong309, local66);
						this.aClass258_4.method5936(local66);
						local66.aLong290 = 0L;
						local23.method8770();
						local23.method8342();
					} else {
						this.aClass258_4.method5936(local23);
						local23.aLong290 = 0L;
					}
					return local37;
				}
				local23.method8770();
				local23.method8342();
				this.anInt5213 += local23.anInt8104;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
	public void method4420() {
		for (@Pc(7) Class3_Sub6_Sub4 local7 = (Class3_Sub6_Sub4) this.aClass258_4.method5934(); local7 != null; local7 = (Class3_Sub6_Sub4) this.aClass258_4.method5929()) {
			if (local7.method6816()) {
				local7.method8770();
				local7.method8342();
				this.anInt5213 += local7.anInt8104;
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)I")
	public int method4421() {
		return this.anInt5203;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)V")
	public void method4422() {
		this.aClass258_4.method5933();
		this.aClass62_26.method1683();
		this.anInt5213 = this.anInt5203;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!wf;BLjava/lang/Object;)V")
	public void method4423(@OriginalArg(0) Interface25 arg0, @OriginalArg(2) Object arg1) {
		this.method4424(arg0, arg1);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!wf;Ljava/lang/Object;II)V")
	private void method4424(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt5203 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4415(arg0);
		this.anInt5213--;
		while (this.anInt5213 < 0) {
			@Pc(32) Class3_Sub6_Sub4 local32 = (Class3_Sub6_Sub4) this.aClass258_4.method5931();
			this.method4414(local32);
		}
		@Pc(46) Class3_Sub6_Sub4_Sub2 local46 = new Class3_Sub6_Sub4_Sub2(arg0, arg1, 1);
		this.aClass62_26.method1686(arg0.method2642(), local46);
		this.aClass258_4.method5936(local46);
		local46.aLong290 = (long) 0;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(II)V")
	public void method4425() {
		if (Static409.aClass27_3 == null) {
			return;
		}
		for (@Pc(9) Class3_Sub6_Sub4 local9 = (Class3_Sub6_Sub4) this.aClass258_4.method5934(); local9 != null; local9 = (Class3_Sub6_Sub4) this.aClass258_4.method5929()) {
			if (local9.method6816()) {
				if (local9.method6818() == null) {
					local9.method8770();
					local9.method8342();
					this.anInt5213 += local9.anInt8104;
				}
			} else if (++local9.aLong290 > (long) 5) {
				@Pc(31) Class3_Sub6_Sub4 local31 = Static409.aClass27_3.method958(local9);
				this.aClass62_26.method1686(local9.aLong309, local31);
				Static58.method1431(local9, local31);
				local9.method8770();
				local9.method8342();
			}
		}
	}
}
