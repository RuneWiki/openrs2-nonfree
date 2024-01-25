import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class134 {

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!su;")
	private final Class227 aClass227_4 = new Class227();

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
	private int anInt3871;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
	private final int anInt3878;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "Lclient!gu;")
	private final Class96 aClass96_23;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V")
	public Class134(@OriginalArg(0) int arg0) {
		this.anInt3871 = arg0;
		this.anInt3878 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass96_23 = new Class96(local14);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
	public int method3262() {
		return this.anInt3871;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(JLjava/lang/Object;B)V")
	public void method3263(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method3271(arg1, arg0);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I")
	public int method3264() {
		@Pc(10) int local10 = 0;
		for (@Pc(16) Class1_Sub2_Sub3 local16 = (Class1_Sub2_Sub3) this.aClass227_4.method5109(); local16 != null; local16 = (Class1_Sub2_Sub3) this.aClass227_4.method5107()) {
			if (!local16.method2528()) {
				local10++;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)I")
	public int method3265() {
		return this.anInt3878;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method3266(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub2_Sub3 local10 = (Class1_Sub2_Sub3) this.aClass96_23.method2335(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(24) Object local24 = local10.method2525();
		if (local24 == null) {
			local10.method6020();
			local10.method5813();
			this.anInt3871 += local10.anInt2924;
			return null;
		}
		if (local10.method2528()) {
			@Pc(61) Class1_Sub2_Sub3_Sub1 local61 = new Class1_Sub2_Sub3_Sub1(local24, local10.anInt2924);
			this.aClass96_23.method2341(local10.aLong222, local61);
			this.aClass227_4.method5106(local61);
			local61.aLong213 = 0L;
			local10.method6020();
			local10.method5813();
		} else {
			this.aClass227_4.method5106(local10);
			local10.aLong213 = 0L;
		}
		return local24;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
	public void method3267() {
		for (@Pc(5) Class1_Sub2_Sub3 local5 = (Class1_Sub2_Sub3) this.aClass227_4.method5109(); local5 != null; local5 = (Class1_Sub2_Sub3) this.aClass227_4.method5107()) {
			if (local5.method2528()) {
				local5.method6020();
				local5.method5813();
				this.anInt3871 += local5.anInt2924;
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!vg;I)V")
	private void method3268(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method6020();
			arg0.method5813();
			this.anInt3871 += arg0.anInt2924;
		}
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method3269() {
		@Pc(19) Class1_Sub2_Sub3 local19 = (Class1_Sub2_Sub3) this.aClass96_23.method2342();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method2525();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class1_Sub2_Sub3 local29 = local19;
			local19 = (Class1_Sub2_Sub3) this.aClass96_23.method2339();
			local29.method6020();
			local29.method5813();
			this.anInt3871 += local19.anInt2924;
		}
		return null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public void method3270(@OriginalArg(1) int arg0) {
		if (Static340.aClass20_1 == null) {
			return;
		}
		for (@Pc(11) Class1_Sub2_Sub3 local11 = (Class1_Sub2_Sub3) this.aClass227_4.method5109(); local11 != null; local11 = (Class1_Sub2_Sub3) this.aClass227_4.method5107()) {
			if (local11.method2528()) {
				if (local11.method2525() == null) {
					local11.method6020();
					local11.method5813();
					this.anInt3871++;
				}
			} else if (++local11.aLong213 > (long) arg0) {
				@Pc(49) Class1_Sub2_Sub3 local49 = Static340.aClass20_1.method568(local11);
				this.aClass96_23.method2341(local11.aLong222, local49);
				Static1.method58(local11, local49);
				local11.method6020();
				local11.method5813();
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLjava/lang/Object;JI)V")
	private void method3271(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		if (this.anInt3878 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3274(arg1);
		this.anInt3871--;
		while (this.anInt3871 < 0) {
			@Pc(29) Class1_Sub2_Sub3 local29 = (Class1_Sub2_Sub3) this.aClass227_4.method5104();
			this.method3268(local29);
		}
		@Pc(49) Class1_Sub2_Sub3_Sub1 local49 = new Class1_Sub2_Sub3_Sub1(arg0, 1);
		this.aClass96_23.method2341(arg1, local49);
		this.aClass227_4.method5106(local49);
		local49.aLong213 = 0L;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	public void method3272() {
		this.aClass227_4.method5111();
		this.aClass96_23.method2338();
		this.anInt3871 = this.anInt3878;
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public Object method3273() {
		@Pc(16) Class1_Sub2_Sub3 local16 = (Class1_Sub2_Sub3) this.aClass96_23.method2339();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method2525();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class1_Sub2_Sub3 local28 = local16;
			local16 = (Class1_Sub2_Sub3) this.aClass96_23.method2339();
			local28.method6020();
			local28.method5813();
			this.anInt3871 += local16.anInt2924;
		}
		return null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(JZ)V")
	private void method3274(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub2_Sub3 local10 = (Class1_Sub2_Sub3) this.aClass96_23.method2335(arg0);
		this.method3268(local10);
	}
}
