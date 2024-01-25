import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class222 {

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	private int anInt5446;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Lclient!gm;")
	private final Class125 aClass125_8;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
	private final int anInt5449;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "Lclient!kea;")
	private final Class187 aClass187_23;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
	public Class222(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(II)V")
	public Class222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass125_8 = new Class125();
		this.anInt5449 = arg0;
		this.anInt5446 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && local14 < arg1; local14 += local14) {
		}
		this.aClass187_23 = new Class187(local14);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public void method4422() {
		for (@Pc(13) Class1_Sub6_Sub12 local13 = (Class1_Sub6_Sub12) this.aClass125_8.method2423(); local13 != null; local13 = (Class1_Sub6_Sub12) this.aClass125_8.method2428()) {
			if (local13.method7763()) {
				local13.method7859();
				local13.method7811();
				this.anInt5446 += local13.anInt9519;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method4423() {
		@Pc(16) Class1_Sub6_Sub12 local16 = (Class1_Sub6_Sub12) this.aClass187_23.method3805();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method7761();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class1_Sub6_Sub12 local28 = local16;
			local16 = (Class1_Sub6_Sub12) this.aClass187_23.method3805();
			local28.method7859();
			local28.method7811();
			this.anInt5446 += local28.anInt9519;
		}
		return null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!vs;)V")
	private void method4424(@OriginalArg(1) Class1_Sub6_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method7859();
			arg0.method7811();
			this.anInt5446 += arg0.anInt9519;
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method4425() {
		@Pc(19) Class1_Sub6_Sub12 local19 = (Class1_Sub6_Sub12) this.aClass187_23.method3799();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method7761();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class1_Sub6_Sub12 local31 = local19;
			local19 = (Class1_Sub6_Sub12) this.aClass187_23.method3805();
			local31.method7859();
			local31.method7811();
			this.anInt5446 += local31.anInt9519;
		}
		return null;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)I")
	public int method4426() {
		return this.anInt5446;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)I")
	public int method4427() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class1_Sub6_Sub12 local18 = (Class1_Sub6_Sub12) this.aClass125_8.method2423(); local18 != null; local18 = (Class1_Sub6_Sub12) this.aClass125_8.method2428()) {
			if (!local18.method7763()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public void method4428() {
		this.aClass125_8.method2420();
		this.aClass187_23.method3801();
		this.anInt5446 = this.anInt5449;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IJ)V")
	private void method4429(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub6_Sub12 local10 = (Class1_Sub6_Sub12) this.aClass187_23.method3797(arg0);
		this.method4424(local10);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method4430(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub6_Sub12 local10 = (Class1_Sub6_Sub12) this.aClass187_23.method3797(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(23) Object local23 = local10.method7761();
		if (local23 == null) {
			local10.method7859();
			local10.method7811();
			this.anInt5446 += local10.anInt9519;
			return null;
		}
		if (local10.method7763()) {
			@Pc(51) Class1_Sub6_Sub12_Sub2 local51 = new Class1_Sub6_Sub12_Sub2(local23, local10.anInt9519);
			this.aClass187_23.method3795(local51, local10.aLong301);
			this.aClass125_8.method2426(local51);
			local51.aLong293 = 0L;
			local10.method7859();
			local10.method7811();
		} else {
			this.aClass125_8.method2426(local10);
			local10.aLong293 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I")
	public int method4432() {
		return this.anInt5449;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
	public void method4433(@OriginalArg(1) int arg0) {
		if (Static256.aClass224_1 == null) {
			return;
		}
		for (@Pc(17) Class1_Sub6_Sub12 local17 = (Class1_Sub6_Sub12) this.aClass125_8.method2423(); local17 != null; local17 = (Class1_Sub6_Sub12) this.aClass125_8.method2428()) {
			if (local17.method7763()) {
				if (local17.method7761() == null) {
					local17.method7859();
					local17.method7811();
					this.anInt5446++;
				}
			} else if (++local17.aLong293 > (long) arg0) {
				@Pc(39) Class1_Sub6_Sub12 local39 = Static256.aClass224_1.method4479(local17);
				this.aClass187_23.method3795(local39, local17.aLong301);
				Static414.method5702(local39, local17);
				local17.method7859();
				local17.method7811();
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method4434(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method4435(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZILjava/lang/Object;J)V")
	public void method4435(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) long arg2) {
		if (arg0 > this.anInt5449) {
			throw new IllegalStateException("s>cs");
		}
		this.method4429(arg2);
		this.anInt5446 -= arg0;
		while (this.anInt5446 < 0) {
			@Pc(36) Class1_Sub6_Sub12 local36 = (Class1_Sub6_Sub12) this.aClass125_8.method2421();
			this.method4424(local36);
		}
		@Pc(52) Class1_Sub6_Sub12_Sub2 local52 = new Class1_Sub6_Sub12_Sub2(arg1, arg0);
		this.aClass187_23.method3795(local52, arg2);
		this.aClass125_8.method2426(local52);
		local52.aLong293 = 0L;
	}
}
