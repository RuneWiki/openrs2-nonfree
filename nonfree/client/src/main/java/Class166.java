import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class166 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "Lclient!re;")
	private final Class286 aClass286_5;

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "Lclient!he;")
	private final Class128 aClass128_16;

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
	private final int anInt5369;

	@OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
	private int anInt5377;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
	public Class166(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(II)V")
	public Class166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass286_5 = new Class286();
		this.anInt5377 = arg0;
		this.anInt5369 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && local14 < arg1; local14 += local14) {
		}
		this.aClass128_16 = new Class128(local14);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method4797() {
		@Pc(17) Class6_Sub2_Sub6 local17 = (Class6_Sub2_Sub6) this.aClass128_16.method3555();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method4831();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class6_Sub2_Sub6 local27 = local17;
			local17 = (Class6_Sub2_Sub6) this.aClass128_16.method3555();
			local27.method9043();
			local27.method8754();
			this.anInt5377 += local27.anInt5401;
		}
		return null;
	}

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method4799() {
		@Pc(11) Class6_Sub2_Sub6 local11 = (Class6_Sub2_Sub6) this.aClass128_16.method3556();
		while (local11 != null) {
			@Pc(25) Object local25 = local11.method4831();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class6_Sub2_Sub6 local29 = local11;
			local11 = (Class6_Sub2_Sub6) this.aClass128_16.method3555();
			local29.method9043();
			local29.method8754();
			this.anInt5377 += local29.anInt5401;
		}
		return null;
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)I")
	public int method4800() {
		return this.anInt5377;
	}

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V")
	public void method4802() {
		for (@Pc(7) Class6_Sub2_Sub6 local7 = (Class6_Sub2_Sub6) this.aClass286_5.method7242(); local7 != null; local7 = (Class6_Sub2_Sub6) this.aClass286_5.method7241()) {
			if (local7.method4829()) {
				local7.method9043();
				local7.method8754();
				this.anInt5377 += local7.anInt5401;
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public void method4803(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method4807(arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)I")
	public int method4804() {
		@Pc(13) int local13 = 0;
		for (@Pc(19) Class6_Sub2_Sub6 local19 = (Class6_Sub2_Sub6) this.aClass286_5.method7242(); local19 != null; local19 = (Class6_Sub2_Sub6) this.aClass286_5.method7241()) {
			if (!local19.method4829()) {
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method4805(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub2_Sub6 local10 = (Class6_Sub2_Sub6) this.aClass128_16.method3560(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method4831();
		if (local18 == null) {
			local10.method9043();
			local10.method8754();
			this.anInt5377 += local10.anInt5401;
			return null;
		}
		if (local10.method4829()) {
			@Pc(46) Class6_Sub2_Sub6_Sub1 local46 = new Class6_Sub2_Sub6_Sub1(local18, local10.anInt5401);
			this.aClass128_16.method3551(local10.aLong278, local46);
			this.aClass286_5.method7239(local46);
			local46.aLong272 = 0L;
			local10.method9043();
			local10.method8754();
		} else {
			this.aClass286_5.method7239(local10);
			local10.aLong272 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)I")
	public int method4806() {
		return this.anInt5369;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(JIILjava/lang/Object;)V")
	public void method4807(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2) {
		if (arg1 > this.anInt5369) {
			throw new IllegalStateException("s>cs");
		}
		this.method4808(arg0);
		this.anInt5377 -= arg1;
		while (this.anInt5377 < 0) {
			@Pc(42) Class6_Sub2_Sub6 local42 = (Class6_Sub2_Sub6) this.aClass286_5.method7244();
			this.method4810(local42);
		}
		@Pc(58) Class6_Sub2_Sub6_Sub1 local58 = new Class6_Sub2_Sub6_Sub1(arg2, arg1);
		this.aClass128_16.method3551(arg0, local58);
		this.aClass286_5.method7239(local58);
		local58.aLong272 = 0L;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(IJ)V")
	private void method4808(@OriginalArg(1) long arg0) {
		@Pc(17) Class6_Sub2_Sub6 local17 = (Class6_Sub2_Sub6) this.aClass128_16.method3560(arg0);
		this.method4810(local17);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
	public void method4809(@OriginalArg(0) int arg0) {
		if (Static599.aClass155_1 == null) {
			return;
		}
		for (@Pc(17) Class6_Sub2_Sub6 local17 = (Class6_Sub2_Sub6) this.aClass286_5.method7242(); local17 != null; local17 = (Class6_Sub2_Sub6) this.aClass286_5.method7241()) {
			if (local17.method4829()) {
				if (local17.method4831() == null) {
					local17.method9043();
					local17.method8754();
					this.anInt5377 += local17.anInt5401;
				}
			} else if (++local17.aLong272 > (long) arg0) {
				@Pc(39) Class6_Sub2_Sub6 local39 = Static599.aClass155_1.method4482(local17);
				this.aClass128_16.method3551(local17.aLong278, local39);
				Static14.method280(local39, local17);
				local17.method9043();
				local17.method8754();
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!fc;I)V")
	private void method4810(@OriginalArg(0) Class6_Sub2_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method9043();
			arg0.method8754();
			this.anInt5377 += arg0.anInt5401;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
	public void method4811() {
		this.aClass286_5.method7237();
		this.aClass128_16.method3562();
		this.anInt5377 = this.anInt5369;
	}
}
