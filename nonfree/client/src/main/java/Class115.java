import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class115 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Lclient!sc;")
	private final Class302 aClass302_7 = new Class302();

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
	private final int anInt4142;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
	private int anInt4146;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!pfa;")
	private final Class253 aClass253_12;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
	public Class115(@OriginalArg(0) int arg0) {
		this.anInt4142 = arg0;
		this.anInt4146 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass253_12 = new Class253(local16);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!on;Ljava/lang/Object;)V")
	public void method3367(@OriginalArg(1) Interface19 arg0, @OriginalArg(2) Object arg1) {
		this.method3376(arg0, arg1);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	public int method3368() {
		return this.anInt4146;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public void method3370() {
		this.aClass302_7.method7322();
		this.aClass253_12.method6598();
		this.anInt4146 = this.anInt4142;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!on;Z)V")
	private void method3371(@OriginalArg(0) Interface19 arg0) {
		@Pc(9) long local9 = arg0.method4711();
		for (@Pc(16) Class8_Sub5_Sub3 local16 = (Class8_Sub5_Sub3) this.aClass253_12.method6594(local9); local16 != null; local16 = (Class8_Sub5_Sub3) this.aClass253_12.method6599()) {
			if (local16.anInterface19_3.method4712(arg0)) {
				this.method3374(local16);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
	public void method3372() {
		for (@Pc(7) Class8_Sub5_Sub3 local7 = (Class8_Sub5_Sub3) this.aClass302_7.method7327(); local7 != null; local7 = (Class8_Sub5_Sub3) this.aClass302_7.method7326()) {
			if (local7.method7784()) {
				local7.method8640();
				local7.method8381();
				this.anInt4146 += local7.anInt9632;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public void method3373() {
		if (Static215.aClass52_1 == null) {
			return;
		}
		for (@Pc(18) Class8_Sub5_Sub3 local18 = (Class8_Sub5_Sub3) this.aClass302_7.method7327(); local18 != null; local18 = (Class8_Sub5_Sub3) this.aClass302_7.method7326()) {
			if (local18.method7784()) {
				if (local18.method7785() == null) {
					local18.method8640();
					local18.method8381();
					this.anInt4146 += local18.anInt9632;
				}
			} else if (++local18.aLong275 > (long) 5) {
				@Pc(67) Class8_Sub5_Sub3 local67 = Static215.aClass52_1.method1719(local18);
				this.aClass253_12.method6591(local67, local18.aLong285);
				Static111.method2526(local67, local18);
				local18.method8640();
				local18.method8381();
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!jg;)V")
	private void method3374(@OriginalArg(1) Class8_Sub5_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method8640();
			arg0.method8381();
			this.anInt4146 += arg0.anInt9632;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
	public int method3375() {
		return this.anInt4142;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!on;ILjava/lang/Object;)V")
	private void method3376(@OriginalArg(1) Interface19 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt4142 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3371(arg0);
		this.anInt4146--;
		while (this.anInt4146 < 0) {
			@Pc(36) Class8_Sub5_Sub3 local36 = (Class8_Sub5_Sub3) this.aClass302_7.method7330();
			this.method3374(local36);
		}
		@Pc(50) Class8_Sub5_Sub3_Sub2 local50 = new Class8_Sub5_Sub3_Sub2(arg0, arg1, 1);
		this.aClass253_12.method6591(local50, arg0.method4711());
		this.aClass302_7.method7328(local50);
		local50.aLong275 = 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!on;I)Ljava/lang/Object;")
	public Object method3378(@OriginalArg(0) Interface19 arg0) {
		@Pc(13) long local13 = arg0.method4711();
		for (@Pc(20) Class8_Sub5_Sub3 local20 = (Class8_Sub5_Sub3) this.aClass253_12.method6594(local13); local20 != null; local20 = (Class8_Sub5_Sub3) this.aClass253_12.method6599()) {
			if (local20.anInterface19_3.method4712(arg0)) {
				@Pc(34) Object local34 = local20.method7785();
				if (local34 != null) {
					if (local20.method7784()) {
						@Pc(63) Class8_Sub5_Sub3_Sub2 local63 = new Class8_Sub5_Sub3_Sub2(arg0, local34, local20.anInt9632);
						this.aClass253_12.method6591(local63, local20.aLong285);
						this.aClass302_7.method7328(local63);
						local63.aLong275 = 0L;
						local20.method8640();
						local20.method8381();
					} else {
						this.aClass302_7.method7328(local20);
						local20.aLong275 = 0L;
					}
					return local34;
				}
				local20.method8640();
				local20.method8381();
				this.anInt4146 += local20.anInt9632;
			}
		}
		return null;
	}
}
