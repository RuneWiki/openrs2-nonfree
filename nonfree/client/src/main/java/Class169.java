import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class169 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
	private final int anInt5783;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
	private int anInt5785;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "Lclient!mn;")
	private final Class211 aClass211_4;

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "Lclient!eq;")
	private final Class99 aClass99_44;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V")
	public Class169(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(II)V")
	public Class169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass211_4 = new Class211();
		this.anInt5785 = arg0;
		this.anInt5783 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && arg1 > local14; local14 += local14) {
		}
		this.aClass99_44 = new Class99(local14);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)I")
	public int method4994() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class2_Sub6_Sub5 local13 = (Class2_Sub6_Sub5) this.aClass211_4.method6008(); local13 != null; local13 = (Class2_Sub6_Sub5) this.aClass211_4.method6000()) {
			if (!local13.method6812()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)I")
	public int method4996() {
		return this.anInt5783;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)V")
	public void method4997(@OriginalArg(1) int arg0) {
		if (Static192.aClass47_1 == null) {
			return;
		}
		for (@Pc(17) Class2_Sub6_Sub5 local17 = (Class2_Sub6_Sub5) this.aClass211_4.method6008(); local17 != null; local17 = (Class2_Sub6_Sub5) this.aClass211_4.method6000()) {
			if (local17.method6812()) {
				if (local17.method6810() == null) {
					local17.method9253();
					local17.method8933();
					this.anInt5785 += local17.anInt7977;
				}
			} else if (++local17.aLong267 > (long) arg0) {
				@Pc(43) Class2_Sub6_Sub5 local43 = Static192.aClass47_1.method8951(local17);
				this.aClass99_44.method3059(local17.aLong278, local43);
				Static621.method9057(local43, local17);
				local17.method9253();
				local17.method8933();
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method4998() {
		@Pc(11) Class2_Sub6_Sub5 local11 = (Class2_Sub6_Sub5) this.aClass99_44.method3058();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method6810();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class2_Sub6_Sub5 local23 = local11;
			local11 = (Class2_Sub6_Sub5) this.aClass99_44.method3058();
			local23.method9253();
			local23.method8933();
			this.anInt5785 += local23.anInt7977;
		}
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILjava/lang/Object;JI)V")
	public void method4999(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (arg2 > this.anInt5783) {
			throw new IllegalStateException("s>cs");
		}
		this.method5005(arg1);
		this.anInt5785 -= arg2;
		while (this.anInt5785 < 0) {
			@Pc(34) Class2_Sub6_Sub5 local34 = (Class2_Sub6_Sub5) this.aClass211_4.method6005();
			this.method5004(local34);
		}
		@Pc(52) Class2_Sub6_Sub5_Sub2 local52 = new Class2_Sub6_Sub5_Sub2(arg0, arg2);
		this.aClass99_44.method3059(arg1, local52);
		this.aClass211_4.method6002(local52);
		local52.aLong267 = 0L;
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)I")
	public int method5000() {
		return this.anInt5785;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
	public void method5001(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method4999(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method5002(@OriginalArg(0) long arg0) {
		@Pc(18) Class2_Sub6_Sub5 local18 = (Class2_Sub6_Sub5) this.aClass99_44.method3056(arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(26) Object local26 = local18.method6810();
		if (local26 == null) {
			local18.method9253();
			local18.method8933();
			this.anInt5785 += local18.anInt7977;
			return null;
		}
		if (local18.method6812()) {
			@Pc(54) Class2_Sub6_Sub5_Sub2 local54 = new Class2_Sub6_Sub5_Sub2(local26, local18.anInt7977);
			this.aClass99_44.method3059(local18.aLong278, local54);
			this.aClass211_4.method6002(local54);
			local54.aLong267 = 0L;
			local18.method9253();
			local18.method8933();
		} else {
			this.aClass211_4.method6002(local18);
			local18.aLong267 = 0L;
		}
		return local26;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!qia;I)V")
	private void method5004(@OriginalArg(0) Class2_Sub6_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method9253();
			arg0.method8933();
			this.anInt5785 += arg0.anInt7977;
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(JI)V")
	private void method5005(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub6_Sub5 local15 = (Class2_Sub6_Sub5) this.aClass99_44.method3056(arg0);
		this.method5004(local15);
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)V")
	public void method5006() {
		for (@Pc(11) Class2_Sub6_Sub5 local11 = (Class2_Sub6_Sub5) this.aClass211_4.method6008(); local11 != null; local11 = (Class2_Sub6_Sub5) this.aClass211_4.method6000()) {
			if (local11.method6812()) {
				local11.method9253();
				local11.method8933();
				this.anInt5785 += local11.anInt7977;
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public Object method5007() {
		@Pc(11) Class2_Sub6_Sub5 local11 = (Class2_Sub6_Sub5) this.aClass99_44.method3060();
		while (local11 != null) {
			@Pc(24) Object local24 = local11.method6810();
			if (local24 != null) {
				return local24;
			}
			@Pc(28) Class2_Sub6_Sub5 local28 = local11;
			local11 = (Class2_Sub6_Sub5) this.aClass99_44.method3058();
			local28.method9253();
			local28.method8933();
			this.anInt5785 += local28.anInt7977;
		}
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
	public void method5009() {
		this.aClass211_4.method6006();
		this.aClass99_44.method3057();
		this.anInt5785 = this.anInt5783;
	}
}
