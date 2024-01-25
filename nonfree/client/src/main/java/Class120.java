import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class120 {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!so;")
	private final Class225 aClass225_4 = new Class225();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	private final int anInt3224;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
	private int anInt3238;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!qh;")
	private final Class199 aClass199_99;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V")
	public Class120(@OriginalArg(0) int arg0) {
		this.anInt3224 = arg0;
		this.anInt3238 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass199_99 = new Class199(local16);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
	public int method2674() {
		return this.anInt3238;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!fr;BLjava/lang/Object;)V")
	public void method2675(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Object arg1) {
		this.method2682(arg0, arg1);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public void method2676() {
		this.aClass225_4.method4938();
		this.aClass199_99.method4385();
		this.anInt3238 = this.anInt3224;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!fr;B)Ljava/lang/Object;")
	public Object method2677(@OriginalArg(0) Interface3 arg0) {
		@Pc(9) long local9 = arg0.method920();
		for (@Pc(16) Class1_Sub5_Sub3 local16 = (Class1_Sub5_Sub3) this.aClass199_99.method4387(local9); local16 != null; local16 = (Class1_Sub5_Sub3) this.aClass199_99.method4389()) {
			if (local16.anInterface3_3.method919(arg0)) {
				@Pc(28) Object local28 = local16.method1628();
				if (local28 != null) {
					if (local16.method1629()) {
						@Pc(67) Class1_Sub5_Sub3_Sub1 local67 = new Class1_Sub5_Sub3_Sub1(arg0, local28, local16.anInt1963);
						this.aClass199_99.method4383(local16.aLong230, local67);
						this.aClass225_4.method4943(local67);
						local67.aLong211 = 0L;
						local16.method5915();
						local16.method5305();
					} else {
						this.aClass225_4.method4943(local16);
						local16.aLong211 = 0L;
					}
					return local28;
				}
				local16.method5915();
				local16.method5305();
				this.anInt3238 += local16.anInt1963;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!fr;)V")
	private void method2678(@OriginalArg(1) Interface3 arg0) {
		@Pc(9) long local9 = arg0.method920();
		for (@Pc(16) Class1_Sub5_Sub3 local16 = (Class1_Sub5_Sub3) this.aClass199_99.method4387(local9); local16 != null; local16 = (Class1_Sub5_Sub3) this.aClass199_99.method4389()) {
			if (local16.anInterface3_3.method919(arg0)) {
				this.method2680(local16);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!hc;)V")
	private void method2680(@OriginalArg(1) Class1_Sub5_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method5915();
			arg0.method5305();
			this.anInt3238 += arg0.anInt1963;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public void method2681() {
		for (@Pc(11) Class1_Sub5_Sub3 local11 = (Class1_Sub5_Sub3) this.aClass225_4.method4942(); local11 != null; local11 = (Class1_Sub5_Sub3) this.aClass225_4.method4937()) {
			if (local11.method1629()) {
				local11.method5915();
				local11.method5305();
				this.anInt3238 += local11.anInt1963;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!fr;Ljava/lang/Object;)V")
	private void method2682(@OriginalArg(2) Interface3 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt3224 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2678(arg0);
		this.anInt3238--;
		while (this.anInt3238 < 0) {
			@Pc(32) Class1_Sub5_Sub3 local32 = (Class1_Sub5_Sub3) this.aClass225_4.method4939();
			this.method2680(local32);
		}
		@Pc(46) Class1_Sub5_Sub3_Sub1 local46 = new Class1_Sub5_Sub3_Sub1(arg0, arg1, 1);
		this.aClass199_99.method4383(arg0.method920(), local46);
		this.aClass225_4.method4943(local46);
		local46.aLong211 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	public void method2683() {
		if (Static342.aClass67_1 == null) {
			return;
		}
		for (@Pc(9) Class1_Sub5_Sub3 local9 = (Class1_Sub5_Sub3) this.aClass225_4.method4942(); local9 != null; local9 = (Class1_Sub5_Sub3) this.aClass225_4.method4937()) {
			if (local9.method1629()) {
				if (local9.method1628() == null) {
					local9.method5915();
					local9.method5305();
					this.anInt3238 += local9.anInt1963;
				}
			} else if (++local9.aLong211 > (long) 5) {
				@Pc(50) Class1_Sub5_Sub3 local50 = Static342.aClass67_1.method2907(local9);
				this.aClass199_99.method4383(local9.aLong230, local50);
				Static134.method2065(local9, local50);
				local9.method5915();
				local9.method5305();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)I")
	public int method2686() {
		return this.anInt3224;
	}
}
