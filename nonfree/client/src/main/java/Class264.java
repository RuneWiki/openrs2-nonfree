import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class264 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	private final int anInt7749;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "Lclient!jo;")
	private final Class187 aClass187_55;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	private int anInt7758;

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "Lclient!dha;")
	private final Class73 aClass73_8;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(I)V")
	public Class264(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(II)V")
	public Class264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass73_8 = new Class73();
		this.anInt7749 = arg0;
		this.anInt7758 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass187_55 = new Class187(local14);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!dja;)V")
	private void method6357(@OriginalArg(1) Class14_Sub3_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method9315();
			arg0.method9253();
			this.anInt7758 += arg0.anInt8329;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)I")
	public int method6358() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class14_Sub3_Sub6 local13 = (Class14_Sub3_Sub6) this.aClass73_8.method1826(); local13 != null; local13 = (Class14_Sub3_Sub6) this.aClass73_8.method1827()) {
			if (!local13.method6921()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLjava/lang/Object;JI)V")
	public void method6359(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (this.anInt7749 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method6361(arg1);
		this.anInt7758 -= arg2;
		while (this.anInt7758 < 0) {
			@Pc(42) Class14_Sub3_Sub6 local42 = (Class14_Sub3_Sub6) this.aClass73_8.method1823();
			this.method6357(local42);
		}
		@Pc(58) Class14_Sub3_Sub6_Sub1 local58 = new Class14_Sub3_Sub6_Sub1(arg0, arg2);
		this.aClass187_55.method4077(arg1, local58);
		this.aClass73_8.method1816(local58);
		local58.aLong302 = 0L;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	public void method6360() {
		this.aClass73_8.method1819();
		this.aClass187_55.method4076();
		this.anInt7758 = this.anInt7749;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IJ)V")
	private void method6361(@OriginalArg(1) long arg0) {
		@Pc(12) Class14_Sub3_Sub6 local12 = (Class14_Sub3_Sub6) this.aClass187_55.method4078(arg0);
		this.method6357(local12);
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)I")
	public int method6362() {
		return this.anInt7749;
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method6363() {
		@Pc(11) Class14_Sub3_Sub6 local11 = (Class14_Sub3_Sub6) this.aClass187_55.method4084();
		while (local11 != null) {
			@Pc(25) Object local25 = local11.method6923();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class14_Sub3_Sub6 local31 = local11;
			local11 = (Class14_Sub3_Sub6) this.aClass187_55.method4084();
			local31.method9315();
			local31.method9253();
			this.anInt7758 += local31.anInt8329;
		}
		return null;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(JBLjava/lang/Object;)V")
	public void method6364(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method6359(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method6365() {
		@Pc(11) Class14_Sub3_Sub6 local11 = (Class14_Sub3_Sub6) this.aClass187_55.method4079();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method6923();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class14_Sub3_Sub6 local23 = local11;
			local11 = (Class14_Sub3_Sub6) this.aClass187_55.method4084();
			local23.method9315();
			local23.method9253();
			this.anInt7758 += local23.anInt8329;
		}
		return null;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
	public void method6366(@OriginalArg(0) int arg0) {
		if (Static76.aClass104_1 == null) {
			return;
		}
		for (@Pc(11) Class14_Sub3_Sub6 local11 = (Class14_Sub3_Sub6) this.aClass73_8.method1826(); local11 != null; local11 = (Class14_Sub3_Sub6) this.aClass73_8.method1827()) {
			if (local11.method6921()) {
				if (local11.method6923() == null) {
					local11.method9315();
					local11.method9253();
					this.anInt7758 += local11.anInt8329;
				}
			} else if ((long) arg0 < ++local11.aLong302) {
				@Pc(35) Class14_Sub3_Sub6 local35 = Static76.aClass104_1.method2486(local11);
				this.aClass187_55.method4077(local11.aLong305, local35);
				Static54.method1181(local11, local35);
				local11.method9315();
				local11.method9253();
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method6367(@OriginalArg(1) long arg0) {
		@Pc(19) Class14_Sub3_Sub6 local19 = (Class14_Sub3_Sub6) this.aClass187_55.method4078(arg0);
		if (local19 == null) {
			return null;
		}
		@Pc(27) Object local27 = local19.method6923();
		if (local27 == null) {
			local19.method9315();
			local19.method9253();
			this.anInt7758 += local19.anInt8329;
			return null;
		}
		if (local19.method6921()) {
			@Pc(65) Class14_Sub3_Sub6_Sub1 local65 = new Class14_Sub3_Sub6_Sub1(local27, local19.anInt8329);
			this.aClass187_55.method4077(local19.aLong305, local65);
			this.aClass73_8.method1816(local65);
			local65.aLong302 = 0L;
			local19.method9315();
			local19.method9253();
		} else {
			this.aClass73_8.method1816(local19);
			local19.aLong302 = 0L;
		}
		return local27;
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)V")
	public void method6368() {
		for (@Pc(11) Class14_Sub3_Sub6 local11 = (Class14_Sub3_Sub6) this.aClass73_8.method1826(); local11 != null; local11 = (Class14_Sub3_Sub6) this.aClass73_8.method1827()) {
			if (local11.method6921()) {
				local11.method9315();
				local11.method9253();
				this.anInt7758 += local11.anInt8329;
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(Z)I")
	public int method6369() {
		return this.anInt7758;
	}
}
