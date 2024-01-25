import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class160 {

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "Lclient!go;")
	private final Class87 aClass87_11 = new Class87();

	@OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
	private int anInt3927;

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
	private final int anInt3925;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Lclient!wk;")
	private final Class246 aClass246_19;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(I)V")
	public Class160(@OriginalArg(0) int arg0) {
		this.anInt3927 = arg0;
		this.anInt3925 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass246_19 = new Class246(local14);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I")
	public int method3593() {
		return this.anInt3925;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!rg;I)V")
	private void method3594(@OriginalArg(0) Class2_Sub10_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method5617();
			arg0.method5572();
			this.anInt3927 += arg0.anInt6494;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public void method3595() {
		this.aClass87_11.method2358();
		this.aClass246_19.method5610();
		this.anInt3927 = this.anInt3925;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJLjava/lang/Object;I)V")
	private void method3596(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt3925 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3598(arg0);
		this.anInt3927--;
		while (this.anInt3927 < 0) {
			@Pc(29) Class2_Sub10_Sub5 local29 = (Class2_Sub10_Sub5) this.aClass87_11.method2359();
			this.method3594(local29);
		}
		@Pc(45) Class2_Sub10_Sub5_Sub1 local45 = new Class2_Sub10_Sub5_Sub1(arg1, 1);
		this.aClass246_19.method5609(local45, arg0);
		this.aClass87_11.method2360(local45);
		local45.aLong206 = 0L;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJ)V")
	private void method3598(@OriginalArg(1) long arg0) {
		@Pc(12) Class2_Sub10_Sub5 local12 = (Class2_Sub10_Sub5) this.aClass246_19.method5613(arg0);
		this.method3594(local12);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method3599(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub10_Sub5 local10 = (Class2_Sub10_Sub5) this.aClass246_19.method5613(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method5575();
		if (local18 == null) {
			local10.method5617();
			local10.method5572();
			this.anInt3927 += local10.anInt6494;
			return null;
		}
		if (local10.method5576()) {
			@Pc(63) Class2_Sub10_Sub5_Sub1 local63 = new Class2_Sub10_Sub5_Sub1(local18, local10.anInt6494);
			this.aClass246_19.method5609(local63, local10.aLong209);
			this.aClass87_11.method2360(local63);
			local63.aLong206 = 0L;
			local10.method5617();
			local10.method5572();
		} else {
			this.aClass87_11.method2360(local10);
			local10.aLong206 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I")
	public int method3600() {
		return this.anInt3927;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(JBLjava/lang/Object;)V")
	public void method3602(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method3596(arg0, arg1);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)I")
	public int method3603() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class2_Sub10_Sub5 local13 = (Class2_Sub10_Sub5) this.aClass87_11.method2353(); local13 != null; local13 = (Class2_Sub10_Sub5) this.aClass87_11.method2352()) {
			if (!local13.method5576()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method3604() {
		@Pc(11) Class2_Sub10_Sub5 local11 = (Class2_Sub10_Sub5) this.aClass246_19.method5606();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method5575();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class2_Sub10_Sub5 local23 = local11;
			local11 = (Class2_Sub10_Sub5) this.aClass246_19.method5614();
			local23.method5617();
			local23.method5572();
			this.anInt3927 += local11.anInt6494;
		}
		return null;
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)V")
	public void method3605() {
		for (@Pc(11) Class2_Sub10_Sub5 local11 = (Class2_Sub10_Sub5) this.aClass87_11.method2353(); local11 != null; local11 = (Class2_Sub10_Sub5) this.aClass87_11.method2352()) {
			if (local11.method5576()) {
				local11.method5617();
				local11.method5572();
				this.anInt3927 += local11.anInt6494;
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)V")
	public void method3606(@OriginalArg(1) int arg0) {
		if (Static367.aClass193_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub10_Sub5 local9 = (Class2_Sub10_Sub5) this.aClass87_11.method2353(); local9 != null; local9 = (Class2_Sub10_Sub5) this.aClass87_11.method2352()) {
			if (local9.method5576()) {
				if (local9.method5575() == null) {
					local9.method5617();
					local9.method5572();
					this.anInt3927++;
				}
			} else if (++local9.aLong206 > (long) arg0) {
				@Pc(31) Class2_Sub10_Sub5 local31 = Static367.aClass193_1.method4128(local9);
				this.aClass246_19.method5609(local31, local9.aLong209);
				Static40.method702(local9, local31);
				local9.method5617();
				local9.method5572();
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public Object method3607() {
		@Pc(16) Class2_Sub10_Sub5 local16 = (Class2_Sub10_Sub5) this.aClass246_19.method5614();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method5575();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class2_Sub10_Sub5 local28 = local16;
			local16 = (Class2_Sub10_Sub5) this.aClass246_19.method5614();
			local28.method5617();
			local28.method5572();
			this.anInt3927 += local16.anInt6494;
		}
		return null;
	}
}
