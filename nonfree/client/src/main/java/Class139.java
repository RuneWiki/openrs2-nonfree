import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class139 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!er;")
	private final Class56 aClass56_10 = new Class56();

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	private int anInt4002;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	private final int anInt4003;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "Lclient!bn;")
	private final Class25 aClass25_21;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
	public Class139(@OriginalArg(0) int arg0) {
		this.anInt4002 = arg0;
		this.anInt4003 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass25_21 = new Class25(local14);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!vh;)Ljava/lang/Object;")
	public Object method3699(@OriginalArg(1) Interface8 arg0) {
		@Pc(9) long local9 = arg0.method2205();
		for (@Pc(16) Class14_Sub2_Sub17 local16 = (Class14_Sub2_Sub17) this.aClass25_21.method691(local9); local16 != null; local16 = (Class14_Sub2_Sub17) this.aClass25_21.method692()) {
			if (local16.anInterface8_3.method2206(arg0)) {
				@Pc(28) Object local28 = local16.method5767();
				if (local28 != null) {
					if (local16.method5762()) {
						@Pc(64) Class14_Sub2_Sub17_Sub1 local64 = new Class14_Sub2_Sub17_Sub1(arg0, local28);
						this.aClass25_21.method687(local16.aLong217, local64);
						this.aClass56_10.method1922(local64);
						local64.aLong208 = 0L;
						local16.method5986();
						local16.method5760();
					} else {
						this.aClass56_10.method1922(local16);
						local16.aLong208 = 0L;
					}
					return local28;
				}
				local16.method5986();
				local16.method5760();
				this.anInt4002++;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!vh;ILjava/lang/Object;)V")
	public void method3700(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) Object arg1) {
		this.method3702(arg0);
		if (this.anInt4002 == 0) {
			@Pc(19) Class14_Sub2_Sub17 local19 = (Class14_Sub2_Sub17) this.aClass56_10.method1917();
			local19.method5986();
			local19.method5760();
		} else {
			this.anInt4002--;
		}
		@Pc(39) Class14_Sub2_Sub17_Sub1 local39 = new Class14_Sub2_Sub17_Sub1(arg0, arg1);
		this.aClass25_21.method687(arg0.method2205(), local39);
		this.aClass56_10.method1922(local39);
		local39.aLong208 = 0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)I")
	public int method3701() {
		return this.anInt4003;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!vh;B)V")
	private void method3702(@OriginalArg(0) Interface8 arg0) {
		@Pc(9) long local9 = arg0.method2205();
		for (@Pc(20) Class14_Sub2_Sub17 local20 = (Class14_Sub2_Sub17) this.aClass25_21.method691(local9); local20 != null; local20 = (Class14_Sub2_Sub17) this.aClass25_21.method692()) {
			if (local20.anInterface8_3.method2206(arg0)) {
				local20.method5986();
				local20.method5760();
				this.anInt4002++;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
	public void method3704() {
		this.aClass56_10.method1916();
		this.aClass25_21.method685();
		this.anInt4002 = this.anInt4003;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	public void method3706() {
		if (Static124.aClass89_1 == null) {
			return;
		}
		for (@Pc(9) Class14_Sub2_Sub17 local9 = (Class14_Sub2_Sub17) this.aClass56_10.method1923(); local9 != null; local9 = (Class14_Sub2_Sub17) this.aClass56_10.method1920()) {
			if (local9.method5762()) {
				if (local9.method5767() == null) {
					local9.method5986();
					local9.method5760();
					this.anInt4002++;
				}
			} else if ((long) 5 < ++local9.aLong208) {
				@Pc(51) Class14_Sub2_Sub17 local51 = Static124.aClass89_1.method3774(local9);
				this.aClass25_21.method687(local9.aLong217, local51);
				Static272.method4613(local51, local9);
				local9.method5986();
				local9.method5760();
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)I")
	public int method3707() {
		return this.anInt4002;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public void method3708() {
		for (@Pc(11) Class14_Sub2_Sub17 local11 = (Class14_Sub2_Sub17) this.aClass56_10.method1923(); local11 != null; local11 = (Class14_Sub2_Sub17) this.aClass56_10.method1920()) {
			if (local11.method5762()) {
				local11.method5986();
				local11.method5760();
				this.anInt4002++;
			}
		}
	}
}
