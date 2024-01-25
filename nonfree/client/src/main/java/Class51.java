import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class51 {

	@OriginalMember(owner = "client!cba", name = "s", descriptor = "Lclient!hf;")
	private final Class150 aClass150_1 = new Class150();

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
	private final int anInt1009;

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "Lclient!tga;")
	private final Class335 aClass335_7;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(I)V")
	public Class51(@OriginalArg(0) int arg0) {
		this.anInt996 = arg0;
		this.anInt1009 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass335_7 = new Class335(local14);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILclient!vc;)V")
	private void method927(@OriginalArg(1) Class5_Sub2_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method8829();
			arg0.method8569();
			this.anInt996 += arg0.anInt9021;
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I")
	public int method928() {
		return this.anInt1009;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZI)V")
	public void method929() {
		if (Static548.aClass213_1 == null) {
			return;
		}
		for (@Pc(12) Class5_Sub2_Sub1 local12 = (Class5_Sub2_Sub1) this.aClass150_1.method3100(); local12 != null; local12 = (Class5_Sub2_Sub1) this.aClass150_1.method3096()) {
			if (local12.method7594()) {
				if (local12.method7595() == null) {
					local12.method8829();
					local12.method8569();
					this.anInt996 += local12.anInt9021;
				}
			} else if (++local12.aLong319 > (long) 5) {
				@Pc(55) Class5_Sub2_Sub1 local55 = Static548.aClass213_1.method5100(local12);
				this.aClass335_7.method7770(local12.aLong329, local55);
				Static337.method5161(local12, local55);
				local12.method8829();
				local12.method8569();
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!pha;B)Ljava/lang/Object;")
	public Object method931(@OriginalArg(0) Interface20 arg0) {
		@Pc(7) long local7 = arg0.method7005();
		for (@Pc(19) Class5_Sub2_Sub1 local19 = (Class5_Sub2_Sub1) this.aClass335_7.method7766(local7); local19 != null; local19 = (Class5_Sub2_Sub1) this.aClass335_7.method7769()) {
			if (local19.anInterface20_3.method7006(arg0)) {
				@Pc(30) Object local30 = local19.method7595();
				if (local30 != null) {
					if (local19.method7594()) {
						@Pc(67) Class5_Sub2_Sub1_Sub2 local67 = new Class5_Sub2_Sub1_Sub2(arg0, local30, local19.anInt9021);
						this.aClass335_7.method7770(local19.aLong329, local67);
						this.aClass150_1.method3095(local67);
						local67.aLong319 = 0L;
						local19.method8829();
						local19.method8569();
					} else {
						this.aClass150_1.method3095(local19);
						local19.aLong319 = 0L;
					}
					return local30;
				}
				local19.method8829();
				local19.method8569();
				this.anInt996 += local19.anInt9021;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
	public void method932() {
		this.aClass150_1.method3097();
		this.aClass335_7.method7773();
		this.anInt996 = this.anInt1009;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILjava/lang/Object;Lclient!pha;)V")
	public void method933(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface20 arg1) {
		this.method938(arg0, arg1);
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)V")
	public void method934() {
		for (@Pc(16) Class5_Sub2_Sub1 local16 = (Class5_Sub2_Sub1) this.aClass150_1.method3100(); local16 != null; local16 = (Class5_Sub2_Sub1) this.aClass150_1.method3096()) {
			if (local16.method7594()) {
				local16.method8829();
				local16.method8569();
				this.anInt996 += local16.anInt9021;
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!pha;I)V")
	private void method935(@OriginalArg(0) Interface20 arg0) {
		@Pc(7) long local7 = arg0.method7005();
		for (@Pc(14) Class5_Sub2_Sub1 local14 = (Class5_Sub2_Sub1) this.aClass335_7.method7766(local7); local14 != null; local14 = (Class5_Sub2_Sub1) this.aClass335_7.method7769()) {
			if (local14.anInterface20_3.method7006(arg0)) {
				this.method927(local14);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILjava/lang/Object;Lclient!pha;)V")
	private void method938(@OriginalArg(2) Object arg0, @OriginalArg(3) Interface20 arg1) {
		if (this.anInt1009 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method935(arg1);
		this.anInt996--;
		while (this.anInt996 < 0) {
			@Pc(29) Class5_Sub2_Sub1 local29 = (Class5_Sub2_Sub1) this.aClass150_1.method3101();
			this.method927(local29);
		}
		@Pc(46) Class5_Sub2_Sub1_Sub2 local46 = new Class5_Sub2_Sub1_Sub2(arg1, arg0, 1);
		this.aClass335_7.method7770(arg1.method7005(), local46);
		this.aClass150_1.method3095(local46);
		local46.aLong319 = (long) 0;
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)I")
	public int method939() {
		return this.anInt996;
	}
}
