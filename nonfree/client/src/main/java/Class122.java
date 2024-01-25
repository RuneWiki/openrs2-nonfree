import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class122 {

	@OriginalMember(owner = "client!gda", name = "n", descriptor = "Lclient!vu;")
	private final Class363 aClass363_16 = new Class363();

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
	private int anInt3382;

	@OriginalMember(owner = "client!gda", name = "p", descriptor = "I")
	private final int anInt3391;

	@OriginalMember(owner = "client!gda", name = "i", descriptor = "Lclient!baa;")
	private final Class25 aClass25_19;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(I)V")
	public Class122(@OriginalArg(0) int arg0) {
		this.anInt3382 = arg0;
		this.anInt3391 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass25_19 = new Class25(local16);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILclient!cr;)V")
	private void method2900(@OriginalArg(1) Interface4 arg0) {
		@Pc(9) long local9 = arg0.method6840();
		for (@Pc(16) Class3_Sub7_Sub3 local16 = (Class3_Sub7_Sub3) this.aClass25_19.method426(local9); local16 != null; local16 = (Class3_Sub7_Sub3) this.aClass25_19.method429()) {
			if (local16.anInterface4_3.method6839(arg0)) {
				this.method2907(local16);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)V")
	public void method2903() {
		if (Static275.aClass70_1 == null) {
			return;
		}
		for (@Pc(9) Class3_Sub7_Sub3 local9 = (Class3_Sub7_Sub3) this.aClass363_16.method8414(); local9 != null; local9 = (Class3_Sub7_Sub3) this.aClass363_16.method8415()) {
			if (local9.method5774()) {
				if (local9.method5775() == null) {
					local9.method8682();
					local9.method7907();
					this.anInt3382 += local9.anInt6634;
				}
			} else if (++local9.aLong251 > (long) 5) {
				@Pc(35) Class3_Sub7_Sub3 local35 = Static275.aClass70_1.method2423(local9);
				this.aClass25_19.method434(local9.aLong277, local35);
				Static607.method8328(local9, local35);
				local9.method8682();
				local9.method7907();
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)I")
	public int method2905() {
		return this.anInt3391;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V")
	public void method2906() {
		this.aClass363_16.method8419();
		this.aClass25_19.method433();
		this.anInt3382 = this.anInt3391;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILclient!mha;)V")
	private void method2907(@OriginalArg(1) Class3_Sub7_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method8682();
			arg0.method7907();
			this.anInt3382 += arg0.anInt6634;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!cr;Ljava/lang/Object;B)V")
	public void method2908(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Object arg1) {
		this.method2912(arg1, arg0);
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)I")
	public int method2909() {
		return this.anInt3382;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!cr;I)Ljava/lang/Object;")
	public Object method2910(@OriginalArg(0) Interface4 arg0) {
		@Pc(9) long local9 = arg0.method6840();
		for (@Pc(23) Class3_Sub7_Sub3 local23 = (Class3_Sub7_Sub3) this.aClass25_19.method426(local9); local23 != null; local23 = (Class3_Sub7_Sub3) this.aClass25_19.method429()) {
			if (local23.anInterface4_3.method6839(arg0)) {
				@Pc(37) Object local37 = local23.method5775();
				if (local37 != null) {
					if (local23.method5774()) {
						@Pc(68) Class3_Sub7_Sub3_Sub1 local68 = new Class3_Sub7_Sub3_Sub1(arg0, local37, local23.anInt6634);
						this.aClass25_19.method434(local23.aLong277, local68);
						this.aClass363_16.method8413(local68);
						local68.aLong251 = 0L;
						local23.method8682();
						local23.method7907();
					} else {
						this.aClass363_16.method8413(local23);
						local23.aLong251 = 0L;
					}
					return local37;
				}
				local23.method8682();
				local23.method7907();
				this.anInt3382 += local23.anInt6634;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)V")
	public void method2911() {
		for (@Pc(15) Class3_Sub7_Sub3 local15 = (Class3_Sub7_Sub3) this.aClass363_16.method8414(); local15 != null; local15 = (Class3_Sub7_Sub3) this.aClass363_16.method8415()) {
			if (local15.method5774()) {
				local15.method8682();
				local15.method7907();
				this.anInt3382 += local15.anInt6634;
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IILjava/lang/Object;Lclient!cr;)V")
	private void method2912(@OriginalArg(2) Object arg0, @OriginalArg(3) Interface4 arg1) {
		if (this.anInt3391 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2900(arg1);
		this.anInt3382--;
		while (this.anInt3382 < 0) {
			@Pc(34) Class3_Sub7_Sub3 local34 = (Class3_Sub7_Sub3) this.aClass363_16.method8420();
			this.method2907(local34);
		}
		@Pc(53) Class3_Sub7_Sub3_Sub1 local53 = new Class3_Sub7_Sub3_Sub1(arg1, arg0, 1);
		this.aClass25_19.method434(arg1.method6840(), local53);
		this.aClass363_16.method8413(local53);
		local53.aLong251 = (long) 0;
	}
}
