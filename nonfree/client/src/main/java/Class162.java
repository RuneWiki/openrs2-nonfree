import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class162 {

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "Lclient!tk;")
	private final Class239 aClass239_7 = new Class239();

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
	private int anInt3985;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
	private final int anInt3988;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "Lclient!ek;")
	private final Class67 aClass67_23;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V")
	public Class162(@OriginalArg(0) int arg0) {
		this.anInt3985 = arg0;
		this.anInt3988 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass67_23 = new Class67(local16);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)V")
	public void method3166() {
		if (Static157.aClass9_1 == null) {
			return;
		}
		for (@Pc(22) Class4_Sub2_Sub16 local22 = (Class4_Sub2_Sub16) this.aClass239_7.method5125(); local22 != null; local22 = (Class4_Sub2_Sub16) this.aClass239_7.method5120()) {
			if (local22.method4974()) {
				if (local22.method4973() == null) {
					local22.method6059();
					local22.method5538();
					this.anInt3985 += local22.anInt6175;
				}
			} else if ((long) 5 < ++local22.aLong208) {
				@Pc(44) Class4_Sub2_Sub16 local44 = Static157.aClass9_1.method140(local22);
				this.aClass67_23.method1426(local44, local22.aLong227);
				Static183.method2544(local22, local44);
				local22.method6059();
				local22.method5538();
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLclient!hf;)V")
	private void method3167(@OriginalArg(1) Interface6 arg0) {
		@Pc(16) long local16 = arg0.method3656();
		for (@Pc(23) Class4_Sub2_Sub16 local23 = (Class4_Sub2_Sub16) this.aClass67_23.method1429(local16); local23 != null; local23 = (Class4_Sub2_Sub16) this.aClass67_23.method1427()) {
			if (local23.anInterface6_3.method3655(arg0)) {
				this.method3172(local23);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!hf;)Ljava/lang/Object;")
	public Object method3168(@OriginalArg(1) Interface6 arg0) {
		@Pc(9) long local9 = arg0.method3656();
		for (@Pc(16) Class4_Sub2_Sub16 local16 = (Class4_Sub2_Sub16) this.aClass67_23.method1429(local9); local16 != null; local16 = (Class4_Sub2_Sub16) this.aClass67_23.method1427()) {
			if (local16.anInterface6_3.method3655(arg0)) {
				@Pc(28) Object local28 = local16.method4973();
				if (local28 != null) {
					if (local16.method4974()) {
						@Pc(69) Class4_Sub2_Sub16_Sub1 local69 = new Class4_Sub2_Sub16_Sub1(arg0, local28, local16.anInt6175);
						this.aClass67_23.method1426(local69, local16.aLong227);
						this.aClass239_7.method5126(local69);
						local69.aLong208 = 0L;
						local16.method6059();
						local16.method5538();
					} else {
						this.aClass239_7.method5126(local16);
						local16.aLong208 = 0L;
					}
					return local28;
				}
				local16.method6059();
				local16.method5538();
				this.anInt3985 += local16.anInt6175;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/Object;IILclient!hf;)V")
	private void method3170(@OriginalArg(0) Object arg0, @OriginalArg(3) Interface6 arg1) {
		if (this.anInt3988 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3167(arg1);
		this.anInt3985--;
		while (this.anInt3985 < 0) {
			@Pc(36) Class4_Sub2_Sub16 local36 = (Class4_Sub2_Sub16) this.aClass239_7.method5119();
			this.method3172(local36);
		}
		@Pc(53) Class4_Sub2_Sub16_Sub1 local53 = new Class4_Sub2_Sub16_Sub1(arg1, arg0, 1);
		this.aClass67_23.method1426(local53, arg1.method3656());
		this.aClass239_7.method5126(local53);
		local53.aLong208 = 0L;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)I")
	public int method3171() {
		return this.anInt3985;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!qf;I)V")
	private void method3172(@OriginalArg(0) Class4_Sub2_Sub16 arg0) {
		if (arg0 != null) {
			arg0.method6059();
			arg0.method5538();
			this.anInt3985 += arg0.anInt6175;
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	public void method3173() {
		this.aClass239_7.method5122();
		this.aClass67_23.method1431();
		this.anInt3985 = this.anInt3988;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!hf;ILjava/lang/Object;)V")
	public void method3175(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) Object arg1) {
		this.method3170(arg1, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)I")
	public int method3176() {
		return this.anInt3988;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
	public void method3178() {
		for (@Pc(9) Class4_Sub2_Sub16 local9 = (Class4_Sub2_Sub16) this.aClass239_7.method5125(); local9 != null; local9 = (Class4_Sub2_Sub16) this.aClass239_7.method5120()) {
			if (local9.method4974()) {
				local9.method6059();
				local9.method5538();
				this.anInt3985 += local9.anInt6175;
			}
		}
	}
}
