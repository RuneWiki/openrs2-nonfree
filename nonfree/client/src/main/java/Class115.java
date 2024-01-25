import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class115 {

	@OriginalMember(owner = "client!fq", name = "t", descriptor = "[I")
	public static final int[] anIntArray257 = new int[4096];

	@OriginalMember(owner = "client!fq", name = "r", descriptor = "Lclient!jh;")
	private final Class175 aClass175_4 = new Class175();

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
	private final int anInt3655;

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "I")
	private int anInt3659;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "Lclient!mp;")
	private final Class222 aClass222_11;

	static {
		for (@Pc(24) int local24 = 0; local24 < 4096; local24++) {
			anIntArray257[local24] = Static254.method4194(local24);
		}
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(I)V")
	public Class115(@OriginalArg(0) int arg0) {
		this.anInt3655 = arg0;
		this.anInt3659 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass222_11 = new Class222(local14);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!rf;I)V")
	private void method3019(@OriginalArg(0) Interface21 arg0) {
		@Pc(9) long local9 = arg0.method4251();
		for (@Pc(20) Class2_Sub5_Sub7 local20 = (Class2_Sub5_Sub7) this.aClass222_11.method5468(local9); local20 != null; local20 = (Class2_Sub5_Sub7) this.aClass222_11.method5475()) {
			if (local20.anInterface21_3.method4250(arg0)) {
				this.method3025(local20);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLclient!rf;Ljava/lang/Object;)V")
	public void method3021(@OriginalArg(1) Interface21 arg0, @OriginalArg(2) Object arg1) {
		this.method3028(arg1, arg0);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLclient!ir;)V")
	private void method3025(@OriginalArg(1) Class2_Sub5_Sub7 arg0) {
		if (arg0 != null) {
			arg0.method8599();
			arg0.method8464();
			this.anInt3659 += arg0.anInt5374;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public void method3026() {
		for (@Pc(5) Class2_Sub5_Sub7 local5 = (Class2_Sub5_Sub7) this.aClass175_4.method4280(); local5 != null; local5 = (Class2_Sub5_Sub7) this.aClass175_4.method4288()) {
			if (local5.method4486()) {
				local5.method8599();
				local5.method8464();
				this.anInt3659 += local5.anInt5374;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/lang/Object;ILclient!rf;)V")
	private void method3028(@OriginalArg(1) Object arg0, @OriginalArg(3) Interface21 arg1) {
		if (this.anInt3655 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3019(arg1);
		this.anInt3659--;
		while (this.anInt3659 < 0) {
			@Pc(36) Class2_Sub5_Sub7 local36 = (Class2_Sub5_Sub7) this.aClass175_4.method4284();
			this.method3025(local36);
		}
		@Pc(50) Class2_Sub5_Sub7_Sub1 local50 = new Class2_Sub5_Sub7_Sub1(arg1, arg0, 1);
		this.aClass222_11.method5476(local50, arg1.method4251());
		this.aClass175_4.method4287(local50);
		local50.aLong283 = 0L;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!rf;)Ljava/lang/Object;")
	public Object method3029(@OriginalArg(1) Interface21 arg0) {
		@Pc(11) long local11 = arg0.method4251();
		for (@Pc(18) Class2_Sub5_Sub7 local18 = (Class2_Sub5_Sub7) this.aClass222_11.method5468(local11); local18 != null; local18 = (Class2_Sub5_Sub7) this.aClass222_11.method5475()) {
			if (local18.anInterface21_3.method4250(arg0)) {
				@Pc(29) Object local29 = local18.method4488();
				if (local29 != null) {
					if (local18.method4486()) {
						@Pc(57) Class2_Sub5_Sub7_Sub1 local57 = new Class2_Sub5_Sub7_Sub1(arg0, local29, local18.anInt5374);
						this.aClass222_11.method5476(local57, local18.aLong287);
						this.aClass175_4.method4287(local57);
						local57.aLong283 = 0L;
						local18.method8599();
						local18.method8464();
					} else {
						this.aClass175_4.method4287(local18);
						local18.aLong283 = 0L;
					}
					return local29;
				}
				local18.method8599();
				local18.method8464();
				this.anInt3659 += local18.anInt5374;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
	public void method3031() {
		this.aClass175_4.method4283();
		this.aClass222_11.method5469();
		this.anInt3659 = this.anInt3655;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)I")
	public int method3032() {
		return this.anInt3659;
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)I")
	public int method3033() {
		return this.anInt3655;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)V")
	public void method3034() {
		if (Static376.aClass124_1 == null) {
			return;
		}
		for (@Pc(13) Class2_Sub5_Sub7 local13 = (Class2_Sub5_Sub7) this.aClass175_4.method4280(); local13 != null; local13 = (Class2_Sub5_Sub7) this.aClass175_4.method4288()) {
			if (local13.method4486()) {
				if (local13.method4488() == null) {
					local13.method8599();
					local13.method8464();
					this.anInt3659 += local13.anInt5374;
				}
			} else if ((long) 5 < ++local13.aLong283) {
				@Pc(35) Class2_Sub5_Sub7 local35 = Static376.aClass124_1.method8418(local13);
				this.aClass222_11.method5476(local35, local13.aLong287);
				Static3.method53(local13, local35);
				local13.method8599();
				local13.method8464();
			}
		}
	}
}
