import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class154 {

	@OriginalMember(owner = "client!on", name = "f", descriptor = "Lclient!tg;")
	private Class7_Sub1 aClass7_Sub1_42 = new Class7_Sub1();

	@OriginalMember(owner = "client!on", name = "j", descriptor = "Lclient!bo;")
	private final Class30 aClass30_4 = new Class30();

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	private int anInt4657;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "I")
	private final int anInt4656;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Lclient!aj;")
	private final Class10 aClass10_36;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(I)V")
	public Class154(@OriginalArg(0) int arg0) {
		this.anInt4657 = arg0;
		this.anInt4656 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass10_36 = new Class10(local19);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public void method4075() {
		this.aClass30_4.method509();
		this.aClass10_36.method156();
		this.aClass7_Sub1_42 = new Class7_Sub1();
		this.anInt4657 = this.anInt4656;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZLclient!tg;J)V")
	public void method4078(@OriginalArg(1) Class7_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4657 == 0) {
			@Pc(17) Class7_Sub1 local17 = this.aClass30_4.method514();
			local17.method5648();
			local17.method5509();
			if (this.aClass7_Sub1_42 == local17) {
				local17 = this.aClass30_4.method514();
				local17.method5648();
				local17.method5509();
			}
		} else {
			this.anInt4657--;
		}
		this.aClass10_36.method161(arg1, arg0);
		this.aClass30_4.method515(arg0);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(JB)Lclient!tg;")
	public Class7_Sub1 method4079(@OriginalArg(0) long arg0) {
		@Pc(18) Class7_Sub1 local18 = (Class7_Sub1) this.aClass10_36.method163(arg0);
		if (local18 != null) {
			this.aClass30_4.method515(local18);
		}
		return local18;
	}
}
