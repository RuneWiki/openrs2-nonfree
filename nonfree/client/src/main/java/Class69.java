import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class69 {

	@OriginalMember(owner = "client!er", name = "h", descriptor = "Lclient!kn;")
	private final Class140 aClass140_2 = new Class140();

	@OriginalMember(owner = "client!er", name = "i", descriptor = "I")
	private int anInt2131;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "I")
	private final int anInt2134;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "Lclient!qo;")
	private final Class196 aClass196_7;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(I)V")
	public Class69(@OriginalArg(0) int arg0) {
		this.anInt2131 = arg0;
		this.anInt2134 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass196_7 = new Class196(local14);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method1590(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method1601(arg0, arg1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public Object method1591(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub1_Sub2 local10 = (Class4_Sub1_Sub2) this.aClass196_7.method4477(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(23) Object local23 = local10.method5314();
		if (local23 == null) {
			local10.method5854();
			local10.method5863();
			this.anInt2131 += local10.anInt6848;
			return null;
		}
		if (local10.method5315()) {
			@Pc(63) Class4_Sub1_Sub2_Sub2 local63 = new Class4_Sub1_Sub2_Sub2(local23, local10.anInt6848);
			this.aClass196_7.method4474(local10.aLong225, local63);
			this.aClass140_2.method3015(local63);
			local63.aLong226 = 0L;
			local10.method5854();
			local10.method5863();
		} else {
			this.aClass140_2.method3015(local10);
			local10.aLong226 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(JI)V")
	private void method1592(@OriginalArg(0) long arg0) {
		@Pc(16) Class4_Sub1_Sub2 local16 = (Class4_Sub1_Sub2) this.aClass196_7.method4477(arg0);
		this.method1603(local16);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	public void method1593() {
		this.aClass140_2.method3013();
		this.aClass196_7.method4471();
		this.anInt2131 = this.anInt2134;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)V")
	public void method1594(@OriginalArg(0) int arg0) {
		if (Static71.aClass26_1 == null) {
			return;
		}
		for (@Pc(17) Class4_Sub1_Sub2 local17 = (Class4_Sub1_Sub2) this.aClass140_2.method3014(); local17 != null; local17 = (Class4_Sub1_Sub2) this.aClass140_2.method3018()) {
			if (local17.method5315()) {
				if (local17.method5314() == null) {
					local17.method5854();
					local17.method5863();
					this.anInt2131++;
				}
			} else if (++local17.aLong226 > (long) arg0) {
				@Pc(57) Class4_Sub1_Sub2 local57 = Static71.aClass26_1.method1434(local17);
				this.aClass196_7.method4474(local17.aLong225, local57);
				Static235.method3263(local57, local17);
				local17.method5854();
				local17.method5863();
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method1595() {
		@Pc(9) Class4_Sub1_Sub2 local9 = (Class4_Sub1_Sub2) this.aClass196_7.method4482();
		while (local9 != null) {
			@Pc(18) Object local18 = local9.method5314();
			if (local18 != null) {
				return local18;
			}
			@Pc(24) Class4_Sub1_Sub2 local24 = local9;
			local9 = (Class4_Sub1_Sub2) this.aClass196_7.method4472();
			local24.method5854();
			local24.method5863();
			this.anInt2131 += local9.anInt6848;
		}
		return null;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method1596() {
		@Pc(19) Class4_Sub1_Sub2 local19 = (Class4_Sub1_Sub2) this.aClass196_7.method4472();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method5314();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class4_Sub1_Sub2 local31 = local19;
			local19 = (Class4_Sub1_Sub2) this.aClass196_7.method4472();
			local31.method5854();
			local31.method5863();
			this.anInt2131 += local19.anInt6848;
		}
		return null;
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)I")
	public int method1597() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class4_Sub1_Sub2 local13 = (Class4_Sub1_Sub2) this.aClass140_2.method3014(); local13 != null; local13 = (Class4_Sub1_Sub2) this.aClass140_2.method3018()) {
			if (!local13.method5315()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)I")
	public int method1598() {
		return this.anInt2134;
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(I)I")
	public int method1599() {
		return this.anInt2131;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
	public void method1600() {
		for (@Pc(15) Class4_Sub1_Sub2 local15 = (Class4_Sub1_Sub2) this.aClass140_2.method3014(); local15 != null; local15 = (Class4_Sub1_Sub2) this.aClass140_2.method3018()) {
			if (local15.method5315()) {
				local15.method5854();
				local15.method5863();
				this.anInt2131 += local15.anInt6848;
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IJLjava/lang/Object;Z)V")
	private void method1601(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt2134 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1592(arg0);
		this.anInt2131--;
		while (this.anInt2131 < 0) {
			@Pc(32) Class4_Sub1_Sub2 local32 = (Class4_Sub1_Sub2) this.aClass140_2.method3016();
			this.method1603(local32);
		}
		@Pc(52) Class4_Sub1_Sub2_Sub2 local52 = new Class4_Sub1_Sub2_Sub2(arg1, 1);
		this.aClass196_7.method4474(arg0, local52);
		this.aClass140_2.method3015(local52);
		local52.aLong226 = 0L;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!av;B)V")
	private void method1603(@OriginalArg(0) Class4_Sub1_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method5854();
			arg0.method5863();
			this.anInt2131 += arg0.anInt6848;
		}
	}
}
