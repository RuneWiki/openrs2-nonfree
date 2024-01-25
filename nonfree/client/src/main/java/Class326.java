import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class326 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!gfa;")
	private final Class117 aClass117_10;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	private final int anInt8771;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	private int anInt8774;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!wh;")
	private final Class356 aClass356_40;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
	public Class326(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(II)V")
	public Class326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass117_10 = new Class117();
		this.anInt8774 = arg0;
		this.anInt8771 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass356_40 = new Class356(local14);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public void method7230() {
		this.aClass117_10.method2555();
		this.aClass356_40.method7802();
		this.anInt8774 = this.anInt8771;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!ok;)V")
	private void method7231(@OriginalArg(1) Class1_Sub3_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method7878();
			arg0.method7811();
			this.anInt8774 += arg0.anInt7193;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLjava/lang/Object;IJ)V")
	public void method7233(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (arg1 > this.anInt8771) {
			throw new IllegalStateException("s>cs");
		}
		this.method7235(arg2);
		this.anInt8774 -= arg1;
		while (this.anInt8774 < 0) {
			@Pc(32) Class1_Sub3_Sub6 local32 = (Class1_Sub3_Sub6) this.aClass117_10.method2556();
			this.method7231(local32);
		}
		@Pc(48) Class1_Sub3_Sub6_Sub2 local48 = new Class1_Sub3_Sub6_Sub2(arg0, arg1);
		this.aClass356_40.method7800(arg2, local48);
		this.aClass117_10.method2550(local48);
		local48.aLong420 = 0L;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public void method7234() {
		for (@Pc(11) Class1_Sub3_Sub6 local11 = (Class1_Sub3_Sub6) this.aClass117_10.method2549(); local11 != null; local11 = (Class1_Sub3_Sub6) this.aClass117_10.method2551()) {
			if (local11.method5932()) {
				local11.method7878();
				local11.method7811();
				this.anInt8774 += local11.anInt7193;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BJ)V")
	private void method7235(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub3_Sub6 local10 = (Class1_Sub3_Sub6) this.aClass356_40.method7796(arg0);
		this.method7231(local10);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
	public void method7236(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method7233(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)I")
	public int method7237() {
		@Pc(15) int local15 = 0;
		for (@Pc(21) Class1_Sub3_Sub6 local21 = (Class1_Sub3_Sub6) this.aClass117_10.method2549(); local21 != null; local21 = (Class1_Sub3_Sub6) this.aClass117_10.method2551()) {
			if (!local21.method5932()) {
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method7238(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub3_Sub6 local10 = (Class1_Sub3_Sub6) this.aClass356_40.method7796(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(24) Object local24 = local10.method5933();
		if (local24 == null) {
			local10.method7878();
			local10.method7811();
			this.anInt8774 += local10.anInt7193;
			return null;
		}
		if (local10.method5932()) {
			@Pc(62) Class1_Sub3_Sub6_Sub2 local62 = new Class1_Sub3_Sub6_Sub2(local24, local10.anInt7193);
			this.aClass356_40.method7800(local10.aLong425, local62);
			this.aClass117_10.method2550(local62);
			local62.aLong420 = 0L;
			local10.method7878();
			local10.method7811();
		} else {
			this.aClass117_10.method2550(local10);
			local10.aLong420 = 0L;
		}
		return local24;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method7239() {
		@Pc(19) Class1_Sub3_Sub6 local19 = (Class1_Sub3_Sub6) this.aClass356_40.method7795();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method5933();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class1_Sub3_Sub6 local31 = local19;
			local19 = (Class1_Sub3_Sub6) this.aClass356_40.method7795();
			local31.method7878();
			local31.method7811();
			this.anInt8774 += local31.anInt7193;
		}
		return null;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)I")
	public int method7240() {
		return this.anInt8774;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)V")
	public void method7241(@OriginalArg(1) int arg0) {
		if (Static333.aClass91_1 == null) {
			return;
		}
		for (@Pc(16) Class1_Sub3_Sub6 local16 = (Class1_Sub3_Sub6) this.aClass117_10.method2549(); local16 != null; local16 = (Class1_Sub3_Sub6) this.aClass117_10.method2551()) {
			if (local16.method5932()) {
				if (local16.method5933() == null) {
					local16.method7878();
					local16.method7811();
					this.anInt8774++;
				}
			} else if (++local16.aLong420 > (long) arg0) {
				@Pc(60) Class1_Sub3_Sub6 local60 = Static333.aClass91_1.method5476(local16);
				this.aClass356_40.method7800(local16.aLong425, local60);
				Static321.method4884(local16, local60);
				local16.method7878();
				local16.method7811();
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method7242() {
		@Pc(16) Class1_Sub3_Sub6 local16 = (Class1_Sub3_Sub6) this.aClass356_40.method7792();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method5933();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class1_Sub3_Sub6 local26 = local16;
			local16 = (Class1_Sub3_Sub6) this.aClass356_40.method7795();
			local26.method7878();
			local26.method7811();
			this.anInt8774 += local26.anInt7193;
		}
		return null;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)I")
	public int method7243() {
		return this.anInt8771;
	}
}
