import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class87 {

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "Lclient!p;")
	private final Class159 aClass159_2 = new Class159();

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
	private final int anInt2674;

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
	private int anInt2665;

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "Lclient!tm;")
	private final Class197 aClass197_10;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(I)V")
	public Class87(@OriginalArg(0) int arg0) {
		this.anInt2674 = arg0;
		this.anInt2665 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass197_10 = new Class197(local14);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V")
	public void method2473(@OriginalArg(0) int arg0) {
		if (Static221.aClass176_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub4_Sub4 local13 = (Class1_Sub4_Sub4) this.aClass159_2.method4261(); local13 != null; local13 = (Class1_Sub4_Sub4) this.aClass159_2.method4257()) {
			if (local13.method1929()) {
				if (local13.method1930() == null) {
					local13.method5628();
					local13.method5632();
					this.anInt2665++;
				}
			} else if (++local13.aLong214 > (long) arg0) {
				@Pc(61) Class1_Sub4_Sub4 local61 = Static221.aClass176_1.method5496(local13);
				this.aClass197_10.method5166(local61, local13.aLong213);
				Static58.method1503(local13, local61);
				local13.method5628();
				local13.method5632();
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method2474() {
		@Pc(11) Class1_Sub4_Sub4 local11 = (Class1_Sub4_Sub4) this.aClass197_10.method5161();
		while (local11 != null) {
			@Pc(19) Object local19 = local11.method1930();
			if (local19 != null) {
				return local19;
			}
			@Pc(23) Class1_Sub4_Sub4 local23 = local11;
			local11 = (Class1_Sub4_Sub4) this.aClass197_10.method5154();
			local23.method5628();
			local23.method5632();
			this.anInt2665++;
		}
		return null;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(JI)V")
	private void method2475(@OriginalArg(0) long arg0) {
		@Pc(18) Class1_Sub4_Sub4 local18 = (Class1_Sub4_Sub4) this.aClass197_10.method5157(arg0);
		if (local18 != null) {
			local18.method5628();
			local18.method5632();
			this.anInt2665++;
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)I")
	public int method2476() {
		return this.anInt2674;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
	public void method2477() {
		for (@Pc(11) Class1_Sub4_Sub4 local11 = (Class1_Sub4_Sub4) this.aClass159_2.method4261(); local11 != null; local11 = (Class1_Sub4_Sub4) this.aClass159_2.method4257()) {
			if (local11.method1929()) {
				local11.method5628();
				local11.method5632();
				this.anInt2665++;
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)I")
	public int method2478() {
		return this.anInt2665;
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method2479() {
		@Pc(11) Class1_Sub4_Sub4 local11 = (Class1_Sub4_Sub4) this.aClass197_10.method5154();
		while (local11 != null) {
			@Pc(19) Object local19 = local11.method1930();
			if (local19 != null) {
				return local19;
			}
			@Pc(23) Class1_Sub4_Sub4 local23 = local11;
			local11 = (Class1_Sub4_Sub4) this.aClass197_10.method5154();
			local23.method5628();
			local23.method5632();
			this.anInt2665++;
		}
		return null;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)I")
	public int method2480() {
		@Pc(12) int local12 = 0;
		for (@Pc(18) Class1_Sub4_Sub4 local18 = (Class1_Sub4_Sub4) this.aClass159_2.method4261(); local18 != null; local18 = (Class1_Sub4_Sub4) this.aClass159_2.method4257()) {
			if (!local18.method1929()) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/Object;BJ)V")
	public void method2481(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method2475(arg1);
		if (this.anInt2665 == 0) {
			@Pc(24) Class1_Sub4_Sub4 local24 = (Class1_Sub4_Sub4) this.aClass159_2.method4258();
			local24.method5628();
			local24.method5632();
		} else {
			this.anInt2665--;
		}
		@Pc(35) Class1_Sub4_Sub4_Sub1 local35 = new Class1_Sub4_Sub4_Sub1(arg0);
		this.aClass197_10.method5166(local35, arg1);
		this.aClass159_2.method4262(local35);
		local35.aLong214 = 0L;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public Object method2482(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub4_Sub4 local10 = (Class1_Sub4_Sub4) this.aClass197_10.method5157(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(23) Object local23 = local10.method1930();
		if (local23 == null) {
			local10.method5628();
			local10.method5632();
			this.anInt2665++;
			return null;
		}
		if (local10.method1929()) {
			@Pc(48) Class1_Sub4_Sub4_Sub1 local48 = new Class1_Sub4_Sub4_Sub1(local23);
			this.aClass197_10.method5166(local48, local10.aLong213);
			this.aClass159_2.method4262(local48);
			local48.aLong214 = 0L;
			local10.method5628();
			local10.method5632();
		} else {
			this.aClass159_2.method4262(local10);
			local10.aLong214 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)V")
	public void method2485() {
		this.aClass159_2.method4255();
		this.aClass197_10.method5155();
		this.anInt2665 = this.anInt2674;
	}
}
