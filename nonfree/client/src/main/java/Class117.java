import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class117 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "Lclient!cs;")
	private final Class42 aClass42_8 = new Class42();

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
	private final int anInt3183;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	private int anInt3180;

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "Lclient!bj;")
	private final Class27 aClass27_22;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
	public Class117(@OriginalArg(0) int arg0) {
		this.anInt3183 = arg0;
		this.anInt3180 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass27_22 = new Class27(local16);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!wv;)V")
	private void method2723(@OriginalArg(1) Class1_Sub2_Sub9 arg0) {
		if (arg0 != null) {
			arg0.method6071();
			arg0.method5883();
			this.anInt3180 += arg0.anInt5539;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLclient!cg;)V")
	private void method2724(@OriginalArg(1) Interface2 arg0) {
		@Pc(16) long local16 = arg0.method1957();
		for (@Pc(23) Class1_Sub2_Sub9 local23 = (Class1_Sub2_Sub9) this.aClass27_22.method553(local16); local23 != null; local23 = (Class1_Sub2_Sub9) this.aClass27_22.method565()) {
			if (local23.anInterface2_3.method1958(arg0)) {
				this.method2723(local23);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
	public int method2725() {
		return this.anInt3180;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I")
	public int method2727() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLjava/lang/Object;Lclient!cg;I)V")
	private void method2728(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface2 arg1) {
		if (this.anInt3183 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2724(arg1);
		this.anInt3180--;
		while (this.anInt3180 < 0) {
			@Pc(40) Class1_Sub2_Sub9 local40 = (Class1_Sub2_Sub9) this.aClass42_8.method1067();
			this.method2723(local40);
		}
		@Pc(54) Class1_Sub2_Sub9_Sub1 local54 = new Class1_Sub2_Sub9_Sub1(arg1, arg0, 1);
		this.aClass27_22.method564(arg1.method1957(), local54);
		this.aClass42_8.method1068(local54);
		local54.aLong221 = 0L;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	public void method2729() {
		for (@Pc(11) Class1_Sub2_Sub9 local11 = (Class1_Sub2_Sub9) this.aClass42_8.method1061(); local11 != null; local11 = (Class1_Sub2_Sub9) this.aClass42_8.method1063()) {
			if (local11.method4433()) {
				local11.method6071();
				local11.method5883();
				this.anInt3180 += local11.anInt5539;
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
	public void method2730() {
		this.aClass42_8.method1066();
		this.aClass27_22.method566();
		this.anInt3180 = this.anInt3183;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)V")
	public void method2732() {
		if (Static133.aClass48_1 == null) {
			return;
		}
		for (@Pc(17) Class1_Sub2_Sub9 local17 = (Class1_Sub2_Sub9) this.aClass42_8.method1061(); local17 != null; local17 = (Class1_Sub2_Sub9) this.aClass42_8.method1063()) {
			if (local17.method4433()) {
				if (local17.method4434() == null) {
					local17.method6071();
					local17.method5883();
					this.anInt3180 += local17.anInt5539;
				}
			} else if (++local17.aLong221 > (long) 5) {
				@Pc(62) Class1_Sub2_Sub9 local62 = Static133.aClass48_1.method1150(local17);
				this.aClass27_22.method564(local17.aLong227, local62);
				Static246.method3620(local17, local62);
				local17.method6071();
				local17.method5883();
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!cg;ILjava/lang/Object;)V")
	public void method2733(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) Object arg1) {
		this.method2728(arg1, arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!cg;I)Ljava/lang/Object;")
	public Object method2735(@OriginalArg(0) Interface2 arg0) {
		@Pc(9) long local9 = arg0.method1957();
		for (@Pc(24) Class1_Sub2_Sub9 local24 = (Class1_Sub2_Sub9) this.aClass27_22.method553(local9); local24 != null; local24 = (Class1_Sub2_Sub9) this.aClass27_22.method565()) {
			if (local24.anInterface2_3.method1958(arg0)) {
				@Pc(36) Object local36 = local24.method4434();
				if (local36 != null) {
					if (local24.method4433()) {
						@Pc(65) Class1_Sub2_Sub9_Sub1 local65 = new Class1_Sub2_Sub9_Sub1(arg0, local36, local24.anInt5539);
						this.aClass27_22.method564(local24.aLong227, local65);
						this.aClass42_8.method1068(local65);
						local65.aLong221 = 0L;
						local24.method6071();
						local24.method5883();
					} else {
						this.aClass42_8.method1068(local24);
						local24.aLong221 = 0L;
					}
					return local36;
				}
				local24.method6071();
				local24.method5883();
				this.anInt3180 += local24.anInt5539;
			}
		}
		return null;
	}
}
