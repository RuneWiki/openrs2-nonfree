import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class317 {

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Lclient!fw;")
	private final Class125 aClass125_35;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Lclient!oga;")
	private final Class269 aClass269_137;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
	private final int anInt9136;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
	private int anInt9144;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(I)V")
	public Class317(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(II)V")
	public Class317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass269_137 = new Class269();
		this.anInt9136 = arg0;
		this.anInt9144 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && arg1 > local14; local14 += local14) {
		}
		this.aClass125_35 = new Class125(local14);
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public Object method7867() {
		@Pc(19) Class14_Sub2_Sub1 local19 = (Class14_Sub2_Sub1) this.aClass125_35.method2627();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method8225();
			if (local25 != null) {
				return local25;
			}
			@Pc(32) Class14_Sub2_Sub1 local32 = local19;
			local19 = (Class14_Sub2_Sub1) this.aClass125_35.method2627();
			local32.method9513();
			local32.method9093();
			this.anInt9144 += local32.anInt9522;
		}
		return null;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(JI)V")
	private void method7869(@OriginalArg(0) long arg0) {
		@Pc(14) Class14_Sub2_Sub1 local14 = (Class14_Sub2_Sub1) this.aClass125_35.method2630(arg0);
		this.method7872(local14);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	public void method7870(@OriginalArg(1) int arg0) {
		if (Static342.aClass62_1 == null) {
			return;
		}
		for (@Pc(7) Class14_Sub2_Sub1 local7 = (Class14_Sub2_Sub1) this.aClass269_137.method6494(); local7 != null; local7 = (Class14_Sub2_Sub1) this.aClass269_137.method6491()) {
			if (local7.method8224()) {
				if (local7.method8225() == null) {
					local7.method9513();
					local7.method9093();
					this.anInt9144 += local7.anInt9522;
				}
			} else if (++local7.aLong308 > (long) arg0) {
				@Pc(30) Class14_Sub2_Sub1 local30 = Static342.aClass62_1.method1240(local7);
				this.aClass125_35.method2626(local30, local7.aLong324);
				Static314.method4993(local30, local7);
				local7.method9513();
				local7.method9093();
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/Object;JBI)V")
	public void method7871(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		if (this.anInt9136 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method7869(arg1);
		this.anInt9144 -= arg2;
		while (this.anInt9144 < 0) {
			@Pc(32) Class14_Sub2_Sub1 local32 = (Class14_Sub2_Sub1) this.aClass269_137.method6490();
			this.method7872(local32);
		}
		@Pc(48) Class14_Sub2_Sub1_Sub1 local48 = new Class14_Sub2_Sub1_Sub1(arg0, arg2);
		this.aClass125_35.method2626(local48, arg1);
		this.aClass269_137.method6493(local48);
		local48.aLong308 = 0L;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!eea;I)V")
	private void method7872(@OriginalArg(0) Class14_Sub2_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method9513();
			arg0.method9093();
			this.anInt9144 += arg0.anInt9522;
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
	public void method7873() {
		this.aClass269_137.method6492();
		this.aClass125_35.method2628();
		this.anInt9144 = this.anInt9136;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	public void method7874() {
		for (@Pc(5) Class14_Sub2_Sub1 local5 = (Class14_Sub2_Sub1) this.aClass269_137.method6494(); local5 != null; local5 = (Class14_Sub2_Sub1) this.aClass269_137.method6491()) {
			if (local5.method8224()) {
				local5.method9513();
				local5.method9093();
				this.anInt9144 += local5.anInt9522;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method7875(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method7871(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)I")
	public int method7877() {
		return this.anInt9136;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)I")
	public int method7878() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class14_Sub2_Sub1 local13 = (Class14_Sub2_Sub1) this.aClass269_137.method6494(); local13 != null; local13 = (Class14_Sub2_Sub1) this.aClass269_137.method6491()) {
			if (!local13.method8224()) {
				local7++;
			}
		}
		if (false) {
			return -10;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method7879() {
		@Pc(21) Class14_Sub2_Sub1 local21 = (Class14_Sub2_Sub1) this.aClass125_35.method2633();
		while (local21 != null) {
			@Pc(27) Object local27 = local21.method8225();
			if (local27 != null) {
				return local27;
			}
			@Pc(31) Class14_Sub2_Sub1 local31 = local21;
			local21 = (Class14_Sub2_Sub1) this.aClass125_35.method2627();
			local31.method9513();
			local31.method9093();
			this.anInt9144 += local31.anInt9522;
		}
		return null;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I")
	public int method7881() {
		return this.anInt9144;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method7882(@OriginalArg(1) long arg0) {
		@Pc(16) Class14_Sub2_Sub1 local16 = (Class14_Sub2_Sub1) this.aClass125_35.method2630(arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(25) Object local25 = local16.method8225();
		if (local25 == null) {
			local16.method9513();
			local16.method9093();
			this.anInt9144 += local16.anInt9522;
			return null;
		}
		if (local16.method8224()) {
			@Pc(54) Class14_Sub2_Sub1_Sub1 local54 = new Class14_Sub2_Sub1_Sub1(local25, local16.anInt9522);
			this.aClass125_35.method2626(local54, local16.aLong324);
			this.aClass269_137.method6493(local54);
			local54.aLong308 = 0L;
			local16.method9513();
			local16.method9093();
		} else {
			this.aClass269_137.method6493(local16);
			local16.aLong308 = 0L;
		}
		return local25;
	}
}
