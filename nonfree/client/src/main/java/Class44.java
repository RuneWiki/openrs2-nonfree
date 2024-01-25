import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class44 {

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!jh;")
	private final Class123 aClass123_4 = new Class123();

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	private int anInt1222;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "I")
	private final int anInt1233;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!vg;")
	private final Class252 aClass252_9;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
	public Class44(@OriginalArg(0) int arg0) {
		this.anInt1222 = arg0;
		this.anInt1233 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass252_9 = new Class252(local14);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(JILjava/lang/Object;)V")
	public void method1017(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method1019(arg1, arg0);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Object;IJB)V")
	private void method1019(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		if (this.anInt1233 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1026(arg1);
		this.anInt1222--;
		while (this.anInt1222 < 0) {
			@Pc(32) Class5_Sub2_Sub4 local32 = (Class5_Sub2_Sub4) this.aClass123_4.method2619();
			this.method1029(local32);
		}
		@Pc(45) Class5_Sub2_Sub4_Sub1 local45 = new Class5_Sub2_Sub4_Sub1(arg0, 1);
		this.aClass252_9.method5658(local45, arg1);
		this.aClass123_4.method2620(local45);
		local45.aLong235 = 0L;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method1022() {
		@Pc(17) Class5_Sub2_Sub4 local17 = (Class5_Sub2_Sub4) this.aClass252_9.method5666();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method3965();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class5_Sub2_Sub4 local27 = local17;
			local17 = (Class5_Sub2_Sub4) this.aClass252_9.method5666();
			local27.method6003();
			local27.method6006();
			this.anInt1222 += local17.anInt5016;
		}
		return null;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	public void method1024() {
		for (@Pc(11) Class5_Sub2_Sub4 local11 = (Class5_Sub2_Sub4) this.aClass123_4.method2616(); local11 != null; local11 = (Class5_Sub2_Sub4) this.aClass123_4.method2618()) {
			if (local11.method3963()) {
				local11.method6003();
				local11.method6006();
				this.anInt1222 += local11.anInt5016;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
	public void method1025(@OriginalArg(0) int arg0) {
		if (Static1.aClass86_2 == null) {
			return;
		}
		for (@Pc(17) Class5_Sub2_Sub4 local17 = (Class5_Sub2_Sub4) this.aClass123_4.method2616(); local17 != null; local17 = (Class5_Sub2_Sub4) this.aClass123_4.method2618()) {
			if (local17.method3963()) {
				if (local17.method3965() == null) {
					local17.method6003();
					local17.method6006();
					this.anInt1222++;
				}
			} else if ((long) arg0 < ++local17.aLong235) {
				@Pc(39) Class5_Sub2_Sub4 local39 = Static1.aClass86_2.method1858(local17);
				this.aClass252_9.method5658(local39, local17.aLong234);
				Static397.method5159(local17, local39);
				local17.method6003();
				local17.method6006();
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BJ)V")
	private void method1026(@OriginalArg(1) long arg0) {
		@Pc(17) Class5_Sub2_Sub4 local17 = (Class5_Sub2_Sub4) this.aClass252_9.method5659(arg0);
		this.method1029(local17);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
	public int method1027() {
		return this.anInt1233;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method1028(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub2_Sub4 local10 = (Class5_Sub2_Sub4) this.aClass252_9.method5659(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method3965();
		if (local18 == null) {
			local10.method6003();
			local10.method6006();
			this.anInt1222 += local10.anInt5016;
			return null;
		}
		if (local10.method3963()) {
			@Pc(46) Class5_Sub2_Sub4_Sub1 local46 = new Class5_Sub2_Sub4_Sub1(local18, local10.anInt5016);
			this.aClass252_9.method5658(local46, local10.aLong234);
			this.aClass123_4.method2620(local46);
			local46.aLong235 = 0L;
			local10.method6003();
			local10.method6006();
		} else {
			this.aClass123_4.method2620(local10);
			local10.aLong235 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!cv;B)V")
	private void method1029(@OriginalArg(0) Class5_Sub2_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method6003();
			arg0.method6006();
			this.anInt1222 += arg0.anInt5016;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)I")
	public int method1030() {
		@Pc(7) int local7 = 0;
		for (@Pc(20) Class5_Sub2_Sub4 local20 = (Class5_Sub2_Sub4) this.aClass123_4.method2616(); local20 != null; local20 = (Class5_Sub2_Sub4) this.aClass123_4.method2618()) {
			if (!local20.method3963()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
	public void method1031() {
		this.aClass123_4.method2622();
		this.aClass252_9.method5661();
		this.anInt1222 = this.anInt1233;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method1033() {
		@Pc(11) Class5_Sub2_Sub4 local11 = (Class5_Sub2_Sub4) this.aClass252_9.method5660();
		while (local11 != null) {
			@Pc(22) Object local22 = local11.method3965();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class5_Sub2_Sub4 local28 = local11;
			local11 = (Class5_Sub2_Sub4) this.aClass252_9.method5666();
			local28.method6003();
			local28.method6006();
			this.anInt1222 += local11.anInt5016;
		}
		return null;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)I")
	public int method1034() {
		return this.anInt1222;
	}
}
