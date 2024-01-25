import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class277 {

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "Lclient!rp;")
	private final Class259 aClass259_10 = new Class259();

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
	private final int anInt7968;

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
	private int anInt7969;

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "Lclient!pt;")
	private final Class230 aClass230_44;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(I)V")
	public Class277(@OriginalArg(0) int arg0) {
		this.anInt7968 = arg0;
		this.anInt7969 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass230_44 = new Class230(local14);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!bea;Z)V")
	private void method7012(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method8239();
			arg0.method7390();
			this.anInt7969 += arg0.anInt6684;
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method7013() {
		@Pc(11) Class1_Sub2_Sub3 local11 = (Class1_Sub2_Sub3) this.aClass230_44.method6137();
		while (local11 != null) {
			@Pc(21) Object local21 = local11.method5995();
			if (local21 != null) {
				return local21;
			}
			@Pc(27) Class1_Sub2_Sub3 local27 = local11;
			local11 = (Class1_Sub2_Sub3) this.aClass230_44.method6140();
			local27.method8239();
			local27.method7390();
			this.anInt7969 += local11.anInt6684;
		}
		return null;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method7014(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2_Sub3 local10 = (Class1_Sub2_Sub3) this.aClass230_44.method6144(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method5995();
		if (local18 == null) {
			local10.method8239();
			local10.method7390();
			this.anInt7969 += local10.anInt6684;
			return null;
		}
		if (local10.method5996()) {
			@Pc(52) Class1_Sub2_Sub3_Sub2 local52 = new Class1_Sub2_Sub3_Sub2(local18, local10.anInt6684);
			this.aClass230_44.method6139(local10.aLong251, local52);
			this.aClass259_10.method6656(local52);
			local52.aLong228 = 0L;
			local10.method8239();
			local10.method7390();
		} else {
			this.aClass259_10.method6656(local10);
			local10.aLong228 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(JB)V")
	private void method7015(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub2_Sub3 local10 = (Class1_Sub2_Sub3) this.aClass230_44.method6144(arg0);
		this.method7012(local10);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
	public void method7016(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method7020(arg0, arg1);
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)I")
	public int method7017() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub2_Sub3 local13 = (Class1_Sub2_Sub3) this.aClass259_10.method6652(); local13 != null; local13 = (Class1_Sub2_Sub3) this.aClass259_10.method6654()) {
			if (!local13.method5996()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(BI)V")
	public void method7018(@OriginalArg(1) int arg0) {
		if (Static442.aClass63_1 == null) {
			return;
		}
		for (@Pc(17) Class1_Sub2_Sub3 local17 = (Class1_Sub2_Sub3) this.aClass259_10.method6652(); local17 != null; local17 = (Class1_Sub2_Sub3) this.aClass259_10.method6654()) {
			if (local17.method5996()) {
				if (local17.method5995() == null) {
					local17.method8239();
					local17.method7390();
					this.anInt7969++;
				}
			} else if (++local17.aLong228 > (long) arg0) {
				@Pc(61) Class1_Sub2_Sub3 local61 = Static442.aClass63_1.method1813(local17);
				this.aClass230_44.method6139(local17.aLong251, local61);
				Static400.method6152(local17, local61);
				local17.method8239();
				local17.method7390();
			}
		}
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V")
	public void method7019() {
		this.aClass259_10.method6653();
		this.aClass230_44.method6141();
		this.anInt7969 = this.anInt7968;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/lang/Object;IJI)V")
	private void method7020(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		if (this.anInt7968 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7015(arg1);
		this.anInt7969--;
		while (this.anInt7969 < 0) {
			@Pc(39) Class1_Sub2_Sub3 local39 = (Class1_Sub2_Sub3) this.aClass259_10.method6658();
			this.method7012(local39);
		}
		@Pc(52) Class1_Sub2_Sub3_Sub2 local52 = new Class1_Sub2_Sub3_Sub2(arg0, 1);
		this.aClass230_44.method6139(arg1, local52);
		this.aClass259_10.method6656(local52);
		local52.aLong228 = 0L;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method7022() {
		@Pc(18) Class1_Sub2_Sub3 local18 = (Class1_Sub2_Sub3) this.aClass230_44.method6140();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method5995();
			if (local24 != null) {
				return local24;
			}
			@Pc(30) Class1_Sub2_Sub3 local30 = local18;
			local18 = (Class1_Sub2_Sub3) this.aClass230_44.method6140();
			local30.method8239();
			local30.method7390();
			this.anInt7969 += local18.anInt6684;
		}
		return null;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)I")
	public int method7023() {
		return this.anInt7969;
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(B)I")
	public int method7024() {
		return this.anInt7968;
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)V")
	public void method7026() {
		for (@Pc(7) Class1_Sub2_Sub3 local7 = (Class1_Sub2_Sub3) this.aClass259_10.method6652(); local7 != null; local7 = (Class1_Sub2_Sub3) this.aClass259_10.method6654()) {
			if (local7.method5996()) {
				local7.method8239();
				local7.method7390();
				this.anInt7969 += local7.anInt6684;
			}
		}
	}
}
