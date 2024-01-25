import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class10 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!wd;")
	private final Class384 aClass384_1;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	private final int anInt342;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!lk;")
	private final Class209 aClass209_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
	public Class10(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(II)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass384_1 = new Class384();
		this.anInt339 = arg0;
		this.anInt342 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass209_1 = new Class209(local14);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
	public int method365() {
		return this.anInt342;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method366(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method377(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)I")
	public int method368() {
		return this.anInt339;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public void method369(@OriginalArg(1) int arg0) {
		if (Static166.aClass86_1 == null) {
			return;
		}
		for (@Pc(19) Class6_Sub4_Sub7 local19 = (Class6_Sub4_Sub7) this.aClass384_1.method8910(); local19 != null; local19 = (Class6_Sub4_Sub7) this.aClass384_1.method8908()) {
			if (local19.method4574()) {
				if (local19.method4575() == null) {
					local19.method9174();
					local19.method9043();
					this.anInt339 += local19.anInt5390;
				}
			} else if (++local19.aLong310 > (long) arg0) {
				@Pc(64) Class6_Sub4_Sub7 local64 = Static166.aClass86_1.method2012(local19);
				this.aClass209_1.method5035(local19.aLong314, local64);
				Static579.method8049(local64, local19);
				local19.method9174();
				local19.method9043();
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method371() {
		@Pc(18) Class6_Sub4_Sub7 local18 = (Class6_Sub4_Sub7) this.aClass209_1.method5037();
		while (local18 != null) {
			@Pc(26) Object local26 = local18.method4575();
			if (local26 != null) {
				return local26;
			}
			@Pc(30) Class6_Sub4_Sub7 local30 = local18;
			local18 = (Class6_Sub4_Sub7) this.aClass209_1.method5036();
			local30.method9174();
			local30.method9043();
			this.anInt339 += local30.anInt5390;
		}
		return null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method373(@OriginalArg(1) long arg0) {
		@Pc(15) Class6_Sub4_Sub7 local15 = (Class6_Sub4_Sub7) this.aClass209_1.method5038(arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(23) Object local23 = local15.method4575();
		if (local23 == null) {
			local15.method9174();
			local15.method9043();
			this.anInt339 += local15.anInt5390;
			return null;
		}
		if (local15.method4574()) {
			@Pc(53) Class6_Sub4_Sub7_Sub2 local53 = new Class6_Sub4_Sub7_Sub2(local23, local15.anInt5390);
			this.aClass209_1.method5035(local15.aLong314, local53);
			this.aClass384_1.method8909(local53);
			local53.aLong310 = 0L;
			local15.method9174();
			local15.method9043();
		} else {
			this.aClass384_1.method8909(local15);
			local15.aLong310 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!io;I)V")
	private void method374(@OriginalArg(0) Class6_Sub4_Sub7 arg0) {
		if (arg0 != null) {
			arg0.method9174();
			arg0.method9043();
			this.anInt339 += arg0.anInt5390;
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
	public void method375() {
		this.aClass384_1.method8913();
		this.aClass209_1.method5041();
		this.anInt339 = this.anInt342;
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method376() {
		@Pc(11) Class6_Sub4_Sub7 local11 = (Class6_Sub4_Sub7) this.aClass209_1.method5036();
		while (local11 != null) {
			@Pc(20) Object local20 = local11.method4575();
			if (local20 != null) {
				return local20;
			}
			@Pc(24) Class6_Sub4_Sub7 local24 = local11;
			local11 = (Class6_Sub4_Sub7) this.aClass209_1.method5036();
			local24.method9174();
			local24.method9043();
			this.anInt339 += local24.anInt5390;
		}
		return null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(JLjava/lang/Object;II)V")
	public void method377(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		if (this.anInt342 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method378(arg0);
		this.anInt339 -= arg2;
		while (this.anInt339 < 0) {
			@Pc(38) Class6_Sub4_Sub7 local38 = (Class6_Sub4_Sub7) this.aClass384_1.method8907();
			this.method374(local38);
		}
		@Pc(51) Class6_Sub4_Sub7_Sub2 local51 = new Class6_Sub4_Sub7_Sub2(arg1, arg2);
		this.aClass209_1.method5035(arg0, local51);
		this.aClass384_1.method8909(local51);
		local51.aLong310 = 0L;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(JI)V")
	private void method378(@OriginalArg(0) long arg0) {
		@Pc(16) Class6_Sub4_Sub7 local16 = (Class6_Sub4_Sub7) this.aClass209_1.method5038(arg0);
		this.method374(local16);
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)I")
	public int method379() {
		@Pc(7) int local7 = 0;
		for (@Pc(20) Class6_Sub4_Sub7 local20 = (Class6_Sub4_Sub7) this.aClass384_1.method8910(); local20 != null; local20 = (Class6_Sub4_Sub7) this.aClass384_1.method8908()) {
			if (!local20.method4574()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
	public void method380() {
		for (@Pc(13) Class6_Sub4_Sub7 local13 = (Class6_Sub4_Sub7) this.aClass384_1.method8910(); local13 != null; local13 = (Class6_Sub4_Sub7) this.aClass384_1.method8908()) {
			if (local13.method4574()) {
				local13.method9174();
				local13.method9043();
				this.anInt339 += local13.anInt5390;
			}
		}
	}
}
