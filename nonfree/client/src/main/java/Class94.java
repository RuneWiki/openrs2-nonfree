import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class94 {

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "Lclient!fu;")
	private Class6_Sub2 aClass6_Sub2_17 = new Class6_Sub2();

	@OriginalMember(owner = "client!ffa", name = "j", descriptor = "Lclient!kp;")
	private final Class180 aClass180_2 = new Class180();

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
	private int anInt3015;

	@OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
	private final int anInt3016;

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "Lclient!hd;")
	private final Class128 aClass128_10;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(I)V")
	public Class94(@OriginalArg(0) int arg0) {
		this.anInt3015 = arg0;
		this.anInt3016 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass128_10 = new Class128(local19);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(JLclient!fu;Z)V")
	public void method2643(@OriginalArg(0) long arg0, @OriginalArg(1) Class6_Sub2 arg1) {
		if (this.anInt3015 == 0) {
			@Pc(15) Class6_Sub2 local15 = this.aClass180_2.method4471();
			local15.method7804();
			local15.method7405();
			if (this.aClass6_Sub2_17 == local15) {
				local15 = this.aClass180_2.method4471();
				local15.method7804();
				local15.method7405();
			}
		} else {
			this.anInt3015--;
		}
		this.aClass128_10.method3267(arg1, arg0);
		this.aClass180_2.method4468(arg1);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V")
	public void method2646() {
		this.aClass180_2.method4465();
		this.aClass128_10.method3274();
		this.aClass6_Sub2_17 = new Class6_Sub2();
		this.anInt3015 = this.anInt3016;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IJ)Lclient!fu;")
	public Class6_Sub2 method2647(@OriginalArg(1) long arg0) {
		@Pc(18) Class6_Sub2 local18 = (Class6_Sub2) this.aClass128_10.method3263(arg0);
		if (local18 != null) {
			this.aClass180_2.method4468(local18);
		}
		return local18;
	}
}
