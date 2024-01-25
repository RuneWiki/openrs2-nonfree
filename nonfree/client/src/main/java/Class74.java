import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class74 {

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "Lclient!hv;")
	private final Class143 aClass143_1 = new Class143();

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
	private final int anInt2363;

	@OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
	private int anInt2362;

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "Lclient!tq;")
	private final Class305 aClass305_14;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(I)V")
	public Class74(@OriginalArg(0) int arg0) {
		this.anInt2363 = arg0;
		this.anInt2362 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass305_14 = new Class305(local16);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLjava/lang/Object;Lclient!lo;I)V")
	private void method2130(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface11 arg1) {
		if (this.anInt2363 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2132(arg1);
		this.anInt2362--;
		while (this.anInt2362 < 0) {
			@Pc(32) Class6_Sub4_Sub8 local32 = (Class6_Sub4_Sub8) this.aClass143_1.method3836();
			this.method2136(local32);
		}
		@Pc(49) Class6_Sub4_Sub8_Sub2 local49 = new Class6_Sub4_Sub8_Sub2(arg1, arg0, 1);
		this.aClass305_14.method7448(arg1.method2309(), local49);
		this.aClass143_1.method3835(local49);
		local49.aLong247 = 0L;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)I")
	public int method2131() {
		return this.anInt2362;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!lo;I)V")
	private void method2132(@OriginalArg(0) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method2309();
		for (@Pc(16) Class6_Sub4_Sub8 local16 = (Class6_Sub4_Sub8) this.aClass305_14.method7447(local9); local16 != null; local16 = (Class6_Sub4_Sub8) this.aClass305_14.method7446()) {
			if (local16.anInterface11_3.method2308(arg0)) {
				this.method2136(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Lclient!lo;I)Ljava/lang/Object;")
	public Object method2133(@OriginalArg(0) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method2309();
		for (@Pc(16) Class6_Sub4_Sub8 local16 = (Class6_Sub4_Sub8) this.aClass305_14.method7447(local9); local16 != null; local16 = (Class6_Sub4_Sub8) this.aClass305_14.method7446()) {
			if (local16.anInterface11_3.method2308(arg0)) {
				@Pc(28) Object local28 = local16.method4615();
				if (local28 != null) {
					if (local16.method4614()) {
						@Pc(57) Class6_Sub4_Sub8_Sub2 local57 = new Class6_Sub4_Sub8_Sub2(arg0, local28, local16.anInt5381);
						this.aClass305_14.method7448(local16.aLong252, local57);
						this.aClass143_1.method3835(local57);
						local57.aLong247 = 0L;
						local16.method8151();
						local16.method8035();
					} else {
						this.aClass143_1.method3835(local16);
						local16.aLong247 = 0L;
					}
					return local28;
				}
				local16.method8151();
				local16.method8035();
				this.anInt2362 += local16.anInt5381;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)I")
	public int method2134() {
		return this.anInt2363;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLclient!lw;)V")
	private void method2136(@OriginalArg(1) Class6_Sub4_Sub8 arg0) {
		if (arg0 != null) {
			arg0.method8151();
			arg0.method8035();
			this.anInt2362 += arg0.anInt5381;
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)V")
	public void method2137() {
		for (@Pc(15) Class6_Sub4_Sub8 local15 = (Class6_Sub4_Sub8) this.aClass143_1.method3839(); local15 != null; local15 = (Class6_Sub4_Sub8) this.aClass143_1.method3833()) {
			if (local15.method4614()) {
				local15.method8151();
				local15.method8035();
				this.anInt2362 += local15.anInt5381;
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Object;BLclient!lo;)V")
	public void method2139(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface11 arg1) {
		this.method2130(arg0, arg1);
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
	public void method2141() {
		this.aClass143_1.method3837();
		this.aClass305_14.method7440();
		this.anInt2362 = this.anInt2363;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V")
	public void method2142() {
		if (Static416.aClass176_1 == null) {
			return;
		}
		for (@Pc(9) Class6_Sub4_Sub8 local9 = (Class6_Sub4_Sub8) this.aClass143_1.method3839(); local9 != null; local9 = (Class6_Sub4_Sub8) this.aClass143_1.method3833()) {
			if (local9.method4614()) {
				if (local9.method4615() == null) {
					local9.method8151();
					local9.method8035();
					this.anInt2362 += local9.anInt5381;
				}
			} else if (++local9.aLong247 > (long) 5) {
				@Pc(52) Class6_Sub4_Sub8 local52 = Static416.aClass176_1.method5274(local9);
				this.aClass305_14.method7448(local9.aLong252, local52);
				Static231.method4105(local52, local9);
				local9.method8151();
				local9.method8035();
			}
		}
	}
}
