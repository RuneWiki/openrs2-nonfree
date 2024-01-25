import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class37 {

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "Lclient!ql;")
	private final Class169 aClass169_1 = new Class169();

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
	private int anInt1178;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
	private final int anInt1182;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "Lclient!vk;")
	private final Class207 aClass207_3;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(I)V")
	public Class37(@OriginalArg(0) int arg0) {
		this.anInt1178 = arg0;
		this.anInt1182 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass207_3 = new Class207(local14);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method912() {
		@Pc(11) Class1_Sub2_Sub7 local11 = (Class1_Sub2_Sub7) this.aClass207_3.method5560();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method4374();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class1_Sub2_Sub7 local23 = local11;
			local11 = (Class1_Sub2_Sub7) this.aClass207_3.method5559();
			local23.method5796();
			local23.method5784();
			this.anInt1178++;
		}
		return null;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I")
	public int method913() {
		return this.anInt1178;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V")
	public void method914() {
		for (@Pc(13) Class1_Sub2_Sub7 local13 = (Class1_Sub2_Sub7) this.aClass169_1.method4480(); local13 != null; local13 = (Class1_Sub2_Sub7) this.aClass169_1.method4474()) {
			if (local13.method4370()) {
				local13.method5796();
				local13.method5784();
				this.anInt1178++;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method915(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub2_Sub7 local10 = (Class1_Sub2_Sub7) this.aClass207_3.method5555(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(25) Object local25 = local10.method4374();
		if (local25 == null) {
			local10.method5796();
			local10.method5784();
			this.anInt1178++;
			return null;
		}
		if (local10.method4370()) {
			@Pc(52) Class1_Sub2_Sub7_Sub2 local52 = new Class1_Sub2_Sub7_Sub2(local25);
			this.aClass207_3.method5552(local52, local10.aLong214);
			this.aClass169_1.method4475(local52);
			local52.aLong213 = 0L;
			local10.method5796();
			local10.method5784();
		} else {
			this.aClass169_1.method4475(local10);
			local10.aLong213 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IJ)V")
	private void method916(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2_Sub7 local10 = (Class1_Sub2_Sub7) this.aClass207_3.method5555(arg0);
		if (local10 != null) {
			local10.method5796();
			local10.method5784();
			this.anInt1178++;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I")
	public int method917() {
		return this.anInt1182;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	public void method919() {
		this.aClass169_1.method4481();
		this.aClass207_3.method5562();
		this.anInt1178 = this.anInt1182;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)V")
	public void method920(@OriginalArg(1) int arg0) {
		if (Static171.aClass117_1 == null) {
			return;
		}
		for (@Pc(11) Class1_Sub2_Sub7 local11 = (Class1_Sub2_Sub7) this.aClass169_1.method4480(); local11 != null; local11 = (Class1_Sub2_Sub7) this.aClass169_1.method4474()) {
			if (local11.method4370()) {
				if (local11.method4374() == null) {
					local11.method5796();
					local11.method5784();
					this.anInt1178++;
				}
			} else if (++local11.aLong213 > (long) arg0) {
				@Pc(36) Class1_Sub2_Sub7 local36 = Static171.aClass117_1.method2412(local11);
				this.aClass207_3.method5552(local36, local11.aLong214);
				Static290.method5076(local36, local11);
				local11.method5796();
				local11.method5784();
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)I")
	public int method921() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub2_Sub7 local13 = (Class1_Sub2_Sub7) this.aClass169_1.method4480(); local13 != null; local13 = (Class1_Sub2_Sub7) this.aClass169_1.method4474()) {
			if (!local13.method4370()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method922(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method916(arg0);
		if (this.anInt1178 == 0) {
			@Pc(27) Class1_Sub2_Sub7 local27 = (Class1_Sub2_Sub7) this.aClass169_1.method4476();
			local27.method5796();
			local27.method5784();
		} else {
			this.anInt1178--;
		}
		@Pc(42) Class1_Sub2_Sub7_Sub2 local42 = new Class1_Sub2_Sub7_Sub2(arg1);
		this.aClass207_3.method5552(local42, arg0);
		this.aClass169_1.method4475(local42);
		local42.aLong213 = 0L;
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public Object method923() {
		@Pc(11) Class1_Sub2_Sub7 local11 = (Class1_Sub2_Sub7) this.aClass207_3.method5559();
		while (local11 != null) {
			@Pc(23) Object local23 = local11.method4374();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class1_Sub2_Sub7 local27 = local11;
			local11 = (Class1_Sub2_Sub7) this.aClass207_3.method5559();
			local27.method5796();
			local27.method5784();
			this.anInt1178++;
		}
		return null;
	}
}
