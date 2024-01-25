import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class129 {

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Lclient!ld;")
	private final Class145 aClass145_3 = new Class145();

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	private int anInt3794;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
	private final int anInt3803;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "Lclient!ub;")
	private final Class240 aClass240_18;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(I)V")
	public Class129(@OriginalArg(0) int arg0) {
		this.anInt3794 = arg0;
		this.anInt3803 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass240_18 = new Class240(local14);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/Object;BJ)V")
	private void method3022(@OriginalArg(1) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt3803 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3036(arg1);
		this.anInt3794--;
		while (this.anInt3794 < 0) {
			@Pc(45) Class2_Sub2_Sub15 local45 = (Class2_Sub2_Sub15) this.aClass145_3.method3391();
			this.method3033(local45);
		}
		@Pc(61) Class2_Sub2_Sub15_Sub1 local61 = new Class2_Sub2_Sub15_Sub1(arg0, 1);
		this.aClass240_18.method5430(arg1, local61);
		this.aClass145_3.method3387(local61);
		local61.aLong223 = 0L;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method3023(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub2_Sub15 local10 = (Class2_Sub2_Sub15) this.aClass240_18.method5439(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(23) Object local23 = local10.method5630();
		if (local23 == null) {
			local10.method6072();
			local10.method5934();
			this.anInt3794 += local10.anInt7234;
			return null;
		}
		if (local10.method5629()) {
			@Pc(51) Class2_Sub2_Sub15_Sub1 local51 = new Class2_Sub2_Sub15_Sub1(local23, local10.anInt7234);
			this.aClass240_18.method5430(local10.aLong227, local51);
			this.aClass145_3.method3387(local51);
			local51.aLong223 = 0L;
			local10.method6072();
			local10.method5934();
		} else {
			this.aClass145_3.method3387(local10);
			local10.aLong223 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)I")
	public int method3024() {
		return this.anInt3794;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V")
	public void method3025() {
		this.aClass145_3.method3388();
		this.aClass240_18.method5433();
		this.anInt3794 = this.anInt3803;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public void method3026() {
		for (@Pc(11) Class2_Sub2_Sub15 local11 = (Class2_Sub2_Sub15) this.aClass145_3.method3390(); local11 != null; local11 = (Class2_Sub2_Sub15) this.aClass145_3.method3384()) {
			if (local11.method5629()) {
				local11.method6072();
				local11.method5934();
				this.anInt3794 += local11.anInt7234;
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method3027() {
		@Pc(11) Class2_Sub2_Sub15 local11 = (Class2_Sub2_Sub15) this.aClass240_18.method5436();
		while (local11 != null) {
			@Pc(23) Object local23 = local11.method5630();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class2_Sub2_Sub15 local27 = local11;
			local11 = (Class2_Sub2_Sub15) this.aClass240_18.method5436();
			local27.method6072();
			local27.method5934();
			this.anInt3794 += local11.anInt7234;
		}
		return null;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)V")
	public void method3028(@OriginalArg(1) int arg0) {
		if (Static207.aClass138_1 == null) {
			return;
		}
		for (@Pc(21) Class2_Sub2_Sub15 local21 = (Class2_Sub2_Sub15) this.aClass145_3.method3390(); local21 != null; local21 = (Class2_Sub2_Sub15) this.aClass145_3.method3384()) {
			if (local21.method5629()) {
				if (local21.method5630() == null) {
					local21.method6072();
					local21.method5934();
					this.anInt3794++;
				}
			} else if (++local21.aLong223 > (long) arg0) {
				@Pc(61) Class2_Sub2_Sub15 local61 = Static207.aClass138_1.method3253(local21);
				this.aClass240_18.method5430(local21.aLong227, local61);
				Static279.method4127(local21, local61);
				local21.method6072();
				local21.method5934();
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method3029(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method3022(arg0, arg1);
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method3030() {
		@Pc(11) Class2_Sub2_Sub15 local11 = (Class2_Sub2_Sub15) this.aClass240_18.method5438();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method5630();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class2_Sub2_Sub15 local23 = local11;
			local11 = (Class2_Sub2_Sub15) this.aClass240_18.method5436();
			local23.method6072();
			local23.method5934();
			this.anInt3794 += local11.anInt7234;
		}
		return null;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)I")
	public int method3032() {
		return this.anInt3803;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!s;)V")
	private void method3033(@OriginalArg(1) Class2_Sub2_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method6072();
			arg0.method5934();
			this.anInt3794 += arg0.anInt7234;
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)I")
	public int method3034() {
		@Pc(15) int local15 = 0;
		for (@Pc(21) Class2_Sub2_Sub15 local21 = (Class2_Sub2_Sub15) this.aClass145_3.method3390(); local21 != null; local21 = (Class2_Sub2_Sub15) this.aClass145_3.method3384()) {
			if (!local21.method5629()) {
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IJ)V")
	private void method3036(@OriginalArg(1) long arg0) {
		@Pc(14) Class2_Sub2_Sub15 local14 = (Class2_Sub2_Sub15) this.aClass240_18.method5439(arg0);
		this.method3033(local14);
	}
}
