import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class173 {

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "Lclient!ut;")
	private final Class367 aClass367_4 = new Class367();

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
	private final int anInt4322;

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
	private int anInt4314;

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "Lclient!dj;")
	private final Class66 aClass66_19;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(I)V")
	public Class173(@OriginalArg(0) int arg0) {
		this.anInt4322 = arg0;
		this.anInt4314 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass66_19 = new Class66(local16);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)I")
	public int method3813() {
		return this.anInt4322;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZLclient!we;)Ljava/lang/Object;")
	public Object method3814(@OriginalArg(1) Interface27 arg0) {
		@Pc(9) long local9 = arg0.method5131();
		for (@Pc(23) Class4_Sub5_Sub6 local23 = (Class4_Sub5_Sub6) this.aClass66_19.method1994(local9); local23 != null; local23 = (Class4_Sub5_Sub6) this.aClass66_19.method1991()) {
			if (local23.anInterface27_3.method5130(arg0)) {
				@Pc(35) Object local35 = local23.method7154();
				if (local35 != null) {
					if (local23.method7153()) {
						@Pc(64) Class4_Sub5_Sub6_Sub1 local64 = new Class4_Sub5_Sub6_Sub1(arg0, local35, local23.anInt8241);
						this.aClass66_19.method1985(local64, local23.aLong307);
						this.aClass367_4.method8310(local64);
						local64.aLong306 = 0L;
						local23.method9000();
						local23.method8990();
					} else {
						this.aClass367_4.method8310(local23);
						local23.aLong306 = 0L;
					}
					return local35;
				}
				local23.method9000();
				local23.method8990();
				this.anInt4314 += local23.anInt8241;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!we;B)V")
	private void method3815(@OriginalArg(0) Interface27 arg0) {
		@Pc(9) long local9 = arg0.method5131();
		for (@Pc(16) Class4_Sub5_Sub6 local16 = (Class4_Sub5_Sub6) this.aClass66_19.method1994(local9); local16 != null; local16 = (Class4_Sub5_Sub6) this.aClass66_19.method1991()) {
			if (local16.anInterface27_3.method5130(arg0)) {
				this.method3822(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILclient!we;Ljava/lang/Object;)V")
	public void method3816(@OriginalArg(1) Interface27 arg0, @OriginalArg(2) Object arg1) {
		this.method3823(arg0, arg1);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)I")
	public int method3818() {
		return this.anInt4314;
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V")
	public void method3819() {
		for (@Pc(7) Class4_Sub5_Sub6 local7 = (Class4_Sub5_Sub6) this.aClass367_4.method8308(); local7 != null; local7 = (Class4_Sub5_Sub6) this.aClass367_4.method8309()) {
			if (local7.method7153()) {
				local7.method9000();
				local7.method8990();
				this.anInt4314 += local7.anInt8241;
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)V")
	public void method3820() {
		this.aClass367_4.method8305();
		this.aClass66_19.method1988();
		this.anInt4314 = this.anInt4322;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BI)V")
	public void method3821() {
		if (Static206.aClass176_1 == null) {
			return;
		}
		for (@Pc(21) Class4_Sub5_Sub6 local21 = (Class4_Sub5_Sub6) this.aClass367_4.method8308(); local21 != null; local21 = (Class4_Sub5_Sub6) this.aClass367_4.method8309()) {
			if (local21.method7153()) {
				if (local21.method7154() == null) {
					local21.method9000();
					local21.method8990();
					this.anInt4314 += local21.anInt8241;
				}
			} else if ((long) 5 < ++local21.aLong306) {
				@Pc(43) Class4_Sub5_Sub6 local43 = Static206.aClass176_1.method3973(local21);
				this.aClass66_19.method1985(local43, local21.aLong307);
				Static515.method6981(local21, local43);
				local21.method9000();
				local21.method8990();
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILclient!pm;)V")
	private void method3822(@OriginalArg(1) Class4_Sub5_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method9000();
			arg0.method8990();
			this.anInt4314 += arg0.anInt8241;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILclient!we;Ljava/lang/Object;I)V")
	private void method3823(@OriginalArg(1) Interface27 arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt4322 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3815(arg0);
		this.anInt4314--;
		while (this.anInt4314 < 0) {
			@Pc(36) Class4_Sub5_Sub6 local36 = (Class4_Sub5_Sub6) this.aClass367_4.method8311();
			this.method3822(local36);
		}
		@Pc(53) Class4_Sub5_Sub6_Sub1 local53 = new Class4_Sub5_Sub6_Sub1(arg0, arg1, 1);
		this.aClass66_19.method1985(local53, arg0.method5131());
		this.aClass367_4.method8310(local53);
		local53.aLong306 = (long) 0;
	}
}
