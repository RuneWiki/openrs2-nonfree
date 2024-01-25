import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class83 {

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "Lclient!cs;")
	private final Class42 aClass42_1 = new Class42();

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
	private int anInt1983;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
	private final int anInt1981;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!bj;")
	private final Class27 aClass27_15;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
	public Class83(@OriginalArg(0) int arg0) {
		this.anInt1983 = arg0;
		this.anInt1981 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass27_15 = new Class27(local14);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method1658(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub2_Sub17 local10 = (Class1_Sub2_Sub17) this.aClass27_15.method553(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(23) Object local23 = local10.method5738();
		if (local23 == null) {
			local10.method6071();
			local10.method5883();
			this.anInt1983 += local10.anInt7404;
			return null;
		}
		if (local10.method5741()) {
			@Pc(51) Class1_Sub2_Sub17_Sub1 local51 = new Class1_Sub2_Sub17_Sub1(local23, local10.anInt7404);
			this.aClass27_15.method564(local10.aLong227, local51);
			this.aClass42_1.method1068(local51);
			local51.aLong221 = 0L;
			local10.method6071();
			local10.method5883();
		} else {
			this.aClass42_1.method1068(local10);
			local10.aLong221 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method1660() {
		@Pc(13) Class1_Sub2_Sub17 local13 = (Class1_Sub2_Sub17) this.aClass27_15.method555();
		while (local13 != null) {
			@Pc(19) Object local19 = local13.method5738();
			if (local19 != null) {
				return local19;
			}
			@Pc(25) Class1_Sub2_Sub17 local25 = local13;
			local13 = (Class1_Sub2_Sub17) this.aClass27_15.method563();
			local25.method6071();
			local25.method5883();
			this.anInt1983 += local13.anInt7404;
		}
		return null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!sq;)V")
	private void method1661(@OriginalArg(1) Class1_Sub2_Sub17 arg0) {
		if (arg0 != null) {
			arg0.method6071();
			arg0.method5883();
			this.anInt1983 += arg0.anInt7404;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method1662() {
		@Pc(17) Class1_Sub2_Sub17 local17 = (Class1_Sub2_Sub17) this.aClass27_15.method563();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method5738();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class1_Sub2_Sub17 local29 = local17;
			local17 = (Class1_Sub2_Sub17) this.aClass27_15.method563();
			local29.method6071();
			local29.method5883();
			this.anInt1983 += local17.anInt7404;
		}
		return null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
	public void method1663(@OriginalArg(1) int arg0) {
		if (Static23.aClass95_1 == null) {
			return;
		}
		for (@Pc(15) Class1_Sub2_Sub17 local15 = (Class1_Sub2_Sub17) this.aClass42_1.method1061(); local15 != null; local15 = (Class1_Sub2_Sub17) this.aClass42_1.method1063()) {
			if (local15.method5741()) {
				if (local15.method5738() == null) {
					local15.method6071();
					local15.method5883();
					this.anInt1983++;
				}
			} else if (++local15.aLong221 > (long) arg0) {
				@Pc(55) Class1_Sub2_Sub17 local55 = Static23.aClass95_1.method4397(local15);
				this.aClass27_15.method564(local15.aLong227, local55);
				Static246.method3620(local15, local55);
				local15.method6071();
				local15.method5883();
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(JB)V")
	private void method1665(@OriginalArg(0) long arg0) {
		@Pc(16) Class1_Sub2_Sub17 local16 = (Class1_Sub2_Sub17) this.aClass27_15.method553(arg0);
		this.method1661(local16);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public void method1667() {
		for (@Pc(16) Class1_Sub2_Sub17 local16 = (Class1_Sub2_Sub17) this.aClass42_1.method1061(); local16 != null; local16 = (Class1_Sub2_Sub17) this.aClass42_1.method1063()) {
			if (local16.method5741()) {
				local16.method6071();
				local16.method5883();
				this.anInt1983 += local16.anInt7404;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	public void method1669() {
		this.aClass42_1.method1066();
		this.aClass27_15.method566();
		this.anInt1983 = this.anInt1981;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJLjava/lang/Object;Z)V")
	private void method1670(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt1981 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1665(arg0);
		this.anInt1983--;
		while (this.anInt1983 < 0) {
			@Pc(36) Class1_Sub2_Sub17 local36 = (Class1_Sub2_Sub17) this.aClass42_1.method1067();
			this.method1661(local36);
		}
		@Pc(49) Class1_Sub2_Sub17_Sub1 local49 = new Class1_Sub2_Sub17_Sub1(arg1, 1);
		this.aClass27_15.method564(arg0, local49);
		this.aClass42_1.method1068(local49);
		local49.aLong221 = 0L;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)I")
	public int method1672() {
		return this.anInt1983;
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)I")
	public int method1673() {
		return this.anInt1981;
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)I")
	public int method1674() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub2_Sub17 local13 = (Class1_Sub2_Sub17) this.aClass42_1.method1061(); local13 != null; local13 = (Class1_Sub2_Sub17) this.aClass42_1.method1063()) {
			if (!local13.method5741()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method1675(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method1670(arg0, arg1);
	}
}
