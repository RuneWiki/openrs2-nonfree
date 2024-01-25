import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class136 {

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
	private final int anInt3673;

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "Lclient!baa;")
	private final Class25 aClass25_20;

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
	private int anInt3683;

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "Lclient!vu;")
	private final Class363 aClass363_18;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(I)V")
	public Class136(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(II)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass363_18 = new Class363();
		this.anInt3673 = arg0;
		this.anInt3683 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass25_20 = new Class25(local14);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	public void method3132(@OriginalArg(1) int arg0) {
		if (Static321.aClass50_1 == null) {
			return;
		}
		for (@Pc(9) Class3_Sub7_Sub15 local9 = (Class3_Sub7_Sub15) this.aClass363_18.method8414(); local9 != null; local9 = (Class3_Sub7_Sub15) this.aClass363_18.method8415()) {
			if (local9.method6724()) {
				if (local9.method6730() == null) {
					local9.method8682();
					local9.method7907();
					this.anInt3683 += local9.anInt7718;
				}
			} else if (++local9.aLong251 > (long) arg0) {
				@Pc(54) Class3_Sub7_Sub15 local54 = Static321.aClass50_1.method1201(local9);
				this.aClass25_20.method434(local9.aLong277, local54);
				Static607.method8328(local9, local54);
				local9.method8682();
				local9.method7907();
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BJ)V")
	private void method3133(@OriginalArg(1) long arg0) {
		@Pc(16) Class3_Sub7_Sub15 local16 = (Class3_Sub7_Sub15) this.aClass25_20.method426(arg0);
		this.method3137(local16);
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method3134(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub7_Sub15 local10 = (Class3_Sub7_Sub15) this.aClass25_20.method426(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(25) Object local25 = local10.method6730();
		if (local25 == null) {
			local10.method8682();
			local10.method7907();
			this.anInt3683 += local10.anInt7718;
			return null;
		}
		if (local10.method6724()) {
			@Pc(67) Class3_Sub7_Sub15_Sub1 local67 = new Class3_Sub7_Sub15_Sub1(local25, local10.anInt7718);
			this.aClass25_20.method434(local10.aLong277, local67);
			this.aClass363_18.method8413(local67);
			local67.aLong251 = 0L;
			local10.method8682();
			local10.method7907();
		} else {
			this.aClass363_18.method8413(local10);
			local10.aLong251 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public void method3135(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method3145(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method3136() {
		@Pc(11) Class3_Sub7_Sub15 local11 = (Class3_Sub7_Sub15) this.aClass25_20.method432();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method6730();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class3_Sub7_Sub15 local23 = local11;
			local11 = (Class3_Sub7_Sub15) this.aClass25_20.method432();
			local23.method8682();
			local23.method7907();
			this.anInt3683 += local23.anInt7718;
		}
		return null;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BLclient!pc;)V")
	private void method3137(@OriginalArg(1) Class3_Sub7_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method8682();
			arg0.method7907();
			this.anInt3683 += arg0.anInt7718;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	public void method3138() {
		for (@Pc(17) Class3_Sub7_Sub15 local17 = (Class3_Sub7_Sub15) this.aClass363_18.method8414(); local17 != null; local17 = (Class3_Sub7_Sub15) this.aClass363_18.method8415()) {
			if (local17.method6724()) {
				local17.method8682();
				local17.method7907();
				this.anInt3683 += local17.anInt7718;
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)I")
	public int method3139() {
		return this.anInt3683;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method3140() {
		@Pc(11) Class3_Sub7_Sub15 local11 = (Class3_Sub7_Sub15) this.aClass25_20.method435();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method6730();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class3_Sub7_Sub15 local21 = local11;
			local11 = (Class3_Sub7_Sub15) this.aClass25_20.method432();
			local21.method8682();
			local21.method7907();
			this.anInt3683 += local21.anInt7718;
		}
		return null;
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "(I)V")
	public void method3142() {
		this.aClass363_18.method8419();
		this.aClass25_20.method433();
		this.anInt3683 = this.anInt3673;
	}

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "(I)I")
	public int method3143() {
		return this.anInt3673;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)I")
	public int method3144() {
		@Pc(12) int local12 = 0;
		for (@Pc(18) Class3_Sub7_Sub15 local18 = (Class3_Sub7_Sub15) this.aClass363_18.method8414(); local18 != null; local18 = (Class3_Sub7_Sub15) this.aClass363_18.method8415()) {
			if (!local18.method6724()) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/lang/Object;BIJ)V")
	public void method3145(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (arg1 > this.anInt3673) {
			throw new IllegalStateException("s>cs");
		}
		this.method3133(arg2);
		this.anInt3683 -= arg1;
		while (this.anInt3683 < 0) {
			@Pc(36) Class3_Sub7_Sub15 local36 = (Class3_Sub7_Sub15) this.aClass363_18.method8420();
			this.method3137(local36);
		}
		@Pc(52) Class3_Sub7_Sub15_Sub1 local52 = new Class3_Sub7_Sub15_Sub1(arg0, arg1);
		this.aClass25_20.method434(arg2, local52);
		this.aClass363_18.method8413(local52);
		local52.aLong251 = 0L;
	}
}
