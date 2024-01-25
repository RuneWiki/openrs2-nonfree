import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class151 {

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Lclient!oga;")
	private final Class269 aClass269_70 = new Class269();

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
	private int anInt4282;

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
	private final int anInt4279;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Lclient!fw;")
	private final Class125 aClass125_12;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(I)V")
	public Class151(@OriginalArg(0) int arg0) {
		this.anInt4282 = arg0;
		this.anInt4279 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass125_12 = new Class125(local16);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/Object;Lclient!uha;II)V")
	private void method3784(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface24 arg1) {
		if (this.anInt4279 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3787(arg1);
		this.anInt4282--;
		while (this.anInt4282 < 0) {
			@Pc(34) Class14_Sub2_Sub4 local34 = (Class14_Sub2_Sub4) this.aClass269_70.method6490();
			this.method3793(local34);
		}
		@Pc(48) Class14_Sub2_Sub4_Sub2 local48 = new Class14_Sub2_Sub4_Sub2(arg1, arg0, 1);
		this.aClass125_12.method2626(local48, arg1.method3979());
		this.aClass269_70.method6493(local48);
		local48.aLong308 = 0L;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!uha;ILjava/lang/Object;)V")
	public void method3785(@OriginalArg(0) Interface24 arg0, @OriginalArg(2) Object arg1) {
		this.method3784(arg1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!uha;Z)Ljava/lang/Object;")
	public Object method3786(@OriginalArg(0) Interface24 arg0) {
		@Pc(7) long local7 = arg0.method3979();
		for (@Pc(21) Class14_Sub2_Sub4 local21 = (Class14_Sub2_Sub4) this.aClass125_12.method2630(local7); local21 != null; local21 = (Class14_Sub2_Sub4) this.aClass125_12.method2635()) {
			if (local21.anInterface24_3.method3978(arg0)) {
				@Pc(32) Object local32 = local21.method7557();
				if (local32 != null) {
					if (local21.method7554()) {
						@Pc(71) Class14_Sub2_Sub4_Sub2 local71 = new Class14_Sub2_Sub4_Sub2(arg0, local32, local21.anInt8731);
						this.aClass125_12.method2626(local71, local21.aLong324);
						this.aClass269_70.method6493(local71);
						local71.aLong308 = 0L;
						local21.method9513();
						local21.method9093();
					} else {
						this.aClass269_70.method6493(local21);
						local21.aLong308 = 0L;
					}
					return local32;
				}
				local21.method9513();
				local21.method9093();
				this.anInt4282 += local21.anInt8731;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!uha;I)V")
	private void method3787(@OriginalArg(0) Interface24 arg0) {
		@Pc(7) long local7 = arg0.method3979();
		for (@Pc(14) Class14_Sub2_Sub4 local14 = (Class14_Sub2_Sub4) this.aClass125_12.method2630(local7); local14 != null; local14 = (Class14_Sub2_Sub4) this.aClass125_12.method2635()) {
			if (local14.anInterface24_3.method3978(arg0)) {
				this.method3793(local14);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	public void method3788() {
		for (@Pc(14) Class14_Sub2_Sub4 local14 = (Class14_Sub2_Sub4) this.aClass269_70.method6494(); local14 != null; local14 = (Class14_Sub2_Sub4) this.aClass269_70.method6491()) {
			if (local14.method7554()) {
				local14.method9513();
				local14.method9093();
				this.anInt4282 += local14.anInt8731;
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)I")
	public int method3789() {
		return this.anInt4279;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)I")
	public int method3791() {
		return this.anInt4282;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	public void method3792() {
		if (Static218.aClass102_1 == null) {
			return;
		}
		for (@Pc(7) Class14_Sub2_Sub4 local7 = (Class14_Sub2_Sub4) this.aClass269_70.method6494(); local7 != null; local7 = (Class14_Sub2_Sub4) this.aClass269_70.method6491()) {
			if (local7.method7554()) {
				if (local7.method7557() == null) {
					local7.method9513();
					local7.method9093();
					this.anInt4282 += local7.anInt8731;
				}
			} else if ((long) 5 < ++local7.aLong308) {
				@Pc(30) Class14_Sub2_Sub4 local30 = Static218.aClass102_1.method4054(local7);
				this.aClass125_12.method2626(local30, local7.aLong324);
				Static314.method4993(local30, local7);
				local7.method9513();
				local7.method9093();
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!kea;)V")
	private void method3793(@OriginalArg(1) Class14_Sub2_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method9513();
			arg0.method9093();
			this.anInt4282 += arg0.anInt8731;
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public void method3795() {
		this.aClass269_70.method6492();
		this.aClass125_12.method2628();
		this.anInt4282 = this.anInt4279;
	}
}
