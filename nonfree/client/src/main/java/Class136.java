import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class136 {

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "Lclient!kp;")
	private final Class180 aClass180_3;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
	private final int anInt3975;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	private int anInt3974;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!hd;")
	private final Class128 aClass128_18;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(II)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass180_3 = new Class180();
		this.anInt3975 = arg0;
		this.anInt3974 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass128_18 = new Class128(local14);
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(I)V")
	public Class136(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public void method3470() {
		this.aClass180_3.method4465();
		this.aClass128_18.method3274();
		this.anInt3974 = this.anInt3975;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!aea;)V")
	private void method3471(@OriginalArg(1) Class6_Sub2_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method7804();
			arg0.method7405();
			this.anInt3974 += arg0.anInt4017;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method3472() {
		@Pc(17) Class6_Sub2_Sub1 local17 = (Class6_Sub2_Sub1) this.aClass128_18.method3265();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method3516();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class6_Sub2_Sub1 local29 = local17;
			local17 = (Class6_Sub2_Sub1) this.aClass128_18.method3273();
			local29.method7804();
			local29.method7405();
			this.anInt3974 += local29.anInt4017;
		}
		return null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
	public Object method3473(@OriginalArg(0) long arg0) {
		@Pc(10) Class6_Sub2_Sub1 local10 = (Class6_Sub2_Sub1) this.aClass128_18.method3263(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method3516();
		if (local18 == null) {
			local10.method7804();
			local10.method7405();
			this.anInt3974 += local10.anInt4017;
			return null;
		}
		if (local10.method3518()) {
			@Pc(46) Class6_Sub2_Sub1_Sub2 local46 = new Class6_Sub2_Sub1_Sub2(local18, local10.anInt4017);
			this.aClass128_18.method3267(local46, local10.aLong263);
			this.aClass180_3.method4468(local46);
			local46.aLong247 = 0L;
			local10.method7804();
			local10.method7405();
		} else {
			this.aClass180_3.method4468(local10);
			local10.aLong247 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
	public void method3474(@OriginalArg(1) int arg0) {
		if (Static435.aClass25_1 == null) {
			return;
		}
		for (@Pc(13) Class6_Sub2_Sub1 local13 = (Class6_Sub2_Sub1) this.aClass180_3.method4466(); local13 != null; local13 = (Class6_Sub2_Sub1) this.aClass180_3.method4473()) {
			if (local13.method3518()) {
				if (local13.method3516() == null) {
					local13.method7804();
					local13.method7405();
					this.anInt3974++;
				}
			} else if (++local13.aLong247 > (long) arg0) {
				@Pc(37) Class6_Sub2_Sub1 local37 = Static435.aClass25_1.method899(local13);
				this.aClass128_18.method3267(local37, local13.aLong263);
				Static344.method5313(local37, local13);
				local13.method7804();
				local13.method7405();
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(JB)V")
	private void method3475(@OriginalArg(0) long arg0) {
		@Pc(10) Class6_Sub2_Sub1 local10 = (Class6_Sub2_Sub1) this.aClass128_18.method3263(arg0);
		this.method3471(local10);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
	public void method3476() {
		for (@Pc(7) Class6_Sub2_Sub1 local7 = (Class6_Sub2_Sub1) this.aClass180_3.method4466(); local7 != null; local7 = (Class6_Sub2_Sub1) this.aClass180_3.method4473()) {
			if (local7.method3518()) {
				local7.method7804();
				local7.method7405();
				this.anInt3974 += local7.anInt4017;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)I")
	public int method3477() {
		return this.anInt3974;
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)I")
	public int method3478() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class6_Sub2_Sub1 local13 = (Class6_Sub2_Sub1) this.aClass180_3.method4466(); local13 != null; local13 = (Class6_Sub2_Sub1) this.aClass180_3.method4473()) {
			if (!local13.method3518()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)I")
	public int method3479() {
		return this.anInt3975;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBLjava/lang/Object;J)V")
	public void method3480(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) long arg2) {
		if (arg0 > this.anInt3975) {
			throw new IllegalStateException("s>cs");
		}
		this.method3475(arg2);
		this.anInt3974 -= arg0;
		while (this.anInt3974 < 0) {
			@Pc(40) Class6_Sub2_Sub1 local40 = (Class6_Sub2_Sub1) this.aClass180_3.method4471();
			this.method3471(local40);
		}
		@Pc(53) Class6_Sub2_Sub1_Sub2 local53 = new Class6_Sub2_Sub1_Sub2(arg1, arg0);
		this.aClass128_18.method3267(local53, arg2);
		this.aClass180_3.method4468(local53);
		local53.aLong247 = 0L;
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public Object method3481() {
		@Pc(17) Class6_Sub2_Sub1 local17 = (Class6_Sub2_Sub1) this.aClass128_18.method3273();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method3516();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class6_Sub2_Sub1 local29 = local17;
			local17 = (Class6_Sub2_Sub1) this.aClass128_18.method3273();
			local29.method7804();
			local29.method7405();
			this.anInt3974 += local29.anInt4017;
		}
		return null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BJLjava/lang/Object;)V")
	public void method3482(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method3480(1, arg1, arg0);
	}
}
