import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class307 {

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!gd;")
	private final Class120 aClass120_10 = new Class120();

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
	private final int anInt9233;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
	private int anInt9219;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "Lclient!mo;")
	private final Class221 aClass221_33;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(I)V")
	public Class307(@OriginalArg(0) int arg0) {
		this.anInt9233 = arg0;
		this.anInt9219 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass221_33 = new Class221(local16);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public void method7076() {
		this.aClass120_10.method2665();
		this.aClass221_33.method5078();
		this.anInt9219 = this.anInt9233;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)I")
	public int method7077() {
		return this.anInt9233;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!hm;I)V")
	private void method7078(@OriginalArg(0) Class4_Sub6_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method8193();
			arg0.method7880();
			this.anInt9219 += arg0.anInt8961;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!er;I)Ljava/lang/Object;")
	public Object method7079(@OriginalArg(0) Interface5 arg0) {
		@Pc(9) long local9 = arg0.method6356();
		for (@Pc(16) Class4_Sub6_Sub1 local16 = (Class4_Sub6_Sub1) this.aClass221_33.method5075(local9); local16 != null; local16 = (Class4_Sub6_Sub1) this.aClass221_33.method5067()) {
			if (local16.anInterface5_3.method6357(arg0)) {
				@Pc(33) Object local33 = local16.method6875();
				if (local33 != null) {
					if (local16.method6872()) {
						@Pc(64) Class4_Sub6_Sub1_Sub1 local64 = new Class4_Sub6_Sub1_Sub1(arg0, local33, local16.anInt8961);
						this.aClass221_33.method5073(local64, local16.aLong295);
						this.aClass120_10.method2669(local64);
						local64.aLong286 = 0L;
						local16.method8193();
						local16.method7880();
					} else {
						this.aClass120_10.method2669(local16);
						local16.aLong286 = 0L;
					}
					return local33;
				}
				local16.method8193();
				local16.method7880();
				this.anInt9219 += local16.anInt8961;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V")
	public void method7081() {
		if (Static375.aClass41_1 == null) {
			return;
		}
		for (@Pc(13) Class4_Sub6_Sub1 local13 = (Class4_Sub6_Sub1) this.aClass120_10.method2674(); local13 != null; local13 = (Class4_Sub6_Sub1) this.aClass120_10.method2671()) {
			if (local13.method6872()) {
				if (local13.method6875() == null) {
					local13.method8193();
					local13.method7880();
					this.anInt9219 += local13.anInt8961;
				}
			} else if (++local13.aLong286 > (long) 5) {
				@Pc(54) Class4_Sub6_Sub1 local54 = Static375.aClass41_1.method1149(local13);
				this.aClass221_33.method5073(local54, local13.aLong295);
				Static513.method7332(local13, local54);
				local13.method8193();
				local13.method7880();
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!er;Ljava/lang/Object;II)V")
	private void method7082(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt9233 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7085(arg0);
		this.anInt9219--;
		while (this.anInt9219 < 0) {
			@Pc(32) Class4_Sub6_Sub1 local32 = (Class4_Sub6_Sub1) this.aClass120_10.method2667();
			this.method7078(local32);
		}
		@Pc(46) Class4_Sub6_Sub1_Sub1 local46 = new Class4_Sub6_Sub1_Sub1(arg0, arg1, 1);
		this.aClass221_33.method5073(local46, arg0.method6356());
		this.aClass120_10.method2669(local46);
		local46.aLong286 = 0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!er;BLjava/lang/Object;)V")
	public void method7083(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) Object arg1) {
		this.method7082(arg0, arg1);
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
	public void method7084() {
		for (@Pc(15) Class4_Sub6_Sub1 local15 = (Class4_Sub6_Sub1) this.aClass120_10.method2674(); local15 != null; local15 = (Class4_Sub6_Sub1) this.aClass120_10.method2671()) {
			if (local15.method6872()) {
				local15.method8193();
				local15.method7880();
				this.anInt9219 += local15.anInt8961;
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!er;B)V")
	private void method7085(@OriginalArg(0) Interface5 arg0) {
		@Pc(11) long local11 = arg0.method6356();
		for (@Pc(24) Class4_Sub6_Sub1 local24 = (Class4_Sub6_Sub1) this.aClass221_33.method5075(local11); local24 != null; local24 = (Class4_Sub6_Sub1) this.aClass221_33.method5067()) {
			if (local24.anInterface5_3.method6357(arg0)) {
				this.method7078(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)I")
	public int method7086() {
		return this.anInt9219;
	}
}
