import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class89 {

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "Lclient!ns;")
	private final Class231 aClass231_1 = new Class231();

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
	private int anInt3282;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
	private final int anInt3278;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "Lclient!wr;")
	private final Class380 aClass380_8;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(I)V")
	public Class89(@OriginalArg(0) int arg0) {
		this.anInt3282 = arg0;
		this.anInt3278 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass380_8 = new Class380(local16);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
	public void method2735() {
		this.aClass231_1.method6049();
		this.aClass380_8.method8751();
		this.anInt3282 = this.anInt3278;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!sn;Ljava/lang/Object;Z)V")
	private void method2736(@OriginalArg(1) Interface23 arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt3278 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2744(arg0);
		this.anInt3282--;
		while (this.anInt3282 < 0) {
			@Pc(36) Class6_Sub5_Sub1 local36 = (Class6_Sub5_Sub1) this.aClass231_1.method6052();
			this.method2741(local36);
		}
		@Pc(50) Class6_Sub5_Sub1_Sub2 local50 = new Class6_Sub5_Sub1_Sub2(arg0, arg1, 1);
		this.aClass380_8.method8753(local50, arg0.method2731());
		this.aClass231_1.method6048(local50);
		local50.aLong254 = 0L;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)V")
	public void method2737() {
		if (Static294.aClass140_1 == null) {
			return;
		}
		for (@Pc(9) Class6_Sub5_Sub1 local9 = (Class6_Sub5_Sub1) this.aClass231_1.method6055(); local9 != null; local9 = (Class6_Sub5_Sub1) this.aClass231_1.method6050()) {
			if (local9.method7754()) {
				if (local9.method7751() == null) {
					local9.method8792();
					local9.method7748();
					this.anInt3282 += local9.anInt9491;
				}
			} else if (++local9.aLong254 > (long) 5) {
				@Pc(50) Class6_Sub5_Sub1 local50 = Static294.aClass140_1.method4313(local9);
				this.aClass380_8.method8753(local50, local9.aLong278);
				Static181.method3392(local9, local50);
				local9.method8792();
				local9.method7748();
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public void method2738() {
		for (@Pc(11) Class6_Sub5_Sub1 local11 = (Class6_Sub5_Sub1) this.aClass231_1.method6055(); local11 != null; local11 = (Class6_Sub5_Sub1) this.aClass231_1.method6050()) {
			if (local11.method7754()) {
				local11.method8792();
				local11.method7748();
				this.anInt3282 += local11.anInt9491;
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Z)I")
	public int method2739() {
		return this.anInt3282;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!naa;B)V")
	private void method2741(@OriginalArg(0) Class6_Sub5_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method8792();
			arg0.method7748();
			this.anInt3282 += arg0.anInt9491;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/lang/Object;Lclient!sn;Z)V")
	public void method2742(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface23 arg1) {
		this.method2736(arg1, arg0);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)I")
	public int method2743() {
		return this.anInt3278;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!sn;Z)V")
	private void method2744(@OriginalArg(0) Interface23 arg0) {
		@Pc(20) long local20 = arg0.method2731();
		for (@Pc(27) Class6_Sub5_Sub1 local27 = (Class6_Sub5_Sub1) this.aClass380_8.method8747(local20); local27 != null; local27 = (Class6_Sub5_Sub1) this.aClass380_8.method8750()) {
			if (local27.anInterface23_3.method2730(arg0)) {
				this.method2741(local27);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!sn;I)Ljava/lang/Object;")
	public Object method2745(@OriginalArg(0) Interface23 arg0) {
		@Pc(13) long local13 = arg0.method2731();
		for (@Pc(22) Class6_Sub5_Sub1 local22 = (Class6_Sub5_Sub1) this.aClass380_8.method8747(local13); local22 != null; local22 = (Class6_Sub5_Sub1) this.aClass380_8.method8750()) {
			if (local22.anInterface23_3.method2730(arg0)) {
				@Pc(34) Object local34 = local22.method7751();
				if (local34 != null) {
					if (local22.method7754()) {
						@Pc(63) Class6_Sub5_Sub1_Sub2 local63 = new Class6_Sub5_Sub1_Sub2(arg0, local34, local22.anInt9491);
						this.aClass380_8.method8753(local63, local22.aLong278);
						this.aClass231_1.method6048(local63);
						local63.aLong254 = 0L;
						local22.method8792();
						local22.method7748();
					} else {
						this.aClass231_1.method6048(local22);
						local22.aLong254 = 0L;
					}
					return local34;
				}
				local22.method8792();
				local22.method7748();
				this.anInt3282 += local22.anInt9491;
			}
		}
		return null;
	}
}
