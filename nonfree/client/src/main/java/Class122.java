import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class122 {

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!su;")
	private final Class227 aClass227_3 = new Class227();

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
	private final int anInt3347;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	private int anInt3352;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!gu;")
	private final Class96 aClass96_21;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
	public Class122(@OriginalArg(0) int arg0) {
		this.anInt3347 = arg0;
		this.anInt3352 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass96_21 = new Class96(local16);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
	public void method2903() {
		for (@Pc(11) Class1_Sub2_Sub5 local11 = (Class1_Sub2_Sub5) this.aClass227_3.method5109(); local11 != null; local11 = (Class1_Sub2_Sub5) this.aClass227_3.method5107()) {
			if (local11.method5815()) {
				local11.method6020();
				local11.method5813();
				this.anInt3352 += local11.anInt7103;
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)I")
	public int method2904() {
		return this.anInt3347;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!cp;I)Ljava/lang/Object;")
	public Object method2905(@OriginalArg(0) Interface1 arg0) {
		@Pc(12) long local12 = arg0.method4481();
		for (@Pc(19) Class1_Sub2_Sub5 local19 = (Class1_Sub2_Sub5) this.aClass96_21.method2335(local12); local19 != null; local19 = (Class1_Sub2_Sub5) this.aClass96_21.method2340()) {
			if (local19.anInterface1_3.method4480(arg0)) {
				@Pc(30) Object local30 = local19.method5818();
				if (local30 != null) {
					if (local19.method5815()) {
						@Pc(69) Class1_Sub2_Sub5_Sub2 local69 = new Class1_Sub2_Sub5_Sub2(arg0, local30, local19.anInt7103);
						this.aClass96_21.method2341(local19.aLong222, local69);
						this.aClass227_3.method5106(local69);
						local69.aLong213 = 0L;
						local19.method6020();
						local19.method5813();
					} else {
						this.aClass227_3.method5106(local19);
						local19.aLong213 = 0L;
					}
					return local30;
				}
				local19.method6020();
				local19.method5813();
				this.anInt3352 += local19.anInt7103;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
	public void method2906() {
		if (Static87.aClass99_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub2_Sub5 local13 = (Class1_Sub2_Sub5) this.aClass227_3.method5109(); local13 != null; local13 = (Class1_Sub2_Sub5) this.aClass227_3.method5107()) {
			if (local13.method5815()) {
				if (local13.method5818() == null) {
					local13.method6020();
					local13.method5813();
					this.anInt3352 += local13.anInt7103;
				}
			} else if ((long) 5 < ++local13.aLong213) {
				@Pc(56) Class1_Sub2_Sub5 local56 = Static87.aClass99_1.method4623(local13);
				this.aClass96_21.method2341(local13.aLong222, local56);
				Static1.method58(local13, local56);
				local13.method6020();
				local13.method5813();
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLclient!mk;)V")
	private void method2907(@OriginalArg(1) Class1_Sub2_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method6020();
			arg0.method5813();
			this.anInt3352 += arg0.anInt7103;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
	public int method2908() {
		return this.anInt3352;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!cp;Ljava/lang/Object;I)V")
	public void method2909(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1) {
		this.method2911(arg1, arg0);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	public void method2910() {
		this.aClass227_3.method5111();
		this.aClass96_21.method2338();
		this.anInt3352 = this.anInt3347;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/Object;IILclient!cp;)V")
	private void method2911(@OriginalArg(0) Object arg0, @OriginalArg(3) Interface1 arg1) {
		if (this.anInt3347 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2914(arg1);
		this.anInt3352--;
		while (this.anInt3352 < 0) {
			@Pc(35) Class1_Sub2_Sub5 local35 = (Class1_Sub2_Sub5) this.aClass227_3.method5104();
			this.method2907(local35);
		}
		@Pc(49) Class1_Sub2_Sub5_Sub2 local49 = new Class1_Sub2_Sub5_Sub2(arg1, arg0, 1);
		this.aClass96_21.method2341(arg1.method4481(), local49);
		this.aClass227_3.method5106(local49);
		local49.aLong213 = 0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!cp;B)V")
	private void method2914(@OriginalArg(0) Interface1 arg0) {
		@Pc(7) long local7 = arg0.method4481();
		for (@Pc(14) Class1_Sub2_Sub5 local14 = (Class1_Sub2_Sub5) this.aClass96_21.method2335(local7); local14 != null; local14 = (Class1_Sub2_Sub5) this.aClass96_21.method2340()) {
			if (local14.anInterface1_3.method4480(arg0)) {
				this.method2907(local14);
				return;
			}
		}
	}
}
