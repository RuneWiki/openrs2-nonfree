import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class75 {

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "Lclient!ql;")
	private final Class169 aClass169_3 = new Class169();

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
	private int anInt1771;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
	private final int anInt1763;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Lclient!vk;")
	private final Class207 aClass207_8;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(I)V")
	public Class75(@OriginalArg(0) int arg0) {
		this.anInt1771 = arg0;
		this.anInt1763 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass207_8 = new Class207(local14);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public void method1459() {
		this.aClass169_3.method4481();
		this.aClass207_8.method5562();
		this.anInt1771 = this.anInt1763;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)I")
	public int method1460() {
		return this.anInt1771;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/Object;Lclient!kb;I)V")
	public void method1462(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface7 arg1) {
		this.method1464(arg1);
		if (this.anInt1771 == 0) {
			@Pc(32) Class1_Sub2_Sub6 local32 = (Class1_Sub2_Sub6) this.aClass169_3.method4476();
			local32.method5796();
			local32.method5784();
		} else {
			this.anInt1771--;
		}
		@Pc(44) Class1_Sub2_Sub6_Sub1 local44 = new Class1_Sub2_Sub6_Sub1(arg1, arg0);
		this.aClass207_8.method5552(local44, arg1.method354());
		this.aClass169_3.method4475(local44);
		local44.aLong213 = 0L;
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)I")
	public int method1463() {
		return this.anInt1763;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!kb;I)V")
	private void method1464(@OriginalArg(0) Interface7 arg0) {
		@Pc(11) long local11 = arg0.method354();
		for (@Pc(23) Class1_Sub2_Sub6 local23 = (Class1_Sub2_Sub6) this.aClass207_8.method5555(local11); local23 != null; local23 = (Class1_Sub2_Sub6) this.aClass207_8.method5563()) {
			if (local23.anInterface7_3.method353(arg0)) {
				local23.method5796();
				local23.method5784();
				this.anInt1771++;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)V")
	public void method1465() {
		if (Static214.aClass2_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub2_Sub6 local13 = (Class1_Sub2_Sub6) this.aClass169_3.method4480(); local13 != null; local13 = (Class1_Sub2_Sub6) this.aClass169_3.method4474()) {
			if (local13.method2976()) {
				if (local13.method2973() == null) {
					local13.method5796();
					local13.method5784();
					this.anInt1771++;
				}
			} else if (++local13.aLong213 > (long) 5) {
				@Pc(57) Class1_Sub2_Sub6 local57 = Static214.aClass2_1.method25(local13);
				this.aClass207_8.method5552(local57, local13.aLong214);
				Static290.method5076(local57, local13);
				local13.method5796();
				local13.method5784();
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!kb;Z)Ljava/lang/Object;")
	public Object method1466(@OriginalArg(0) Interface7 arg0) {
		@Pc(9) long local9 = arg0.method354();
		for (@Pc(16) Class1_Sub2_Sub6 local16 = (Class1_Sub2_Sub6) this.aClass207_8.method5555(local9); local16 != null; local16 = (Class1_Sub2_Sub6) this.aClass207_8.method5563()) {
			if (local16.anInterface7_3.method353(arg0)) {
				@Pc(28) Object local28 = local16.method2973();
				if (local28 != null) {
					if (local16.method2976()) {
						@Pc(54) Class1_Sub2_Sub6_Sub1 local54 = new Class1_Sub2_Sub6_Sub1(arg0, local28);
						this.aClass207_8.method5552(local54, local16.aLong214);
						this.aClass169_3.method4475(local54);
						local54.aLong213 = 0L;
						local16.method5796();
						local16.method5784();
					} else {
						this.aClass169_3.method4475(local16);
						local16.aLong213 = 0L;
					}
					return local28;
				}
				local16.method5796();
				local16.method5784();
				this.anInt1771++;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)V")
	public void method1467() {
		for (@Pc(15) Class1_Sub2_Sub6 local15 = (Class1_Sub2_Sub6) this.aClass169_3.method4480(); local15 != null; local15 = (Class1_Sub2_Sub6) this.aClass169_3.method4474()) {
			if (local15.method2976()) {
				local15.method5796();
				local15.method5784();
				this.anInt1771++;
			}
		}
	}
}
