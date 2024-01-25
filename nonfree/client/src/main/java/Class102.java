import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class102 {

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
	private final int anInt2888;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "Lclient!ak;")
	private final Class15 aClass15_6;

	@OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
	private int anInt2902;

	@OriginalMember(owner = "client!fba", name = "s", descriptor = "Lclient!qp;")
	private final Class280 aClass280_13;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(I)V")
	public Class102(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(II)V")
	public Class102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass15_6 = new Class15();
		this.anInt2902 = arg0;
		this.anInt2888 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && local14 < arg1; local14 += local14) {
		}
		this.aClass280_13 = new Class280(local14);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/lang/Object;IBJ)V")
	public void method2665(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		if (arg1 > this.anInt2888) {
			throw new IllegalStateException("s>cs");
		}
		this.method2675(arg2);
		this.anInt2902 -= arg1;
		while (this.anInt2902 < 0) {
			@Pc(32) Class3_Sub4_Sub2 local32 = (Class3_Sub4_Sub2) this.aClass15_6.method902();
			this.method2669(local32);
		}
		@Pc(48) Class3_Sub4_Sub2_Sub2 local48 = new Class3_Sub4_Sub2_Sub2(arg0, arg1);
		this.aClass280_13.method7109(local48, arg2);
		this.aClass15_6.method901(local48);
		local48.aLong274 = 0L;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)V")
	public void method2668(@OriginalArg(0) int arg0) {
		if (Static86.aClass198_8 == null) {
			return;
		}
		for (@Pc(9) Class3_Sub4_Sub2 local9 = (Class3_Sub4_Sub2) this.aClass15_6.method897(); local9 != null; local9 = (Class3_Sub4_Sub2) this.aClass15_6.method898()) {
			if (local9.method8738()) {
				if (local9.method8739() == null) {
					local9.method8769();
					local9.method8732();
					this.anInt2902 += local9.anInt10195;
				}
			} else if (++local9.aLong274 > (long) arg0) {
				@Pc(33) Class3_Sub4_Sub2 local33 = Static86.aClass198_8.method6192(local9);
				this.aClass280_13.method7109(local33, local9.aLong276);
				Static544.method7944(local33, local9);
				local9.method8769();
				local9.method8732();
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BLclient!ci;)V")
	private void method2669(@OriginalArg(1) Class3_Sub4_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method8769();
			arg0.method8732();
			this.anInt2902 += arg0.anInt10195;
		}
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method2671() {
		@Pc(17) Class3_Sub4_Sub2 local17 = (Class3_Sub4_Sub2) this.aClass280_13.method7110();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method8739();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class3_Sub4_Sub2 local29 = local17;
			local17 = (Class3_Sub4_Sub2) this.aClass280_13.method7108();
			local29.method8769();
			local29.method8732();
			this.anInt2902 += local29.anInt10195;
		}
		return null;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method2672() {
		@Pc(11) Class3_Sub4_Sub2 local11 = (Class3_Sub4_Sub2) this.aClass280_13.method7108();
		while (local11 != null) {
			@Pc(25) Object local25 = local11.method8739();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class3_Sub4_Sub2 local31 = local11;
			local11 = (Class3_Sub4_Sub2) this.aClass280_13.method7108();
			local31.method8769();
			local31.method8732();
			this.anInt2902 += local31.anInt10195;
		}
		return null;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)I")
	public int method2673() {
		return this.anInt2888;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BJLjava/lang/Object;)V")
	public void method2674(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method2665(arg1, 1, arg0);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZJ)V")
	private void method2675(@OriginalArg(1) long arg0) {
		@Pc(14) Class3_Sub4_Sub2 local14 = (Class3_Sub4_Sub2) this.aClass280_13.method7107(arg0);
		this.method2669(local14);
	}

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "(B)I")
	public int method2676() {
		return this.anInt2902;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method2677(@OriginalArg(1) long arg0) {
		@Pc(14) Class3_Sub4_Sub2 local14 = (Class3_Sub4_Sub2) this.aClass280_13.method7107(arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Object local22 = local14.method8739();
		if (local22 == null) {
			local14.method8769();
			local14.method8732();
			this.anInt2902 += local14.anInt10195;
			return null;
		}
		if (local14.method8738()) {
			@Pc(62) Class3_Sub4_Sub2_Sub2 local62 = new Class3_Sub4_Sub2_Sub2(local22, local14.anInt10195);
			this.aClass280_13.method7109(local62, local14.aLong276);
			this.aClass15_6.method901(local62);
			local62.aLong274 = 0L;
			local14.method8769();
			local14.method8732();
		} else {
			this.aClass15_6.method901(local14);
			local14.aLong274 = 0L;
		}
		return local22;
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)I")
	public int method2679() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class3_Sub4_Sub2 local13 = (Class3_Sub4_Sub2) this.aClass15_6.method897(); local13 != null; local13 = (Class3_Sub4_Sub2) this.aClass15_6.method898()) {
			if (!local13.method8738()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)V")
	public void method2680() {
		for (@Pc(14) Class3_Sub4_Sub2 local14 = (Class3_Sub4_Sub2) this.aClass15_6.method897(); local14 != null; local14 = (Class3_Sub4_Sub2) this.aClass15_6.method898()) {
			if (local14.method8738()) {
				local14.method8769();
				local14.method8732();
				this.anInt2902 += local14.anInt10195;
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V")
	public void method2681() {
		this.aClass15_6.method903();
		this.aClass280_13.method7100();
		this.anInt2902 = this.anInt2888;
	}
}
