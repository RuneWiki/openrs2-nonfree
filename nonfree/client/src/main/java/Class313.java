import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class313 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!il;")
	private final Class162 aClass162_38;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
	private final int anInt8393;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
	private int anInt8398;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "Lclient!je;")
	private final Class171 aClass171_6;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V")
	public Class313(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(II)V")
	public Class313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass171_6 = new Class171();
		this.anInt8393 = arg0;
		this.anInt8398 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass162_38 = new Class162(local14);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I")
	public int method6975() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class2_Sub3_Sub9 local13 = (Class2_Sub3_Sub9) this.aClass171_6.method3796(); local13 != null; local13 = (Class2_Sub3_Sub9) this.aClass171_6.method3786()) {
			if (!local13.method4640()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public void method6977() {
		this.aClass171_6.method3790();
		this.aClass162_38.method3518();
		this.anInt8398 = this.anInt8393;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I")
	public int method6979() {
		return this.anInt8393;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method6980(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method6986(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method6981() {
		@Pc(11) Class2_Sub3_Sub9 local11 = (Class2_Sub3_Sub9) this.aClass162_38.method3527();
		while (local11 != null) {
			@Pc(20) Object local20 = local11.method4641();
			if (local20 != null) {
				return local20;
			}
			@Pc(24) Class2_Sub3_Sub9 local24 = local11;
			local11 = (Class2_Sub3_Sub9) this.aClass162_38.method3523();
			local24.method7966();
			local24.method7767();
			this.anInt8398 += local24.anInt5541;
		}
		return null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
	public void method6982(@OriginalArg(1) int arg0) {
		if (Static379.aClass330_1 == null) {
			return;
		}
		for (@Pc(19) Class2_Sub3_Sub9 local19 = (Class2_Sub3_Sub9) this.aClass171_6.method3796(); local19 != null; local19 = (Class2_Sub3_Sub9) this.aClass171_6.method3786()) {
			if (local19.method4640()) {
				if (local19.method4641() == null) {
					local19.method7966();
					local19.method7767();
					this.anInt8398++;
				}
			} else if ((long) arg0 < ++local19.aLong260) {
				@Pc(59) Class2_Sub3_Sub9 local59 = Static379.aClass330_1.method7649(local19);
				this.aClass162_38.method3522(local59, local19.aLong268);
				Static505.method7025(local19, local59);
				local19.method7966();
				local19.method7767();
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public void method6983() {
		for (@Pc(11) Class2_Sub3_Sub9 local11 = (Class2_Sub3_Sub9) this.aClass171_6.method3796(); local11 != null; local11 = (Class2_Sub3_Sub9) this.aClass171_6.method3786()) {
			if (local11.method4640()) {
				local11.method7966();
				local11.method7767();
				this.anInt8398 += local11.anInt5541;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)I")
	public int method6984() {
		return this.anInt8398;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BIJLjava/lang/Object;)V")
	public void method6986(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Object arg2) {
		if (this.anInt8393 < arg0) {
			throw new IllegalStateException("s>cs");
		}
		this.method6990(arg1);
		this.anInt8398 -= arg0;
		while (this.anInt8398 < 0) {
			@Pc(36) Class2_Sub3_Sub9 local36 = (Class2_Sub3_Sub9) this.aClass171_6.method3787();
			this.method6987(local36);
		}
		@Pc(52) Class2_Sub3_Sub9_Sub1 local52 = new Class2_Sub3_Sub9_Sub1(arg2, arg0);
		this.aClass162_38.method3522(local52, arg1);
		this.aClass171_6.method3791(local52);
		local52.aLong260 = 0L;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!sp;I)V")
	private void method6987(@OriginalArg(0) Class2_Sub3_Sub9 arg0) {
		if (arg0 != null) {
			arg0.method7966();
			arg0.method7767();
			this.anInt8398 += arg0.anInt5541;
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method6988() {
		@Pc(17) Class2_Sub3_Sub9 local17 = (Class2_Sub3_Sub9) this.aClass162_38.method3523();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method4641();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class2_Sub3_Sub9 local29 = local17;
			local17 = (Class2_Sub3_Sub9) this.aClass162_38.method3523();
			local29.method7966();
			local29.method7767();
			this.anInt8398 += local29.anInt5541;
		}
		return null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public Object method6989(@OriginalArg(0) long arg0) {
		@Pc(17) Class2_Sub3_Sub9 local17 = (Class2_Sub3_Sub9) this.aClass162_38.method3519(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(27) Object local27 = local17.method4641();
		if (local27 == null) {
			local17.method7966();
			local17.method7767();
			this.anInt8398 += local17.anInt5541;
			return null;
		}
		if (local17.method4640()) {
			@Pc(67) Class2_Sub3_Sub9_Sub1 local67 = new Class2_Sub3_Sub9_Sub1(local27, local17.anInt5541);
			this.aClass162_38.method3522(local67, local17.aLong268);
			this.aClass171_6.method3791(local67);
			local67.aLong260 = 0L;
			local17.method7966();
			local17.method7767();
		} else {
			this.aClass171_6.method3791(local17);
			local17.aLong260 = 0L;
		}
		return local27;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IJ)V")
	private void method6990(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub3_Sub9 local10 = (Class2_Sub3_Sub9) this.aClass162_38.method3519(arg0);
		this.method6987(local10);
	}
}
