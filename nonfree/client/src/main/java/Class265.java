import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class265 {

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!tga;")
	private final Class335 aClass335_40;

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	private int anInt7743;

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!hf;")
	private final Class150 aClass150_10;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
	private final int anInt7746;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V")
	public Class265(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II)V")
	public Class265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass150_10 = new Class150();
		this.anInt7746 = arg0;
		this.anInt7743 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass335_40 = new Class335(local14);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
	public void method6566(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method6572(arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(JB)V")
	private void method6567(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub2_Sub3 local10 = (Class5_Sub2_Sub3) this.aClass335_40.method7766(arg0);
		this.method6571(local10);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public void method6568() {
		this.aClass150_10.method3097();
		this.aClass335_40.method7773();
		this.anInt7743 = this.anInt7746;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method6569() {
		@Pc(18) Class5_Sub2_Sub3 local18 = (Class5_Sub2_Sub3) this.aClass335_40.method7777();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method6866();
			if (local24 != null) {
				return local24;
			}
			@Pc(30) Class5_Sub2_Sub3 local30 = local18;
			local18 = (Class5_Sub2_Sub3) this.aClass335_40.method7777();
			local30.method8829();
			local30.method8569();
			this.anInt7743 += local30.anInt8079;
		}
		return null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
	public void method6570(@OriginalArg(0) int arg0) {
		if (Static427.aClass184_30 == null) {
			return;
		}
		for (@Pc(7) Class5_Sub2_Sub3 local7 = (Class5_Sub2_Sub3) this.aClass150_10.method3100(); local7 != null; local7 = (Class5_Sub2_Sub3) this.aClass150_10.method3096()) {
			if (local7.method6867()) {
				if (local7.method6866() == null) {
					local7.method8829();
					local7.method8569();
					this.anInt7743 += local7.anInt8079;
				}
			} else if (++local7.aLong319 > (long) arg0) {
				@Pc(50) Class5_Sub2_Sub3 local50 = Static427.aClass184_30.method3869(local7);
				this.aClass335_40.method7770(local7.aLong329, local50);
				Static337.method5161(local7, local50);
				local7.method8829();
				local7.method8569();
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!dha;B)V")
	private void method6571(@OriginalArg(0) Class5_Sub2_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method8829();
			arg0.method8569();
			this.anInt7743 += arg0.anInt8079;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZJILjava/lang/Object;)V")
	public void method6572(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2) {
		if (this.anInt7746 < arg1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6567(arg0);
		this.anInt7743 -= arg1;
		while (this.anInt7743 < 0) {
			@Pc(39) Class5_Sub2_Sub3 local39 = (Class5_Sub2_Sub3) this.aClass150_10.method3101();
			this.method6571(local39);
		}
		@Pc(55) Class5_Sub2_Sub3_Sub1 local55 = new Class5_Sub2_Sub3_Sub1(arg2, arg1);
		this.aClass335_40.method7770(arg0, local55);
		this.aClass150_10.method3095(local55);
		local55.aLong319 = 0L;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public void method6573() {
		for (@Pc(12) Class5_Sub2_Sub3 local12 = (Class5_Sub2_Sub3) this.aClass150_10.method3100(); local12 != null; local12 = (Class5_Sub2_Sub3) this.aClass150_10.method3096()) {
			if (local12.method6867()) {
				local12.method8829();
				local12.method8569();
				this.anInt7743 += local12.anInt8079;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)I")
	public int method6574() {
		return this.anInt7743;
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)I")
	public int method6576() {
		return this.anInt7746;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method6577(@OriginalArg(0) long arg0) {
		@Pc(15) Class5_Sub2_Sub3 local15 = (Class5_Sub2_Sub3) this.aClass335_40.method7766(arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(23) Object local23 = local15.method6866();
		if (local23 == null) {
			local15.method8829();
			local15.method8569();
			this.anInt7743 += local15.anInt8079;
			return null;
		}
		if (local15.method6867()) {
			@Pc(60) Class5_Sub2_Sub3_Sub1 local60 = new Class5_Sub2_Sub3_Sub1(local23, local15.anInt8079);
			this.aClass335_40.method7770(local15.aLong329, local60);
			this.aClass150_10.method3095(local60);
			local60.aLong319 = 0L;
			local15.method8829();
			local15.method8569();
		} else {
			this.aClass150_10.method3095(local15);
			local15.aLong319 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method6579() {
		@Pc(11) Class5_Sub2_Sub3 local11 = (Class5_Sub2_Sub3) this.aClass335_40.method7768();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method6866();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class5_Sub2_Sub3 local21 = local11;
			local11 = (Class5_Sub2_Sub3) this.aClass335_40.method7777();
			local21.method8829();
			local21.method8569();
			this.anInt7743 += local21.anInt8079;
		}
		return null;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)I")
	public int method6581() {
		@Pc(5) int local5 = 0;
		for (@Pc(16) Class5_Sub2_Sub3 local16 = (Class5_Sub2_Sub3) this.aClass150_10.method3100(); local16 != null; local16 = (Class5_Sub2_Sub3) this.aClass150_10.method3096()) {
			if (!local16.method6867()) {
				local5++;
			}
		}
		return local5;
	}
}
