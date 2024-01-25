import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class211 {

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!ca;")
	private final Class39 aClass39_3;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!bc;")
	private final Class25 aClass25_24;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	private int anInt6610;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "I")
	private final int anInt6617;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V")
	public Class211(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(II)V")
	public Class211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass39_3 = new Class39();
		this.anInt6610 = arg0;
		this.anInt6617 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && arg1 > local14; local14 += local14) {
		}
		this.aClass25_24 = new Class25(local14);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(JILjava/lang/Object;)V")
	public void method5529(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method5536(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!jda;)V")
	private void method5530(@OriginalArg(1) Class3_Sub4_Sub13 arg0) {
		if (arg0 != null) {
			arg0.method8412();
			arg0.method8309();
			this.anInt6610 += arg0.anInt9924;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
	public int method5531() {
		return this.anInt6610;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
	public int method5532() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) Class3_Sub4_Sub13 local11 = (Class3_Sub4_Sub13) this.aClass39_3.method1270(); local11 != null; local11 = (Class3_Sub4_Sub13) this.aClass39_3.method1275()) {
			if (!local11.method8057()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method5533() {
		@Pc(17) Class3_Sub4_Sub13 local17 = (Class3_Sub4_Sub13) this.aClass25_24.method949();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method8058();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class3_Sub4_Sub13 local29 = local17;
			local17 = (Class3_Sub4_Sub13) this.aClass25_24.method947();
			local29.method8412();
			local29.method8309();
			this.anInt6610 += local29.anInt9924;
		}
		return null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method5534(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub4_Sub13 local10 = (Class3_Sub4_Sub13) this.aClass25_24.method946(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method8058();
		if (local18 == null) {
			local10.method8412();
			local10.method8309();
			this.anInt6610 += local10.anInt9924;
			return null;
		}
		if (local10.method8057()) {
			@Pc(63) Class3_Sub4_Sub13_Sub2 local63 = new Class3_Sub4_Sub13_Sub2(local18, local10.anInt9924);
			this.aClass25_24.method945(local63, local10.aLong262);
			this.aClass39_3.method1273(local63);
			local63.aLong259 = 0L;
			local10.method8412();
			local10.method8309();
		} else {
			this.aClass39_3.method1273(local10);
			local10.aLong259 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public void method5535() {
		this.aClass39_3.method1279();
		this.aClass25_24.method948();
		this.anInt6610 = this.anInt6617;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIJLjava/lang/Object;)V")
	public void method5536(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Object arg2) {
		if (this.anInt6617 < arg0) {
			throw new IllegalStateException("s>cs");
		}
		this.method5540(arg1);
		this.anInt6610 -= arg0;
		while (this.anInt6610 < 0) {
			@Pc(33) Class3_Sub4_Sub13 local33 = (Class3_Sub4_Sub13) this.aClass39_3.method1276();
			this.method5530(local33);
		}
		@Pc(46) Class3_Sub4_Sub13_Sub2 local46 = new Class3_Sub4_Sub13_Sub2(arg2, arg0);
		this.aClass25_24.method945(local46, arg1);
		this.aClass39_3.method1273(local46);
		local46.aLong259 = 0L;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
	public void method5537() {
		for (@Pc(7) Class3_Sub4_Sub13 local7 = (Class3_Sub4_Sub13) this.aClass39_3.method1270(); local7 != null; local7 = (Class3_Sub4_Sub13) this.aClass39_3.method1275()) {
			if (local7.method8057()) {
				local7.method8412();
				local7.method8309();
				this.anInt6610 += local7.anInt9924;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public void method5538(@OriginalArg(1) int arg0) {
		if (Static99.aClass190_1 == null) {
			return;
		}
		for (@Pc(11) Class3_Sub4_Sub13 local11 = (Class3_Sub4_Sub13) this.aClass39_3.method1270(); local11 != null; local11 = (Class3_Sub4_Sub13) this.aClass39_3.method1275()) {
			if (local11.method8057()) {
				if (local11.method8058() == null) {
					local11.method8412();
					local11.method8309();
					this.anInt6610++;
				}
			} else if ((long) arg0 < ++local11.aLong259) {
				@Pc(32) Class3_Sub4_Sub13 local32 = Static99.aClass190_1.method5647(local11);
				this.aClass25_24.method945(local32, local11.aLong262);
				Static300.method6049(local32, local11);
				local11.method8412();
				local11.method8309();
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)I")
	public int method5539() {
		return this.anInt6617;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZJ)V")
	private void method5540(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub4_Sub13 local10 = (Class3_Sub4_Sub13) this.aClass25_24.method946(arg0);
		this.method5530(local10);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method5541() {
		@Pc(19) Class3_Sub4_Sub13 local19 = (Class3_Sub4_Sub13) this.aClass25_24.method947();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method8058();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class3_Sub4_Sub13 local29 = local19;
			local19 = (Class3_Sub4_Sub13) this.aClass25_24.method947();
			local29.method8412();
			local29.method8309();
			this.anInt6610 += local29.anInt9924;
		}
		return null;
	}
}
