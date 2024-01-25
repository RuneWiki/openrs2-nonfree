import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class91 {

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "Lclient!vt;")
	private final Class262 aClass262_2 = new Class262();

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
	private int anInt2708;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
	private final int anInt2703;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Lclient!bu;")
	private final Class38 aClass38_11;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(I)V")
	public Class91(@OriginalArg(0) int arg0) {
		this.anInt2708 = arg0;
		this.anInt2703 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass38_11 = new Class38(local14);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(JI)V")
	private void method1987(@OriginalArg(0) long arg0) {
		@Pc(18) Class1_Sub1_Sub12 local18 = (Class1_Sub1_Sub12) this.aClass38_11.method765(arg0);
		this.method1997(local18);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method1988(@OriginalArg(1) long arg0) {
		@Pc(18) Class1_Sub1_Sub12 local18 = (Class1_Sub1_Sub12) this.aClass38_11.method765(arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(26) Object local26 = local18.method4222();
		if (local26 == null) {
			local18.method6178();
			local18.method6125();
			this.anInt2708 += local18.anInt5473;
			return null;
		}
		if (local18.method4225()) {
			@Pc(54) Class1_Sub1_Sub12_Sub1 local54 = new Class1_Sub1_Sub12_Sub1(local26, local18.anInt5473);
			this.aClass38_11.method766(local54, local18.aLong228);
			this.aClass262_2.method5876(local54);
			local54.aLong227 = 0L;
			local18.method6178();
			local18.method6125();
		} else {
			this.aClass262_2.method5876(local18);
			local18.aLong227 = 0L;
		}
		return local26;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method1989() {
		@Pc(11) Class1_Sub1_Sub12 local11 = (Class1_Sub1_Sub12) this.aClass38_11.method767();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method4222();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class1_Sub1_Sub12 local23 = local11;
			local11 = (Class1_Sub1_Sub12) this.aClass38_11.method773();
			local23.method6178();
			local23.method6125();
			this.anInt2708 += local11.anInt5473;
		}
		return null;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
	public void method1990(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method1996(arg0, arg1);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)I")
	public int method1991() {
		return this.anInt2708;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	public void method1993() {
		for (@Pc(5) Class1_Sub1_Sub12 local5 = (Class1_Sub1_Sub12) this.aClass262_2.method5882(); local5 != null; local5 = (Class1_Sub1_Sub12) this.aClass262_2.method5879()) {
			if (local5.method4225()) {
				local5.method6178();
				local5.method6125();
				this.anInt2708 += local5.anInt5473;
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)I")
	public int method1994() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) Class1_Sub1_Sub12 local11 = (Class1_Sub1_Sub12) this.aClass262_2.method5882(); local11 != null; local11 = (Class1_Sub1_Sub12) this.aClass262_2.method5879()) {
			if (!local11.method4225()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method1995() {
		@Pc(13) Class1_Sub1_Sub12 local13 = (Class1_Sub1_Sub12) this.aClass38_11.method773();
		while (local13 != null) {
			@Pc(19) Object local19 = local13.method4222();
			if (local19 != null) {
				return local19;
			}
			@Pc(25) Class1_Sub1_Sub12 local25 = local13;
			local13 = (Class1_Sub1_Sub12) this.aClass38_11.method773();
			local25.method6178();
			local25.method6125();
			this.anInt2708 += local13.anInt5473;
		}
		return null;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLjava/lang/Object;JI)V")
	private void method1996(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2703 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1987(arg1);
		this.anInt2708--;
		while (this.anInt2708 < 0) {
			@Pc(29) Class1_Sub1_Sub12 local29 = (Class1_Sub1_Sub12) this.aClass262_2.method5880();
			this.method1997(local29);
		}
		@Pc(42) Class1_Sub1_Sub12_Sub1 local42 = new Class1_Sub1_Sub12_Sub1(arg0, 1);
		this.aClass38_11.method766(local42, arg1);
		this.aClass262_2.method5876(local42);
		local42.aLong227 = 0L;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZLclient!ns;)V")
	private void method1997(@OriginalArg(1) Class1_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method6178();
			arg0.method6125();
			this.anInt2708 += arg0.anInt5473;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)V")
	public void method1998(@OriginalArg(1) int arg0) {
		if (Static435.aClass69_1 == null) {
			return;
		}
		for (@Pc(17) Class1_Sub1_Sub12 local17 = (Class1_Sub1_Sub12) this.aClass262_2.method5882(); local17 != null; local17 = (Class1_Sub1_Sub12) this.aClass262_2.method5879()) {
			if (local17.method4225()) {
				if (local17.method4222() == null) {
					local17.method6178();
					local17.method6125();
					this.anInt2708++;
				}
			} else if (++local17.aLong227 > (long) arg0) {
				@Pc(42) Class1_Sub1_Sub12 local42 = Static435.aClass69_1.method5020(local17);
				this.aClass38_11.method766(local42, local17.aLong228);
				Static446.method6045(local17, local42);
				local17.method6178();
				local17.method6125();
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "(I)V")
	public void method1999() {
		this.aClass262_2.method5875();
		this.aClass38_11.method774();
		this.anInt2708 = this.anInt2703;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)I")
	public int method2000() {
		return this.anInt2703;
	}
}
